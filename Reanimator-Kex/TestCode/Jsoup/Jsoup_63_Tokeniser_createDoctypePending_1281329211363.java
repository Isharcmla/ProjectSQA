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

public class Tokeniser_createDoctypePending_1281329211363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333130;
     Object term333447;

    public Tokeniser_createDoctypePending_1281329211363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term333048 = (char[]) newCharArray(0);
        StringBuilder term333256 = new StringBuilder();
        ((StringBuilder) term333256).append(term333048);
        StringBuilder term333316 = new StringBuilder();
        term333130 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term333196 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term333196, term333196.getClass(), "name", term333256);
        setField(term333196, term333196.getClass(), "pubSysKey", null);
        setField(term333196, term333196.getClass(), "publicIdentifier", null);
        setField(term333196, term333196.getClass(), "systemIdentifier", term333316);
        setField(term333130, term333130.getClass(), "doctypePending", term333196);
        term333447 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term333448 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term333449 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term333450 = (byte[]) newByteArray(16);
        Object term333451 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term333452 = (byte[]) newByteArray(16);
        setField(term333447, term333447.getClass(), "reader", null);
        setField(term333447, term333447.getClass(), "errors", null);
        setField(term333447, term333447.getClass(), "state", null);
        setField(term333447, term333447.getClass(), "emitPending", null);
        setBooleanField(term333447, term333447.getClass(), "isEmitPending", false);
        setField(term333447, term333447.getClass(), "charsString", null);
        setField(term333447, term333447.getClass(), "charsBuilder", null);
        setField(term333447, term333447.getClass(), "dataBuffer", null);
        setField(term333447, term333447.getClass(), "tagPending", null);
        setField(term333447, term333447.getClass(), "startPending", null);
        setField(term333447, term333447.getClass(), "endPending", null);
        setField(term333447, term333447.getClass(), "charPending", null);
        setField(term333449, term333449.getClass(), "value", term333450);
        setByteField(term333449, term333449.getClass(), "coder", (byte) 0);
        setIntField(term333449, term333449.getClass(), "count", 0);
        setField(term333448, term333448.getClass(), "name", term333449);
        setField(term333448, term333448.getClass(), "pubSysKey", null);
        setField(term333448, term333448.getClass(), "publicIdentifier", null);
        setField(term333451, term333451.getClass(), "value", term333452);
        setByteField(term333451, term333451.getClass(), "coder", (byte) 0);
        setIntField(term333451, term333451.getClass(), "count", 0);
        setField(term333448, term333448.getClass(), "systemIdentifier", term333451);
        setBooleanField(term333448, term333448.getClass(), "forceQuirks", false);
        setField(term333448, term333448.getClass(), "type", null);
        setField(term333447, term333447.getClass(), "doctypePending", term333448);
        setField(term333447, term333447.getClass(), "commentPending", null);
        setField(term333447, term333447.getClass(), "lastStartTag", null);
        setBooleanField(term333447, term333447.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term333447, term333447.getClass(), "codepointHolder", null);
        setField(term333447, term333447.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDoctypePending", argTypes, term333130, args);
        assertTrue(recursiveEquals(term333130, term333447));
    }

};


