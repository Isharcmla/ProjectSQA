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

public class Tokeniser_emit_17178667368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137340;
     Object term137742;

    public Tokeniser_emit_17178667368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term137228 = (char[]) newCharArray(0);
        StringBuilder term137438 = new StringBuilder();
        ((StringBuilder) term137438).append(term137228);
        term137340 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term137340, term137340.getClass(), "charsString", "");
        setField(term137340, term137340.getClass(), "charsBuilder", term137438);
        term137742 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term137745 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term137746 = (byte[]) newByteArray(16);
        setField(term137742, term137742.getClass(), "reader", null);
        setField(term137742, term137742.getClass(), "errors", null);
        setField(term137742, term137742.getClass(), "state", null);
        setField(term137742, term137742.getClass(), "emitPending", null);
        setBooleanField(term137742, term137742.getClass(), "isEmitPending", false);
        setField(term137742, term137742.getClass(), "charsString", "");
        setField(term137745, term137745.getClass(), "value", term137746);
        setByteField(term137745, term137745.getClass(), "coder", (byte) 0);
        setIntField(term137745, term137745.getClass(), "count", 1);
        setField(term137742, term137742.getClass(), "charsBuilder", term137745);
        setField(term137742, term137742.getClass(), "dataBuffer", null);
        setField(term137742, term137742.getClass(), "tagPending", null);
        setField(term137742, term137742.getClass(), "startPending", null);
        setField(term137742, term137742.getClass(), "endPending", null);
        setField(term137742, term137742.getClass(), "charPending", null);
        setField(term137742, term137742.getClass(), "doctypePending", null);
        setField(term137742, term137742.getClass(), "commentPending", null);
        setField(term137742, term137742.getClass(), "lastStartTag", null);
        setBooleanField(term137742, term137742.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term137742, term137742.getClass(), "codepointHolder", null);
        setField(term137742, term137742.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        callMethod(klass, "emit", argTypes, term137340, args);
        assertTrue(recursiveEquals(term137340, term137742));
    }

};


