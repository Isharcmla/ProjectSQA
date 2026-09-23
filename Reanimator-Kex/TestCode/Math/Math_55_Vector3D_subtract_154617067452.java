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

public class Vector3D_subtract_154617067452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;
     Object term129;
     Object term1593;
     Object term1594;
     Object term1578;

    public Vector3D_subtract_154617067452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term125, term125.getClass(), "x", 0.146431486357265);
        setDoubleField(term125, term125.getClass(), "y", 0.24259014218848696);
        setDoubleField(term125, term125.getClass(), "z", 0.1544348383112728);
        term129 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term129, term129.getClass(), "x", 0.5187846213101265);
        setDoubleField(term129, term129.getClass(), "y", 0.045893173090043815);
        setDoubleField(term129, term129.getClass(), "z", 0.3626177854778667);
        term1593 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1593, term1593.getClass(), "x", 0.146431486357265);
        setDoubleField(term1593, term1593.getClass(), "y", 0.24259014218848696);
        setDoubleField(term1593, term1593.getClass(), "z", 0.1544348383112728);
        term1594 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1594, term1594.getClass(), "x", 0.5187846213101265);
        setDoubleField(term1594, term1594.getClass(), "y", 0.045893173090043815);
        setDoubleField(term1594, term1594.getClass(), "z", 0.3626177854778667);
        term1578 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1578, term1578.getClass(), "x", -0.3723531349528615);
        setDoubleField(term1578, term1578.getClass(), "y", 0.19669696909844314);
        setDoubleField(term1578, term1578.getClass(), "z", -0.2081829471665939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[1];
        args[0] = term129;
        Object retValue = callMethod(klass, "subtract", argTypes, term125, args);
        assertTrue(recursiveEquals(term125, term1593));
        assertTrue(recursiveEquals(term129, term1594));
        assertTrue(recursiveEquals(retValue, term1578));
    }

};


