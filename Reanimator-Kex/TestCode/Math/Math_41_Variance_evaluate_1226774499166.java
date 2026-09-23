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

public class Variance_evaluate_1226774499166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247915;
     Object term242577;
     Object term257508;
     Object term257509;

    public Variance_evaluate_1226774499166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247915 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term242577 = (double[]) newDoubleArray(433);
        term257508 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term257508, term257508.getClass(), "moment", null);
        setBooleanField(term257508, term257508.getClass(), "incMoment", false);
        setBooleanField(term257508, term257508.getClass(), "isBiasCorrected", false);
        setField(term257508, term257508.getClass(), "storedData", null);
        term257509 = (double[]) newDoubleArray(433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term242577;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term247915, args);
        assertTrue(recursiveEquals(term247915, term257508));
        assertTrue(recursiveEquals(term242577, term257509));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


