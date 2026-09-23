package org.apache.commons.math3.linear;

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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class OpenMapRealVector_setSubVector_1657227392120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224066;
     Object term224069;

    public OpenMapRealVector_setSubVector_1657227392120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224066 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(term224066, term224066.getClass(), "entries", null);
        setIntField(term224066, term224066.getClass(), "virtualSize", 0);
        setDoubleField(term224066, term224066.getClass(), "epsilon", 0.0);
        term224069 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.linear.RealVector");
        Object[] args = new Object[2];
        args[0] = term224069;
        args[1] = null;
        callMethod(klass, "setSubVector", argTypes, term224066, args);
    }

};


