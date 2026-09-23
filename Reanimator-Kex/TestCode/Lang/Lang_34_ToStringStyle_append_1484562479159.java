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

public class ToStringStyle_append_1484562479159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3575;
     Object term3619;
     Object term3627;

    public ToStringStyle_append_1484562479159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3575 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3588 = (byte[]) newByteArray(16);
        setField(term3575, term3575.getClass(), "toStringCache", "LvJFtLBaxj");
        setField(term3575, term3575.getClass(), "value", term3588);
        setByteField(term3575, term3575.getClass(), "coder", (byte) -123);
        setIntField(term3575, term3575.getClass(), "count", 1225272962);
        term3619 = (char[]) newCharArray(7);
        setCharElement(term3619, 0, 'E');
        setCharElement(term3619, 1, 'B');
        setCharElement(term3619, 2, 't');
        setCharElement(term3619, 3, 'n');
        setCharElement(term3619, 4, 'Z');
        setCharElement(term3619, 5, 't');
        setCharElement(term3619, 6, 'T');
        term3627 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(char.class, 0).getClass();
        argTypes[3] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[4];
        args[0] = term3575;
        args[1] = "PHvxnGHptP";
        args[2] = term3619;
        args[3] = term3627;
        try {
            callMethod(klass, "append", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


