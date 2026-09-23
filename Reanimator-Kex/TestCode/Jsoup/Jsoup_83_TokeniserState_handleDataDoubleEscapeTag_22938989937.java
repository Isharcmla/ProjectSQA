package org.jsoup.parser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class TokeniserState_handleDataDoubleEscapeTag_22938989937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47042;
     Object term47112;
     Object term47132;
     Object term47133;

    public TokeniserState_handleDataDoubleEscapeTag_22938989937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47042 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        term47112 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term47112, term47112.getClass(), "bufPos", -2147483648);
        setIntField(term47112, term47112.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term47112, term47112.getClass(), "bufLength", -2147483648);
        term47132 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term47132, term47132.getClass(), "charBuf", null);
        setField(term47132, term47132.getClass(), "reader", null);
        setIntField(term47132, term47132.getClass(), "bufLength", -2147483648);
        setIntField(term47132, term47132.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term47132, term47132.getClass(), "bufPos", -2147483648);
        setIntField(term47132, term47132.getClass(), "readerPos", 0);
        setIntField(term47132, term47132.getClass(), "bufMark", 0);
        setField(term47132, term47132.getClass(), "stringCache", null);
        term47133 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term47133, term47133.getClass(), "reader", null);
        setField(term47133, term47133.getClass(), "errors", null);
        setField(term47133, term47133.getClass(), "state", null);
        setField(term47133, term47133.getClass(), "emitPending", null);
        setBooleanField(term47133, term47133.getClass(), "isEmitPending", false);
        setField(term47133, term47133.getClass(), "charsString", null);
        setField(term47133, term47133.getClass(), "charsBuilder", null);
        setField(term47133, term47133.getClass(), "dataBuffer", null);
        setField(term47133, term47133.getClass(), "tagPending", null);
        setField(term47133, term47133.getClass(), "startPending", null);
        setField(term47133, term47133.getClass(), "endPending", null);
        setField(term47133, term47133.getClass(), "charPending", null);
        setField(term47133, term47133.getClass(), "doctypePending", null);
        setField(term47133, term47133.getClass(), "commentPending", null);
        setField(term47133, term47133.getClass(), "lastStartTag", null);
        setField(term47133, term47133.getClass(), "codepointHolder", null);
        setField(term47133, term47133.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        argTypes[3] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[4];
        args[0] = term47042;
        args[1] = term47112;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "handleDataDoubleEscapeTag", argTypes, null, args);
        assertTrue(recursiveEquals(term47042, term47132));
        assertTrue(recursiveEquals(term47112, term47133));
    }

};


