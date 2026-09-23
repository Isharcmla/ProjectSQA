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

public class OpenMapRealVector_getDistance_1634902359185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188712;
     Object term188922;

    public OpenMapRealVector_getDistance_1634902359185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188712 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term188820 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term186681 = (byte[]) newByteArray(32);
        setIntField(term188820, term188820.getClass(), "count", 0);
        setByteElement(term186681, 4, (byte) -128);
        setByteElement(term186681, 6, (byte) -128);
        setByteElement(term186681, 8, (byte) -128);
        setByteElement(term186681, 17, (byte) -128);
        setByteElement(term186681, 19, (byte) -128);
        setByteElement(term186681, 20, (byte) -128);
        setByteElement(term186681, 29, (byte) -128);
        setByteElement(term186681, 31, (byte) -128);
        setField(term188820, term188820.getClass(), "states", term186681);
        setField(term188712, term188712.getClass(), "entries", term188820);
        term188922 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term189030 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term187779 = (byte[]) newByteArray(20);
        setIntField(term189030, term189030.getClass(), "count", 0);
        setByteElement(term187779, 2, (byte) -128);
        setByteElement(term187779, 5, (byte) -128);
        setByteElement(term187779, 12, (byte) -128);
        setByteElement(term187779, 19, (byte) -128);
        setField(term189030, term189030.getClass(), "states", term187779);
        setField(term188922, term188922.getClass(), "entries", term189030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term188922;
        callMethod(klass, "getDistance", argTypes, term188712, args);
    }

};


