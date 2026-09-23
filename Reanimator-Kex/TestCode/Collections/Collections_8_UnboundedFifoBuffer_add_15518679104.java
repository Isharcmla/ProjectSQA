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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.collections.buffer.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnboundedFifoBuffer_add_15518679104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27302;
     Object term27422;

    public UnboundedFifoBuffer_add_15518679104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27302 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term27150 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term27302, term27302.getClass(), "tail", 1485964552);
        setIntField(term27302, term27302.getClass(), "head", -637936147);
        setField(term27302, term27302.getClass(), "buffer", term27150);
        term27422 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27422;
        try {
            callMethod(klass, "add", argTypes, term27302, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


