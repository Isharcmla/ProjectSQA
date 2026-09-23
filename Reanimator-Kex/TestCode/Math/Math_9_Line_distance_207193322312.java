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

public class Line_distance_207193322312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;
     Object term144;

    public Line_distance_207193322312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term136 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term140 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term136, term136.getClass(), "x", 0.3163771663728089);
        setDoubleField(term136, term136.getClass(), "y", 0.8819646072665548);
        setDoubleField(term136, term136.getClass(), "z", 0.5412182593116958);
        setField(term135, term135.getClass(), "direction", term136);
        setDoubleField(term140, term140.getClass(), "x", 0.16988691727397487);
        setDoubleField(term140, term140.getClass(), "y", 0.39286935532362843);
        setDoubleField(term140, term140.getClass(), "z", 0.11577948268926874);
        setField(term135, term135.getClass(), "zero", term140);
        term144 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term144, term144.getClass(), "x", 0.5617009352394552);
        setDoubleField(term144, term144.getClass(), "y", 0.09067063848644474);
        setDoubleField(term144, term144.getClass(), "z", 0.268304014379393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D");
        Object[] args = new Object[1];
        args[0] = term144;
        callMethod(klass, "distance", argTypes, term135, args);
    }

};


