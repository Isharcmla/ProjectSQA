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

public class OpenMapRealVector_isInfinite_1550398858138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139010;

    public OpenMapRealVector_isInfinite_1550398858138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139010 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term139118 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term137803 = (byte[]) newByteArray(31);
        setIntField(term139118, term139118.getClass(), "count", 0);
        setByteElement(term137803, 27, (byte) 1);
        setByteElement(term137803, 28, (byte) 1);
        setByteElement(term137803, 29, (byte) 1);
        setByteElement(term137803, 30, (byte) 1);
        setField(term139118, term139118.getClass(), "states", term137803);
        setField(term139010, term139010.getClass(), "entries", term139118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInfinite", argTypes, term139010, args);
    }

};


