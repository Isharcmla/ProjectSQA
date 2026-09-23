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

public class Tokeniser_createDoctypePending_1281329211253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226251;
     Object term226468;

    public Tokeniser_createDoctypePending_1281329211253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term226171 = (char[]) newCharArray(0);
        StringBuilder term226377 = new StringBuilder();
        ((StringBuilder) term226377).append(term226171);
        term226251 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term226317 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term226317, term226317.getClass(), "name", null);
        setField(term226317, term226317.getClass(), "pubSysKey", null);
        setField(term226317, term226317.getClass(), "publicIdentifier", term226377);
        setField(term226317, term226317.getClass(), "systemIdentifier", term226377);
        setField(term226251, term226251.getClass(), "doctypePending", term226317);
        term226468 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term226469 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term226470 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term226471 = (byte[]) newByteArray(16);
        setField(term226468, term226468.getClass(), "reader", null);
        setField(term226468, term226468.getClass(), "errors", null);
        setField(term226468, term226468.getClass(), "state", null);
        setField(term226468, term226468.getClass(), "emitPending", null);
        setBooleanField(term226468, term226468.getClass(), "isEmitPending", false);
        setField(term226468, term226468.getClass(), "charsString", null);
        setField(term226468, term226468.getClass(), "charsBuilder", null);
        setField(term226468, term226468.getClass(), "dataBuffer", null);
        setField(term226468, term226468.getClass(), "tagPending", null);
        setField(term226468, term226468.getClass(), "startPending", null);
        setField(term226468, term226468.getClass(), "endPending", null);
        setField(term226468, term226468.getClass(), "charPending", null);
        setField(term226469, term226469.getClass(), "name", null);
        setField(term226469, term226469.getClass(), "pubSysKey", null);
        setField(term226470, term226470.getClass(), "value", term226471);
        setByteField(term226470, term226470.getClass(), "coder", (byte) 0);
        setIntField(term226470, term226470.getClass(), "count", 0);
        setField(term226469, term226469.getClass(), "publicIdentifier", term226470);
        setField(term226469, term226469.getClass(), "systemIdentifier", term226470);
        setBooleanField(term226469, term226469.getClass(), "forceQuirks", false);
        setField(term226469, term226469.getClass(), "type", null);
        setField(term226468, term226468.getClass(), "doctypePending", term226469);
        setField(term226468, term226468.getClass(), "commentPending", null);
        setField(term226468, term226468.getClass(), "lastStartTag", null);
        setBooleanField(term226468, term226468.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term226468, term226468.getClass(), "codepointHolder", null);
        setField(term226468, term226468.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDoctypePending", argTypes, term226251, args);
        assertTrue(recursiveEquals(term226251, term226468));
    }

};


