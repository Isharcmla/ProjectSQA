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

public class UnboundedFifoBuffer_size_104890892016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5104;
     Object term6566;

    public UnboundedFifoBuffer_size_104890892016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5104 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term5105 = (Object[]) newArray("java.lang.Object", 33);
        setField(term5104, term5104.getClass(), "buffer", term5105);
        setIntField(term5104, term5104.getClass(), "head", -1465035361);
        setIntField(term5104, term5104.getClass(), "tail", 1090617576);
        term6566 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term6567 = (Object[]) newArray("java.lang.Object", 33);
        setField(term6566, term6566.getClass(), "buffer", term6567);
        setIntField(term6566, term6566.getClass(), "head", -1465035361);
        setIntField(term6566, term6566.getClass(), "tail", 1090617576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term5104, args);
        assertTrue(recursiveEquals(term5104, term6566));
        assertTrue(recursiveEquals(retValue, -1739314359));
    }

};


