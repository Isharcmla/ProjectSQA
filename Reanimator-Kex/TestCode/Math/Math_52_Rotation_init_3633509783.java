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

public class Rotation_init_3633509783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;
     Object term65;
     Object term69;
     Object term73;

    public Rotation_init_3633509783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term61, term61.getClass(), "x", 0.7559240768573477);
        setDoubleField(term61, term61.getClass(), "y", 0.10667076642995188);
        setDoubleField(term61, term61.getClass(), "z", 0.11493000848982304);
        term65 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term65, term65.getClass(), "x", 0.37161417339133307);
        setDoubleField(term65, term65.getClass(), "y", 0.6805867182029153);
        setDoubleField(term65, term65.getClass(), "z", 0.2852810965221698);
        term69 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term69, term69.getClass(), "x", 0.6300849762307866);
        setDoubleField(term69, term69.getClass(), "y", 0.9737083944266686);
        setDoubleField(term69, term69.getClass(), "z", 0.0668892744806211);
        term73 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term73, term73.getClass(), "x", 0.3587267442738795);
        setDoubleField(term73, term73.getClass(), "y", 0.07802449704920456);
        setDoubleField(term73, term73.getClass(), "z", 0.5279279537140873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D");
        argTypes[2] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D");
        argTypes[3] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D");
        Object[] args = new Object[4];
        args[0] = term61;
        args[1] = term65;
        args[2] = term69;
        args[3] = term73;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


