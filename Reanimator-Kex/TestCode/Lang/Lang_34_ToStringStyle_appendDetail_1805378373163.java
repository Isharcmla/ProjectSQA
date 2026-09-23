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

public class ToStringStyle_appendDetail_1805378373163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3939;
     Object term3983;

    public ToStringStyle_appendDetail_1805378373163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3939 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3952 = (byte[]) newByteArray(16);
        setField(term3939, term3939.getClass(), "toStringCache", "JqXGgAhZPl");
        setField(term3939, term3939.getClass(), "value", term3952);
        setByteField(term3939, term3939.getClass(), "coder", (byte) -57);
        setIntField(term3939, term3939.getClass(), "count", -112921587);
        term3983 = (double[]) newDoubleArray(4);
        setDoubleElement(term3983, 0, 0.36923381893433327);
        setDoubleElement(term3983, 1, 0.6076495596892013);
        setDoubleElement(term3983, 2, 0.37773193782763337);
        setDoubleElement(term3983, 3, 0.8474802076607362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term3939;
        args[1] = "jiKYgYHqIS";
        args[2] = term3983;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


