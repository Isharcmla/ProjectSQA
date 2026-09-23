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
     Object term738;
     Object term745;
     Object term747;
     Object term13133;

    public ArrayUtils_indexOf_1337916565240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term738 = (char[]) newCharArray(6);
        setCharElement(term738, 0, 'l');
        setCharElement(term738, 1, 'P');
        setCharElement(term738, 2, 'w');
        setCharElement(term738, 3, 'D');
        setCharElement(term738, 4, 'Y');
        setCharElement(term738, 5, 'F');
        term745 = new Character('s');
        term747 = new Integer(962840079);
        term13133 = (char[]) newCharArray(6);
        setCharElement(term13133, 0, 'l');
        setCharElement(term13133, 1, 'P');
        setCharElement(term13133, 2, 'w');
        setCharElement(term13133, 3, 'D');
        setCharElement(term13133, 4, 'Y');
        setCharElement(term13133, 5, 'F');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term738;
        args[1] = term745;
        args[2] = term747;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term738, term13133));
        assertTrue(recursiveEquals(term745, 's'));
        assertTrue(recursiveEquals(term747, 962840079));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


