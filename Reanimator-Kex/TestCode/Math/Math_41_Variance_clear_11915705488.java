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

public class Variance_clear_11915705488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107;

    public Variance_clear_11915705488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term108 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term116 = (double[]) newDoubleArray(2);
        setDoubleField(term108, term108.getClass(), "m2", Double.NaN);
        setLongField(term108, term108.getClass(), "n", 0L);
        setDoubleField(term108, term108.getClass(), "m1", Double.NaN);
        setDoubleField(term108, term108.getClass(), "dev", Double.NaN);
        setDoubleField(term108, term108.getClass(), "nDev", Double.NaN);
        setField(term108, term108.getClass(), "storedData", null);
        setField(term107, term107.getClass(), "moment", term108);
        setBooleanField(term107, term107.getClass(), "incMoment", true);
        setBooleanField(term107, term107.getClass(), "isBiasCorrected", true);
        setDoubleElement(term116, 0, 0.13481025392611334);
        setDoubleElement(term116, 1, 0.3800088629986428);
        setField(term107, term107.getClass(), "storedData", term116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term107, args);
    }

};


