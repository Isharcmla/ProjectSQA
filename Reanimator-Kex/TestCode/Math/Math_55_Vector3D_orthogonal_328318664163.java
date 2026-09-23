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

public class Vector3D_orthogonal_328318664163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23422;
     Object term23449;
     Object term23445;

    public Vector3D_orthogonal_328318664163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23422 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23422, term23422.getClass(), "x", 9.40865331658753E14);
        setDoubleField(term23422, term23422.getClass(), "y", -2.30445435463076403E18);
        setDoubleField(term23422, term23422.getClass(), "z", 0.0);
        term23449 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23449, term23449.getClass(), "x", 9.40865331658753E14);
        setDoubleField(term23449, term23449.getClass(), "y", -2.30445435463076403E18);
        setDoubleField(term23449, term23449.getClass(), "z", 0.0);
        term23445 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23445, term23445.getClass(), "x", 0.0);
        setDoubleField(term23445, term23445.getClass(), "y", 0.0);
        setDoubleField(term23445, term23445.getClass(), "z", 1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "orthogonal", argTypes, term23422, args);
        assertTrue(recursiveEquals(term23422, term23449));
        assertTrue(recursiveEquals(retValue, term23445));
    }

};


