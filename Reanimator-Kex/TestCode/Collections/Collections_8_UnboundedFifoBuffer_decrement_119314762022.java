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

public class UnboundedFifoBuffer_decrement_119314762022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5131;
     Object term5135;
     Object term10251;

    public UnboundedFifoBuffer_decrement_119314762022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5131 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term5132 = (Object[]) newArray("java.lang.Object", 33);
        setField(term5131, term5131.getClass(), "buffer", term5132);
        setIntField(term5131, term5131.getClass(), "head", 1596213415);
        setIntField(term5131, term5131.getClass(), "tail", -268815336);
        term5135 = new Integer(-1210583429);
        term10251 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term10252 = (Object[]) newArray("java.lang.Object", 33);
        setField(term10251, term10251.getClass(), "buffer", term10252);
        setIntField(term10251, term10251.getClass(), "head", 1596213415);
        setIntField(term10251, term10251.getClass(), "tail", -268815336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5135;
        Object retValue = callMethod(klass, "decrement", argTypes, term5131, args);
        assertTrue(recursiveEquals(term5131, term10251));
        assertTrue(recursiveEquals(term5135, -1210583429));
        assertTrue(recursiveEquals(retValue, 32));
    }

};


