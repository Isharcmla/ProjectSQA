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

public class ArrayUtils_isSameLength_1946816906203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288;
     Object term295;
     Object term11726;
     Object term11727;

    public ArrayUtils_isSameLength_1946816906203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288 = (char[]) newCharArray(6);
        setCharElement(term288, 0, 'Z');
        setCharElement(term288, 1, 't');
        setCharElement(term288, 2, 'T');
        setCharElement(term288, 3, 'D');
        setCharElement(term288, 4, 's');
        setCharElement(term288, 5, 'j');
        term295 = (char[]) newCharArray(5);
        setCharElement(term295, 0, 'l');
        setCharElement(term295, 1, 'J');
        setCharElement(term295, 2, 'A');
        setCharElement(term295, 3, 'E');
        setCharElement(term295, 4, 't');
        term11726 = (char[]) newCharArray(6);
        setCharElement(term11726, 0, 'Z');
        setCharElement(term11726, 1, 't');
        setCharElement(term11726, 2, 'T');
        setCharElement(term11726, 3, 'D');
        setCharElement(term11726, 4, 's');
        setCharElement(term11726, 5, 'j');
        term11727 = (char[]) newCharArray(5);
        setCharElement(term11727, 0, 'l');
        setCharElement(term11727, 1, 'J');
        setCharElement(term11727, 2, 'A');
        setCharElement(term11727, 3, 'E');
        setCharElement(term11727, 4, 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term288;
        args[1] = term295;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term288, term11726));
        assertTrue(recursiveEquals(term295, term11727));
        assertTrue(recursiveEquals(retValue, false));
    }

};


