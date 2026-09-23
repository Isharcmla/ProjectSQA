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
import java.lang.Double;
import java.lang.Object;

public class Variance_init_53919144422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term891;
     Object term894;

    public Variance_init_53919144422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term7 = (double[]) newDoubleArray(5);
        setDoubleField(term1, term1.getClass(), "m2", Double.NaN);
        setLongField(term1, term1.getClass(), "n", 2442117782898005296L);
        setDoubleField(term1, term1.getClass(), "m1", Double.NaN);
        setDoubleField(term1, term1.getClass(), "dev", Double.NaN);
        setDoubleField(term1, term1.getClass(), "nDev", Double.NaN);
        setDoubleElement(term7, 0, 0.13238746331190498);
        setDoubleElement(term7, 1, 0.3455959125047594);
        setDoubleElement(term7, 2, 0.5523635872663106);
        setDoubleElement(term7, 3, 0.544608645520025);
        setDoubleElement(term7, 4, 0.28570734989730284);
        setField(term1, term1.getClass(), "storedData", term7);
        term891 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term892 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term893 = (double[]) newDoubleArray(5);
        setDoubleField(term892, term892.getClass(), "m2", Double.NaN);
        setLongField(term892, term892.getClass(), "n", 2442117782898005296L);
        setDoubleField(term892, term892.getClass(), "m1", Double.NaN);
        setDoubleField(term892, term892.getClass(), "dev", Double.NaN);
        setDoubleField(term892, term892.getClass(), "nDev", Double.NaN);
        setDoubleElement(term893, 0, 0.13238746331190498);
        setDoubleElement(term893, 1, 0.3455959125047594);
        setDoubleElement(term893, 2, 0.5523635872663106);
        setDoubleElement(term893, 3, 0.544608645520025);
        setDoubleElement(term893, 4, 0.28570734989730284);
        setField(term892, term892.getClass(), "storedData", term893);
        setField(term891, term891.getClass(), "moment", term892);
        setBooleanField(term891, term891.getClass(), "incMoment", false);
        setBooleanField(term891, term891.getClass(), "isBiasCorrected", true);
        setField(term891, term891.getClass(), "storedData", null);
        term894 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term895 = (double[]) newDoubleArray(5);
        setDoubleField(term894, term894.getClass(), "m2", Double.NaN);
        setLongField(term894, term894.getClass(), "n", 2442117782898005296L);
        setDoubleField(term894, term894.getClass(), "m1", Double.NaN);
        setDoubleField(term894, term894.getClass(), "dev", Double.NaN);
        setDoubleField(term894, term894.getClass(), "nDev", Double.NaN);
        setDoubleElement(term895, 0, 0.13238746331190498);
        setDoubleElement(term895, 1, 0.3455959125047594);
        setDoubleElement(term895, 2, 0.5523635872663106);
        setDoubleElement(term895, 3, 0.544608645520025);
        setDoubleElement(term895, 4, 0.28570734989730284);
        setField(term894, term894.getClass(), "storedData", term895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term891));
        assertTrue(recursiveEquals(term1, term894));
    }

};


