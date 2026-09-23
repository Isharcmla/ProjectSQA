package org.apache.commons.math.stat.descriptive.moment;

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
import static org.apache.commons.math.stat.descriptive.moment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.descriptive.moment.EqualityUtils.*;
import java.lang.Double;

public class Variance_evaluate_1226774499111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124898;
     Object term121420;
     Object term129083;
     Object term129084;

    public Variance_evaluate_1226774499111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124898 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term121420 = (double[]) newDoubleArray(278);
        term129083 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term129083, term129083.getClass(), "moment", null);
        setBooleanField(term129083, term129083.getClass(), "incMoment", false);
        setBooleanField(term129083, term129083.getClass(), "isBiasCorrected", false);
        setField(term129083, term129083.getClass(), "storedData", null);
        term129084 = (double[]) newDoubleArray(278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term121420;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term124898, args);
        assertTrue(recursiveEquals(term124898, term129083));
        assertTrue(recursiveEquals(term121420, term129084));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


