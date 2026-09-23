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
import java.lang.Object;
import java.lang.Double;

public class Variance_getResult_7473197996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;

    public Variance_getResult_7473197996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term74 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term82 = (double[]) newDoubleArray(1);
        setDoubleField(term74, term74.getClass(), "m2", Double.NaN);
        setLongField(term74, term74.getClass(), "n", 0L);
        setDoubleField(term74, term74.getClass(), "m1", Double.NaN);
        setDoubleField(term74, term74.getClass(), "dev", Double.NaN);
        setDoubleField(term74, term74.getClass(), "nDev", Double.NaN);
        setField(term74, term74.getClass(), "storedData", null);
        setField(term73, term73.getClass(), "moment", term74);
        setBooleanField(term73, term73.getClass(), "incMoment", true);
        setBooleanField(term73, term73.getClass(), "isBiasCorrected", true);
        setDoubleElement(term82, 0, 0.2779719046761513);
        setField(term73, term73.getClass(), "storedData", term82);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResult", argTypes, term73, args);
    }

};


