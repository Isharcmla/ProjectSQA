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

public class Vector3D_distance_46944201866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;
     Object term214;
     Object term2210;
     Object term2211;

    public Vector3D_distance_46944201866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term210, term210.getClass(), "x", 0.7507333108648018);
        setDoubleField(term210, term210.getClass(), "y", 0.007493740494434409);
        setDoubleField(term210, term210.getClass(), "z", 0.29172553321356776);
        term214 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term214, term214.getClass(), "x", 0.9276995636844321);
        setDoubleField(term214, term214.getClass(), "y", 0.7636130748477434);
        setDoubleField(term214, term214.getClass(), "z", 0.07901636960861558);
        term2210 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2210, term2210.getClass(), "x", 0.7507333108648018);
        setDoubleField(term2210, term2210.getClass(), "y", 0.007493740494434409);
        setDoubleField(term2210, term2210.getClass(), "z", 0.29172553321356776);
        term2211 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2211, term2211.getClass(), "x", 0.9276995636844321);
        setDoubleField(term2211, term2211.getClass(), "y", 0.7636130748477434);
        setDoubleField(term2211, term2211.getClass(), "z", 0.07901636960861558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term210;
        args[1] = term214;
        Object retValue = callMethod(klass, "distance", argTypes, null, args);
        assertTrue(recursiveEquals(term210, term2210));
        assertTrue(recursiveEquals(term214, term2211));
        assertTrue(recursiveEquals(retValue, 0.8051575564455883));
    }

};


