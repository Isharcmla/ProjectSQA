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

public class CharacterReader_consumeLetterSequence_1921724210188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37264;
     Object term37416;

    public CharacterReader_consumeLetterSequence_1921724210188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37264 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term37264, term37264.getClass(), "bufPos", -2147483648);
        setIntField(term37264, term37264.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term37264, term37264.getClass(), "bufLength", -2147483648);
        term37416 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term37416, term37416.getClass(), "charBuf", null);
        setField(term37416, term37416.getClass(), "reader", null);
        setIntField(term37416, term37416.getClass(), "bufLength", -2147483648);
        setIntField(term37416, term37416.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term37416, term37416.getClass(), "bufPos", -2147483648);
        setIntField(term37416, term37416.getClass(), "readerPos", 0);
        setIntField(term37416, term37416.getClass(), "bufMark", 0);
        setField(term37416, term37416.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeLetterSequence", argTypes, term37264, args);
        assertTrue(recursiveEquals(term37264, term37416));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


