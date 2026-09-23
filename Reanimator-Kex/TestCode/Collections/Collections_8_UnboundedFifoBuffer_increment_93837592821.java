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
import java.lang.Integer;

public class UnboundedFifoBuffer_increment_93837592821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5125;
     Object term5129;
     Object term10242;

    public UnboundedFifoBuffer_increment_93837592821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5125 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term5126 = (Object[]) newArray("java.lang.Object", 33);
        setField(term5125, term5125.getClass(), "buffer", term5126);
        setIntField(term5125, term5125.getClass(), "head", -894662986);
        setIntField(term5125, term5125.getClass(), "tail", 304775596);
        term5129 = new Integer(-1347665717);
        term10242 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term10243 = (Object[]) newArray("java.lang.Object", 33);
        setField(term10242, term10242.getClass(), "buffer", term10243);
        setIntField(term10242, term10242.getClass(), "head", -894662986);
        setIntField(term10242, term10242.getClass(), "tail", 304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5129;
        Object retValue = callMethod(klass, "increment", argTypes, term5125, args);
        assertTrue(recursiveEquals(term5125, term10242));
        assertTrue(recursiveEquals(term5129, -1347665717));
        assertTrue(recursiveEquals(retValue, -1347665716));
    }

};


