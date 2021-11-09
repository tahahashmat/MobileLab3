package com.uoit.noteme.listeners;
import com.uoit.noteme.entities.Note;
public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
