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

public class UnboundedFifoBuffer_iterator_58338288323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5137;
     Object term10260;
     Object term10253;

    public UnboundedFifoBuffer_iterator_58338288323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5137 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term5138 = (Object[]) newArray("java.lang.Object", 33);
        setField(term5137, term5137.getClass(), "buffer", term5138);
        setIntField(term5137, term5137.getClass(), "head", -615654495);
        setIntField(term5137, term5137.getClass(), "tail", -1476117762);
        term10260 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term10261 = (Object[]) newArray("java.lang.Object", 33);
        setField(term10260, term10260.getClass(), "buffer", term10261);
        setIntField(term10260, term10260.getClass(), "head", -615654495);
        setIntField(term10260, term10260.getClass(), "tail", -1476117762);
        term10253 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer$1"));
        Object term10256 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term10257 = (Object[]) newArray("java.lang.Object", 33);
        setIntField(term10253, term10253.getClass(), "index", -615654495);
        setIntField(term10253, term10253.getClass(), "lastReturnedIndex", -1);
        setField(term10256, term10256.getClass(), "buffer", term10257);
        setIntField(term10256, term10256.getClass(), "head", -615654495);
        setIntField(term10256, term10256.getClass(), "tail", -1476117762);
        setField(term10253, term10253.getClass(), "this$0", term10256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "iterator", argTypes, term5137, args);
        assertTrue(recursiveEquals(term5137, term10260));
        assertTrue(recursiveEquals(retValue, term10253));
    }

};


