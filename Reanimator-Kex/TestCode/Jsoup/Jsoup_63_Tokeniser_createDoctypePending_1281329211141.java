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

public class Tokeniser_createDoctypePending_1281329211141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162519;
     Object term162596;

    public Tokeniser_createDoctypePending_1281329211141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162519 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term162585 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term162585, term162585.getClass(), "name", null);
        setField(term162519, term162519.getClass(), "doctypePending", term162585);
        term162596 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term162597 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term162596, term162596.getClass(), "reader", null);
        setField(term162596, term162596.getClass(), "errors", null);
        setField(term162596, term162596.getClass(), "state", null);
        setField(term162596, term162596.getClass(), "emitPending", null);
        setBooleanField(term162596, term162596.getClass(), "isEmitPending", false);
        setField(term162596, term162596.getClass(), "charsString", null);
        setField(term162596, term162596.getClass(), "charsBuilder", null);
        setField(term162596, term162596.getClass(), "dataBuffer", null);
        setField(term162596, term162596.getClass(), "tagPending", null);
        setField(term162596, term162596.getClass(), "startPending", null);
        setField(term162596, term162596.getClass(), "endPending", null);
        setField(term162596, term162596.getClass(), "charPending", null);
        setField(term162597, term162597.getClass(), "name", null);
        setField(term162597, term162597.getClass(), "pubSysKey", null);
        setField(term162597, term162597.getClass(), "publicIdentifier", null);
        setField(term162597, term162597.getClass(), "systemIdentifier", null);
        setBooleanField(term162597, term162597.getClass(), "forceQuirks", false);
        setField(term162597, term162597.getClass(), "type", null);
        setField(term162596, term162596.getClass(), "doctypePending", term162597);
        setField(term162596, term162596.getClass(), "commentPending", null);
        setField(term162596, term162596.getClass(), "lastStartTag", null);
        setBooleanField(term162596, term162596.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term162596, term162596.getClass(), "codepointHolder", null);
        setField(term162596, term162596.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDoctypePending", argTypes, term162519, args);
        assertTrue(recursiveEquals(term162519, term162596));
    }

};


