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

public class Variance_evaluate_170869860662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21350;
     Object term21206;
     Object term21374;
     Object term21375;

    public Variance_evaluate_170869860662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21350 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setBooleanField(term21350, term21350.getClass(), "incMoment", false);
        term21206 = (double[]) newDoubleArray(1);
        term21374 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term21374, term21374.getClass(), "moment", null);
        setBooleanField(term21374, term21374.getClass(), "incMoment", false);
        setBooleanField(term21374, term21374.getClass(), "isBiasCorrected", false);
        setField(term21374, term21374.getClass(), "storedData", null);
        term21375 = (double[]) newDoubleArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term21206;
        Object retValue = callMethod(klass, "evaluate", argTypes, term21350, args);
        assertTrue(recursiveEquals(term21350, term21374));
        assertTrue(recursiveEquals(term21206, term21375));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


