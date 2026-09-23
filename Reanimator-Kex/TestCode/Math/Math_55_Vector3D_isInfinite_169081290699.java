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

public class Vector3D_isInfinite_169081290699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6730;
     Object term6744;

    public Vector3D_isInfinite_169081290699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6730 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term6730, term6730.getClass(), "x", -9.2188684372274053E18);
        setDoubleField(term6730, term6730.getClass(), "y", -9.2188684372274053E18);
        setDoubleField(term6730, term6730.getClass(), "z", 9.2188684372274053E18);
        term6744 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term6744, term6744.getClass(), "x", -9.2188684372274053E18);
        setDoubleField(term6744, term6744.getClass(), "y", -9.2188684372274053E18);
        setDoubleField(term6744, term6744.getClass(), "z", 9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInfinite", argTypes, term6730, args);
        assertTrue(recursiveEquals(term6730, term6744));
        assertTrue(recursiveEquals(retValue, false));
    }

};


