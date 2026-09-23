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

public class TokeniserState_handleDataEndTag_31681323025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49984;
     Object term50114;
     Object term50160;
     Object term50161;

    public TokeniserState_handleDataEndTag_31681323025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term50044 = new StringBuilder();
        term49984 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term49984, term49984.getClass(), "lastStartTag", null);
        setField(term49984, term49984.getClass(), "dataBuffer", term50044);
        term50114 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term50114, term50114.getClass(), "pos", -2147483648);
        setIntField(term50114, term50114.getClass(), "length", -2147483648);
        term50160 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term50160, term50160.getClass(), "input", null);
        setIntField(term50160, term50160.getClass(), "length", -2147483648);
        setIntField(term50160, term50160.getClass(), "pos", -2147483648);
        setIntField(term50160, term50160.getClass(), "mark", 0);
        setField(term50160, term50160.getClass(), "stringCache", null);
        term50161 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term50164 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term50165 = (byte[]) newByteArray(16);
        setField(term50161, term50161.getClass(), "reader", null);
        setField(term50161, term50161.getClass(), "errors", null);
        setField(term50161, term50161.getClass(), "state", null);
        setField(term50161, term50161.getClass(), "emitPending", null);
        setBooleanField(term50161, term50161.getClass(), "isEmitPending", false);
        setField(term50161, term50161.getClass(), "charsString", "</");
        setField(term50161, term50161.getClass(), "charsBuilder", null);
        setField(term50164, term50164.getClass(), "value", term50165);
        setByteField(term50164, term50164.getClass(), "coder", (byte) 0);
        setIntField(term50164, term50164.getClass(), "count", 0);
        setField(term50161, term50161.getClass(), "dataBuffer", term50164);
        setField(term50161, term50161.getClass(), "tagPending", null);
        setField(term50161, term50161.getClass(), "startPending", null);
        setField(term50161, term50161.getClass(), "endPending", null);
        setField(term50161, term50161.getClass(), "charPending", null);
        setField(term50161, term50161.getClass(), "doctypePending", null);
        setField(term50161, term50161.getClass(), "commentPending", null);
        setField(term50161, term50161.getClass(), "lastStartTag", null);
        setBooleanField(term50161, term50161.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term50161, term50161.getClass(), "codepointHolder", null);
        setField(term50161, term50161.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term49984;
        args[1] = term50114;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term49984, term50160));
        assertTrue(recursiveEquals(term50114, term50161));
    }

};


