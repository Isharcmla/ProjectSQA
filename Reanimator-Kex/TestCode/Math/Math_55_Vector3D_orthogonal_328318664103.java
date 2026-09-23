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

public class Vector3D_orthogonal_328318664103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7030;
     Object term7061;
     Object term7057;

    public Vector3D_orthogonal_328318664103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7030 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term7030, term7030.getClass(), "x", 6.9168297382510592E18);
        setDoubleField(term7030, term7030.getClass(), "y", 2.30043868966084941E18);
        setDoubleField(term7030, term7030.getClass(), "z", 0.0);
        term7061 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term7061, term7061.getClass(), "x", 6.9168297382510592E18);
        setDoubleField(term7061, term7061.getClass(), "y", 2.30043868966084941E18);
        setDoubleField(term7061, term7061.getClass(), "z", 0.0);
        term7057 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term7057, term7057.getClass(), "x", -0.0);
        setDoubleField(term7057, term7057.getClass(), "y", 0.0);
        setDoubleField(term7057, term7057.getClass(), "z", 1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "orthogonal", argTypes, term7030, args);
        assertTrue(recursiveEquals(term7030, term7061));
        assertTrue(recursiveEquals(retValue, term7057));
    }

};


