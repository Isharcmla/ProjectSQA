package org.apache.commons.math.geometry.euclidean.threed;

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
import static org.apache.commons.math.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.geometry.euclidean.threed.EqualityUtils.*;

public class Rotation_getQ1_203696636529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;
     Object term2562;

    public Rotation_getQ1_203696636529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term136, term136.getClass(), "q0", 0.5306473989087822);
        setDoubleField(term136, term136.getClass(), "q1", 0.022483645678509023);
        setDoubleField(term136, term136.getClass(), "q2", 0.025133051616627267);
        setDoubleField(term136, term136.getClass(), "q3", 0.016575281023182953);
        term2562 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term2562, term2562.getClass(), "q0", 0.5306473989087822);
        setDoubleField(term2562, term2562.getClass(), "q1", 0.022483645678509023);
        setDoubleField(term2562, term2562.getClass(), "q2", 0.025133051616627267);
        setDoubleField(term2562, term2562.getClass(), "q3", 0.016575281023182953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQ1", argTypes, term136, args);
        assertTrue(recursiveEquals(term136, term2562));
        assertTrue(recursiveEquals(retValue, 0.022483645678509023));
    }

};


