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
import java.lang.Double;

public class OpenMapRealVector_mapAddToSelf_1361605308118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224058;
     Object term224061;

    public OpenMapRealVector_mapAddToSelf_1361605308118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224058 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(term224058, term224058.getClass(), "entries", null);
        setIntField(term224058, term224058.getClass(), "virtualSize", 0);
        setDoubleField(term224058, term224058.getClass(), "epsilon", 0.0);
        term224061 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term224061;
        callMethod(klass, "mapAddToSelf", argTypes, term224058, args);
    }

};


