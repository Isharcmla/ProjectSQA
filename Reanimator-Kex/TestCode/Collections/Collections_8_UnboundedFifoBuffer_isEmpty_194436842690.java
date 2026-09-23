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

public class UnboundedFifoBuffer_isEmpty_194436842690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24536;
     Object term24689;

    public UnboundedFifoBuffer_isEmpty_194436842690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24536 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term24404 = (Object[]) newArray("java.lang.Object", 489);
        setIntField(term24536, term24536.getClass(), "tail", -2147483648);
        setIntField(term24536, term24536.getClass(), "head", -2147483647);
        setField(term24536, term24536.getClass(), "buffer", term24404);
        term24689 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term24690 = (Object[]) newArray("java.lang.Object", 489);
        setField(term24689, term24689.getClass(), "buffer", term24690);
        setIntField(term24689, term24689.getClass(), "head", -2147483647);
        setIntField(term24689, term24689.getClass(), "tail", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term24536, args);
        assertTrue(recursiveEquals(term24536, term24689));
        assertTrue(recursiveEquals(retValue, false));
    }

};


