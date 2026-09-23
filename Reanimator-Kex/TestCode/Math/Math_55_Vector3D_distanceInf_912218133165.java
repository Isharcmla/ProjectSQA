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

public class Vector3D_distanceInf_912218133165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23584;
     Object term23672;
     Object term23708;
     Object term23709;

    public Vector3D_distanceInf_912218133165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23584 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23584, term23584.getClass(), "x", -4.7738149054014758E17);
        setDoubleField(term23584, term23584.getClass(), "y", -3.4632571183316337E18);
        setDoubleField(term23584, term23584.getClass(), "z", -9.223372036854776E18);
        term23672 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23672, term23672.getClass(), "x", -4.9314332865773421E17);
        setDoubleField(term23672, term23672.getClass(), "y", -3.4642488778198876E18);
        setDoubleField(term23672, term23672.getClass(), "z", 0.0);
        term23708 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23708, term23708.getClass(), "x", -4.7738149054014758E17);
        setDoubleField(term23708, term23708.getClass(), "y", -3.4632571183316337E18);
        setDoubleField(term23708, term23708.getClass(), "z", -9.223372036854776E18);
        term23709 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23709, term23709.getClass(), "x", -4.9314332865773421E17);
        setDoubleField(term23709, term23709.getClass(), "y", -3.4642488778198876E18);
        setDoubleField(term23709, term23709.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term23584;
        args[1] = term23672;
        Object retValue = callMethod(klass, "distanceInf", argTypes, null, args);
        assertTrue(recursiveEquals(term23584, term23708));
        assertTrue(recursiveEquals(term23672, term23709));
        assertTrue(recursiveEquals(retValue, 9.223372036854776E18));
    }

};


