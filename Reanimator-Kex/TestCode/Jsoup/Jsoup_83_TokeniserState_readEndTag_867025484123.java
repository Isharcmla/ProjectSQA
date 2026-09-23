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

public class TokeniserState_readEndTag_867025484123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205759;
     Object term205927;
     Object term206724;
     Object term206725;

    public TokeniserState_readEndTag_867025484123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term205153 = (char[]) newCharArray(256);
        StringBuilder term205857 = new StringBuilder();
        ((StringBuilder) term205857).append(term205153);
        term205759 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term205759, term205759.getClass(), "charsString", "");
        setField(term205759, term205759.getClass(), "charsBuilder", term205857);
        term205927 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term205927, term205927.getClass(), "bufPos", -2147483648);
        setIntField(term205927, term205927.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term205927, term205927.getClass(), "bufLength", -2147483648);
        term206724 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term206724, term206724.getClass(), "charBuf", null);
        setField(term206724, term206724.getClass(), "reader", null);
        setIntField(term206724, term206724.getClass(), "bufLength", -2147483648);
        setIntField(term206724, term206724.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term206724, term206724.getClass(), "bufPos", -2147483648);
        setIntField(term206724, term206724.getClass(), "readerPos", 0);
        setIntField(term206724, term206724.getClass(), "bufMark", 0);
        setField(term206724, term206724.getClass(), "stringCache", null);
        term206725 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term206728 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term206729 = (byte[]) newByteArray(514);
        setField(term206725, term206725.getClass(), "reader", null);
        setField(term206725, term206725.getClass(), "errors", null);
        setField(term206725, term206725.getClass(), "state", null);
        setField(term206725, term206725.getClass(), "emitPending", null);
        setBooleanField(term206725, term206725.getClass(), "isEmitPending", false);
        setField(term206725, term206725.getClass(), "charsString", "");
        setByteElement(term206729, 256, (byte) 60);
        setByteElement(term206729, 257, (byte) 47);
        setField(term206728, term206728.getClass(), "value", term206729);
        setByteField(term206728, term206728.getClass(), "coder", (byte) 0);
        setIntField(term206728, term206728.getClass(), "count", 258);
        setField(term206725, term206725.getClass(), "charsBuilder", term206728);
        setField(term206725, term206725.getClass(), "dataBuffer", null);
        setField(term206725, term206725.getClass(), "tagPending", null);
        setField(term206725, term206725.getClass(), "startPending", null);
        setField(term206725, term206725.getClass(), "endPending", null);
        setField(term206725, term206725.getClass(), "charPending", null);
        setField(term206725, term206725.getClass(), "doctypePending", null);
        setField(term206725, term206725.getClass(), "commentPending", null);
        setField(term206725, term206725.getClass(), "lastStartTag", null);
        setField(term206725, term206725.getClass(), "codepointHolder", null);
        setField(term206725, term206725.getClass(), "multipointHolder", null);
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
        args[0] = term205759;
        args[1] = term205927;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "readEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term205759, term206724));
        assertTrue(recursiveEquals(term205927, term206725));
    }

};


