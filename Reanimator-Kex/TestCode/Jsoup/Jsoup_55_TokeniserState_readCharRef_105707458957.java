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

public class TokeniserState_readCharRef_105707458957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112106;
     Object term112319;

    public TokeniserState_readCharRef_105707458957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term112274 = new StringBuilder();
        term112106 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term112176 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term112176, term112176.getClass(), "pos", -2147483648);
        setIntField(term112176, term112176.getClass(), "length", -2147483648);
        setField(term112106, term112106.getClass(), "reader", term112176);
        setField(term112106, term112106.getClass(), "charsString", "");
        setField(term112106, term112106.getClass(), "charsBuilder", term112274);
        term112319 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term112320 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term112323 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term112324 = (byte[]) newByteArray(16);
        setField(term112320, term112320.getClass(), "input", null);
        setIntField(term112320, term112320.getClass(), "length", -2147483648);
        setIntField(term112320, term112320.getClass(), "pos", -2147483648);
        setIntField(term112320, term112320.getClass(), "mark", 0);
        setField(term112320, term112320.getClass(), "stringCache", null);
        setField(term112319, term112319.getClass(), "reader", term112320);
        setField(term112319, term112319.getClass(), "errors", null);
        setField(term112319, term112319.getClass(), "state", null);
        setField(term112319, term112319.getClass(), "emitPending", null);
        setBooleanField(term112319, term112319.getClass(), "isEmitPending", false);
        setField(term112319, term112319.getClass(), "charsString", "");
        setByteElement(term112324, 0, (byte) 38);
        setField(term112323, term112323.getClass(), "value", term112324);
        setByteField(term112323, term112323.getClass(), "coder", (byte) 0);
        setIntField(term112323, term112323.getClass(), "count", 1);
        setField(term112319, term112319.getClass(), "charsBuilder", term112323);
        setField(term112319, term112319.getClass(), "dataBuffer", null);
        setField(term112319, term112319.getClass(), "tagPending", null);
        setField(term112319, term112319.getClass(), "startPending", null);
        setField(term112319, term112319.getClass(), "endPending", null);
        setField(term112319, term112319.getClass(), "charPending", null);
        setField(term112319, term112319.getClass(), "doctypePending", null);
        setField(term112319, term112319.getClass(), "commentPending", null);
        setField(term112319, term112319.getClass(), "lastStartTag", null);
        setBooleanField(term112319, term112319.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term112319, term112319.getClass(), "codepointHolder", null);
        setField(term112319, term112319.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term112106;
        args[1] = null;
        callMethod(klass, "readCharRef", argTypes, null, args);
        assertTrue(recursiveEquals(term112106, term112319));
    }

};


