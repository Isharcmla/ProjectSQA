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
import static org.apache.commons.math.linear.EqualityUtils.*;

public class BigMatrixImpl_init_53221968461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27522;

    public BigMatrixImpl_init_53221968461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27522 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        setField(term27522, term27522.getClass(), "data", null);
        setField(term27522, term27522.getClass(), "lu", null);
        setField(term27522, term27522.getClass(), "permutation", null);
        setIntField(term27522, term27522.getClass(), "parity", 1);
        setIntField(term27522, term27522.getClass(), "roundingMode", 4);
        setIntField(term27522, term27522.getClass(), "scale", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27522));
    }

};


