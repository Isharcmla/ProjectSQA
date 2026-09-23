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

public class ArrayUtils_add_438478687312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1573;
     Object term1582;

    public ArrayUtils_add_438478687312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1573 = (char[]) newCharArray(8);
        setCharElement(term1573, 0, 'S');
        setCharElement(term1573, 1, 'z');
        setCharElement(term1573, 2, 'Y');
        setCharElement(term1573, 3, 'Y');
        setCharElement(term1573, 4, 'I');
        setCharElement(term1573, 5, 'r');
        setCharElement(term1573, 6, 'c');
        setCharElement(term1573, 7, 'R');
        term1582 = new Character('M');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term1573;
        args[1] = term1582;
        try {
            callMethod(klass, "add", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


