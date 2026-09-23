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
import java.lang.Boolean;

public class ToStringStyle_append_1484562479168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4374;
     Object term4418;
     Object term4420;

    public ToStringStyle_append_1484562479168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4374 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term4387 = (byte[]) newByteArray(16);
        setField(term4374, term4374.getClass(), "toStringCache", "vjxIhXHxGR");
        setField(term4374, term4374.getClass(), "value", term4387);
        setByteField(term4374, term4374.getClass(), "coder", (byte) -92);
        setIntField(term4374, term4374.getClass(), "count", 1265463001);
        term4418 = (boolean[]) newBooleanArray(1);
        term4420 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[3] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[4];
        args[0] = term4374;
        args[1] = "QXzGXbEXMu";
        args[2] = term4418;
        args[3] = term4420;
        try {
            callMethod(klass, "append", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


