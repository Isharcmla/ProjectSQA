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

public class CharacterReader_consumeToAny_1422703610345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2093339;
     Object term2093169;

    public CharacterReader_consumeToAny_1422703610345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2093339 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2093172 = (char[]) newCharArray(10);
        setIntField(term2093339, term2093339.getClass(), "pos", 671088641);
        setIntField(term2093339, term2093339.getClass(), "length", 671088647);
        setCharElement(term2093172, 0, (char) 8);
        setField(term2093339, term2093339.getClass(), "input", term2093172);
        setField(term2093339, term2093339.getClass(), "stringCache", null);
        term2093169 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2093169;
        try {
            callMethod(klass, "consumeToAny", argTypes, term2093339, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


