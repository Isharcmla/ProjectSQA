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

public class Vector3D_toString_120891255369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234;
     Object term2922;

    public Vector3D_toString_120891255369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term234, term234.getClass(), "x", 0.28292420012823627);
        setDoubleField(term234, term234.getClass(), "y", 0.5407563152320285);
        setDoubleField(term234, term234.getClass(), "z", 0.9485929668765458);
        term2922 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2922, term2922.getClass(), "x", 0.28292420012823627);
        setDoubleField(term2922, term2922.getClass(), "y", 0.5407563152320285);
        setDoubleField(term2922, term2922.getClass(), "z", 0.9485929668765458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term234, args);
        assertTrue(recursiveEquals(term234, term2922));
        assertTrue(recursiveEquals(retValue, "{0.28; 0.54; 0.95}"));
    }

};


