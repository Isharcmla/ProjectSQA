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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ArrayUtils_add_125194032319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1666;
     Object term1674;
     Object term1676;

    public ArrayUtils_add_125194032319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1666 = (Object[]) newArray("java.lang.Object", 7);
        Object term1667 = newInstance(Class.forName("java.lang.Object"));
        Object term1668 = newInstance(Class.forName("java.lang.Object"));
        Object term1669 = newInstance(Class.forName("java.lang.Object"));
        Object term1670 = newInstance(Class.forName("java.lang.Object"));
        Object term1671 = newInstance(Class.forName("java.lang.Object"));
        Object term1672 = newInstance(Class.forName("java.lang.Object"));
        Object term1673 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1666, 0, term1667);
        setElement(term1666, 1, term1668);
        setElement(term1666, 2, term1669);
        setElement(term1666, 3, term1670);
        setElement(term1666, 4, term1671);
        setElement(term1666, 5, term1672);
        setElement(term1666, 6, term1673);
        term1674 = new Integer(-615654495);
        term1676 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term1666;
        args[1] = term1674;
        args[2] = term1676;
        try {
            callMethod(klass, "add", argTypes, null, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


