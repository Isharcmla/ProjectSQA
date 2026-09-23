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

public class Variance_evaluate_122677449935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284;
     Object term300;
     Object term303;
     Object term6067;
     Object term6070;

    public Variance_evaluate_122677449935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term285 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term293 = (double[]) newDoubleArray(6);
        setDoubleField(term285, term285.getClass(), "m2", Double.NaN);
        setLongField(term285, term285.getClass(), "n", 0L);
        setDoubleField(term285, term285.getClass(), "m1", Double.NaN);
        setDoubleField(term285, term285.getClass(), "dev", Double.NaN);
        setDoubleField(term285, term285.getClass(), "nDev", Double.NaN);
        setField(term285, term285.getClass(), "storedData", null);
        setField(term284, term284.getClass(), "moment", term285);
        setBooleanField(term284, term284.getClass(), "incMoment", true);
        setBooleanField(term284, term284.getClass(), "isBiasCorrected", true);
        setDoubleElement(term293, 0, 0.36226058076369927);
        setDoubleElement(term293, 1, 0.03699061125289671);
        setDoubleElement(term293, 2, 0.6047137830113202);
        setDoubleElement(term293, 3, 0.6767213143579776);
        setDoubleElement(term293, 4, 0.48862955528902696);
        setDoubleElement(term293, 5, 0.426231085465289);
        setField(term284, term284.getClass(), "storedData", term293);
        term300 = (double[]) newDoubleArray(2);
        setDoubleElement(term300, 0, 0.0027299293098262956);
        setDoubleElement(term300, 1, 0.29874017652881824);
        term303 = new Double(0.32554480512985284);
        term6067 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term6068 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term6069 = (double[]) newDoubleArray(6);
        setDoubleField(term6068, term6068.getClass(), "m2", Double.NaN);
        setLongField(term6068, term6068.getClass(), "n", 0L);
        setDoubleField(term6068, term6068.getClass(), "m1", Double.NaN);
        setDoubleField(term6068, term6068.getClass(), "dev", Double.NaN);
        setDoubleField(term6068, term6068.getClass(), "nDev", Double.NaN);
        setField(term6068, term6068.getClass(), "storedData", null);
        setField(term6067, term6067.getClass(), "moment", term6068);
        setBooleanField(term6067, term6067.getClass(), "incMoment", true);
        setBooleanField(term6067, term6067.getClass(), "isBiasCorrected", true);
        setDoubleElement(term6069, 0, 0.36226058076369927);
        setDoubleElement(term6069, 1, 0.03699061125289671);
        setDoubleElement(term6069, 2, 0.6047137830113202);
        setDoubleElement(term6069, 3, 0.6767213143579776);
        setDoubleElement(term6069, 4, 0.48862955528902696);
        setDoubleElement(term6069, 5, 0.426231085465289);
        setField(term6067, term6067.getClass(), "storedData", term6069);
        term6070 = (double[]) newDoubleArray(2);
        setDoubleElement(term6070, 0, 0.0027299293098262956);
        setDoubleElement(term6070, 1, 0.29874017652881824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term300;
        args[1] = term303;
        Object retValue = callMethod(klass, "evaluate", argTypes, term284, args);
        assertTrue(recursiveEquals(term284, term6067));
        assertTrue(recursiveEquals(term300, term6070));
        assertTrue(recursiveEquals(term303, 0.32554480512985284));
        assertTrue(recursiveEquals(retValue, 0.04381103322932437));
    }

};


