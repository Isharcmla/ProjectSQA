package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;

public class WordUtils_capitalize_13655764618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107;
     Object term870;

    public WordUtils_capitalize_13655764618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107 = (char[]) newCharArray(5);
        setCharElement(term107, 0, 'P');
        setCharElement(term107, 1, 'A');
        setCharElement(term107, 2, 'E');
        setCharElement(term107, 3, 'B');
        setCharElement(term107, 4, 't');
        term870 = (char[]) newCharArray(5);
        setCharElement(term870, 0, 'P');
        setCharElement(term870, 1, 'A');
        setCharElement(term870, 2, 'E');
        setCharElement(term870, 3, 'B');
        setCharElement(term870, 4, 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.WordUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "jJCZpVmanW";
        args[1] = term107;
        Object retValue = callMethod(klass, "capitalize", argTypes, null, args);
        assertTrue(recursiveEquals(term107, "jJCZpVmanW"));
        assertTrue(recursiveEquals(retValue, "JJCZpVmanW"));
    }

};


