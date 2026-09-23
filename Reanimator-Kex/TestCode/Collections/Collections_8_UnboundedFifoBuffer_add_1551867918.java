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

public class UnboundedFifoBuffer_add_1551867918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5112;
     Object term5116;

    public UnboundedFifoBuffer_add_1551867918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5112 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term5113 = (Object[]) newArray("java.lang.Object", 33);
        setField(term5112, term5112.getClass(), "buffer", term5113);
        setIntField(term5112, term5112.getClass(), "head", 1114000454);
        setIntField(term5112, term5112.getClass(), "tail", -556405712);
        term5116 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5116;
        try {
            callMethod(klass, "add", argTypes, term5112, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


