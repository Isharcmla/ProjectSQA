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

public class Tokeniser_emit_127242538969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137644;
     Object term137710;
     Object term137807;
     Object term137809;

    public Tokeniser_emit_127242538969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137644 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term137644, term137644.getClass(), "isEmitPending", false);
        setField(term137644, term137644.getClass(), "emitPending", null);
        term137710 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        term137807 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term137808 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term137807, term137807.getClass(), "reader", null);
        setField(term137807, term137807.getClass(), "errors", null);
        setField(term137807, term137807.getClass(), "state", null);
        setField(term137808, term137808.getClass(), "data", null);
        setBooleanField(term137808, term137808.getClass(), "bogus", false);
        setField(term137808, term137808.getClass(), "type", null);
        setField(term137807, term137807.getClass(), "emitPending", term137808);
        setBooleanField(term137807, term137807.getClass(), "isEmitPending", true);
        setField(term137807, term137807.getClass(), "charsString", null);
        setField(term137807, term137807.getClass(), "charsBuilder", null);
        setField(term137807, term137807.getClass(), "dataBuffer", null);
        setField(term137807, term137807.getClass(), "tagPending", null);
        setField(term137807, term137807.getClass(), "startPending", null);
        setField(term137807, term137807.getClass(), "endPending", null);
        setField(term137807, term137807.getClass(), "charPending", null);
        setField(term137807, term137807.getClass(), "doctypePending", null);
        setField(term137807, term137807.getClass(), "commentPending", null);
        setField(term137807, term137807.getClass(), "lastStartTag", null);
        setBooleanField(term137807, term137807.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term137807, term137807.getClass(), "codepointHolder", null);
        setField(term137807, term137807.getClass(), "multipointHolder", null);
        term137809 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term137809, term137809.getClass(), "data", null);
        setBooleanField(term137809, term137809.getClass(), "bogus", false);
        setField(term137809, term137809.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term137710;
        callMethod(klass, "emit", argTypes, term137644, args);
        assertTrue(recursiveEquals(term137644, term137807));
        assertTrue(recursiveEquals(term137710, term137809));
    }

};


