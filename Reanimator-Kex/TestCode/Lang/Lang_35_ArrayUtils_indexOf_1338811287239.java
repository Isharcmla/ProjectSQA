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

public class ArrayUtils_indexOf_1338811287239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734;
     Object term741;
     Object term13104;

    public ArrayUtils_indexOf_1338811287239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term734 = (char[]) newCharArray(6);
        setCharElement(term734, 0, 'H');
        setCharElement(term734, 1, 'g');
        setCharElement(term734, 2, 'q');
        setCharElement(term734, 3, 'z');
        setCharElement(term734, 4, 'x');
        setCharElement(term734, 5, 'x');
        term741 = new Character('t');
        term13104 = (char[]) newCharArray(6);
        setCharElement(term13104, 0, 'H');
        setCharElement(term13104, 1, 'g');
        setCharElement(term13104, 2, 'q');
        setCharElement(term13104, 3, 'z');
        setCharElement(term13104, 4, 'x');
        setCharElement(term13104, 5, 'x');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term734;
        args[1] = term741;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term734, term13104));
        assertTrue(recursiveEquals(term741, 't'));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


