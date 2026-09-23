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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeToAny_1422703610247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52309;
     Object term52211;

    public CharacterReader_consumeToAny_1422703610247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52309 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term52211 = (char[]) newCharArray(0);
        setIntField(term52309, term52309.getClass(), "bufPos", -1);
        setIntField(term52309, term52309.getClass(), "bufSplitPoint", 0);
        setIntField(term52309, term52309.getClass(), "bufLength", 1);
        setField(term52309, term52309.getClass(), "charBuf", term52211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term52211;
        try {
            callMethod(klass, "consumeToAny", argTypes, term52309, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


