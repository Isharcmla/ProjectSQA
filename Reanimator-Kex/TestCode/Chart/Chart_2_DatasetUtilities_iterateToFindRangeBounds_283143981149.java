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

public class DatasetUtilities_iterateToFindRangeBounds_283143981149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29824;

    public DatasetUtilities_iterateToFindRangeBounds_283143981149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29824 = newInstance(Class.forName("org.jfree.data.statistics.SimpleHistogramDataset"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jfree.data.xy.XYDataset");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("org.jfree.data.Range");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term29824;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "iterateToFindRangeBounds", argTypes, null, args);
    }

};


