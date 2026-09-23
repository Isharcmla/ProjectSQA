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
import java.lang.Short;

public class ToStringStyle_append_349738549131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1182;
     Object term1226;

    public ToStringStyle_append_349738549131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1182 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1195 = (byte[]) newByteArray(16);
        setField(term1182, term1182.getClass(), "toStringCache", "TEParAifyi");
        setField(term1182, term1182.getClass(), "value", term1195);
        setByteField(term1182, term1182.getClass(), "coder", (byte) -54);
        setIntField(term1182, term1182.getClass(), "count", 1622346318);
        term1226 = new Short((short) 9519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = short.class;
        Object[] args = new Object[3];
        args[0] = term1182;
        args[1] = "OWDIEULEFu";
        args[2] = term1226;
        try {
            callMethod(klass, "append", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


