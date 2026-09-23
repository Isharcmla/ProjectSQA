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

public class Vector3D_getNormSq_49469178346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;
     Object term748;

    public Vector3D_getNormSq_49469178346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term91, term91.getClass(), "x", 0.3227335400819148);
        setDoubleField(term91, term91.getClass(), "y", 0.43337207054070237);
        setDoubleField(term91, term91.getClass(), "z", 0.13246999699526574);
        term748 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term748, term748.getClass(), "x", 0.3227335400819148);
        setDoubleField(term748, term748.getClass(), "y", 0.43337207054070237);
        setDoubleField(term748, term748.getClass(), "z", 0.13246999699526574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNormSq", argTypes, term91, args);
        assertTrue(recursiveEquals(term91, term748));
        assertTrue(recursiveEquals(retValue, 0.30951658952246613));
    }

};


