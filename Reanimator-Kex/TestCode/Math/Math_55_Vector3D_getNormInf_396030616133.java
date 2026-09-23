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

public class Vector3D_getNormInf_396030616133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17680;
     Object term17714;

    public Vector3D_getNormInf_396030616133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17680 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term17680, term17680.getClass(), "x", 1.125899906842624E16);
        setDoubleField(term17680, term17680.getClass(), "y", -9.2188684372274053E18);
        term17714 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term17714, term17714.getClass(), "x", 1.125899906842624E16);
        setDoubleField(term17714, term17714.getClass(), "y", -9.2188684372274053E18);
        setDoubleField(term17714, term17714.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNormInf", argTypes, term17680, args);
        assertTrue(recursiveEquals(term17680, term17714));
        assertTrue(recursiveEquals(retValue, 9.2188684372274053E18));
    }

};


