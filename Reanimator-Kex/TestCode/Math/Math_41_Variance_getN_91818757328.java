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

public class Variance_getN_91818757328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;
     Object term1800;

    public Variance_getN_91818757328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term86 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term94 = (double[]) newDoubleArray(6);
        setDoubleField(term86, term86.getClass(), "m2", Double.NaN);
        setLongField(term86, term86.getClass(), "n", 0L);
        setDoubleField(term86, term86.getClass(), "m1", Double.NaN);
        setDoubleField(term86, term86.getClass(), "dev", Double.NaN);
        setDoubleField(term86, term86.getClass(), "nDev", Double.NaN);
        setField(term86, term86.getClass(), "storedData", null);
        setField(term85, term85.getClass(), "moment", term86);
        setBooleanField(term85, term85.getClass(), "incMoment", true);
        setBooleanField(term85, term85.getClass(), "isBiasCorrected", true);
        setDoubleElement(term94, 0, 0.6436713023569729);
        setDoubleElement(term94, 1, 0.7332741045694002);
        setDoubleElement(term94, 2, 0.4569171842750229);
        setDoubleElement(term94, 3, 0.8598297828918529);
        setDoubleElement(term94, 4, 0.43692187681405226);
        setDoubleElement(term94, 5, 0.7633268466829064);
        setField(term85, term85.getClass(), "storedData", term94);
        term1800 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term1801 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term1802 = (double[]) newDoubleArray(6);
        setDoubleField(term1801, term1801.getClass(), "m2", Double.NaN);
        setLongField(term1801, term1801.getClass(), "n", 0L);
        setDoubleField(term1801, term1801.getClass(), "m1", Double.NaN);
        setDoubleField(term1801, term1801.getClass(), "dev", Double.NaN);
        setDoubleField(term1801, term1801.getClass(), "nDev", Double.NaN);
        setField(term1801, term1801.getClass(), "storedData", null);
        setField(term1800, term1800.getClass(), "moment", term1801);
        setBooleanField(term1800, term1800.getClass(), "incMoment", true);
        setBooleanField(term1800, term1800.getClass(), "isBiasCorrected", true);
        setDoubleElement(term1802, 0, 0.6436713023569729);
        setDoubleElement(term1802, 1, 0.7332741045694002);
        setDoubleElement(term1802, 2, 0.4569171842750229);
        setDoubleElement(term1802, 3, 0.8598297828918529);
        setDoubleElement(term1802, 4, 0.43692187681405226);
        setDoubleElement(term1802, 5, 0.7633268466829064);
        setField(term1800, term1800.getClass(), "storedData", term1802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getN", argTypes, term85, args);
        assertTrue(recursiveEquals(term85, term1800));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


