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
import java.lang.Integer;

public class ArrayUtils_lastIndexOf_1162680693242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term769;
     Object term776;
     Object term778;
     Object term13179;

    public ArrayUtils_lastIndexOf_1162680693242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term769 = (char[]) newCharArray(6);
        setCharElement(term769, 0, 'J');
        setCharElement(term769, 1, 'C');
        setCharElement(term769, 2, 'Z');
        setCharElement(term769, 3, 'p');
        setCharElement(term769, 4, 'V');
        setCharElement(term769, 5, 'm');
        term776 = new Character('a');
        term778 = new Integer(1540719661);
        term13179 = (char[]) newCharArray(6);
        setCharElement(term13179, 0, 'J');
        setCharElement(term13179, 1, 'C');
        setCharElement(term13179, 2, 'Z');
        setCharElement(term13179, 3, 'p');
        setCharElement(term13179, 4, 'V');
        setCharElement(term13179, 5, 'm');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term769;
        args[1] = term776;
        args[2] = term778;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term769, term13179));
        assertTrue(recursiveEquals(term776, 'a'));
        assertTrue(recursiveEquals(term778, 1540719661));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


