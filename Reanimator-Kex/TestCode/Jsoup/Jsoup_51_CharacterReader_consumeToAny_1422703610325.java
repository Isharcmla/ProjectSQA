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

public class CharacterReader_consumeToAny_1422703610325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2066361;
     Object term2065251;

    public CharacterReader_consumeToAny_1422703610325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2066361 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2065254 = (char[]) newCharArray(490);
        setIntField(term2066361, term2066361.getClass(), "pos", 1);
        setIntField(term2066361, term2066361.getClass(), "length", 5);
        setField(term2066361, term2066361.getClass(), "input", term2065254);
        setField(term2066361, term2066361.getClass(), "stringCache", null);
        term2065251 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2065251;
        try {
            callMethod(klass, "consumeToAny", argTypes, term2066361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


