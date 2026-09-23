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

public class CharacterReader_consumeToAny_1422703610306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1322106;
     Object term1320992;

    public CharacterReader_consumeToAny_1422703610306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1322106 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1320995 = (char[]) newCharArray(490);
        setIntField(term1322106, term1322106.getClass(), "pos", 548505932);
        setIntField(term1322106, term1322106.getClass(), "length", 548505936);
        setCharElement(term1320995, 0, (char) 128);
        setCharElement(term1320995, 1, (char) 128);
        setField(term1322106, term1322106.getClass(), "input", term1320995);
        setField(term1322106, term1322106.getClass(), "stringCache", null);
        term1320992 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1320992;
        try {
            callMethod(klass, "consumeToAny", argTypes, term1322106, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


