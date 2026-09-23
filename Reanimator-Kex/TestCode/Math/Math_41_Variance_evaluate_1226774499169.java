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

public class Variance_evaluate_1226774499169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253160;
     Object term248350;
     Object term266834;
     Object term266835;

    public Variance_evaluate_1226774499169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253160 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term248350 = (double[]) newDoubleArray(389);
        term266834 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term266834, term266834.getClass(), "moment", null);
        setBooleanField(term266834, term266834.getClass(), "incMoment", false);
        setBooleanField(term266834, term266834.getClass(), "isBiasCorrected", false);
        setField(term266834, term266834.getClass(), "storedData", null);
        term266835 = (double[]) newDoubleArray(389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term248350;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term253160, args);
        assertTrue(recursiveEquals(term253160, term266834));
        assertTrue(recursiveEquals(term248350, term266835));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


