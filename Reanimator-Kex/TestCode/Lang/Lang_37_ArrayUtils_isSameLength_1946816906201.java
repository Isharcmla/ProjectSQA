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

public class ArrayUtils_isSameLength_1946816906201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;
     Object term284;
     Object term11680;
     Object term11681;

    public ArrayUtils_isSameLength_1946816906201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277 = (char[]) newCharArray(6);
        setCharElement(term277, 0, 'Z');
        setCharElement(term277, 1, 't');
        setCharElement(term277, 2, 'T');
        setCharElement(term277, 3, 'D');
        setCharElement(term277, 4, 's');
        setCharElement(term277, 5, 'j');
        term284 = (char[]) newCharArray(5);
        setCharElement(term284, 0, 'l');
        setCharElement(term284, 1, 'J');
        setCharElement(term284, 2, 'A');
        setCharElement(term284, 3, 'E');
        setCharElement(term284, 4, 't');
        term11680 = (char[]) newCharArray(6);
        setCharElement(term11680, 0, 'Z');
        setCharElement(term11680, 1, 't');
        setCharElement(term11680, 2, 'T');
        setCharElement(term11680, 3, 'D');
        setCharElement(term11680, 4, 's');
        setCharElement(term11680, 5, 'j');
        term11681 = (char[]) newCharArray(5);
        setCharElement(term11681, 0, 'l');
        setCharElement(term11681, 1, 'J');
        setCharElement(term11681, 2, 'A');
        setCharElement(term11681, 3, 'E');
        setCharElement(term11681, 4, 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term277;
        args[1] = term284;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term277, term11680));
        assertTrue(recursiveEquals(term284, term11681));
        assertTrue(recursiveEquals(retValue, false));
    }

};


