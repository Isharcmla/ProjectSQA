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

public class ArrayUtils_indexOf_1337916565240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term749;
     Object term756;
     Object term758;
     Object term13130;

    public ArrayUtils_indexOf_1337916565240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term749 = (char[]) newCharArray(6);
        setCharElement(term749, 0, 'l');
        setCharElement(term749, 1, 'P');
        setCharElement(term749, 2, 'w');
        setCharElement(term749, 3, 'D');
        setCharElement(term749, 4, 'Y');
        setCharElement(term749, 5, 'F');
        term756 = new Character('s');
        term758 = new Integer(962840079);
        term13130 = (char[]) newCharArray(6);
        setCharElement(term13130, 0, 'l');
        setCharElement(term13130, 1, 'P');
        setCharElement(term13130, 2, 'w');
        setCharElement(term13130, 3, 'D');
        setCharElement(term13130, 4, 'Y');
        setCharElement(term13130, 5, 'F');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term749;
        args[1] = term756;
        args[2] = term758;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term749, term13130));
        assertTrue(recursiveEquals(term756, 's'));
        assertTrue(recursiveEquals(term758, 962840079));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


