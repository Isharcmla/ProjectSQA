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
import java.lang.NullPointerException;
import static org.jfree.data.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DatasetUtilities_createConsolidatedPieDataset_2111315993114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23661;

    public DatasetUtilities_createConsolidatedPieDataset_2111315993114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23661 = newInstance(Class.forName("org.jfree.data.pie.DefaultPieDataset"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.data.pie.PieDataset");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term23661;
        args[1] = null;
        args[2] = 0.0;
        try {
            callMethod(klass, "createConsolidatedPieDataset", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


