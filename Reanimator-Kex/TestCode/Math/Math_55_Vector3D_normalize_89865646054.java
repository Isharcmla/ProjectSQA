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

public class Vector3D_normalize_89865646054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;
     Object term1634;
     Object term1630;

    public Vector3D_normalize_89865646054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term143, term143.getClass(), "x", 0.09067063848644474);
        setDoubleField(term143, term143.getClass(), "y", 0.268304014379393);
        setDoubleField(term143, term143.getClass(), "z", 0.7171972879282721);
        term1634 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1634, term1634.getClass(), "x", 0.09067063848644474);
        setDoubleField(term1634, term1634.getClass(), "y", 0.268304014379393);
        setDoubleField(term1634, term1634.getClass(), "z", 0.7171972879282721);
        term1630 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1630, term1630.getClass(), "x", 0.11758758411419788);
        setDoubleField(term1630, term1630.getClass(), "y", 0.3479541049413746);
        setDoubleField(term1630, term1630.getClass(), "z", 0.9301081124883459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "normalize", argTypes, term143, args);
        assertTrue(recursiveEquals(term143, term1634));
        assertTrue(recursiveEquals(retValue, term1630));
    }

};


