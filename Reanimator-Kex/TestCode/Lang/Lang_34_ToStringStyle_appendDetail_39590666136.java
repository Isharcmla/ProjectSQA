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
import java.lang.Character;

public class ToStringStyle_appendDetail_39590666136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1592;
     Object term1636;

    public ToStringStyle_appendDetail_39590666136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1592 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1605 = (byte[]) newByteArray(16);
        setField(term1592, term1592.getClass(), "toStringCache", "aKnKipADSo");
        setField(term1592, term1592.getClass(), "value", term1605);
        setByteField(term1592, term1592.getClass(), "coder", (byte) -16);
        setIntField(term1592, term1592.getClass(), "count", -117576464);
        term1636 = new Character('A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term1592;
        args[1] = "wSQxaModmm";
        args[2] = term1636;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


