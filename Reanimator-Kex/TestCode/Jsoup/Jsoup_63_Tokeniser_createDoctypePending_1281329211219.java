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
import java.lang.StringBuilder;

public class Tokeniser_createDoctypePending_1281329211219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211051;
     Object term211561;

    public Tokeniser_createDoctypePending_1281329211219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term211215 = new StringBuilder();
        term211051 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term211117 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term211117, term211117.getClass(), "name", null);
        setField(term211117, term211117.getClass(), "pubSysKey", "");
        setField(term211117, term211117.getClass(), "publicIdentifier", term211215);
        setField(term211051, term211051.getClass(), "doctypePending", term211117);
        term211561 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term211562 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term211563 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term211564 = (byte[]) newByteArray(16);
        setField(term211561, term211561.getClass(), "reader", null);
        setField(term211561, term211561.getClass(), "errors", null);
        setField(term211561, term211561.getClass(), "state", null);
        setField(term211561, term211561.getClass(), "emitPending", null);
        setBooleanField(term211561, term211561.getClass(), "isEmitPending", false);
        setField(term211561, term211561.getClass(), "charsString", null);
        setField(term211561, term211561.getClass(), "charsBuilder", null);
        setField(term211561, term211561.getClass(), "dataBuffer", null);
        setField(term211561, term211561.getClass(), "tagPending", null);
        setField(term211561, term211561.getClass(), "startPending", null);
        setField(term211561, term211561.getClass(), "endPending", null);
        setField(term211561, term211561.getClass(), "charPending", null);
        setField(term211562, term211562.getClass(), "name", null);
        setField(term211562, term211562.getClass(), "pubSysKey", null);
        setField(term211563, term211563.getClass(), "value", term211564);
        setByteField(term211563, term211563.getClass(), "coder", (byte) 0);
        setIntField(term211563, term211563.getClass(), "count", 0);
        setField(term211562, term211562.getClass(), "publicIdentifier", term211563);
        setField(term211562, term211562.getClass(), "systemIdentifier", null);
        setBooleanField(term211562, term211562.getClass(), "forceQuirks", false);
        setField(term211562, term211562.getClass(), "type", null);
        setField(term211561, term211561.getClass(), "doctypePending", term211562);
        setField(term211561, term211561.getClass(), "commentPending", null);
        setField(term211561, term211561.getClass(), "lastStartTag", null);
        setBooleanField(term211561, term211561.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term211561, term211561.getClass(), "codepointHolder", null);
        setField(term211561, term211561.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDoctypePending", argTypes, term211051, args);
        assertTrue(recursiveEquals(term211051, term211561));
    }

};


