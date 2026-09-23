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

public class Tokeniser_read_374258942185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182283;
     Object term184950;
     Object term183948;

    public Tokeniser_read_374258942185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term178710 = (char[]) newCharArray(496);
        StringBuilder term182343 = new StringBuilder();
        ((StringBuilder) term182343).append(term178710);
        term182283 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term182451 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setBooleanField(term182283, term182283.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term182283, term182283.getClass(), "isEmitPending", true);
        setField(term182283, term182283.getClass(), "charsBuilder", term182343);
        setField(term182283, term182283.getClass(), "charsString", "");
        setField(term182283, term182283.getClass(), "charPending", term182451);
        term184950 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term184951 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term184952 = (byte[]) newByteArray(496);
        Object term184953 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term184950, term184950.getClass(), "reader", null);
        setField(term184950, term184950.getClass(), "errors", null);
        setField(term184950, term184950.getClass(), "state", null);
        setField(term184950, term184950.getClass(), "emitPending", null);
        setBooleanField(term184950, term184950.getClass(), "isEmitPending", true);
        setField(term184950, term184950.getClass(), "charsString", null);
        setField(term184951, term184951.getClass(), "value", term184952);
        setByteField(term184951, term184951.getClass(), "coder", (byte) 0);
        setIntField(term184951, term184951.getClass(), "count", 0);
        setField(term184950, term184950.getClass(), "charsBuilder", term184951);
        setField(term184950, term184950.getClass(), "dataBuffer", null);
        setField(term184950, term184950.getClass(), "tagPending", null);
        setField(term184950, term184950.getClass(), "startPending", null);
        setField(term184950, term184950.getClass(), "endPending", null);
        setField(term184953, term184953.getClass(), "data", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term184953, term184953.getClass(), "type", null);
        setField(term184950, term184950.getClass(), "charPending", term184953);
        setField(term184950, term184950.getClass(), "doctypePending", null);
        setField(term184950, term184950.getClass(), "commentPending", null);
        setField(term184950, term184950.getClass(), "lastStartTag", null);
        setBooleanField(term184950, term184950.getClass(), "selfClosingFlagAcknowledged", true);
        setField(term184950, term184950.getClass(), "codepointHolder", null);
        setField(term184950, term184950.getClass(), "multipointHolder", null);
        term183948 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term183948, term183948.getClass(), "data", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term183948, term183948.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term182283, args);
        assertTrue(recursiveEquals(term182283, term184950));
        assertTrue(recursiveEquals(retValue, term183948));
    }

};


