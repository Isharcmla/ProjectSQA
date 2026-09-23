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

public class ArrayUtils_reverse_137132136212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401;
     Object term12199;

    public ArrayUtils_reverse_137132136212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term401 = (char[]) newCharArray(9);
        setCharElement(term401, 0, 'R');
        setCharElement(term401, 1, 'r');
        setCharElement(term401, 2, 'b');
        setCharElement(term401, 3, 'M');
        setCharElement(term401, 4, 'u');
        setCharElement(term401, 5, 'L');
        setCharElement(term401, 6, 'c');
        setCharElement(term401, 7, 'g');
        setCharElement(term401, 8, 'Q');
        term12199 = (char[]) newCharArray(9);
        setCharElement(term12199, 0, 'Q');
        setCharElement(term12199, 1, 'g');
        setCharElement(term12199, 2, 'c');
        setCharElement(term12199, 3, 'L');
        setCharElement(term12199, 4, 'u');
        setCharElement(term12199, 5, 'M');
        setCharElement(term12199, 6, 'b');
        setCharElement(term12199, 7, 'r');
        setCharElement(term12199, 8, 'R');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term401;
        callMethod(klass, "reverse", argTypes, null, args);
        assertTrue(recursiveEquals(term401, term12199));
    }

};


