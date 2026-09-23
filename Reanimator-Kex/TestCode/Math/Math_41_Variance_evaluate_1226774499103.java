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

public class Variance_evaluate_1226774499103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103688;
     Object term102418;
     Object term108253;
     Object term108254;

    public Variance_evaluate_1226774499103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103688 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term102418 = (double[]) newDoubleArray(94);
        term108253 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term108253, term108253.getClass(), "moment", null);
        setBooleanField(term108253, term108253.getClass(), "incMoment", false);
        setBooleanField(term108253, term108253.getClass(), "isBiasCorrected", false);
        setField(term108253, term108253.getClass(), "storedData", null);
        term108254 = (double[]) newDoubleArray(94);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term102418;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term103688, args);
        assertTrue(recursiveEquals(term103688, term108253));
        assertTrue(recursiveEquals(term102418, term108254));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


