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

public class Variance_evaluate_17086986069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;
     Object term137;

    public Variance_evaluate_17086986069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term122 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term130 = (double[]) newDoubleArray(6);
        setDoubleField(term122, term122.getClass(), "m2", Double.NaN);
        setLongField(term122, term122.getClass(), "n", 0L);
        setDoubleField(term122, term122.getClass(), "m1", Double.NaN);
        setDoubleField(term122, term122.getClass(), "dev", Double.NaN);
        setDoubleField(term122, term122.getClass(), "nDev", Double.NaN);
        setField(term122, term122.getClass(), "storedData", null);
        setField(term121, term121.getClass(), "moment", term122);
        setBooleanField(term121, term121.getClass(), "incMoment", true);
        setBooleanField(term121, term121.getClass(), "isBiasCorrected", true);
        setDoubleElement(term130, 0, 0.5840714198152577);
        setDoubleElement(term130, 1, 0.7559240768573477);
        setDoubleElement(term130, 2, 0.10667076642995188);
        setDoubleElement(term130, 3, 0.11493000848982304);
        setDoubleElement(term130, 4, 0.37161417339133307);
        setDoubleElement(term130, 5, 0.6805867182029153);
        setField(term121, term121.getClass(), "storedData", term130);
        term137 = (double[]) newDoubleArray(7);
        setDoubleElement(term137, 0, 0.2852810965221698);
        setDoubleElement(term137, 1, 0.6300849762307866);
        setDoubleElement(term137, 2, 0.9737083944266686);
        setDoubleElement(term137, 3, 0.0668892744806211);
        setDoubleElement(term137, 4, 0.3587267442738795);
        setDoubleElement(term137, 5, 0.07802449704920456);
        setDoubleElement(term137, 6, 0.5279279537140873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term137;
        callMethod(klass, "evaluate", argTypes, term121, args);
    }

};


