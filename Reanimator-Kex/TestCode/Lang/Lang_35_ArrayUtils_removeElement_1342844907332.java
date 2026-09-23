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
import java.lang.Object;

public class ArrayUtils_removeElement_1342844907332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1816;
     Object term1822;
     Object term23979;
     Object term23985;
     Object term23978;

    public ArrayUtils_removeElement_1342844907332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1816 = (Object[]) newArray("java.lang.Object", 5);
        Object term1817 = newInstance(Class.forName("java.lang.Object"));
        Object term1818 = newInstance(Class.forName("java.lang.Object"));
        Object term1819 = newInstance(Class.forName("java.lang.Object"));
        Object term1820 = newInstance(Class.forName("java.lang.Object"));
        Object term1821 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1816, 0, term1817);
        setElement(term1816, 1, term1818);
        setElement(term1816, 2, term1819);
        setElement(term1816, 3, term1820);
        setElement(term1816, 4, term1821);
        term1822 = newInstance(Class.forName("java.lang.Object"));
        term23979 = (Object[]) newArray("java.lang.Object", 5);
        Object term23980 = newInstance(Class.forName("java.lang.Object"));
        Object term23981 = newInstance(Class.forName("java.lang.Object"));
        Object term23982 = newInstance(Class.forName("java.lang.Object"));
        Object term23983 = newInstance(Class.forName("java.lang.Object"));
        Object term23984 = newInstance(Class.forName("java.lang.Object"));
        setElement(term23979, 0, term23980);
        setElement(term23979, 1, term23981);
        setElement(term23979, 2, term23982);
        setElement(term23979, 3, term23983);
        setElement(term23979, 4, term23984);
        term23985 = newInstance(Class.forName("java.lang.Object"));
        term23978 = (Object[]) newArray("java.lang.Object", 5);
        Object term23962 = newInstance(Class.forName("java.lang.Object"));
        Object term23963 = newInstance(Class.forName("java.lang.Object"));
        Object term23964 = newInstance(Class.forName("java.lang.Object"));
        Object term23965 = newInstance(Class.forName("java.lang.Object"));
        Object term23966 = newInstance(Class.forName("java.lang.Object"));
        setElement(term23978, 0, term23962);
        setElement(term23978, 1, term23963);
        setElement(term23978, 2, term23964);
        setElement(term23978, 3, term23965);
        setElement(term23978, 4, term23966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term1816;
        args[1] = term1822;
        Object retValue = callMethod(klass, "removeElement", argTypes, null, args);
        assertTrue(recursiveEquals(term1816, term23979));
        assertTrue(recursiveEquals(term1822, term23985));
        assertTrue(recursiveEquals(retValue, term23978));
    }

};


