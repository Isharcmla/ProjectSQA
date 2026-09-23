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

public class Vector3D_orthogonal_328318664161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23263;
     Object term23292;
     Object term23288;

    public Vector3D_orthogonal_328318664161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23263 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23263, term23263.getClass(), "x", -9.2231548269165814E18);
        setDoubleField(term23263, term23263.getClass(), "y", 5.2152278804277883E18);
        setDoubleField(term23263, term23263.getClass(), "z", 0.0);
        term23292 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23292, term23292.getClass(), "x", -9.2231548269165814E18);
        setDoubleField(term23292, term23292.getClass(), "y", 5.2152278804277883E18);
        setDoubleField(term23292, term23292.getClass(), "z", 0.0);
        term23288 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23288, term23288.getClass(), "x", -0.0);
        setDoubleField(term23288, term23288.getClass(), "y", 0.0);
        setDoubleField(term23288, term23288.getClass(), "z", -1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "orthogonal", argTypes, term23263, args);
        assertTrue(recursiveEquals(term23263, term23292));
        assertTrue(recursiveEquals(retValue, term23288));
    }

};


