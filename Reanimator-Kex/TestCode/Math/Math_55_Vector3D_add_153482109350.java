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

public class Vector3D_add_153482109350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107;
     Object term111;
     Object term1558;
     Object term1559;
     Object term1543;

    public Vector3D_add_153482109350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term107, term107.getClass(), "x", 0.0022646783892913414);
        setDoubleField(term107, term107.getClass(), "y", 0.36226058076369927);
        setDoubleField(term107, term107.getClass(), "z", 0.03699061125289671);
        term111 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term111, term111.getClass(), "x", 0.6047137830113202);
        setDoubleField(term111, term111.getClass(), "y", 0.6767213143579776);
        setDoubleField(term111, term111.getClass(), "z", 0.48862955528902696);
        term1558 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1558, term1558.getClass(), "x", 0.0022646783892913414);
        setDoubleField(term1558, term1558.getClass(), "y", 0.36226058076369927);
        setDoubleField(term1558, term1558.getClass(), "z", 0.03699061125289671);
        term1559 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1559, term1559.getClass(), "x", 0.6047137830113202);
        setDoubleField(term1559, term1559.getClass(), "y", 0.6767213143579776);
        setDoubleField(term1559, term1559.getClass(), "z", 0.48862955528902696);
        term1543 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1543, term1543.getClass(), "x", 0.6069784614006115);
        setDoubleField(term1543, term1543.getClass(), "y", 1.038981895121677);
        setDoubleField(term1543, term1543.getClass(), "z", 0.5256201665419237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[1];
        args[0] = term111;
        Object retValue = callMethod(klass, "add", argTypes, term107, args);
        assertTrue(recursiveEquals(term107, term1558));
        assertTrue(recursiveEquals(term111, term1559));
        assertTrue(recursiveEquals(retValue, term1543));
    }

};


