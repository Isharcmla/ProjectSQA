package org.apache.commons.math3.geometry.euclidean.threed;

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
import static org.apache.commons.math3.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.geometry.euclidean.threed.EqualityUtils.*;
import java.lang.Object;

public class Line_init_101880400718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;
     Object term615;
     Object term618;

    public Line_init_101880400718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term10 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term14 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term10, term10.getClass(), "x", 0.2641345529914265);
        setDoubleField(term10, term10.getClass(), "y", 0.36923381893433327);
        setDoubleField(term10, term10.getClass(), "z", 0.6076495596892013);
        setField(term9, term9.getClass(), "direction", term10);
        setDoubleField(term14, term14.getClass(), "x", 0.37773193782763337);
        setDoubleField(term14, term14.getClass(), "y", 0.8474802076607362);
        setDoubleField(term14, term14.getClass(), "z", 0.5183269973490326);
        setField(term9, term9.getClass(), "zero", term14);
        term615 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term616 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term617 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term616, term616.getClass(), "x", 0.2641345529914265);
        setDoubleField(term616, term616.getClass(), "y", 0.36923381893433327);
        setDoubleField(term616, term616.getClass(), "z", 0.6076495596892013);
        setField(term615, term615.getClass(), "direction", term616);
        setDoubleField(term617, term617.getClass(), "x", 0.37773193782763337);
        setDoubleField(term617, term617.getClass(), "y", 0.8474802076607362);
        setDoubleField(term617, term617.getClass(), "z", 0.5183269973490326);
        setField(term615, term615.getClass(), "zero", term617);
        term618 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term619 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term620 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term619, term619.getClass(), "x", 0.2641345529914265);
        setDoubleField(term619, term619.getClass(), "y", 0.36923381893433327);
        setDoubleField(term619, term619.getClass(), "z", 0.6076495596892013);
        setField(term618, term618.getClass(), "direction", term619);
        setDoubleField(term620, term620.getClass(), "x", 0.37773193782763337);
        setDoubleField(term620, term620.getClass(), "y", 0.8474802076607362);
        setDoubleField(term620, term620.getClass(), "z", 0.5183269973490326);
        setField(term618, term618.getClass(), "zero", term620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Object[] args = new Object[1];
        args[0] = term9;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term615));
        assertTrue(recursiveEquals(term9, term618));
    }

};


