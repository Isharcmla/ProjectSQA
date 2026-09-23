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

public class Variance_copy_4303262019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;

    public Variance_copy_4303262019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term445 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term446 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term454 = (double[]) newDoubleArray(2);
        setDoubleField(term446, term446.getClass(), "m2", Double.NaN);
        setLongField(term446, term446.getClass(), "n", 0L);
        setDoubleField(term446, term446.getClass(), "m1", Double.NaN);
        setDoubleField(term446, term446.getClass(), "dev", Double.NaN);
        setDoubleField(term446, term446.getClass(), "nDev", Double.NaN);
        setField(term446, term446.getClass(), "storedData", null);
        setField(term445, term445.getClass(), "moment", term446);
        setBooleanField(term445, term445.getClass(), "incMoment", true);
        setBooleanField(term445, term445.getClass(), "isBiasCorrected", true);
        setDoubleElement(term454, 0, 0.05880719443135807);
        setDoubleElement(term454, 1, 0.34010089048558567);
        setField(term445, term445.getClass(), "storedData", term454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term445, args);
    }

};


