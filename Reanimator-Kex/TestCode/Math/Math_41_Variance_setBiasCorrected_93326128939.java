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
import java.lang.Boolean;

public class Variance_setBiasCorrected_93326128939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419;
     Object term436;
     Object term7853;

    public Variance_setBiasCorrected_93326128939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term419 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term420 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term428 = (double[]) newDoubleArray(7);
        setDoubleField(term420, term420.getClass(), "m2", Double.NaN);
        setLongField(term420, term420.getClass(), "n", 0L);
        setDoubleField(term420, term420.getClass(), "m1", Double.NaN);
        setDoubleField(term420, term420.getClass(), "dev", Double.NaN);
        setDoubleField(term420, term420.getClass(), "nDev", Double.NaN);
        setField(term420, term420.getClass(), "storedData", null);
        setField(term419, term419.getClass(), "moment", term420);
        setBooleanField(term419, term419.getClass(), "incMoment", true);
        setBooleanField(term419, term419.getClass(), "isBiasCorrected", true);
        setDoubleElement(term428, 0, 0.7618164754425794);
        setDoubleElement(term428, 1, 0.7385589312559342);
        setDoubleElement(term428, 2, 0.7080134263823477);
        setDoubleElement(term428, 3, 0.6059734092898602);
        setDoubleElement(term428, 4, 0.3074693824288357);
        setDoubleElement(term428, 5, 0.1245258965512791);
        setDoubleElement(term428, 6, 0.9511861072660375);
        setField(term419, term419.getClass(), "storedData", term428);
        term436 = new Boolean(false);
        term7853 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term7854 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term7855 = (double[]) newDoubleArray(7);
        setDoubleField(term7854, term7854.getClass(), "m2", Double.NaN);
        setLongField(term7854, term7854.getClass(), "n", 0L);
        setDoubleField(term7854, term7854.getClass(), "m1", Double.NaN);
        setDoubleField(term7854, term7854.getClass(), "dev", Double.NaN);
        setDoubleField(term7854, term7854.getClass(), "nDev", Double.NaN);
        setField(term7854, term7854.getClass(), "storedData", null);
        setField(term7853, term7853.getClass(), "moment", term7854);
        setBooleanField(term7853, term7853.getClass(), "incMoment", true);
        setBooleanField(term7853, term7853.getClass(), "isBiasCorrected", false);
        setDoubleElement(term7855, 0, 0.7618164754425794);
        setDoubleElement(term7855, 1, 0.7385589312559342);
        setDoubleElement(term7855, 2, 0.7080134263823477);
        setDoubleElement(term7855, 3, 0.6059734092898602);
        setDoubleElement(term7855, 4, 0.3074693824288357);
        setDoubleElement(term7855, 5, 0.1245258965512791);
        setDoubleElement(term7855, 6, 0.9511861072660375);
        setField(term7853, term7853.getClass(), "storedData", term7855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term436;
        callMethod(klass, "setBiasCorrected", argTypes, term419, args);
        assertTrue(recursiveEquals(term419, term7853));
        assertTrue(recursiveEquals(term436, false));
    }

};


