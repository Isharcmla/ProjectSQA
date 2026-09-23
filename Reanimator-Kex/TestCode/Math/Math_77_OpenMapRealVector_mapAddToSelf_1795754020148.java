package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class OpenMapRealVector_mapAddToSelf_1795754020148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163844;
     Object term163847;

    public OpenMapRealVector_mapAddToSelf_1795754020148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163844 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(term163844, term163844.getClass(), "entries", null);
        setIntField(term163844, term163844.getClass(), "virtualSize", 0);
        setDoubleField(term163844, term163844.getClass(), "epsilon", 0.0);
        term163847 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term163847;
        callMethod(klass, "mapAddToSelf", argTypes, term163844, args);
    }

};


