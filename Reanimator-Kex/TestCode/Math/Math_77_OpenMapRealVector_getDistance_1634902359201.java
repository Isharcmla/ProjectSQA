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

public class OpenMapRealVector_getDistance_1634902359201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230387;

    public OpenMapRealVector_getDistance_1634902359201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230387 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term230495 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term230047 = (byte[]) newByteArray(11);
        setIntField(term230495, term230495.getClass(), "count", 0);
        setField(term230495, term230495.getClass(), "states", term230047);
        setField(term230387, term230387.getClass(), "entries", term230495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getDistance", argTypes, term230387, args);
    }

};


