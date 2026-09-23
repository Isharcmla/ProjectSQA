package org.apache.commons.lang3.builder;

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
import java.lang.NullPointerException;
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class ToStringStyle_appendDetail_1805378373137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1756;
     Object term1800;

    public ToStringStyle_appendDetail_1805378373137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1756 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1769 = (byte[]) newByteArray(16);
        setField(term1756, term1756.getClass(), "toStringCache", "hxCBltsObl");
        setField(term1756, term1756.getClass(), "value", term1769);
        setByteField(term1756, term1756.getClass(), "coder", (byte) -111);
        setIntField(term1756, term1756.getClass(), "count", 1135664017);
        term1800 = new Double(0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term1756;
        args[1] = "BndsHwAFMv";
        args[2] = term1800;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


