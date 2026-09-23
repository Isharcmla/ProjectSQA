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

public class UnboundedFifoBuffer_isEmpty_1944368426105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27567;
     Object term27838;

    public UnboundedFifoBuffer_isEmpty_1944368426105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27567 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term27426 = (Object[]) newArray("java.lang.Object", 489);
        setIntField(term27567, term27567.getClass(), "tail", -235);
        setIntField(term27567, term27567.getClass(), "head", 254);
        setField(term27567, term27567.getClass(), "buffer", term27426);
        term27838 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term27839 = (Object[]) newArray("java.lang.Object", 489);
        setField(term27838, term27838.getClass(), "buffer", term27839);
        setIntField(term27838, term27838.getClass(), "head", 254);
        setIntField(term27838, term27838.getClass(), "tail", -235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term27567, args);
        assertTrue(recursiveEquals(term27567, term27838));
        assertTrue(recursiveEquals(retValue, true));
    }

};


