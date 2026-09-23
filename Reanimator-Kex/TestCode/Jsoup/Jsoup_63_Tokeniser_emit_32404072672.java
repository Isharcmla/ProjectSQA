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

public class Tokeniser_emit_32404072672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137889;
     Object term138081;

    public Tokeniser_emit_32404072672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term137813 = (char[]) newCharArray(0);
        StringBuilder term137987 = new StringBuilder();
        ((StringBuilder) term137987).append(term137813);
        term137889 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term137889, term137889.getClass(), "charsString", "");
        setField(term137889, term137889.getClass(), "charsBuilder", term137987);
        term138081 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term138084 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term138085 = (byte[]) newByteArray(16);
        setField(term138081, term138081.getClass(), "reader", null);
        setField(term138081, term138081.getClass(), "errors", null);
        setField(term138081, term138081.getClass(), "state", null);
        setField(term138081, term138081.getClass(), "emitPending", null);
        setBooleanField(term138081, term138081.getClass(), "isEmitPending", false);
        setField(term138081, term138081.getClass(), "charsString", "");
        setByteElement(term138085, 0, (byte) 110);
        setByteElement(term138085, 1, (byte) 117);
        setByteElement(term138085, 2, (byte) 108);
        setByteElement(term138085, 3, (byte) 108);
        setField(term138084, term138084.getClass(), "value", term138085);
        setByteField(term138084, term138084.getClass(), "coder", (byte) 0);
        setIntField(term138084, term138084.getClass(), "count", 4);
        setField(term138081, term138081.getClass(), "charsBuilder", term138084);
        setField(term138081, term138081.getClass(), "dataBuffer", null);
        setField(term138081, term138081.getClass(), "tagPending", null);
        setField(term138081, term138081.getClass(), "startPending", null);
        setField(term138081, term138081.getClass(), "endPending", null);
        setField(term138081, term138081.getClass(), "charPending", null);
        setField(term138081, term138081.getClass(), "doctypePending", null);
        setField(term138081, term138081.getClass(), "commentPending", null);
        setField(term138081, term138081.getClass(), "lastStartTag", null);
        setBooleanField(term138081, term138081.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term138081, term138081.getClass(), "codepointHolder", null);
        setField(term138081, term138081.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "emit", argTypes, term137889, args);
        assertTrue(recursiveEquals(term137889, term138081));
    }

};


