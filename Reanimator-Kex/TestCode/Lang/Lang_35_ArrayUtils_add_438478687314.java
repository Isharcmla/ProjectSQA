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
import java.lang.reflect.InaccessibleObjectException;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;

public class ArrayUtils_add_438478687314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1582;
     Object term1591;

    public ArrayUtils_add_438478687314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1582 = (char[]) newCharArray(8);
        setCharElement(term1582, 0, 'S');
        setCharElement(term1582, 1, 'z');
        setCharElement(term1582, 2, 'Y');
        setCharElement(term1582, 3, 'Y');
        setCharElement(term1582, 4, 'I');
        setCharElement(term1582, 5, 'r');
        setCharElement(term1582, 6, 'c');
        setCharElement(term1582, 7, 'R');
        term1591 = new Character('M');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term1582;
        args[1] = term1591;
        try {
            callMethod(klass, "add", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


