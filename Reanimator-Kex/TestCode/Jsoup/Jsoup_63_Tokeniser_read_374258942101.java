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

public class Tokeniser_read_374258942101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142800;
     Object term142888;

    public Tokeniser_read_374258942101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term142860 = new StringBuilder();
        term142800 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term142800, term142800.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term142800, term142800.getClass(), "isEmitPending", true);
        setField(term142800, term142800.getClass(), "charsBuilder", term142860);
        term142888 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term142889 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term142890 = (byte[]) newByteArray(16);
        setField(term142888, term142888.getClass(), "reader", null);
        setField(term142888, term142888.getClass(), "errors", null);
        setField(term142888, term142888.getClass(), "state", null);
        setField(term142888, term142888.getClass(), "emitPending", null);
        setBooleanField(term142888, term142888.getClass(), "isEmitPending", false);
        setField(term142888, term142888.getClass(), "charsString", null);
        setField(term142889, term142889.getClass(), "value", term142890);
        setByteField(term142889, term142889.getClass(), "coder", (byte) 0);
        setIntField(term142889, term142889.getClass(), "count", 0);
        setField(term142888, term142888.getClass(), "charsBuilder", term142889);
        setField(term142888, term142888.getClass(), "dataBuffer", null);
        setField(term142888, term142888.getClass(), "tagPending", null);
        setField(term142888, term142888.getClass(), "startPending", null);
        setField(term142888, term142888.getClass(), "endPending", null);
        setField(term142888, term142888.getClass(), "charPending", null);
        setField(term142888, term142888.getClass(), "doctypePending", null);
        setField(term142888, term142888.getClass(), "commentPending", null);
        setField(term142888, term142888.getClass(), "lastStartTag", null);
        setBooleanField(term142888, term142888.getClass(), "selfClosingFlagAcknowledged", true);
        setField(term142888, term142888.getClass(), "codepointHolder", null);
        setField(term142888, term142888.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term142800, args);
        assertTrue(recursiveEquals(term142800, term142888));
        assertTrue(recursiveEquals(retValue, null));
    }

};


