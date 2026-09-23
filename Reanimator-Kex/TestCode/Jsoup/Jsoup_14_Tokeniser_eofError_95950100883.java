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

public class Tokeniser_eofError_95950100883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195055;
     Object term195061;

    public Tokeniser_eofError_95950100883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195055 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term195055, term195055.getClass(), "trackErrors", false);
        term195061 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term195061, term195061.getClass(), "reader", null);
        setBooleanField(term195061, term195061.getClass(), "trackErrors", false);
        setField(term195061, term195061.getClass(), "errors", null);
        setField(term195061, term195061.getClass(), "state", null);
        setField(term195061, term195061.getClass(), "emitPending", null);
        setBooleanField(term195061, term195061.getClass(), "isEmitPending", false);
        setField(term195061, term195061.getClass(), "charBuffer", null);
        setField(term195061, term195061.getClass(), "dataBuffer", null);
        setField(term195061, term195061.getClass(), "tagPending", null);
        setField(term195061, term195061.getClass(), "doctypePending", null);
        setField(term195061, term195061.getClass(), "commentPending", null);
        setField(term195061, term195061.getClass(), "lastStartTag", null);
        setBooleanField(term195061, term195061.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "eofError", argTypes, term195055, args);
        assertTrue(recursiveEquals(term195055, term195061));
    }

};


