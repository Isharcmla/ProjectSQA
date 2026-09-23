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

public class Variance_copy_98763734020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term459;
     Object term475;

    public Variance_copy_98763734020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term459 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term460 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term468 = (double[]) newDoubleArray(6);
        setDoubleField(term460, term460.getClass(), "m2", Double.NaN);
        setLongField(term460, term460.getClass(), "n", 0L);
        setDoubleField(term460, term460.getClass(), "m1", Double.NaN);
        setDoubleField(term460, term460.getClass(), "dev", Double.NaN);
        setDoubleField(term460, term460.getClass(), "nDev", Double.NaN);
        setField(term460, term460.getClass(), "storedData", null);
        setField(term459, term459.getClass(), "moment", term460);
        setBooleanField(term459, term459.getClass(), "incMoment", true);
        setBooleanField(term459, term459.getClass(), "isBiasCorrected", true);
        setDoubleElement(term468, 0, 0.19625398866403143);
        setDoubleElement(term468, 1, 0.45069204793711093);
        setDoubleElement(term468, 2, 0.9341364461850963);
        setDoubleElement(term468, 3, 0.9022041121474429);
        setDoubleElement(term468, 4, 0.6512870939318848);
        setDoubleElement(term468, 5, 0.8777038609128434);
        setField(term459, term459.getClass(), "storedData", term468);
        term475 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term476 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term484 = (double[]) newDoubleArray(6);
        setDoubleField(term476, term476.getClass(), "m2", Double.NaN);
        setLongField(term476, term476.getClass(), "n", 0L);
        setDoubleField(term476, term476.getClass(), "m1", Double.NaN);
        setDoubleField(term476, term476.getClass(), "dev", Double.NaN);
        setDoubleField(term476, term476.getClass(), "nDev", Double.NaN);
        setField(term476, term476.getClass(), "storedData", null);
        setField(term475, term475.getClass(), "moment", term476);
        setBooleanField(term475, term475.getClass(), "incMoment", true);
        setBooleanField(term475, term475.getClass(), "isBiasCorrected", true);
        setDoubleElement(term484, 0, 0.008025683154629148);
        setDoubleElement(term484, 1, 0.40598298281353484);
        setDoubleElement(term484, 2, 0.3710067290060264);
        setDoubleElement(term484, 3, 0.7818620200430967);
        setDoubleElement(term484, 4, 0.04640022995603543);
        setDoubleElement(term484, 5, 0.9123572866833729);
        setField(term475, term475.getClass(), "storedData", term484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        argTypes[1] = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Object[] args = new Object[2];
        args[0] = term459;
        args[1] = term475;
        callMethod(klass, "copy", argTypes, null, args);
    }

};


