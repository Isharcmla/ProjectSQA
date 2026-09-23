package org.apache.commons.math.geometry.euclidean.threed;

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
import static org.apache.commons.math.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.geometry.euclidean.threed.EqualityUtils.*;
import java.lang.Object;

public class Rotation_getMatrix_42701792435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201;
     Object term3075;
     Object term3057;

    public Rotation_getMatrix_42701792435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term201, term201.getClass(), "q0", 0.09067063848644474);
        setDoubleField(term201, term201.getClass(), "q1", 0.268304014379393);
        setDoubleField(term201, term201.getClass(), "q2", 0.7171972879282721);
        setDoubleField(term201, term201.getClass(), "q3", 0.9006361024877096);
        term3075 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term3075, term3075.getClass(), "q0", 0.09067063848644474);
        setDoubleField(term3075, term3075.getClass(), "q1", 0.268304014379393);
        setDoubleField(term3075, term3075.getClass(), "q2", 0.7171972879282721);
        setDoubleField(term3075, term3075.getClass(), "q3", 0.9006361024877096);
        term3057 = (Object[]) newArray("[D", 3);
        double[] term3058 = (double[]) newDoubleArray(3);
        double[] term3062 = (double[]) newDoubleArray(3);
        double[] term3066 = (double[]) newDoubleArray(3);
        setDoubleElement(term3058, 0, -0.8395835823687259);
        setDoubleElement(term3058, 1, 0.548176323819345);
        setDoubleElement(term3058, 2, 0.3532310915505199);
        setElement(term3057, 0, term3058);
        setDoubleElement(term3062, 0, 0.22153132199333014);
        setDoubleElement(term3062, 1, 0.04518622899041658);
        setDoubleElement(term3062, 2, 1.3405221328134609);
        setElement(term3057, 1, term3062);
        setDoubleElement(term3066, 0, 0.6133460356193318);
        setDoubleElement(term3066, 1, 1.2432129476444376);
        setDoubleElement(term3066, 2, 0.6387331075755835);
        setElement(term3057, 2, term3066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMatrix", argTypes, term201, args);
        assertTrue(recursiveEquals(term201, term3075));
        assertTrue(recursiveEquals(retValue, term3057));
    }

};


