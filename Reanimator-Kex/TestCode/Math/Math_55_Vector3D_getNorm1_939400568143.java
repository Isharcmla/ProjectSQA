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

public class Vector3D_getNorm1_939400568143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20033;
     Object term20055;

    public Vector3D_getNorm1_939400568143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20033 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20033, term20033.getClass(), "x", 9.007199254806528E15);
        setDoubleField(term20033, term20033.getClass(), "y", -9.2188684372273889E18);
        setDoubleField(term20033, term20033.getClass(), "z", 4.503599627370497E15);
        term20055 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20055, term20055.getClass(), "x", 9.007199254806528E15);
        setDoubleField(term20055, term20055.getClass(), "y", -9.2188684372273889E18);
        setDoubleField(term20055, term20055.getClass(), "z", 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNorm1", argTypes, term20033, args);
        assertTrue(recursiveEquals(term20033, term20055));
        assertTrue(recursiveEquals(retValue, 9.232379236109566E18));
    }

};


