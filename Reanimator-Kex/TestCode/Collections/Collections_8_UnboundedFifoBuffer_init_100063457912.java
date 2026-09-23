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

public class UnboundedFifoBuffer_init_100063457912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5147;

    public UnboundedFifoBuffer_init_100063457912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5147 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term5148 = (Object[]) newArray("java.lang.Object", 33);
        setField(term5147, term5147.getClass(), "buffer", term5148);
        setIntField(term5147, term5147.getClass(), "head", 0);
        setIntField(term5147, term5147.getClass(), "tail", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5147));
    }

};


