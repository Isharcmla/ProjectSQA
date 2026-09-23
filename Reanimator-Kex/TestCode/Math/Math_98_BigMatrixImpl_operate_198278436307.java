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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigMatrixImpl_operate_198278436307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105094;
     Object term104961;

    public BigMatrixImpl_operate_198278436307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105094 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term104962 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term104963 = (Object[]) newArray("java.math.BigDecimal", 1);
        setElement(term104962, 0, term104963);
        setField(term105094, term105094.getClass(), "data", term104962);
        term104961 = (Object[]) newArray("java.math.BigDecimal", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term104961;
        try {
            callMethod(klass, "operate", argTypes, term105094, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


