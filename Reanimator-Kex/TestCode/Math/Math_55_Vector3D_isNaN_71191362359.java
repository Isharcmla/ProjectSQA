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

public class Vector3D_isNaN_71191362359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169;
     Object term2101;

    public Vector3D_isNaN_71191362359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term169, term169.getClass(), "x", 0.7385589312559342);
        setDoubleField(term169, term169.getClass(), "y", 0.7080134263823477);
        setDoubleField(term169, term169.getClass(), "z", 0.6059734092898602);
        term2101 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2101, term2101.getClass(), "x", 0.7385589312559342);
        setDoubleField(term2101, term2101.getClass(), "y", 0.7080134263823477);
        setDoubleField(term2101, term2101.getClass(), "z", 0.6059734092898602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNaN", argTypes, term169, args);
        assertTrue(recursiveEquals(term169, term2101));
        assertTrue(recursiveEquals(retValue, false));
    }

};


