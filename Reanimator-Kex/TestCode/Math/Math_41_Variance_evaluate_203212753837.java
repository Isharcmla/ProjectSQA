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
import org.apache.commons.math.exception.DimensionMismatchException;
import static org.apache.commons.math.stat.descriptive.moment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class Variance_evaluate_203212753837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357;
     Object term372;
     Object term379;
     Object term385;

    public Variance_evaluate_203212753837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term358 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term366 = (double[]) newDoubleArray(5);
        setDoubleField(term358, term358.getClass(), "m2", Double.NaN);
        setLongField(term358, term358.getClass(), "n", 0L);
        setDoubleField(term358, term358.getClass(), "m1", Double.NaN);
        setDoubleField(term358, term358.getClass(), "dev", Double.NaN);
        setDoubleField(term358, term358.getClass(), "nDev", Double.NaN);
        setField(term358, term358.getClass(), "storedData", null);
        setField(term357, term357.getClass(), "moment", term358);
        setBooleanField(term357, term357.getClass(), "incMoment", true);
        setBooleanField(term357, term357.getClass(), "isBiasCorrected", true);
        setDoubleElement(term366, 0, 0.11577948268926874);
        setDoubleElement(term366, 1, 0.5617009352394552);
        setDoubleElement(term366, 2, 0.09067063848644474);
        setDoubleElement(term366, 3, 0.268304014379393);
        setDoubleElement(term366, 4, 0.7171972879282721);
        setField(term357, term357.getClass(), "storedData", term366);
        term372 = (double[]) newDoubleArray(6);
        setDoubleElement(term372, 0, 0.9006361024877096);
        setDoubleElement(term372, 1, 0.5644914462415626);
        setDoubleElement(term372, 2, 0.509895859167191);
        setDoubleElement(term372, 3, 0.07417792024383196);
        setDoubleElement(term372, 4, 0.686293604788188);
        setDoubleElement(term372, 5, 0.12764449157430724);
        term379 = (double[]) newDoubleArray(5);
        setDoubleElement(term379, 0, 0.39446728256884744);
        setDoubleElement(term379, 1, 0.7865909711092062);
        setDoubleElement(term379, 2, 0.06587158449170749);
        setDoubleElement(term379, 3, 0.0865998004187658);
        setDoubleElement(term379, 4, 0.9628647861255637);
        term385 = new Double(0.623231822150205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term372;
        args[1] = term379;
        args[2] = term385;
        try {
            callMethod(klass, "evaluate", argTypes, term357, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


