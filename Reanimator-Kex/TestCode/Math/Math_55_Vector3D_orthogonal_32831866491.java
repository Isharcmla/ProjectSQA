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

public class Vector3D_orthogonal_32831866491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5233;
     Object term5260;
     Object term5256;

    public Vector3D_orthogonal_32831866491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5233 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term5233, term5233.getClass(), "x", 5.7606511515271977E18);
        setDoubleField(term5233, term5233.getClass(), "y", 9.2208058362118543E18);
        setDoubleField(term5233, term5233.getClass(), "z", 0.0);
        term5260 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term5260, term5260.getClass(), "x", 5.7606511515271977E18);
        setDoubleField(term5260, term5260.getClass(), "y", 9.2208058362118543E18);
        setDoubleField(term5260, term5260.getClass(), "z", 0.0);
        term5256 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term5256, term5256.getClass(), "x", 0.0);
        setDoubleField(term5256, term5256.getClass(), "y", 0.0);
        setDoubleField(term5256, term5256.getClass(), "z", -1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "orthogonal", argTypes, term5233, args);
        assertTrue(recursiveEquals(term5233, term5260));
        assertTrue(recursiveEquals(retValue, term5256));
    }

};


