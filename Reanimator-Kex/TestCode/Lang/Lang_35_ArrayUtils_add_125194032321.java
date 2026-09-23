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

public class ArrayUtils_add_125194032321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1675;
     Object term1685;
     Object term1687;

    public ArrayUtils_add_125194032321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1675 = (Object[]) newArray("java.lang.Object", 9);
        Object term1676 = newInstance(Class.forName("java.lang.Object"));
        Object term1677 = newInstance(Class.forName("java.lang.Object"));
        Object term1678 = newInstance(Class.forName("java.lang.Object"));
        Object term1679 = newInstance(Class.forName("java.lang.Object"));
        Object term1680 = newInstance(Class.forName("java.lang.Object"));
        Object term1681 = newInstance(Class.forName("java.lang.Object"));
        Object term1682 = newInstance(Class.forName("java.lang.Object"));
        Object term1683 = newInstance(Class.forName("java.lang.Object"));
        Object term1684 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1675, 0, term1676);
        setElement(term1675, 1, term1677);
        setElement(term1675, 2, term1678);
        setElement(term1675, 3, term1679);
        setElement(term1675, 4, term1680);
        setElement(term1675, 5, term1681);
        setElement(term1675, 6, term1682);
        setElement(term1675, 7, term1683);
        setElement(term1675, 8, term1684);
        term1685 = new Integer(-615654495);
        term1687 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term1675;
        args[1] = term1685;
        args[2] = term1687;
        try {
            callMethod(klass, "add", argTypes, null, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


