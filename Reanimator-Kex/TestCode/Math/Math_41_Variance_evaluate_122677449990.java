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

public class Variance_evaluate_122677449990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78910;
     Object term74292;
     Object term80542;
     Object term80543;

    public Variance_evaluate_122677449990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78910 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term74292 = (double[]) newDoubleArray(373);
        term80542 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term80542, term80542.getClass(), "moment", null);
        setBooleanField(term80542, term80542.getClass(), "incMoment", false);
        setBooleanField(term80542, term80542.getClass(), "isBiasCorrected", false);
        setField(term80542, term80542.getClass(), "storedData", null);
        term80543 = (double[]) newDoubleArray(373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term74292;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term78910, args);
        assertTrue(recursiveEquals(term78910, term80542));
        assertTrue(recursiveEquals(term74292, term80543));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


