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

public class OpenMapRealVector_isInfinite_1550398858129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126182;

    public OpenMapRealVector_isInfinite_1550398858129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126182 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term126290 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term125170 = (byte[]) newByteArray(31);
        setIntField(term126290, term126290.getClass(), "count", 0);
        setByteElement(term125170, 22, (byte) 1);
        setByteElement(term125170, 23, (byte) 1);
        setByteElement(term125170, 24, (byte) 1);
        setByteElement(term125170, 25, (byte) 1);
        setByteElement(term125170, 26, (byte) 1);
        setByteElement(term125170, 27, (byte) 1);
        setByteElement(term125170, 28, (byte) 1);
        setByteElement(term125170, 29, (byte) 1);
        setByteElement(term125170, 30, (byte) 1);
        setField(term126290, term126290.getClass(), "states", term125170);
        setField(term126182, term126182.getClass(), "entries", term126290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInfinite", argTypes, term126182, args);
    }

};


