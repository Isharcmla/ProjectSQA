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

public class Vector3D_getDelta_1516080757179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27495;
     Object term27514;

    public Vector3D_getDelta_1516080757179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27495 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term27495, term27495.getClass(), "z", 1.15527891088885197E18);
        setDoubleField(term27495, term27495.getClass(), "x", 0.0);
        setDoubleField(term27495, term27495.getClass(), "y", 0.0);
        term27514 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term27514, term27514.getClass(), "x", 0.0);
        setDoubleField(term27514, term27514.getClass(), "y", 0.0);
        setDoubleField(term27514, term27514.getClass(), "z", 1.15527891088885197E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDelta", argTypes, term27495, args);
        assertTrue(recursiveEquals(term27495, term27514));
        assertTrue(recursiveEquals(retValue, 1.5707963267948966));
    }

};


