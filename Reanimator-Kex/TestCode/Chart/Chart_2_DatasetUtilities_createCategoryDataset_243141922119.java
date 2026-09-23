package org.jfree.data.general;

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
import java.lang.IllegalArgumentException;
import static org.jfree.data.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DatasetUtilities_createCategoryDataset_243141922119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24824;
     Object term24826;

    public DatasetUtilities_createCategoryDataset_243141922119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24824 = (Object[]) newArray("java.lang.Comparable", 4);
        Object term24896 = newInstance(Class.forName("java.nio.HeapIntBuffer"));
        setElement(term24824, 0, term24896);
        setElement(term24824, 1, term24896);
        setElement(term24824, 2, term24896);
        setElement(term24824, 3, term24896);
        term24826 = (Object[]) newArray("java.lang.Comparable", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term24824;
        args[1] = term24826;
        args[2] = null;
        try {
            callMethod(klass, "createCategoryDataset", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


