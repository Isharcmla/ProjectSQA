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

public class Tokeniser_emit_17178667376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138448;
     Object term138364;
     Object term138648;
     Object term138653;

    public Tokeniser_emit_17178667376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138364 = (char[]) newCharArray(0);
        StringBuilder term138546 = new StringBuilder();
        ((StringBuilder) term138546).append(term138364);
        term138448 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term138448, term138448.getClass(), "charsString", "");
        setField(term138448, term138448.getClass(), "charsBuilder", term138546);
        term138648 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term138651 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term138652 = (byte[]) newByteArray(16);
        setField(term138648, term138648.getClass(), "reader", null);
        setField(term138648, term138648.getClass(), "errors", null);
        setField(term138648, term138648.getClass(), "state", null);
        setField(term138648, term138648.getClass(), "emitPending", null);
        setBooleanField(term138648, term138648.getClass(), "isEmitPending", false);
        setField(term138648, term138648.getClass(), "charsString", "");
        setByteElement(term138652, 0, (byte) 91);
        setByteElement(term138652, 1, (byte) 67);
        setByteElement(term138652, 2, (byte) 64);
        setByteElement(term138652, 3, (byte) 50);
        setByteElement(term138652, 4, (byte) 101);
        setByteElement(term138652, 5, (byte) 48);
        setByteElement(term138652, 6, (byte) 100);
        setByteElement(term138652, 7, (byte) 50);
        setByteElement(term138652, 8, (byte) 56);
        setByteElement(term138652, 9, (byte) 102);
        setByteElement(term138652, 10, (byte) 50);
        setField(term138651, term138651.getClass(), "value", term138652);
        setByteField(term138651, term138651.getClass(), "coder", (byte) 0);
        setIntField(term138651, term138651.getClass(), "count", 11);
        setField(term138648, term138648.getClass(), "charsBuilder", term138651);
        setField(term138648, term138648.getClass(), "dataBuffer", null);
        setField(term138648, term138648.getClass(), "tagPending", null);
        setField(term138648, term138648.getClass(), "startPending", null);
        setField(term138648, term138648.getClass(), "endPending", null);
        setField(term138648, term138648.getClass(), "charPending", null);
        setField(term138648, term138648.getClass(), "doctypePending", null);
        setField(term138648, term138648.getClass(), "commentPending", null);
        setField(term138648, term138648.getClass(), "lastStartTag", null);
        setBooleanField(term138648, term138648.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term138648, term138648.getClass(), "codepointHolder", null);
        setField(term138648, term138648.getClass(), "multipointHolder", null);
        term138653 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term138364;
        callMethod(klass, "emit", argTypes, term138448, args);
        assertTrue(recursiveEquals(term138448, term138648));
        assertTrue(recursiveEquals(term138364, term138653));
    }

};


