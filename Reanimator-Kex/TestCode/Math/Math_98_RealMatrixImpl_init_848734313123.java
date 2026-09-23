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

public class RealMatrixImpl_init_848734313123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public RealMatrixImpl_init_848734313123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78446 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term78337 = (Object[]) newArray("[D", 0);
        setField(term78446, term78446.getClass(), "data", term78337);
        setField(term78446, term78446.getClass(), "lu", null);
        setField(term78446, term78446.getClass(), "permutation", null);
        setIntField(term78446, term78446.getClass(), "parity", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


