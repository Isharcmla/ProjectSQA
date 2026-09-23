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

public class DatasetUtilities_createCategoryDataset_243141922144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29065;
     Object term29067;

    public DatasetUtilities_createCategoryDataset_243141922144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29065 = (Object[]) newArray("java.lang.Comparable", 1);
        Object term29283 = newInstance(Class.forName("org.jfree.chart.renderer.LookupPaintScale$PaintItem"));
        setElement(term29065, 0, term29283);
        term29067 = (Object[]) newArray("java.lang.Comparable", 3);
        setElement(term29067, 0, term29283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term29065;
        args[1] = term29067;
        args[2] = null;
        callMethod(klass, "createCategoryDataset", argTypes, null, args);
    }

};


