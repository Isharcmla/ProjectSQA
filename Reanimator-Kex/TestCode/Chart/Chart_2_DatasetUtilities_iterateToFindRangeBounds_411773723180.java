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
import java.util.ArrayList;

public class DatasetUtilities_iterateToFindRangeBounds_411773723180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34390;
     Object term34442;

    public DatasetUtilities_iterateToFindRangeBounds_411773723180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34390 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        term34442 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.data.category.CategoryDataset");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term34390;
        args[1] = term34442;
        args[2] = false;
        callMethod(klass, "iterateToFindRangeBounds", argTypes, null, args);
    }

};


