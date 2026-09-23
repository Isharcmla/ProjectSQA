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

public class Line_distance_141655496913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;
     Object term157;

    public Line_distance_141655496913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term149 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term153 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term149, term149.getClass(), "x", 0.7171972879282721);
        setDoubleField(term149, term149.getClass(), "y", 0.9006361024877096);
        setDoubleField(term149, term149.getClass(), "z", 0.5644914462415626);
        setField(term148, term148.getClass(), "direction", term149);
        setDoubleField(term153, term153.getClass(), "x", 0.509895859167191);
        setDoubleField(term153, term153.getClass(), "y", 0.07417792024383196);
        setDoubleField(term153, term153.getClass(), "z", 0.686293604788188);
        setField(term148, term148.getClass(), "zero", term153);
        term157 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term158 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term162 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term158, term158.getClass(), "x", 0.12764449157430724);
        setDoubleField(term158, term158.getClass(), "y", 0.39446728256884744);
        setDoubleField(term158, term158.getClass(), "z", 0.7865909711092062);
        setField(term157, term157.getClass(), "direction", term158);
        setDoubleField(term162, term162.getClass(), "x", 0.06587158449170749);
        setDoubleField(term162, term162.getClass(), "y", 0.0865998004187658);
        setDoubleField(term162, term162.getClass(), "z", 0.9628647861255637);
        setField(term157, term157.getClass(), "zero", term162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Object[] args = new Object[1];
        args[0] = term157;
        callMethod(klass, "distance", argTypes, term148, args);
    }

};


