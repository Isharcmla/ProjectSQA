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

public class ToStringStyle_appendDetail_39590666169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4459;
     Object term4503;

    public ToStringStyle_appendDetail_39590666169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4459 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term4472 = (byte[]) newByteArray(16);
        setField(term4459, term4459.getClass(), "toStringCache", "qxSDVejjiY");
        setField(term4459, term4459.getClass(), "value", term4472);
        setByteField(term4459, term4459.getClass(), "coder", (byte) -42);
        setIntField(term4459, term4459.getClass(), "count", 335112684);
        term4503 = (boolean[]) newBooleanArray(2);
        setBooleanElement(term4503, 0, true);
        setBooleanElement(term4503, 1, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term4459;
        args[1] = "xBsXSDjXYK";
        args[2] = term4503;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


