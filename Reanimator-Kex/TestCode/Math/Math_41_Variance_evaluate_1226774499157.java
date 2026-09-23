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

public class Variance_evaluate_1226774499157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235713;
     Object term232955;
     Object term237722;
     Object term237723;

    public Variance_evaluate_1226774499157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235713 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term232955 = (double[]) newDoubleArray(218);
        term237722 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term237722, term237722.getClass(), "moment", null);
        setBooleanField(term237722, term237722.getClass(), "incMoment", false);
        setBooleanField(term237722, term237722.getClass(), "isBiasCorrected", false);
        setField(term237722, term237722.getClass(), "storedData", null);
        term237723 = (double[]) newDoubleArray(218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term232955;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term235713, args);
        assertTrue(recursiveEquals(term235713, term237722));
        assertTrue(recursiveEquals(term232955, term237723));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


