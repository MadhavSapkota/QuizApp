package com.aregyan.github.database;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QuestionDao_Impl implements QuestionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<QuestionEntity> __insertionAdapterOfQuestionEntity;

  public QuestionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQuestionEntity = new EntityInsertionAdapter<QuestionEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `question` (`id`,`question`,`correctAnswer`,`multipleCorrectAnswers`,`answerA`,`answerB`,`answerC`,`answerD`,`answerE`,`answerF`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, QuestionEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getQuestion() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getQuestion());
        }
        if (value.getCorrectAnswer() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCorrectAnswer());
        }
        if (value.getMultipleCorrectAnswers() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMultipleCorrectAnswers());
        }
        final AnswersEntity _tmpAnswers = value.getAnswers();
        if(_tmpAnswers != null) {
          if (_tmpAnswers.getAnswerA() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpAnswers.getAnswerA());
          }
          if (_tmpAnswers.getAnswerB() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpAnswers.getAnswerB());
          }
          if (_tmpAnswers.getAnswerC() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpAnswers.getAnswerC());
          }
          if (_tmpAnswers.getAnswerD() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpAnswers.getAnswerD());
          }
          if (_tmpAnswers.getAnswerE() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpAnswers.getAnswerE());
          }
          if (_tmpAnswers.getAnswerF() == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindString(10, _tmpAnswers.getAnswerF());
          }
        } else {
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
        }
      }
    };
  }

  @Override
  public void insertAll(final List<QuestionEntity> questions) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfQuestionEntity.insert(questions);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<QuestionEntity> getAllQuestions() {
    final String _sql = "SELECT * FROM question";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "question");
      final int _cursorIndexOfCorrectAnswer = CursorUtil.getColumnIndexOrThrow(_cursor, "correctAnswer");
      final int _cursorIndexOfMultipleCorrectAnswers = CursorUtil.getColumnIndexOrThrow(_cursor, "multipleCorrectAnswers");
      final int _cursorIndexOfAnswerA = CursorUtil.getColumnIndexOrThrow(_cursor, "answerA");
      final int _cursorIndexOfAnswerB = CursorUtil.getColumnIndexOrThrow(_cursor, "answerB");
      final int _cursorIndexOfAnswerC = CursorUtil.getColumnIndexOrThrow(_cursor, "answerC");
      final int _cursorIndexOfAnswerD = CursorUtil.getColumnIndexOrThrow(_cursor, "answerD");
      final int _cursorIndexOfAnswerE = CursorUtil.getColumnIndexOrThrow(_cursor, "answerE");
      final int _cursorIndexOfAnswerF = CursorUtil.getColumnIndexOrThrow(_cursor, "answerF");
      final List<QuestionEntity> _result = new ArrayList<QuestionEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final QuestionEntity _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpQuestion;
        if (_cursor.isNull(_cursorIndexOfQuestion)) {
          _tmpQuestion = null;
        } else {
          _tmpQuestion = _cursor.getString(_cursorIndexOfQuestion);
        }
        final String _tmpCorrectAnswer;
        if (_cursor.isNull(_cursorIndexOfCorrectAnswer)) {
          _tmpCorrectAnswer = null;
        } else {
          _tmpCorrectAnswer = _cursor.getString(_cursorIndexOfCorrectAnswer);
        }
        final String _tmpMultipleCorrectAnswers;
        if (_cursor.isNull(_cursorIndexOfMultipleCorrectAnswers)) {
          _tmpMultipleCorrectAnswers = null;
        } else {
          _tmpMultipleCorrectAnswers = _cursor.getString(_cursorIndexOfMultipleCorrectAnswers);
        }
        final AnswersEntity _tmpAnswers;
        if (! (_cursor.isNull(_cursorIndexOfAnswerA) && _cursor.isNull(_cursorIndexOfAnswerB) && _cursor.isNull(_cursorIndexOfAnswerC) && _cursor.isNull(_cursorIndexOfAnswerD) && _cursor.isNull(_cursorIndexOfAnswerE) && _cursor.isNull(_cursorIndexOfAnswerF))) {
          final String _tmpAnswerA;
          if (_cursor.isNull(_cursorIndexOfAnswerA)) {
            _tmpAnswerA = null;
          } else {
            _tmpAnswerA = _cursor.getString(_cursorIndexOfAnswerA);
          }
          final String _tmpAnswerB;
          if (_cursor.isNull(_cursorIndexOfAnswerB)) {
            _tmpAnswerB = null;
          } else {
            _tmpAnswerB = _cursor.getString(_cursorIndexOfAnswerB);
          }
          final String _tmpAnswerC;
          if (_cursor.isNull(_cursorIndexOfAnswerC)) {
            _tmpAnswerC = null;
          } else {
            _tmpAnswerC = _cursor.getString(_cursorIndexOfAnswerC);
          }
          final String _tmpAnswerD;
          if (_cursor.isNull(_cursorIndexOfAnswerD)) {
            _tmpAnswerD = null;
          } else {
            _tmpAnswerD = _cursor.getString(_cursorIndexOfAnswerD);
          }
          final String _tmpAnswerE;
          if (_cursor.isNull(_cursorIndexOfAnswerE)) {
            _tmpAnswerE = null;
          } else {
            _tmpAnswerE = _cursor.getString(_cursorIndexOfAnswerE);
          }
          final String _tmpAnswerF;
          if (_cursor.isNull(_cursorIndexOfAnswerF)) {
            _tmpAnswerF = null;
          } else {
            _tmpAnswerF = _cursor.getString(_cursorIndexOfAnswerF);
          }
          _tmpAnswers = new AnswersEntity(_tmpAnswerA,_tmpAnswerB,_tmpAnswerC,_tmpAnswerD,_tmpAnswerE,_tmpAnswerF);
        }  else  {
          _tmpAnswers = null;
        }
        _item = new QuestionEntity(_tmpId,_tmpQuestion,_tmpAnswers,_tmpCorrectAnswer,_tmpMultipleCorrectAnswers);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
