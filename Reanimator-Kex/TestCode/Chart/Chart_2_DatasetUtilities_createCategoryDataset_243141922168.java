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
import java.lang.String;

public class DatasetUtilities_createCategoryDataset_243141922168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32119;
     Object term32121;

    public DatasetUtilities_createCategoryDataset_243141922168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32415 = Class.forName((String) "java.util.Locale$FilteringMode");
        Field term32414 = ((Class) term32415).getDeclaredField((String) "AUTOSELECT_FILTERING");
        ((Field) term32414).setAccessible(true);
        Object enum2 = ((Field) term32414).get((Object) null);
        term32119 = (Object[]) newArray("java.lang.Comparable", 1);
        setElement(term32119, 0, enum2);
        term32121 = (Object[]) newArray("java.lang.Comparable", 4);
        setElement(term32121, 0, enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term32119;
        args[1] = term32121;
        args[2] = null;
        callMethod(klass, "createCategoryDataset", argTypes, null, args);
    }

};


