package org.apache.commons.collections.buffer;

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
import static org.apache.commons.collections.buffer.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.buffer.EqualityUtils.*;
import java.lang.Object;

public class UnboundedFifoBuffer_size_104890892055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17175;
     Object term17182;

    public UnboundedFifoBuffer_size_104890892055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17175 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term17043 = (Object[]) newArray("java.lang.Object", 489);
        setIntField(term17175, term17175.getClass(), "tail", -2147483648);
        setIntField(term17175, term17175.getClass(), "head", -2147483647);
        setField(term17175, term17175.getClass(), "buffer", term17043);
        term17182 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term17183 = (Object[]) newArray("java.lang.Object", 489);
        setField(term17182, term17182.getClass(), "buffer", term17183);
        setIntField(term17182, term17182.getClass(), "head", -2147483647);
        setIntField(term17182, term17182.getClass(), "tail", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term17175, args);
        assertTrue(recursiveEquals(term17175, term17182));
        assertTrue(recursiveEquals(retValue, 488));
    }

};


