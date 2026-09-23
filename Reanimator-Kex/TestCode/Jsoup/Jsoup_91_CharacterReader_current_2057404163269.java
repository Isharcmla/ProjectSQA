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

public class CharacterReader_current_2057404163269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58409;
     Object term58670;

    public CharacterReader_current_2057404163269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58409 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term58409, term58409.getClass(), "bufPos", -2147483648);
        setIntField(term58409, term58409.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term58409, term58409.getClass(), "bufLength", -2147483648);
        term58670 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term58670, term58670.getClass(), "charBuf", null);
        setField(term58670, term58670.getClass(), "reader", null);
        setIntField(term58670, term58670.getClass(), "bufLength", -2147483648);
        setIntField(term58670, term58670.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term58670, term58670.getClass(), "bufPos", -2147483648);
        setIntField(term58670, term58670.getClass(), "readerPos", 0);
        setIntField(term58670, term58670.getClass(), "bufMark", 0);
        setField(term58670, term58670.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "current", argTypes, term58409, args);
        assertTrue(recursiveEquals(term58409, term58670));
        assertTrue(recursiveEquals(retValue, 65535));
    }

};


