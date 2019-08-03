package com.example.markiiimark.unittesting;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;

import com.example.markiiimark.unittesting.persistence.NoteDao;
import com.example.markiiimark.unittesting.persistence.NoteDatabase;

import org.junit.After;
import org.junit.Before;

public abstract class NoteDatabaseTest {

    // system under test
    private NoteDatabase noteDatabase;

    public NoteDao getNoteDao(){
        return noteDatabase.getNoteDao();
    }

    @Before
    public void init(){
        noteDatabase = Room.inMemoryDatabaseBuilder(
                ApplicationProvider.getApplicationContext(),
                NoteDatabase.class
        ).build();
    }

    @After
    public void finish(){
        noteDatabase.close();
    }
}






