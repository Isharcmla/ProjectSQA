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

public class Tokeniser_read_374258942129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220218;
     Object term220343;

    public Tokeniser_read_374258942129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term220278 = new StringBuilder();
        term220218 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term220218, term220218.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term220218, term220218.getClass(), "trackErrors", false);
        setBooleanField(term220218, term220218.getClass(), "isEmitPending", true);
        setField(term220218, term220218.getClass(), "charBuffer", term220278);
        term220343 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term220344 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term220345 = (byte[]) newByteArray(16);
        setField(term220343, term220343.getClass(), "reader", null);
        setBooleanField(term220343, term220343.getClass(), "trackErrors", false);
        setField(term220343, term220343.getClass(), "errors", null);
        setField(term220343, term220343.getClass(), "state", null);
        setField(term220343, term220343.getClass(), "emitPending", null);
        setBooleanField(term220343, term220343.getClass(), "isEmitPending", false);
        setField(term220344, term220344.getClass(), "value", term220345);
        setByteField(term220344, term220344.getClass(), "coder", (byte) 0);
        setIntField(term220344, term220344.getClass(), "count", 0);
        setField(term220343, term220343.getClass(), "charBuffer", term220344);
        setField(term220343, term220343.getClass(), "dataBuffer", null);
        setField(term220343, term220343.getClass(), "tagPending", null);
        setField(term220343, term220343.getClass(), "doctypePending", null);
        setField(term220343, term220343.getClass(), "commentPending", null);
        setField(term220343, term220343.getClass(), "lastStartTag", null);
        setBooleanField(term220343, term220343.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term220218, args);
        assertTrue(recursiveEquals(term220218, term220343));
        assertTrue(recursiveEquals(retValue, null));
    }

};


