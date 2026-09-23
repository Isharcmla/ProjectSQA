package org.apache.commons.math.distribution;

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
import static org.apache.commons.math.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.distribution.EqualityUtils.*;
import java.lang.Double;

public class FDistributionImpl_setNumeratorDegreesOfFreedom_90491747816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;
     Object term33;
     Object term998;

    public FDistributionImpl_setNumeratorDegreesOfFreedom_90491747816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term30, term30.getClass(), "numeratorDegreesOfFreedom", 0.2779719046761513);
        setDoubleField(term30, term30.getClass(), "denominatorDegreesOfFreedom", 0.6436713023569729);
        term33 = new Double(0.7332741045694002);
        term998 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term998, term998.getClass(), "numeratorDegreesOfFreedom", 0.7332741045694002);
        setDoubleField(term998, term998.getClass(), "denominatorDegreesOfFreedom", 0.6436713023569729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.FDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term33;
        callMethod(klass, "setNumeratorDegreesOfFreedom", argTypes, term30, args);
        assertTrue(recursiveEquals(term30, term998));
        assertTrue(recursiveEquals(term33, 0.7332741045694002));
    }

};


