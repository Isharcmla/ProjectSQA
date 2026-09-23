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

public class ArrayUtils_reverse_137132136214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412;
     Object term12245;

    public ArrayUtils_reverse_137132136214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term412 = (char[]) newCharArray(9);
        setCharElement(term412, 0, 'R');
        setCharElement(term412, 1, 'r');
        setCharElement(term412, 2, 'b');
        setCharElement(term412, 3, 'M');
        setCharElement(term412, 4, 'u');
        setCharElement(term412, 5, 'L');
        setCharElement(term412, 6, 'c');
        setCharElement(term412, 7, 'g');
        setCharElement(term412, 8, 'Q');
        term12245 = (char[]) newCharArray(9);
        setCharElement(term12245, 0, 'Q');
        setCharElement(term12245, 1, 'g');
        setCharElement(term12245, 2, 'c');
        setCharElement(term12245, 3, 'L');
        setCharElement(term12245, 4, 'u');
        setCharElement(term12245, 5, 'M');
        setCharElement(term12245, 6, 'b');
        setCharElement(term12245, 7, 'r');
        setCharElement(term12245, 8, 'R');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term412;
        callMethod(klass, "reverse", argTypes, null, args);
        assertTrue(recursiveEquals(term412, term12245));
    }

};


