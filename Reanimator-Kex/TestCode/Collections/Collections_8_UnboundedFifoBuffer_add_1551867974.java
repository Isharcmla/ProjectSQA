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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.collections.buffer.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnboundedFifoBuffer_add_1551867974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20607;
     Object term20727;

    public UnboundedFifoBuffer_add_1551867974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20607 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term20469 = (Object[]) newArray("java.lang.Object", 489);
        setIntField(term20607, term20607.getClass(), "tail", -2147483648);
        setIntField(term20607, term20607.getClass(), "head", -2147483648);
        setField(term20607, term20607.getClass(), "buffer", term20469);
        term20727 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20727;
        try {
            callMethod(klass, "add", argTypes, term20607, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


