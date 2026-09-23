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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class Rotation_orthogonalizeMatrix_165227540140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;
     Object term249;
     Object term265;

    public Rotation_orthogonalizeMatrix_165227540140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term244, term244.getClass(), "q0", 0.40598298281353484);
        setDoubleField(term244, term244.getClass(), "q1", 0.3710067290060264);
        setDoubleField(term244, term244.getClass(), "q2", 0.7818620200430967);
        setDoubleField(term244, term244.getClass(), "q3", 0.04640022995603543);
        term249 = (Object[]) newArray("[D", 2);
        double[] term250 = (double[]) newDoubleArray(6);
        double[] term257 = (double[]) newDoubleArray(7);
        setDoubleElement(term250, 0, 0.9123572866833729);
        setDoubleElement(term250, 1, 0.40635376375558196);
        setDoubleElement(term250, 2, 0.4772043271031934);
        setDoubleElement(term250, 3, 0.2446504549754045);
        setDoubleElement(term250, 4, 0.6142723998707854);
        setDoubleElement(term250, 5, 0.4355627280318103);
        setElement(term249, 0, term250);
        setDoubleElement(term257, 0, 0.841460835734741);
        setDoubleElement(term257, 1, 0.7859316615744082);
        setDoubleElement(term257, 2, 0.6428742553484879);
        setDoubleElement(term257, 3, 0.6584165706677267);
        setDoubleElement(term257, 4, 0.44268490778872205);
        setDoubleElement(term257, 5, 0.7507333108648018);
        setDoubleElement(term257, 6, 0.007493740494434409);
        setElement(term249, 1, term257);
        term265 = new Double(0.29172553321356776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term249;
        args[1] = term265;
        try {
            callMethod(klass, "orthogonalizeMatrix", argTypes, term244, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


