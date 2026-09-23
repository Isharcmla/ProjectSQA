package org.apache.commons.math.stat.inference;

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
import static org.apache.commons.math.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChiSquareTestImpl_chiSquareDataSetsComparison_25100906574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29808;
     Object term29678;

    public ChiSquareTestImpl_chiSquareDataSetsComparison_25100906574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29808 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        term29678 = (long[]) newLongArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term29678;
        args[1] = null;
        callMethod(klass, "chiSquareDataSetsComparison", argTypes, term29808, args);
    }

};


