package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;

public class StringUtils_indexOfAny_423869868195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1265;
     Object term9329;

    public StringUtils_indexOfAny_423869868195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1265 = (char[]) newCharArray(3);
        setCharElement(term1265, 0, 'n');
        setCharElement(term1265, 1, 'Z');
        setCharElement(term1265, 2, 't');
        term9329 = (char[]) newCharArray(3);
        setCharElement(term9329, 0, 'n');
        setCharElement(term9329, 1, 'Z');
        setCharElement(term9329, 2, 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1265;
        Object retValue = callMethod(klass, "indexOfAny", argTypes, null, args);
        assertTrue(recursiveEquals(term1265, term9329));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


