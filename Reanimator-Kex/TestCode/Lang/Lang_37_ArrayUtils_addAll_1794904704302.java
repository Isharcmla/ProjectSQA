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

public class ArrayUtils_addAll_1794904704302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1438;
     Object term1439;
     Object term15006;
     Object term15007;
     Object term14993;

    public ArrayUtils_addAll_1794904704302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1438 = (char[]) newCharArray(0);
        term1439 = (char[]) newCharArray(5);
        setCharElement(term1439, 0, 'N');
        setCharElement(term1439, 1, 'F');
        setCharElement(term1439, 2, 'h');
        setCharElement(term1439, 3, 'R');
        setCharElement(term1439, 4, 'N');
        term15006 = (char[]) newCharArray(0);
        term15007 = (char[]) newCharArray(5);
        setCharElement(term15007, 0, 'N');
        setCharElement(term15007, 1, 'F');
        setCharElement(term15007, 2, 'h');
        setCharElement(term15007, 3, 'R');
        setCharElement(term15007, 4, 'N');
        term14993 = (char[]) newCharArray(5);
        setCharElement(term14993, 0, 'N');
        setCharElement(term14993, 1, 'F');
        setCharElement(term14993, 2, 'h');
        setCharElement(term14993, 3, 'R');
        setCharElement(term14993, 4, 'N');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1438;
        args[1] = term1439;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1438, term15006));
        assertTrue(recursiveEquals(term1439, term15007));
        assertTrue(recursiveEquals(retValue, term14993));
    }

};


