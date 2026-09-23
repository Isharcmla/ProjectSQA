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

public class Variance_init_1912968494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;

    public Variance_init_1912968494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term38 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term46 = (double[]) newDoubleArray(3);
        setDoubleField(term38, term38.getClass(), "m2", Double.NaN);
        setLongField(term38, term38.getClass(), "n", 0L);
        setDoubleField(term38, term38.getClass(), "m1", Double.NaN);
        setDoubleField(term38, term38.getClass(), "dev", Double.NaN);
        setDoubleField(term38, term38.getClass(), "nDev", Double.NaN);
        setField(term38, term38.getClass(), "storedData", null);
        setField(term37, term37.getClass(), "moment", term38);
        setBooleanField(term37, term37.getClass(), "incMoment", true);
        setBooleanField(term37, term37.getClass(), "isBiasCorrected", true);
        setDoubleElement(term46, 0, 0.37773193782763337);
        setDoubleElement(term46, 1, 0.8474802076607362);
        setDoubleElement(term46, 2, 0.5183269973490326);
        setField(term37, term37.getClass(), "storedData", term46);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Object[] args = new Object[1];
        args[0] = term37;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


