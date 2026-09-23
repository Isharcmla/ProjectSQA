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

public class UnboundedFifoBuffer_isEmpty_194436842617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5108;
     Object term7223;

    public UnboundedFifoBuffer_isEmpty_194436842617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5108 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term5109 = (Object[]) newArray("java.lang.Object", 33);
        setField(term5108, term5108.getClass(), "buffer", term5109);
        setIntField(term5108, term5108.getClass(), "head", -1547384488);
        setIntField(term5108, term5108.getClass(), "tail", 1442160736);
        term7223 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term7224 = (Object[]) newArray("java.lang.Object", 33);
        setField(term7223, term7223.getClass(), "buffer", term7224);
        setIntField(term7223, term7223.getClass(), "head", -1547384488);
        setIntField(term7223, term7223.getClass(), "tail", 1442160736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term5108, args);
        assertTrue(recursiveEquals(term5108, term7223));
        assertTrue(recursiveEquals(retValue, false));
    }

};


