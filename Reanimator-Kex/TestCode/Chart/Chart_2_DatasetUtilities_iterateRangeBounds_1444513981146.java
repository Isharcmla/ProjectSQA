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

public class DatasetUtilities_iterateRangeBounds_1444513981146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29492;

    public DatasetUtilities_iterateRangeBounds_1444513981146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29492 = newInstance(Class.forName("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.category.CategoryDataset");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term29492;
        args[1] = false;
        callMethod(klass, "iterateRangeBounds", argTypes, null, args);
    }

};


