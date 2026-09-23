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

public class ArrayUtils_remove_1092918454330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1793;
     Object term1797;

    public ArrayUtils_remove_1092918454330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1793 = (Object[]) newArray("java.lang.Object", 3);
        Object term1794 = newInstance(Class.forName("java.lang.Object"));
        Object term1795 = newInstance(Class.forName("java.lang.Object"));
        Object term1796 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1793, 0, term1794);
        setElement(term1793, 1, term1795);
        setElement(term1793, 2, term1796);
        term1797 = new Integer(1107176718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1793;
        args[1] = term1797;
        try {
            callMethod(klass, "remove", argTypes, null, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


