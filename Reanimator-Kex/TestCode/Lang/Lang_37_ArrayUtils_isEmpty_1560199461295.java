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

public class ArrayUtils_isEmpty_1560199461295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1344;
     Object term14815;

    public ArrayUtils_isEmpty_1560199461295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1344 = (char[]) newCharArray(4);
        setCharElement(term1344, 0, 'S');
        setCharElement(term1344, 1, 'R');
        setCharElement(term1344, 2, 'K');
        setCharElement(term1344, 3, 'T');
        term14815 = (char[]) newCharArray(4);
        setCharElement(term14815, 0, 'S');
        setCharElement(term14815, 1, 'R');
        setCharElement(term14815, 2, 'K');
        setCharElement(term14815, 3, 'T');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1344;
        Object retValue = callMethod(klass, "isEmpty", argTypes, null, args);
        assertTrue(recursiveEquals(term1344, term14815));
        assertTrue(recursiveEquals(retValue, false));
    }

};


