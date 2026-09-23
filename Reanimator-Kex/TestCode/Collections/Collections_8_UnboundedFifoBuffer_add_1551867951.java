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
import java.lang.NullPointerException;
import static org.apache.commons.collections.buffer.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UnboundedFifoBuffer_add_1551867951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15494;
     Object term15614;

    public UnboundedFifoBuffer_add_1551867951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15494 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        setIntField(term15494, term15494.getClass(), "tail", -2147483648);
        setIntField(term15494, term15494.getClass(), "head", -2147483648);
        term15614 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15614;
        try {
            callMethod(klass, "add", argTypes, term15494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


