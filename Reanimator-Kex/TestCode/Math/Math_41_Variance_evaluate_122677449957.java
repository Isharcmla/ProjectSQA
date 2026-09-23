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

public class Variance_evaluate_122677449957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14278;
     Object term13620;
     Object term16174;
     Object term16175;

    public Variance_evaluate_122677449957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14278 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term13620 = (double[]) newDoubleArray(491);
        term16174 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term16174, term16174.getClass(), "moment", null);
        setBooleanField(term16174, term16174.getClass(), "incMoment", false);
        setBooleanField(term16174, term16174.getClass(), "isBiasCorrected", false);
        setField(term16174, term16174.getClass(), "storedData", null);
        term16175 = (double[]) newDoubleArray(491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term13620;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term14278, args);
        assertTrue(recursiveEquals(term14278, term16174));
        assertTrue(recursiveEquals(term13620, term16175));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


