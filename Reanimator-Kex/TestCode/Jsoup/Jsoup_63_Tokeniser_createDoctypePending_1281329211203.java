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

public class Tokeniser_createDoctypePending_1281329211203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200173;
     Object term200528;

    public Tokeniser_createDoctypePending_1281329211203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term200085 = (char[]) newCharArray(0);
        StringBuilder term200299 = new StringBuilder();
        ((StringBuilder) term200299).append(term200085);
        StringBuilder term200397 = new StringBuilder();
        ((StringBuilder) term200397).append(term200085);
        term200173 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term200239 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term200239, term200239.getClass(), "name", term200299);
        setField(term200239, term200239.getClass(), "pubSysKey", "");
        setField(term200239, term200239.getClass(), "publicIdentifier", term200397);
        setField(term200239, term200239.getClass(), "systemIdentifier", null);
        setField(term200173, term200173.getClass(), "doctypePending", term200239);
        term200528 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term200529 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term200530 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term200531 = (byte[]) newByteArray(16);
        Object term200532 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term200533 = (byte[]) newByteArray(16);
        setField(term200528, term200528.getClass(), "reader", null);
        setField(term200528, term200528.getClass(), "errors", null);
        setField(term200528, term200528.getClass(), "state", null);
        setField(term200528, term200528.getClass(), "emitPending", null);
        setBooleanField(term200528, term200528.getClass(), "isEmitPending", false);
        setField(term200528, term200528.getClass(), "charsString", null);
        setField(term200528, term200528.getClass(), "charsBuilder", null);
        setField(term200528, term200528.getClass(), "dataBuffer", null);
        setField(term200528, term200528.getClass(), "tagPending", null);
        setField(term200528, term200528.getClass(), "startPending", null);
        setField(term200528, term200528.getClass(), "endPending", null);
        setField(term200528, term200528.getClass(), "charPending", null);
        setField(term200530, term200530.getClass(), "value", term200531);
        setByteField(term200530, term200530.getClass(), "coder", (byte) 0);
        setIntField(term200530, term200530.getClass(), "count", 0);
        setField(term200529, term200529.getClass(), "name", term200530);
        setField(term200529, term200529.getClass(), "pubSysKey", null);
        setField(term200532, term200532.getClass(), "value", term200533);
        setByteField(term200532, term200532.getClass(), "coder", (byte) 0);
        setIntField(term200532, term200532.getClass(), "count", 0);
        setField(term200529, term200529.getClass(), "publicIdentifier", term200532);
        setField(term200529, term200529.getClass(), "systemIdentifier", null);
        setBooleanField(term200529, term200529.getClass(), "forceQuirks", false);
        setField(term200529, term200529.getClass(), "type", null);
        setField(term200528, term200528.getClass(), "doctypePending", term200529);
        setField(term200528, term200528.getClass(), "commentPending", null);
        setField(term200528, term200528.getClass(), "lastStartTag", null);
        setBooleanField(term200528, term200528.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term200528, term200528.getClass(), "codepointHolder", null);
        setField(term200528, term200528.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDoctypePending", argTypes, term200173, args);
        assertTrue(recursiveEquals(term200173, term200528));
    }

};


