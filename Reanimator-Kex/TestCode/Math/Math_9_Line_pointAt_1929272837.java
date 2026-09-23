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
import java.lang.Object;
import java.lang.Double;

public class Line_pointAt_1929272837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term84;

    public Line_pointAt_1929272837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term76 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term80 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term76, term76.getClass(), "x", 0.15917839663695388);
        setDoubleField(term76, term76.getClass(), "y", 0.9374115574082594);
        setDoubleField(term76, term76.getClass(), "z", 0.8454723071922143);
        setField(term75, term75.getClass(), "direction", term76);
        setDoubleField(term80, term80.getClass(), "x", 0.8566567697571895);
        setDoubleField(term80, term80.getClass(), "y", 0.9203805380592256);
        setDoubleField(term80, term80.getClass(), "z", 0.5804948995371725);
        setField(term75, term75.getClass(), "zero", term80);
        term84 = new Double(0.20737514139742264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term84;
        callMethod(klass, "pointAt", argTypes, term75, args);
    }

};


