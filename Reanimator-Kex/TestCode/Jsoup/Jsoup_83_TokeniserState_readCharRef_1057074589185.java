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
import java.lang.Object;
import java.lang.StringBuilder;

public class TokeniserState_readCharRef_1057074589185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274547;
     Object term274764;

    public TokeniserState_readCharRef_1057074589185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term274715 = new StringBuilder();
        term274547 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term274617 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term274617, term274617.getClass(), "bufPos", -2147483648);
        setIntField(term274617, term274617.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term274617, term274617.getClass(), "bufLength", -2147483648);
        setField(term274547, term274547.getClass(), "reader", term274617);
        setField(term274547, term274547.getClass(), "charsString", "");
        setField(term274547, term274547.getClass(), "charsBuilder", term274715);
        term274764 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term274765 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term274768 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term274769 = (byte[]) newByteArray(16);
        setField(term274765, term274765.getClass(), "charBuf", null);
        setField(term274765, term274765.getClass(), "reader", null);
        setIntField(term274765, term274765.getClass(), "bufLength", -2147483648);
        setIntField(term274765, term274765.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term274765, term274765.getClass(), "bufPos", -2147483648);
        setIntField(term274765, term274765.getClass(), "readerPos", 0);
        setIntField(term274765, term274765.getClass(), "bufMark", 0);
        setField(term274765, term274765.getClass(), "stringCache", null);
        setField(term274764, term274764.getClass(), "reader", term274765);
        setField(term274764, term274764.getClass(), "errors", null);
        setField(term274764, term274764.getClass(), "state", null);
        setField(term274764, term274764.getClass(), "emitPending", null);
        setBooleanField(term274764, term274764.getClass(), "isEmitPending", false);
        setField(term274764, term274764.getClass(), "charsString", "");
        setByteElement(term274769, 0, (byte) 38);
        setField(term274768, term274768.getClass(), "value", term274769);
        setByteField(term274768, term274768.getClass(), "coder", (byte) 0);
        setIntField(term274768, term274768.getClass(), "count", 1);
        setField(term274764, term274764.getClass(), "charsBuilder", term274768);
        setField(term274764, term274764.getClass(), "dataBuffer", null);
        setField(term274764, term274764.getClass(), "tagPending", null);
        setField(term274764, term274764.getClass(), "startPending", null);
        setField(term274764, term274764.getClass(), "endPending", null);
        setField(term274764, term274764.getClass(), "charPending", null);
        setField(term274764, term274764.getClass(), "doctypePending", null);
        setField(term274764, term274764.getClass(), "commentPending", null);
        setField(term274764, term274764.getClass(), "lastStartTag", null);
        setField(term274764, term274764.getClass(), "codepointHolder", null);
        setField(term274764, term274764.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term274547;
        args[1] = null;
        callMethod(klass, "readCharRef", argTypes, null, args);
        assertTrue(recursiveEquals(term274547, term274764));
    }

};


