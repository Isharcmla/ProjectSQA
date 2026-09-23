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

public class ArrayUtils_contains_385880417241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term775;
     Object term781;
     Object term13182;

    public ArrayUtils_contains_385880417241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term775 = (char[]) newCharArray(5);
        setCharElement(term775, 0, 'n');
        setCharElement(term775, 1, 'W');
        setCharElement(term775, 2, 'E');
        setCharElement(term775, 3, 'G');
        setCharElement(term775, 4, 't');
        term781 = new Character('D');
        term13182 = (char[]) newCharArray(5);
        setCharElement(term13182, 0, 'n');
        setCharElement(term13182, 1, 'W');
        setCharElement(term13182, 2, 'E');
        setCharElement(term13182, 3, 'G');
        setCharElement(term13182, 4, 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term775;
        args[1] = term781;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term775, term13182));
        assertTrue(recursiveEquals(term781, 'D'));
        assertTrue(recursiveEquals(retValue, false));
    }

};


