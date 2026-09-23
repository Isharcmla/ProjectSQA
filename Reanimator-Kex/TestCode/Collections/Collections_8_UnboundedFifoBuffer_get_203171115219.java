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

public class UnboundedFifoBuffer_get_203171115219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5117;

    public UnboundedFifoBuffer_get_203171115219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5117 = newInstance(Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        Object[] term5118 = (Object[]) newArray("java.lang.Object", 33);
        setField(term5117, term5117.getClass(), "buffer", term5118);
        setIntField(term5117, term5117.getClass(), "head", -1772434990);
        setIntField(term5117, term5117.getClass(), "tail", -1845499264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "get", argTypes, term5117, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


