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

public class CharacterReader_consumeLetterSequence_1921724210235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50036;
     Object term50073;

    public CharacterReader_consumeLetterSequence_1921724210235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50036 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term50036, term50036.getClass(), "bufPos", -2147483648);
        setIntField(term50036, term50036.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term50036, term50036.getClass(), "bufLength", -2147483648);
        term50073 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term50073, term50073.getClass(), "charBuf", null);
        setField(term50073, term50073.getClass(), "reader", null);
        setIntField(term50073, term50073.getClass(), "bufLength", -2147483648);
        setIntField(term50073, term50073.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term50073, term50073.getClass(), "bufPos", -2147483648);
        setIntField(term50073, term50073.getClass(), "readerPos", 0);
        setIntField(term50073, term50073.getClass(), "bufMark", 0);
        setField(term50073, term50073.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeLetterSequence", argTypes, term50036, args);
        assertTrue(recursiveEquals(term50036, term50073));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


