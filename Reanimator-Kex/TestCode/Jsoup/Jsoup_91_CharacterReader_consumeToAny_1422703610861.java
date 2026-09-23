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

public class CharacterReader_consumeToAny_1422703610861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277584;
     Object term276433;

    public CharacterReader_consumeToAny_1422703610861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277584 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term276437 = (char[]) newCharArray(493);
        setIntField(term277584, term277584.getClass(), "bufPos", -1609564155);
        setIntField(term277584, term277584.getClass(), "bufSplitPoint", -1609564154);
        setIntField(term277584, term277584.getClass(), "bufLength", -1609564145);
        setField(term277584, term277584.getClass(), "charBuf", term276437);
        setField(term277584, term277584.getClass(), "stringCache", null);
        term276433 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term276433;
        try {
            callMethod(klass, "consumeToAny", argTypes, term277584, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


