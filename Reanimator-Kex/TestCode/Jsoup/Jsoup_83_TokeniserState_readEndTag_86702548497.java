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
import java.lang.StringBuilder;
import java.lang.Object;

public class TokeniserState_readEndTag_86702548497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141250;
     Object term141418;
     Object term150490;
     Object term150491;

    public TokeniserState_readEndTag_86702548497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term141348 = new StringBuilder();
        term141250 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term141250, term141250.getClass(), "charsString", "");
        setField(term141250, term141250.getClass(), "charsBuilder", term141348);
        term141418 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term141418, term141418.getClass(), "bufPos", -2147483648);
        setIntField(term141418, term141418.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term141418, term141418.getClass(), "bufLength", -2147483648);
        term150490 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term150490, term150490.getClass(), "charBuf", null);
        setField(term150490, term150490.getClass(), "reader", null);
        setIntField(term150490, term150490.getClass(), "bufLength", -2147483648);
        setIntField(term150490, term150490.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term150490, term150490.getClass(), "bufPos", -2147483648);
        setIntField(term150490, term150490.getClass(), "readerPos", 0);
        setIntField(term150490, term150490.getClass(), "bufMark", 0);
        setField(term150490, term150490.getClass(), "stringCache", null);
        term150491 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term150494 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term150495 = (byte[]) newByteArray(16);
        setField(term150491, term150491.getClass(), "reader", null);
        setField(term150491, term150491.getClass(), "errors", null);
        setField(term150491, term150491.getClass(), "state", null);
        setField(term150491, term150491.getClass(), "emitPending", null);
        setBooleanField(term150491, term150491.getClass(), "isEmitPending", false);
        setField(term150491, term150491.getClass(), "charsString", "");
        setByteElement(term150495, 0, (byte) 60);
        setByteElement(term150495, 1, (byte) 47);
        setField(term150494, term150494.getClass(), "value", term150495);
        setByteField(term150494, term150494.getClass(), "coder", (byte) 0);
        setIntField(term150494, term150494.getClass(), "count", 2);
        setField(term150491, term150491.getClass(), "charsBuilder", term150494);
        setField(term150491, term150491.getClass(), "dataBuffer", null);
        setField(term150491, term150491.getClass(), "tagPending", null);
        setField(term150491, term150491.getClass(), "startPending", null);
        setField(term150491, term150491.getClass(), "endPending", null);
        setField(term150491, term150491.getClass(), "charPending", null);
        setField(term150491, term150491.getClass(), "doctypePending", null);
        setField(term150491, term150491.getClass(), "commentPending", null);
        setField(term150491, term150491.getClass(), "lastStartTag", null);
        setField(term150491, term150491.getClass(), "codepointHolder", null);
        setField(term150491, term150491.getClass(), "multipointHolder", null);
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
        args[0] = term141250;
        args[1] = term141418;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "readEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term141250, term150490));
        assertTrue(recursiveEquals(term141418, term150491));
    }

};


