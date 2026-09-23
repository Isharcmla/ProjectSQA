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

public class Tokeniser_isAppropriateEndTagToken_151432047953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77456;
     Object term78444;

    public Tokeniser_isAppropriateEndTagToken_151432047953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77456 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term77456, term77456.getClass(), "lastStartTag", null);
        term78444 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term78444, term78444.getClass(), "reader", null);
        setField(term78444, term78444.getClass(), "errors", null);
        setField(term78444, term78444.getClass(), "state", null);
        setField(term78444, term78444.getClass(), "emitPending", null);
        setBooleanField(term78444, term78444.getClass(), "isEmitPending", false);
        setField(term78444, term78444.getClass(), "charBuffer", null);
        setField(term78444, term78444.getClass(), "dataBuffer", null);
        setField(term78444, term78444.getClass(), "tagPending", null);
        setField(term78444, term78444.getClass(), "doctypePending", null);
        setField(term78444, term78444.getClass(), "commentPending", null);
        setField(term78444, term78444.getClass(), "lastStartTag", null);
        setBooleanField(term78444, term78444.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isAppropriateEndTagToken", argTypes, term77456, args);
        assertTrue(recursiveEquals(term77456, term78444));
        assertTrue(recursiveEquals(retValue, false));
    }

};


