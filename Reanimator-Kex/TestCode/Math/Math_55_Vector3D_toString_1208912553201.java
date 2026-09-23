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

public class Vector3D_toString_1208912553201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32893;

    public Vector3D_toString_1208912553201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32893 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term32893, term32893.getClass(), "x", -9.2188684286374707E18);
        setDoubleField(term32893, term32893.getClass(), "y", -9.2188673377157775E18);
        setDoubleField(term32893, term32893.getClass(), "z", -9.2166166374137201E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term32893, args);
    }

};


