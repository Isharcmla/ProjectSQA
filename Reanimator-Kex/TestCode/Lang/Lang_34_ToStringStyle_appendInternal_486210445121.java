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

public class ToStringStyle_appendInternal_486210445121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423;
     Object term467;
     Object term468;

    public ToStringStyle_appendInternal_486210445121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term436 = (byte[]) newByteArray(16);
        setField(term423, term423.getClass(), "toStringCache", "RMFIsYGgne");
        setField(term423, term423.getClass(), "value", term436);
        setByteField(term423, term423.getClass(), "coder", (byte) -29);
        setIntField(term423, term423.getClass(), "count", -1955890973);
        term467 = newInstance(Class.forName("java.lang.Object"));
        term468 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term423;
        args[1] = "NRdvgJlhkX";
        args[2] = term467;
        args[3] = term468;
        try {
            callMethod(klass, "appendInternal", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


