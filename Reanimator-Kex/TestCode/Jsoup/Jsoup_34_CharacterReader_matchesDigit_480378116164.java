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

public class CharacterReader_matchesDigit_480378116164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23674;
     Object term24080;

    public CharacterReader_matchesDigit_480378116164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23674 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term23572 = (char[]) newCharArray(8);
        setIntField(term23674, term23674.getClass(), "pos", 6);
        setIntField(term23674, term23674.getClass(), "length", 7);
        setCharElement(term23572, 0, (char) 58);
        setCharElement(term23572, 1, (char) 58);
        setCharElement(term23572, 2, (char) 58);
        setCharElement(term23572, 3, (char) 58);
        setCharElement(term23572, 4, (char) 58);
        setCharElement(term23572, 5, (char) 58);
        setCharElement(term23572, 6, (char) 58);
        setCharElement(term23572, 7, (char) 58);
        setField(term23674, term23674.getClass(), "input", term23572);
        term24080 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term24081 = (char[]) newCharArray(8);
        setCharElement(term24081, 0, (char) 58);
        setCharElement(term24081, 1, (char) 58);
        setCharElement(term24081, 2, (char) 58);
        setCharElement(term24081, 3, (char) 58);
        setCharElement(term24081, 4, (char) 58);
        setCharElement(term24081, 5, (char) 58);
        setCharElement(term24081, 6, (char) 58);
        setCharElement(term24081, 7, (char) 58);
        setField(term24080, term24080.getClass(), "input", term24081);
        setIntField(term24080, term24080.getClass(), "length", 7);
        setIntField(term24080, term24080.getClass(), "pos", 6);
        setIntField(term24080, term24080.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term23674, args);
        assertTrue(recursiveEquals(term23674, term24080));
        assertTrue(recursiveEquals(retValue, false));
    }

};


