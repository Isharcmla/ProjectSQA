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
import java.lang.Object;

public class Rotation_getAngles_162229050213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161;
     Object term166;

    public Rotation_getAngles_162229050213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term161, term161.getClass(), "q0", 0.146431486357265);
        setDoubleField(term161, term161.getClass(), "q1", 0.24259014218848696);
        setDoubleField(term161, term161.getClass(), "q2", 0.1544348383112728);
        setDoubleField(term161, term161.getClass(), "q3", 0.5187846213101265);
        term166 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.RotationOrder"));
        Object term179 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        Object term183 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        Object term187 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setField(term166, term166.getClass(), "name", "sjlJAEtRrb");
        setDoubleField(term179, term179.getClass(), "x", 0.045893173090043815);
        setDoubleField(term179, term179.getClass(), "y", 0.3626177854778667);
        setDoubleField(term179, term179.getClass(), "z", 0.3163771663728089);
        setField(term166, term166.getClass(), "a1", term179);
        setDoubleField(term183, term183.getClass(), "x", 0.8819646072665548);
        setDoubleField(term183, term183.getClass(), "y", 0.5412182593116958);
        setDoubleField(term183, term183.getClass(), "z", 0.16988691727397487);
        setField(term166, term166.getClass(), "a2", term183);
        setDoubleField(term187, term187.getClass(), "x", 0.39286935532362843);
        setDoubleField(term187, term187.getClass(), "y", 0.11577948268926874);
        setDoubleField(term187, term187.getClass(), "z", 0.5617009352394552);
        setField(term166, term166.getClass(), "a3", term187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.RotationOrder");
        Object[] args = new Object[1];
        args[0] = term166;
        callMethod(klass, "getAngles", argTypes, term161, args);
    }

};


