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

public class ToStringStyle_appendDetail_39590666160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3672;
     Object term3716;

    public ToStringStyle_appendDetail_39590666160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3672 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3685 = (byte[]) newByteArray(16);
        setField(term3672, term3672.getClass(), "toStringCache", "TimdotUuNC");
        setField(term3672, term3672.getClass(), "value", term3685);
        setByteField(term3672, term3672.getClass(), "coder", (byte) -23);
        setIntField(term3672, term3672.getClass(), "count", 1324040357);
        term3716 = (char[]) newCharArray(1);
        setCharElement(term3716, 0, 'D');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term3672;
        args[1] = "PkWMRdJcBb";
        args[2] = term3716;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


