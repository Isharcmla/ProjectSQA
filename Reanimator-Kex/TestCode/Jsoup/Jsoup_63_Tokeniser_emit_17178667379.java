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

public class Tokeniser_emit_17178667379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138791;
     Object term139067;

    public Tokeniser_emit_17178667379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138791 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term138791, term138791.getClass(), "charsString", null);
        term139067 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term139067, term139067.getClass(), "reader", null);
        setField(term139067, term139067.getClass(), "errors", null);
        setField(term139067, term139067.getClass(), "state", null);
        setField(term139067, term139067.getClass(), "emitPending", null);
        setBooleanField(term139067, term139067.getClass(), "isEmitPending", false);
        setField(term139067, term139067.getClass(), "charsString", " \u0001");
        setField(term139067, term139067.getClass(), "charsBuilder", null);
        setField(term139067, term139067.getClass(), "dataBuffer", null);
        setField(term139067, term139067.getClass(), "tagPending", null);
        setField(term139067, term139067.getClass(), "startPending", null);
        setField(term139067, term139067.getClass(), "endPending", null);
        setField(term139067, term139067.getClass(), "charPending", null);
        setField(term139067, term139067.getClass(), "doctypePending", null);
        setField(term139067, term139067.getClass(), "commentPending", null);
        setField(term139067, term139067.getClass(), "lastStartTag", null);
        setBooleanField(term139067, term139067.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term139067, term139067.getClass(), "codepointHolder", null);
        setField(term139067, term139067.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 256;
        callMethod(klass, "emit", argTypes, term138791, args);
        assertTrue(recursiveEquals(term138791, term139067));
    }

};


