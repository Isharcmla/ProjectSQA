package org.joda.time.format;

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
import java.lang.OutOfMemoryError;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DateTimeFormatterBuilder_appendUnknownString_695778475148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723;
     Object term755;

    public DateTimeFormatterBuilder_appendUnknownString_695778475148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term723 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term736 = (byte[]) newByteArray(16);
        setField(term723, term723.getClass(), "toStringCache", "MjGYSRKTNF");
        setField(term723, term723.getClass(), "value", term736);
        setByteField(term723, term723.getClass(), "coder", (byte) 47);
        setIntField(term723, term723.getClass(), "count", 1632125673);
        term755 = new Integer(454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term723;
        args[1] = term755;
        try {
            callMethod(klass, "appendUnknownString", argTypes, null, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


