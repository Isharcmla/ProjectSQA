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

public class Vector3D_getNorm1_939400568147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20435;
     Object term20457;

    public Vector3D_getNorm1_939400568147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20435 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20435, term20435.getClass(), "x", 4.503599627370498E15);
        setDoubleField(term20435, term20435.getClass(), "y", 4.503599627370497E15);
        setDoubleField(term20435, term20435.getClass(), "z", -9.2188684372274053E18);
        term20457 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20457, term20457.getClass(), "x", 4.503599627370498E15);
        setDoubleField(term20457, term20457.getClass(), "y", 4.503599627370497E15);
        setDoubleField(term20457, term20457.getClass(), "z", -9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNorm1", argTypes, term20435, args);
        assertTrue(recursiveEquals(term20435, term20457));
        assertTrue(recursiveEquals(retValue, 9.227875636482146E18));
    }

};


