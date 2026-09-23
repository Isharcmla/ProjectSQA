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

public class Vector3D_distanceSq_50531017268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226;
     Object term230;
     Object term2262;
     Object term2263;

    public Vector3D_distanceSq_50531017268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term226, term226.getClass(), "x", 0.22227423914231126);
        setDoubleField(term226, term226.getClass(), "y", 0.06480976831423468);
        setDoubleField(term226, term226.getClass(), "z", 0.8490790645379176);
        term230 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term230, term230.getClass(), "x", 0.23129126164078717);
        setDoubleField(term230, term230.getClass(), "y", 0.6047138318674447);
        setDoubleField(term230, term230.getClass(), "z", 0.5597136413549945);
        term2262 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2262, term2262.getClass(), "x", 0.22227423914231126);
        setDoubleField(term2262, term2262.getClass(), "y", 0.06480976831423468);
        setDoubleField(term2262, term2262.getClass(), "z", 0.8490790645379176);
        term2263 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2263, term2263.getClass(), "x", 0.23129126164078717);
        setDoubleField(term2263, term2263.getClass(), "y", 0.6047138318674447);
        setDoubleField(term2263, term2263.getClass(), "z", 0.5597136413549945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term226;
        args[1] = term230;
        Object retValue = callMethod(klass, "distanceSq", argTypes, null, args);
        assertTrue(recursiveEquals(term226, term2262));
        assertTrue(recursiveEquals(term230, term2263));
        assertTrue(recursiveEquals(retValue, 0.3753100526698388));
    }

};


