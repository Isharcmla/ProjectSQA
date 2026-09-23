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

public class ToStringStyle_append_1484570167156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3324;
     Object term3368;
     Object term3370;

    public ToStringStyle_append_1484570167156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3324 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3337 = (byte[]) newByteArray(16);
        setField(term3324, term3324.getClass(), "toStringCache", "wGmYcqUkgE");
        setField(term3324, term3324.getClass(), "value", term3337);
        setByteField(term3324, term3324.getClass(), "coder", (byte) -61);
        setIntField(term3324, term3324.getClass(), "count", 97029295);
        term3368 = (byte[]) newByteArray(1);
        setByteElement(term3368, 0, (byte) -85);
        term3370 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        argTypes[3] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[4];
        args[0] = term3324;
        args[1] = "idgaQsnJpQ";
        args[2] = term3368;
        args[3] = term3370;
        try {
            callMethod(klass, "append", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


