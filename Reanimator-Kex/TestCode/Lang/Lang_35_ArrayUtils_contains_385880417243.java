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
import java.lang.Character;

public class ArrayUtils_contains_385880417243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term786;
     Object term792;
     Object term13217;

    public ArrayUtils_contains_385880417243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term786 = (char[]) newCharArray(5);
        setCharElement(term786, 0, 'n');
        setCharElement(term786, 1, 'W');
        setCharElement(term786, 2, 'E');
        setCharElement(term786, 3, 'G');
        setCharElement(term786, 4, 't');
        term792 = new Character('D');
        term13217 = (char[]) newCharArray(5);
        setCharElement(term13217, 0, 'n');
        setCharElement(term13217, 1, 'W');
        setCharElement(term13217, 2, 'E');
        setCharElement(term13217, 3, 'G');
        setCharElement(term13217, 4, 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term786;
        args[1] = term792;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term786, term13217));
        assertTrue(recursiveEquals(term792, 'D'));
        assertTrue(recursiveEquals(retValue, false));
    }

};


