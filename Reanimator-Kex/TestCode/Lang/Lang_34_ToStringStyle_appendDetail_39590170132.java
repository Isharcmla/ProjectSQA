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

public class ToStringStyle_appendDetail_39590170132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1264;
     Object term1308;

    public ToStringStyle_appendDetail_39590170132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1264 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1277 = (byte[]) newByteArray(16);
        setField(term1264, term1264.getClass(), "toStringCache", "dWRymuLBtr");
        setField(term1264, term1264.getClass(), "value", term1277);
        setByteField(term1264, term1264.getClass(), "coder", (byte) 67);
        setIntField(term1264, term1264.getClass(), "count", 1048535127);
        term1308 = new Short((short) -10960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = short.class;
        Object[] args = new Object[3];
        args[0] = term1264;
        args[1] = "AijpHYOFuy";
        args[2] = term1308;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


