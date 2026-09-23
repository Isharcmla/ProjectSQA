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

public class Tokeniser_createTempBuffer_213098673089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140811;
     Object term141137;

    public Tokeniser_createTempBuffer_213098673089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140811 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term140811, term140811.getClass(), "dataBuffer", null);
        term141137 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term141137, term141137.getClass(), "reader", null);
        setField(term141137, term141137.getClass(), "errors", null);
        setField(term141137, term141137.getClass(), "state", null);
        setField(term141137, term141137.getClass(), "emitPending", null);
        setBooleanField(term141137, term141137.getClass(), "isEmitPending", false);
        setField(term141137, term141137.getClass(), "charsString", null);
        setField(term141137, term141137.getClass(), "charsBuilder", null);
        setField(term141137, term141137.getClass(), "dataBuffer", null);
        setField(term141137, term141137.getClass(), "tagPending", null);
        setField(term141137, term141137.getClass(), "startPending", null);
        setField(term141137, term141137.getClass(), "endPending", null);
        setField(term141137, term141137.getClass(), "charPending", null);
        setField(term141137, term141137.getClass(), "doctypePending", null);
        setField(term141137, term141137.getClass(), "commentPending", null);
        setField(term141137, term141137.getClass(), "lastStartTag", null);
        setBooleanField(term141137, term141137.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term141137, term141137.getClass(), "codepointHolder", null);
        setField(term141137, term141137.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createTempBuffer", argTypes, term140811, args);
        assertTrue(recursiveEquals(term140811, term141137));
    }

};


