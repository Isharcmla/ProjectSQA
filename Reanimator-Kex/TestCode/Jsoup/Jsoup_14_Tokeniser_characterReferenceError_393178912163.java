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

public class Tokeniser_characterReferenceError_393178912163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247125;
     Object term247131;

    public Tokeniser_characterReferenceError_393178912163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247125 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term247125, term247125.getClass(), "trackErrors", false);
        term247131 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term247131, term247131.getClass(), "reader", null);
        setBooleanField(term247131, term247131.getClass(), "trackErrors", false);
        setField(term247131, term247131.getClass(), "errors", null);
        setField(term247131, term247131.getClass(), "state", null);
        setField(term247131, term247131.getClass(), "emitPending", null);
        setBooleanField(term247131, term247131.getClass(), "isEmitPending", false);
        setField(term247131, term247131.getClass(), "charBuffer", null);
        setField(term247131, term247131.getClass(), "dataBuffer", null);
        setField(term247131, term247131.getClass(), "tagPending", null);
        setField(term247131, term247131.getClass(), "doctypePending", null);
        setField(term247131, term247131.getClass(), "commentPending", null);
        setField(term247131, term247131.getClass(), "lastStartTag", null);
        setBooleanField(term247131, term247131.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "characterReferenceError", argTypes, term247125, args);
        assertTrue(recursiveEquals(term247125, term247131));
    }

};


