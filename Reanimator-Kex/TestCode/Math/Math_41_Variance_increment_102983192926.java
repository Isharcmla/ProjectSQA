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

public class Variance_increment_102983192926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;
     Object term67;
     Object term1747;

    public Variance_increment_102983192926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term54 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term62 = (double[]) newDoubleArray(4);
        setDoubleField(term54, term54.getClass(), "m2", Double.NaN);
        setLongField(term54, term54.getClass(), "n", 0L);
        setDoubleField(term54, term54.getClass(), "m1", Double.NaN);
        setDoubleField(term54, term54.getClass(), "dev", Double.NaN);
        setDoubleField(term54, term54.getClass(), "nDev", Double.NaN);
        setField(term54, term54.getClass(), "storedData", null);
        setField(term53, term53.getClass(), "moment", term54);
        setBooleanField(term53, term53.getClass(), "incMoment", true);
        setBooleanField(term53, term53.getClass(), "isBiasCorrected", true);
        setDoubleElement(term62, 0, 0.7655020693602768);
        setDoubleElement(term62, 1, 0.1374549299694151);
        setDoubleElement(term62, 2, 0.7031006357544823);
        setDoubleElement(term62, 3, 0.9527281779865117);
        setField(term53, term53.getClass(), "storedData", term62);
        term67 = new Double(0.9828442029246764);
        term1747 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term1748 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term1749 = (double[]) newDoubleArray(4);
        setDoubleField(term1748, term1748.getClass(), "m2", 0.0);
        setLongField(term1748, term1748.getClass(), "n", 1L);
        setDoubleField(term1748, term1748.getClass(), "m1", 0.9828442029246764);
        setDoubleField(term1748, term1748.getClass(), "dev", 0.9828442029246764);
        setDoubleField(term1748, term1748.getClass(), "nDev", 0.9828442029246764);
        setField(term1748, term1748.getClass(), "storedData", null);
        setField(term1747, term1747.getClass(), "moment", term1748);
        setBooleanField(term1747, term1747.getClass(), "incMoment", true);
        setBooleanField(term1747, term1747.getClass(), "isBiasCorrected", true);
        setDoubleElement(term1749, 0, 0.7655020693602768);
        setDoubleElement(term1749, 1, 0.1374549299694151);
        setDoubleElement(term1749, 2, 0.7031006357544823);
        setDoubleElement(term1749, 3, 0.9527281779865117);
        setField(term1747, term1747.getClass(), "storedData", term1749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term67;
        callMethod(klass, "increment", argTypes, term53, args);
        assertTrue(recursiveEquals(term53, term1747));
        assertTrue(recursiveEquals(term67, 0.9828442029246764));
    }

};


