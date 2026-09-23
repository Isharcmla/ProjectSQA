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

public class Vector3D_getNormInf_396030616121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12042;
     Object term12078;

    public Vector3D_getNormInf_396030616121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12042 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term12042, term12042.getClass(), "x", 4.792464018008705E18);
        setDoubleField(term12042, term12042.getClass(), "y", 4.7925365857720904E18);
        term12078 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term12078, term12078.getClass(), "x", 4.792464018008705E18);
        setDoubleField(term12078, term12078.getClass(), "y", 4.7925365857720904E18);
        setDoubleField(term12078, term12078.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNormInf", argTypes, term12042, args);
        assertTrue(recursiveEquals(term12042, term12078));
        assertTrue(recursiveEquals(retValue, 4.7925365857720904E18));
    }

};


