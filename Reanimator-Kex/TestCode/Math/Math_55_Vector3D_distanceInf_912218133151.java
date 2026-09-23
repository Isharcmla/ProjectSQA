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

public class Vector3D_distanceInf_912218133151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20725;
     Object term20813;
     Object term20851;
     Object term20852;

    public Vector3D_distanceInf_912218133151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20725 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20725, term20725.getClass(), "x", -9.1332999395866665E18);
        setDoubleField(term20725, term20725.getClass(), "y", -9.223372036854776E18);
        term20813 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20813, term20813.getClass(), "x", -9.1333273936227164E18);
        setDoubleField(term20813, term20813.getClass(), "y", 0.0);
        term20851 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20851, term20851.getClass(), "x", -9.1332999395866665E18);
        setDoubleField(term20851, term20851.getClass(), "y", -9.223372036854776E18);
        setDoubleField(term20851, term20851.getClass(), "z", 0.0);
        term20852 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20852, term20852.getClass(), "x", -9.1333273936227164E18);
        setDoubleField(term20852, term20852.getClass(), "y", 0.0);
        setDoubleField(term20852, term20852.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term20725;
        args[1] = term20813;
        Object retValue = callMethod(klass, "distanceInf", argTypes, null, args);
        assertTrue(recursiveEquals(term20725, term20851));
        assertTrue(recursiveEquals(term20813, term20852));
        assertTrue(recursiveEquals(retValue, 9.223372036854776E18));
    }

};


