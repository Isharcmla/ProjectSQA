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
import static org.jfree.data.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DatasetUtilities_createCategoryDataset_243141922139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28451;
     Object term28453;

    public DatasetUtilities_createCategoryDataset_243141922139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28451 = (Object[]) newArray("java.lang.Comparable", 1);
        Object term28663 = newInstance(Class.forName("java.nio.HeapDoubleBufferR"));
        setElement(term28451, 0, term28663);
        term28453 = (Object[]) newArray("java.lang.Comparable", 495);
        setElement(term28453, 0, term28663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term28451;
        args[1] = term28453;
        args[2] = null;
        callMethod(klass, "createCategoryDataset", argTypes, null, args);
    }

};


