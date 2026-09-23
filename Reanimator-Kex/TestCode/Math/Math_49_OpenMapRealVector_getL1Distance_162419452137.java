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

public class OpenMapRealVector_getL1Distance_162419452137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142122;

    public OpenMapRealVector_getL1Distance_162419452137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142122 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term142230 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term141976 = (byte[]) newByteArray(2);
        setIntField(term142230, term142230.getClass(), "count", 0);
        setField(term142230, term142230.getClass(), "states", term141976);
        setField(term142122, term142122.getClass(), "entries", term142230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getL1Distance", argTypes, term142122, args);
    }

};


