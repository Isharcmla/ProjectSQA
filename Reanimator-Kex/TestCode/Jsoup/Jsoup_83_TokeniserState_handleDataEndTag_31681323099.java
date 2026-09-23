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

public class TokeniserState_handleDataEndTag_31681323099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154075;
     Object term154303;
     Object term155823;
     Object term155824;

    public TokeniserState_handleDataEndTag_31681323099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term154135 = new StringBuilder();
        char[] term152981 = (char[]) newCharArray(489);
        StringBuilder term154233 = new StringBuilder();
        ((StringBuilder) term154233).append(term152981);
        term154075 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term154075, term154075.getClass(), "lastStartTag", null);
        setField(term154075, term154075.getClass(), "dataBuffer", term154135);
        setField(term154075, term154075.getClass(), "charsString", "");
        setField(term154075, term154075.getClass(), "charsBuilder", term154233);
        term154303 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term154303, term154303.getClass(), "bufPos", -2147483648);
        setIntField(term154303, term154303.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term154303, term154303.getClass(), "bufLength", -2147483648);
        term155823 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term155823, term155823.getClass(), "charBuf", null);
        setField(term155823, term155823.getClass(), "reader", null);
        setIntField(term155823, term155823.getClass(), "bufLength", -2147483648);
        setIntField(term155823, term155823.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term155823, term155823.getClass(), "bufPos", -2147483648);
        setIntField(term155823, term155823.getClass(), "readerPos", 0);
        setIntField(term155823, term155823.getClass(), "bufMark", 0);
        setField(term155823, term155823.getClass(), "stringCache", null);
        term155824 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term155827 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term155828 = (byte[]) newByteArray(980);
        Object term155829 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term155830 = (byte[]) newByteArray(16);
        setField(term155824, term155824.getClass(), "reader", null);
        setField(term155824, term155824.getClass(), "errors", null);
        setField(term155824, term155824.getClass(), "state", null);
        setField(term155824, term155824.getClass(), "emitPending", null);
        setBooleanField(term155824, term155824.getClass(), "isEmitPending", false);
        setField(term155824, term155824.getClass(), "charsString", "");
        setByteElement(term155828, 489, (byte) 60);
        setByteElement(term155828, 490, (byte) 47);
        setField(term155827, term155827.getClass(), "value", term155828);
        setByteField(term155827, term155827.getClass(), "coder", (byte) 0);
        setIntField(term155827, term155827.getClass(), "count", 491);
        setField(term155824, term155824.getClass(), "charsBuilder", term155827);
        setField(term155829, term155829.getClass(), "value", term155830);
        setByteField(term155829, term155829.getClass(), "coder", (byte) 0);
        setIntField(term155829, term155829.getClass(), "count", 0);
        setField(term155824, term155824.getClass(), "dataBuffer", term155829);
        setField(term155824, term155824.getClass(), "tagPending", null);
        setField(term155824, term155824.getClass(), "startPending", null);
        setField(term155824, term155824.getClass(), "endPending", null);
        setField(term155824, term155824.getClass(), "charPending", null);
        setField(term155824, term155824.getClass(), "doctypePending", null);
        setField(term155824, term155824.getClass(), "commentPending", null);
        setField(term155824, term155824.getClass(), "lastStartTag", null);
        setField(term155824, term155824.getClass(), "codepointHolder", null);
        setField(term155824, term155824.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term154075;
        args[1] = term154303;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term154075, term155823));
        assertTrue(recursiveEquals(term154303, term155824));
    }

};


