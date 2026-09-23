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
import java.lang.Object;
import java.lang.Double;

public class OpenMapRealVector_init_11107909938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;

    public OpenMapRealVector_init_11107909938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term245 = new Double(0.13238746331190498);
        Double term247 = new Double(0.3455959125047594);
        Double term249 = new Double(0.5523635872663106);
        term244 = (Object[]) newArray("java.lang.Double", 3);
        setElement(term244, 0, term245);
        setElement(term244, 1, term247);
        setElement(term244, 2, term249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Double"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term244;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


