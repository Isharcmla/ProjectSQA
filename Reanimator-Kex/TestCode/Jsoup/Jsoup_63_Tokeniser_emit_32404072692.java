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

public class Tokeniser_emit_32404072692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141202;
     Object term141338;

    public Tokeniser_emit_32404072692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141202 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term141202, term141202.getClass(), "charsString", null);
        term141338 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term141338, term141338.getClass(), "reader", null);
        setField(term141338, term141338.getClass(), "errors", null);
        setField(term141338, term141338.getClass(), "state", null);
        setField(term141338, term141338.getClass(), "emitPending", null);
        setBooleanField(term141338, term141338.getClass(), "isEmitPending", false);
        setField(term141338, term141338.getClass(), "charsString", null);
        setField(term141338, term141338.getClass(), "charsBuilder", null);
        setField(term141338, term141338.getClass(), "dataBuffer", null);
        setField(term141338, term141338.getClass(), "tagPending", null);
        setField(term141338, term141338.getClass(), "startPending", null);
        setField(term141338, term141338.getClass(), "endPending", null);
        setField(term141338, term141338.getClass(), "charPending", null);
        setField(term141338, term141338.getClass(), "doctypePending", null);
        setField(term141338, term141338.getClass(), "commentPending", null);
        setField(term141338, term141338.getClass(), "lastStartTag", null);
        setBooleanField(term141338, term141338.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term141338, term141338.getClass(), "codepointHolder", null);
        setField(term141338, term141338.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "emit", argTypes, term141202, args);
        assertTrue(recursiveEquals(term141202, term141338));
    }

};


