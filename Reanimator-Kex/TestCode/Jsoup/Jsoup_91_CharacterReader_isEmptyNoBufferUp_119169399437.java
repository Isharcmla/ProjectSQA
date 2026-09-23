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

public class CharacterReader_isEmptyNoBufferUp_119169399437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104950;
     Object term105100;

    public CharacterReader_isEmptyNoBufferUp_119169399437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104950 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term104950, term104950.getClass(), "bufPos", -2147483648);
        setIntField(term104950, term104950.getClass(), "bufLength", -2147483647);
        term105100 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term105100, term105100.getClass(), "charBuf", null);
        setField(term105100, term105100.getClass(), "reader", null);
        setIntField(term105100, term105100.getClass(), "bufLength", -2147483647);
        setIntField(term105100, term105100.getClass(), "bufSplitPoint", 0);
        setIntField(term105100, term105100.getClass(), "bufPos", -2147483648);
        setIntField(term105100, term105100.getClass(), "readerPos", 0);
        setIntField(term105100, term105100.getClass(), "bufMark", 0);
        setField(term105100, term105100.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmptyNoBufferUp", argTypes, term104950, args);
        assertTrue(recursiveEquals(term104950, term105100));
        assertTrue(recursiveEquals(retValue, false));
    }

};


