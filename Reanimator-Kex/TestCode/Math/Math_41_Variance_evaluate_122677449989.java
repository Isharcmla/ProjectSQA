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

public class Variance_evaluate_122677449989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74173;
     Object term72627;
     Object term79539;
     Object term79540;

    public Variance_evaluate_122677449989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74173 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term72627 = (double[]) newDoubleArray(117);
        term79539 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term79539, term79539.getClass(), "moment", null);
        setBooleanField(term79539, term79539.getClass(), "incMoment", false);
        setBooleanField(term79539, term79539.getClass(), "isBiasCorrected", false);
        setField(term79539, term79539.getClass(), "storedData", null);
        term79540 = (double[]) newDoubleArray(117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term72627;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term74173, args);
        assertTrue(recursiveEquals(term74173, term79539));
        assertTrue(recursiveEquals(term72627, term79540));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


