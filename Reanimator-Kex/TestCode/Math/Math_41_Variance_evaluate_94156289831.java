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
import org.apache.commons.math.exception.NumberIsTooLargeException;
import static org.apache.commons.math.stat.descriptive.moment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.lang.Integer;

public class Variance_evaluate_94156289831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158;
     Object term169;
     Object term176;
     Object term178;

    public Variance_evaluate_94156289831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term159 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term167 = (double[]) newDoubleArray(1);
        setDoubleField(term159, term159.getClass(), "m2", Double.NaN);
        setLongField(term159, term159.getClass(), "n", 0L);
        setDoubleField(term159, term159.getClass(), "m1", Double.NaN);
        setDoubleField(term159, term159.getClass(), "dev", Double.NaN);
        setDoubleField(term159, term159.getClass(), "nDev", Double.NaN);
        setField(term159, term159.getClass(), "storedData", null);
        setField(term158, term158.getClass(), "moment", term159);
        setBooleanField(term158, term158.getClass(), "incMoment", true);
        setBooleanField(term158, term158.getClass(), "isBiasCorrected", true);
        setDoubleElement(term167, 0, 0.3202192021706908);
        setField(term158, term158.getClass(), "storedData", term167);
        term169 = (double[]) newDoubleArray(6);
        setDoubleElement(term169, 0, 0.22651340641904605);
        setDoubleElement(term169, 1, 0.8878841294187743);
        setDoubleElement(term169, 2, 0.6588948704887806);
        setDoubleElement(term169, 3, 0.6397214730945112);
        setDoubleElement(term169, 4, 0.25937345430928016);
        setDoubleElement(term169, 5, 0.5873228247510078);
        term176 = new Integer(568599855);
        term178 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term169;
        args[1] = term176;
        args[2] = term178;
        try {
            callMethod(klass, "evaluate", argTypes, term158, args);
            assertTrue(false);
        }
        catch (NumberIsTooLargeException e) {
        }

    }

};


