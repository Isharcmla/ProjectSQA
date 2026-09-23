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

public class Vector3D_getNormInf_39603061675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3280;
     Object term3374;

    public Vector3D_getNormInf_39603061675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3280 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term3280, term3280.getClass(), "x", 2.9723883984482468E18);
        setDoubleField(term3280, term3280.getClass(), "y", 6.7104898886192333E17);
        setDoubleField(term3280, term3280.getClass(), "z", 5.9008485585877729E18);
        term3374 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term3374, term3374.getClass(), "x", 2.9723883984482468E18);
        setDoubleField(term3374, term3374.getClass(), "y", 6.7104898886192333E17);
        setDoubleField(term3374, term3374.getClass(), "z", 5.9008485585877729E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNormInf", argTypes, term3280, args);
        assertTrue(recursiveEquals(term3280, term3374));
        assertTrue(recursiveEquals(retValue, 5.9008485585877729E18));
    }

};


