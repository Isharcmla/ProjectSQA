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

public class ChiSquareTestImpl_chiSquareTestDataSetsComparison_106002047576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30439;
     Object term29814;

    public ChiSquareTestImpl_chiSquareTestDataSetsComparison_106002047576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30439 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        setField(term30439, term30439.getClass(), "distribution", null);
        term29814 = (long[]) newLongArray(489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term29814;
        args[1] = null;
        args[2] = 4.778309726736482E-299;
        callMethod(klass, "chiSquareTestDataSetsComparison", argTypes, term30439, args);
    }

};


