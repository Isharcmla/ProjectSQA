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

public class CharacterReader_isEmpty_80380485191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17742;
     Object term18001;

    public CharacterReader_isEmpty_80380485191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17742 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term17742, term17742.getClass(), "bufPos", -2147483648);
        setIntField(term17742, term17742.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term17742, term17742.getClass(), "bufLength", -2147483648);
        term18001 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term18001, term18001.getClass(), "charBuf", null);
        setField(term18001, term18001.getClass(), "reader", null);
        setIntField(term18001, term18001.getClass(), "bufLength", -2147483648);
        setIntField(term18001, term18001.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term18001, term18001.getClass(), "bufPos", -2147483648);
        setIntField(term18001, term18001.getClass(), "readerPos", 0);
        setIntField(term18001, term18001.getClass(), "bufMark", 0);
        setField(term18001, term18001.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term17742, args);
        assertTrue(recursiveEquals(term17742, term18001));
        assertTrue(recursiveEquals(retValue, true));
    }

};


