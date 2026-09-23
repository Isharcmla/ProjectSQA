package org.apache.commons.math.geometry;

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
import static org.apache.commons.math.geometry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Vector3D_distanceInf_912218133220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36600;
     Object term36688;

    public Vector3D_distanceInf_912218133220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36600 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term36600, term36600.getClass(), "x", -5.443726049584087E17);
        setDoubleField(term36600, term36600.getClass(), "y", 6.741034453457104E16);
        setDoubleField(term36600, term36600.getClass(), "z", -5.0890675789286605E17);
        term36688 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term36688, term36688.getClass(), "x", -5.6249959345856184E18);
        setDoubleField(term36688, term36688.getClass(), "y", -9.1457333217936957E18);
        setDoubleField(term36688, term36688.getClass(), "z", 8.7327611524481024E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term36600;
        args[1] = term36688;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


