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

public class Vector3D_distanceInf_912218133198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31802;
     Object term31890;

    public Vector3D_distanceInf_912218133198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31802 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term31802, term31802.getClass(), "x", 4.6347668290870927E18);
        setDoubleField(term31802, term31802.getClass(), "y", -4.6027491879168246E18);
        setDoubleField(term31802, term31802.getClass(), "z", -4.547598784161366E18);
        term31890 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term31890, term31890.getClass(), "x", 4.6882447383928545E18);
        setDoubleField(term31890, term31890.getClass(), "y", 4.6207284020542177E18);
        setDoubleField(term31890, term31890.getClass(), "z", -9.223372036854776E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term31802;
        args[1] = term31890;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


