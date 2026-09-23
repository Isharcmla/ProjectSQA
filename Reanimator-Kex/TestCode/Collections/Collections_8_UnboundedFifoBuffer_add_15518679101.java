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

public class UnboundedFifoBuffer_add_15518679101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26659;
     Object term26817;
     Object term27141;
     Object term27144;

    public UnboundedFifoBuffer_add_15518679101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26659 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term26505 = (Object[]) newArray("java.lang.Object", 1);
        Object term26697 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term26659, term26659.getClass(), "tail", 0);
        setIntField(term26659, term26659.getClass(), "head", 0);
        setElement(term26505, 0, term26697);
        setField(term26659, term26659.getClass(), "buffer", term26505);
        term26817 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        term27141 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term27142 = (Object[]) newArray("java.lang.Object", 1);
        Object term27143 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        setField(term27143, term27143.getClass(), "buffer", null);
        setIntField(term27143, term27143.getClass(), "head", 0);
        setIntField(term27143, term27143.getClass(), "tail", 0);
        setElement(term27142, 0, term27143);
        setField(term27141, term27141.getClass(), "buffer", term27142);
        setIntField(term27141, term27141.getClass(), "head", 0);
        setIntField(term27141, term27141.getClass(), "tail", 0);
        term27144 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        setField(term27144, term27144.getClass(), "buffer", null);
        setIntField(term27144, term27144.getClass(), "head", 0);
        setIntField(term27144, term27144.getClass(), "tail", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26817;
        Object retValue = callMethod(klass, "add", argTypes, term26659, args);
        assertTrue(recursiveEquals(term26659, term27141));
        assertTrue(recursiveEquals(term26817, term27144));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


