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
import java.lang.Object;
import java.lang.Double;

public class Variance_isBiasCorrected_60887831138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;
     Object term7826;

    public Variance_isBiasCorrected_60887831138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term404 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term412 = (double[]) newDoubleArray(3);
        setDoubleField(term404, term404.getClass(), "m2", Double.NaN);
        setLongField(term404, term404.getClass(), "n", 0L);
        setDoubleField(term404, term404.getClass(), "m1", Double.NaN);
        setDoubleField(term404, term404.getClass(), "dev", Double.NaN);
        setDoubleField(term404, term404.getClass(), "nDev", Double.NaN);
        setField(term404, term404.getClass(), "storedData", null);
        setField(term403, term403.getClass(), "moment", term404);
        setBooleanField(term403, term403.getClass(), "incMoment", true);
        setBooleanField(term403, term403.getClass(), "isBiasCorrected", true);
        setDoubleElement(term412, 0, 0.09037487793444521);
        setDoubleElement(term412, 1, 0.6561919196821765);
        setDoubleElement(term412, 2, 0.7330178886612495);
        setField(term403, term403.getClass(), "storedData", term412);
        term7826 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term7827 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term7828 = (double[]) newDoubleArray(3);
        setDoubleField(term7827, term7827.getClass(), "m2", Double.NaN);
        setLongField(term7827, term7827.getClass(), "n", 0L);
        setDoubleField(term7827, term7827.getClass(), "m1", Double.NaN);
        setDoubleField(term7827, term7827.getClass(), "dev", Double.NaN);
        setDoubleField(term7827, term7827.getClass(), "nDev", Double.NaN);
        setField(term7827, term7827.getClass(), "storedData", null);
        setField(term7826, term7826.getClass(), "moment", term7827);
        setBooleanField(term7826, term7826.getClass(), "incMoment", true);
        setBooleanField(term7826, term7826.getClass(), "isBiasCorrected", true);
        setDoubleElement(term7828, 0, 0.09037487793444521);
        setDoubleElement(term7828, 1, 0.6561919196821765);
        setDoubleElement(term7828, 2, 0.7330178886612495);
        setField(term7826, term7826.getClass(), "storedData", term7828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBiasCorrected", argTypes, term403, args);
        assertTrue(recursiveEquals(term403, term7826));
    }

};


