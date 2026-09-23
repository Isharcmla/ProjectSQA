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

public class DatasetUtilities_findStackedRangeBounds_1681028330173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33355;

    public DatasetUtilities_findStackedRangeBounds_1681028330173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33355 = newInstance(Class.forName("org.jfree.data.xy.DefaultTableXYDataset"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.xy.TableXYDataset");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term33355;
        args[1] = 0.0;
        callMethod(klass, "findStackedRangeBounds", argTypes, null, args);
    }

};


