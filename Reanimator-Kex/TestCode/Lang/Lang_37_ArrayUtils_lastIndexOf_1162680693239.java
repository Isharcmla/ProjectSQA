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

public class ArrayUtils_lastIndexOf_1162680693239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term758;
     Object term765;
     Object term767;
     Object term13107;

    public ArrayUtils_lastIndexOf_1162680693239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term758 = (char[]) newCharArray(6);
        setCharElement(term758, 0, 'J');
        setCharElement(term758, 1, 'C');
        setCharElement(term758, 2, 'Z');
        setCharElement(term758, 3, 'p');
        setCharElement(term758, 4, 'V');
        setCharElement(term758, 5, 'm');
        term765 = new Character('a');
        term767 = new Integer(1540719661);
        term13107 = (char[]) newCharArray(6);
        setCharElement(term13107, 0, 'J');
        setCharElement(term13107, 1, 'C');
        setCharElement(term13107, 2, 'Z');
        setCharElement(term13107, 3, 'p');
        setCharElement(term13107, 4, 'V');
        setCharElement(term13107, 5, 'm');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term758;
        args[1] = term765;
        args[2] = term767;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term758, term13107));
        assertTrue(recursiveEquals(term765, 'a'));
        assertTrue(recursiveEquals(term767, 1540719661));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


