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

public class TokeniserState_readEndTag_86702548421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43824;
     Object term43894;
     Object term43918;
     Object term43919;

    public TokeniserState_readEndTag_86702548421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43824 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        term43894 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term43894, term43894.getClass(), "bufPos", -2147483648);
        setIntField(term43894, term43894.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term43894, term43894.getClass(), "bufLength", -2147483648);
        term43918 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term43918, term43918.getClass(), "charBuf", null);
        setField(term43918, term43918.getClass(), "reader", null);
        setIntField(term43918, term43918.getClass(), "bufLength", -2147483648);
        setIntField(term43918, term43918.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term43918, term43918.getClass(), "bufPos", -2147483648);
        setIntField(term43918, term43918.getClass(), "readerPos", 0);
        setIntField(term43918, term43918.getClass(), "bufMark", 0);
        setField(term43918, term43918.getClass(), "stringCache", null);
        term43919 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term43919, term43919.getClass(), "reader", null);
        setField(term43919, term43919.getClass(), "errors", null);
        setField(term43919, term43919.getClass(), "state", null);
        setField(term43919, term43919.getClass(), "emitPending", null);
        setBooleanField(term43919, term43919.getClass(), "isEmitPending", false);
        setField(term43919, term43919.getClass(), "charsString", "</");
        setField(term43919, term43919.getClass(), "charsBuilder", null);
        setField(term43919, term43919.getClass(), "dataBuffer", null);
        setField(term43919, term43919.getClass(), "tagPending", null);
        setField(term43919, term43919.getClass(), "startPending", null);
        setField(term43919, term43919.getClass(), "endPending", null);
        setField(term43919, term43919.getClass(), "charPending", null);
        setField(term43919, term43919.getClass(), "doctypePending", null);
        setField(term43919, term43919.getClass(), "commentPending", null);
        setField(term43919, term43919.getClass(), "lastStartTag", null);
        setField(term43919, term43919.getClass(), "codepointHolder", null);
        setField(term43919, term43919.getClass(), "multipointHolder", null);
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
        args[0] = term43824;
        args[1] = term43894;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "readEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term43824, term43918));
        assertTrue(recursiveEquals(term43894, term43919));
    }

};


