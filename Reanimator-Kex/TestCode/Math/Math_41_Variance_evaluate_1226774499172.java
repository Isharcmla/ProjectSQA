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

public class Variance_evaluate_1226774499172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255290;
     Object term254104;
     Object term268716;
     Object term268717;

    public Variance_evaluate_1226774499172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255290 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term254104 = (double[]) newDoubleArray(87);
        term268716 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term268716, term268716.getClass(), "moment", null);
        setBooleanField(term268716, term268716.getClass(), "incMoment", false);
        setBooleanField(term268716, term268716.getClass(), "isBiasCorrected", false);
        setField(term268716, term268716.getClass(), "storedData", null);
        term268717 = (double[]) newDoubleArray(87);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term254104;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term255290, args);
        assertTrue(recursiveEquals(term255290, term268716));
        assertTrue(recursiveEquals(term254104, term268717));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


