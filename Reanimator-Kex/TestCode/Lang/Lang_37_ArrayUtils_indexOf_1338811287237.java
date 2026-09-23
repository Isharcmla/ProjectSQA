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

public class ArrayUtils_indexOf_1338811287237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723;
     Object term730;
     Object term13058;

    public ArrayUtils_indexOf_1338811287237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term723 = (char[]) newCharArray(6);
        setCharElement(term723, 0, 'H');
        setCharElement(term723, 1, 'g');
        setCharElement(term723, 2, 'q');
        setCharElement(term723, 3, 'z');
        setCharElement(term723, 4, 'x');
        setCharElement(term723, 5, 'x');
        term730 = new Character('t');
        term13058 = (char[]) newCharArray(6);
        setCharElement(term13058, 0, 'H');
        setCharElement(term13058, 1, 'g');
        setCharElement(term13058, 2, 'q');
        setCharElement(term13058, 3, 'z');
        setCharElement(term13058, 4, 'x');
        setCharElement(term13058, 5, 'x');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term723;
        args[1] = term730;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term723, term13058));
        assertTrue(recursiveEquals(term730, 't'));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


