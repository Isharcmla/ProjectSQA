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

public class Tokeniser_read_374258942120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111715;
     Object term113805;

    public Tokeniser_read_374258942120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term111775 = new StringBuilder();
        term111715 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term111715, term111715.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term111715, term111715.getClass(), "isEmitPending", true);
        setField(term111715, term111715.getClass(), "charBuffer", term111775);
        term113805 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term113806 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term113807 = (byte[]) newByteArray(16);
        setField(term113805, term113805.getClass(), "reader", null);
        setField(term113805, term113805.getClass(), "errors", null);
        setField(term113805, term113805.getClass(), "state", null);
        setField(term113805, term113805.getClass(), "emitPending", null);
        setBooleanField(term113805, term113805.getClass(), "isEmitPending", false);
        setField(term113806, term113806.getClass(), "value", term113807);
        setByteField(term113806, term113806.getClass(), "coder", (byte) 0);
        setIntField(term113806, term113806.getClass(), "count", 0);
        setField(term113805, term113805.getClass(), "charBuffer", term113806);
        setField(term113805, term113805.getClass(), "dataBuffer", null);
        setField(term113805, term113805.getClass(), "tagPending", null);
        setField(term113805, term113805.getClass(), "doctypePending", null);
        setField(term113805, term113805.getClass(), "commentPending", null);
        setField(term113805, term113805.getClass(), "lastStartTag", null);
        setBooleanField(term113805, term113805.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term111715, args);
        assertTrue(recursiveEquals(term111715, term113805));
        assertTrue(recursiveEquals(retValue, null));
    }

};


