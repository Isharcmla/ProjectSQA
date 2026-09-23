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

public class ArrayUtils_remove_1092918454331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1804;
     Object term1814;

    public ArrayUtils_remove_1092918454331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1804 = (Object[]) newArray("java.lang.Object", 9);
        Object term1805 = newInstance(Class.forName("java.lang.Object"));
        Object term1806 = newInstance(Class.forName("java.lang.Object"));
        Object term1807 = newInstance(Class.forName("java.lang.Object"));
        Object term1808 = newInstance(Class.forName("java.lang.Object"));
        Object term1809 = newInstance(Class.forName("java.lang.Object"));
        Object term1810 = newInstance(Class.forName("java.lang.Object"));
        Object term1811 = newInstance(Class.forName("java.lang.Object"));
        Object term1812 = newInstance(Class.forName("java.lang.Object"));
        Object term1813 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1804, 0, term1805);
        setElement(term1804, 1, term1806);
        setElement(term1804, 2, term1807);
        setElement(term1804, 3, term1808);
        setElement(term1804, 4, term1809);
        setElement(term1804, 5, term1810);
        setElement(term1804, 6, term1811);
        setElement(term1804, 7, term1812);
        setElement(term1804, 8, term1813);
        term1814 = new Integer(1107176718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1804;
        args[1] = term1814;
        try {
            callMethod(klass, "remove", argTypes, null, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


