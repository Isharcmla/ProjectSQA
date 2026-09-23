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

public class Tokeniser_unescapeEntities_180262396055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134378;
     Object term134470;

    public Tokeniser_unescapeEntities_180262396055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134378 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term134448 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term134448, term134448.getClass(), "bufPos", -2147483648);
        setIntField(term134448, term134448.getClass(), "bufLength", -2147483648);
        setField(term134378, term134378.getClass(), "reader", term134448);
        term134470 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term134471 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term134471, term134471.getClass(), "charBuf", null);
        setField(term134471, term134471.getClass(), "reader", null);
        setIntField(term134471, term134471.getClass(), "bufLength", -2147483648);
        setIntField(term134471, term134471.getClass(), "bufSplitPoint", 0);
        setIntField(term134471, term134471.getClass(), "bufPos", -2147483648);
        setIntField(term134471, term134471.getClass(), "readerPos", 0);
        setIntField(term134471, term134471.getClass(), "bufMark", 0);
        setField(term134471, term134471.getClass(), "stringCache", null);
        setField(term134470, term134470.getClass(), "reader", term134471);
        setField(term134470, term134470.getClass(), "errors", null);
        setField(term134470, term134470.getClass(), "state", null);
        setField(term134470, term134470.getClass(), "emitPending", null);
        setBooleanField(term134470, term134470.getClass(), "isEmitPending", false);
        setField(term134470, term134470.getClass(), "charsString", null);
        setField(term134470, term134470.getClass(), "charsBuilder", null);
        setField(term134470, term134470.getClass(), "dataBuffer", null);
        setField(term134470, term134470.getClass(), "tagPending", null);
        setField(term134470, term134470.getClass(), "startPending", null);
        setField(term134470, term134470.getClass(), "endPending", null);
        setField(term134470, term134470.getClass(), "charPending", null);
        setField(term134470, term134470.getClass(), "doctypePending", null);
        setField(term134470, term134470.getClass(), "commentPending", null);
        setField(term134470, term134470.getClass(), "lastStartTag", null);
        setBooleanField(term134470, term134470.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term134470, term134470.getClass(), "codepointHolder", null);
        setField(term134470, term134470.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        Object retValue = callMethod(klass, "unescapeEntities", argTypes, term134378, args);
        assertTrue(recursiveEquals(term134378, term134470));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


