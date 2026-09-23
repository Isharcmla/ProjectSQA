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
import java.lang.Double;

public class Rotation_init_3367033565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;
     Object term110;
     Object term112;
     Object term114;

    public Rotation_init_3367033565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.RotationOrder"));
        Object term98 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        Object term102 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        Object term106 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setField(term85, term85.getClass(), "name", "PAEBtnZtTD");
        setDoubleField(term98, term98.getClass(), "x", 0.5873228247510078);
        setDoubleField(term98, term98.getClass(), "y", 0.8823181080774973);
        setDoubleField(term98, term98.getClass(), "z", 0.2192450926212024);
        setField(term85, term85.getClass(), "a1", term98);
        setDoubleField(term102, term102.getClass(), "x", 0.7591353014991907);
        setDoubleField(term102, term102.getClass(), "y", 0.791695029600875);
        setDoubleField(term102, term102.getClass(), "z", 0.6862221294683138);
        setField(term85, term85.getClass(), "a2", term102);
        setDoubleField(term106, term106.getClass(), "x", 0.15917839663695388);
        setDoubleField(term106, term106.getClass(), "y", 0.9374115574082594);
        setDoubleField(term106, term106.getClass(), "z", 0.8454723071922143);
        setField(term85, term85.getClass(), "a3", term106);
        term110 = new Double(0.8566567697571895);
        term112 = new Double(0.9203805380592256);
        term114 = new Double(0.5804948995371725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.RotationOrder");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term85;
        args[1] = term110;
        args[2] = term112;
        args[3] = term114;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


