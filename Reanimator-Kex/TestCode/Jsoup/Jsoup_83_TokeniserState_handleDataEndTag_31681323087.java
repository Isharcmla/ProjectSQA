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

public class TokeniserState_handleDataEndTag_31681323087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130369;
     Object term130597;
     Object term132590;
     Object term132591;

    public TokeniserState_handleDataEndTag_31681323087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term128729 = (char[]) newCharArray(489);
        StringBuilder term130429 = new StringBuilder();
        ((StringBuilder) term130429).append(term128729);
        StringBuilder term130527 = new StringBuilder();
        term130369 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term130369, term130369.getClass(), "lastStartTag", null);
        setField(term130369, term130369.getClass(), "dataBuffer", term130429);
        setField(term130369, term130369.getClass(), "charsString", "");
        setField(term130369, term130369.getClass(), "charsBuilder", term130527);
        term130597 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term130597, term130597.getClass(), "bufPos", -2147483648);
        setIntField(term130597, term130597.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term130597, term130597.getClass(), "bufLength", -2147483648);
        term132590 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term132590, term132590.getClass(), "charBuf", null);
        setField(term132590, term132590.getClass(), "reader", null);
        setIntField(term132590, term132590.getClass(), "bufLength", -2147483648);
        setIntField(term132590, term132590.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term132590, term132590.getClass(), "bufPos", -2147483648);
        setIntField(term132590, term132590.getClass(), "readerPos", 0);
        setIntField(term132590, term132590.getClass(), "bufMark", 0);
        setField(term132590, term132590.getClass(), "stringCache", null);
        term132591 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term132594 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term132595 = (byte[]) newByteArray(491);
        Object term132596 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term132597 = (byte[]) newByteArray(489);
        setField(term132591, term132591.getClass(), "reader", null);
        setField(term132591, term132591.getClass(), "errors", null);
        setField(term132591, term132591.getClass(), "state", null);
        setField(term132591, term132591.getClass(), "emitPending", null);
        setBooleanField(term132591, term132591.getClass(), "isEmitPending", false);
        setField(term132591, term132591.getClass(), "charsString", "");
        setByteElement(term132595, 0, (byte) 60);
        setByteElement(term132595, 1, (byte) 47);
        setField(term132594, term132594.getClass(), "value", term132595);
        setByteField(term132594, term132594.getClass(), "coder", (byte) 0);
        setIntField(term132594, term132594.getClass(), "count", 491);
        setField(term132591, term132591.getClass(), "charsBuilder", term132594);
        setField(term132596, term132596.getClass(), "value", term132597);
        setByteField(term132596, term132596.getClass(), "coder", (byte) 0);
        setIntField(term132596, term132596.getClass(), "count", 489);
        setField(term132591, term132591.getClass(), "dataBuffer", term132596);
        setField(term132591, term132591.getClass(), "tagPending", null);
        setField(term132591, term132591.getClass(), "startPending", null);
        setField(term132591, term132591.getClass(), "endPending", null);
        setField(term132591, term132591.getClass(), "charPending", null);
        setField(term132591, term132591.getClass(), "doctypePending", null);
        setField(term132591, term132591.getClass(), "commentPending", null);
        setField(term132591, term132591.getClass(), "lastStartTag", null);
        setField(term132591, term132591.getClass(), "codepointHolder", null);
        setField(term132591, term132591.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term130369;
        args[1] = term130597;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term130369, term132590));
        assertTrue(recursiveEquals(term130597, term132591));
    }

};


