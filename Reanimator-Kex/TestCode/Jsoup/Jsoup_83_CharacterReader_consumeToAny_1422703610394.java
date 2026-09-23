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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeToAny_1422703610394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95205;
     Object term95092;

    public CharacterReader_consumeToAny_1422703610394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95205 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term95205, term95205.getClass(), "bufPos", 3);
        setIntField(term95205, term95205.getClass(), "bufSplitPoint", 4);
        setIntField(term95205, term95205.getClass(), "bufLength", 6);
        setField(term95205, term95205.getClass(), "charBuf", null);
        term95092 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term95092;
        try {
            callMethod(klass, "consumeToAny", argTypes, term95205, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


