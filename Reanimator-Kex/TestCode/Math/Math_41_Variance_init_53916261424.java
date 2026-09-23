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
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;

public class Variance_init_53916261424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term22;
     Object term1299;
     Object term1302;

    public Variance_init_53916261424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20 = new Boolean(false);
        term22 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term28 = (double[]) newDoubleArray(4);
        setDoubleField(term22, term22.getClass(), "m2", Double.NaN);
        setLongField(term22, term22.getClass(), "n", 6375119433582206027L);
        setDoubleField(term22, term22.getClass(), "m1", Double.NaN);
        setDoubleField(term22, term22.getClass(), "dev", Double.NaN);
        setDoubleField(term22, term22.getClass(), "nDev", Double.NaN);
        setDoubleElement(term28, 0, 0.40176586625454525);
        setDoubleElement(term28, 1, 0.2641345529914265);
        setDoubleElement(term28, 2, 0.36923381893433327);
        setDoubleElement(term28, 3, 0.6076495596892013);
        setField(term22, term22.getClass(), "storedData", term28);
        term1299 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term1300 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term1301 = (double[]) newDoubleArray(4);
        setDoubleField(term1300, term1300.getClass(), "m2", Double.NaN);
        setLongField(term1300, term1300.getClass(), "n", 6375119433582206027L);
        setDoubleField(term1300, term1300.getClass(), "m1", Double.NaN);
        setDoubleField(term1300, term1300.getClass(), "dev", Double.NaN);
        setDoubleField(term1300, term1300.getClass(), "nDev", Double.NaN);
        setDoubleElement(term1301, 0, 0.40176586625454525);
        setDoubleElement(term1301, 1, 0.2641345529914265);
        setDoubleElement(term1301, 2, 0.36923381893433327);
        setDoubleElement(term1301, 3, 0.6076495596892013);
        setField(term1300, term1300.getClass(), "storedData", term1301);
        setField(term1299, term1299.getClass(), "moment", term1300);
        setBooleanField(term1299, term1299.getClass(), "incMoment", false);
        setBooleanField(term1299, term1299.getClass(), "isBiasCorrected", false);
        setField(term1299, term1299.getClass(), "storedData", null);
        term1302 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term1303 = (double[]) newDoubleArray(4);
        setDoubleField(term1302, term1302.getClass(), "m2", Double.NaN);
        setLongField(term1302, term1302.getClass(), "n", 6375119433582206027L);
        setDoubleField(term1302, term1302.getClass(), "m1", Double.NaN);
        setDoubleField(term1302, term1302.getClass(), "dev", Double.NaN);
        setDoubleField(term1302, term1302.getClass(), "nDev", Double.NaN);
        setDoubleElement(term1303, 0, 0.40176586625454525);
        setDoubleElement(term1303, 1, 0.2641345529914265);
        setDoubleElement(term1303, 2, 0.36923381893433327);
        setDoubleElement(term1303, 3, 0.6076495596892013);
        setField(term1302, term1302.getClass(), "storedData", term1303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment");
        Object[] args = new Object[2];
        args[0] = term20;
        args[1] = term22;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1299));
        assertTrue(recursiveEquals(term20, false));
        assertTrue(recursiveEquals(term22, term1302));
    }

};


