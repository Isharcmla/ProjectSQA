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

public class DatasetUtilities_createCategoryDataset_243141922174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33356;
     Object term33358;

    public DatasetUtilities_createCategoryDataset_243141922174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33534 = Class.forName((String) "java.util.Locale$IsoCountryCode");
        Field term33533 = ((Class) term33534).getDeclaredField((String) "PART1_ALPHA2");
        ((Field) term33533).setAccessible(true);
        Object enum3 = ((Field) term33533).get((Object) null);
        term33356 = (Object[]) newArray("java.lang.Comparable", 490);
        setElement(term33356, 0, enum3);
        term33358 = (Object[]) newArray("java.lang.Comparable", 489);
        setElement(term33358, 0, enum3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term33356;
        args[1] = term33358;
        args[2] = null;
        callMethod(klass, "createCategoryDataset", argTypes, null, args);
    }

};


