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

public class DatasetUtilities_sampleFunction2DToSeries_305084196164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31826;

    public DatasetUtilities_sampleFunction2DToSeries_305084196164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31826 = newInstance(Class.forName("org.jfree.data.function.NormalDistributionFunction2D"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.jfree.data.function.Function2D");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[5];
        args[0] = term31826;
        args[1] = 0.0;
        args[2] = 0.0;
        args[3] = 0;
        args[4] = null;
        callMethod(klass, "sampleFunction2DToSeries", argTypes, null, args);
    }

};


