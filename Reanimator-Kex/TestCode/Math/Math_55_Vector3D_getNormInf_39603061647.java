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
import static org.apache.commons.math.geometry.EqualityUtils.*;

public class Vector3D_getNormInf_39603061647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;
     Object term782;

    public Vector3D_getNormInf_39603061647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term95, term95.getClass(), "x", 0.9126850255993704);
        setDoubleField(term95, term95.getClass(), "y", 0.11179067076100713);
        setDoubleField(term95, term95.getClass(), "z", 0.5306473989087822);
        term782 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term782, term782.getClass(), "x", 0.9126850255993704);
        setDoubleField(term782, term782.getClass(), "y", 0.11179067076100713);
        setDoubleField(term782, term782.getClass(), "z", 0.5306473989087822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNormInf", argTypes, term95, args);
        assertTrue(recursiveEquals(term95, term782));
        assertTrue(recursiveEquals(retValue, 0.9126850255993704));
    }

};


