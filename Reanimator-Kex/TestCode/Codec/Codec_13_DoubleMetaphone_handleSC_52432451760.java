package org.apache.commons.codec.language;

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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DoubleMetaphone_handleSC_52432451760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1464;
     Object term1478;
     Object term1520;

    public DoubleMetaphone_handleSC_52432451760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1464 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1464, term1464.getClass(), "maxCodeLen", 4);
        term1478 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1479 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1480 = (byte[]) newByteArray(16);
        Object term1499 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1500 = (byte[]) newByteArray(16);
        setField(term1479, term1479.getClass(), "value", term1480);
        setByteField(term1479, term1479.getClass(), "coder", (byte) 23);
        setIntField(term1479, term1479.getClass(), "count", 2055867847);
        setField(term1478, term1478.getClass(), "primary", term1479);
        setField(term1499, term1499.getClass(), "value", term1500);
        setByteField(term1499, term1499.getClass(), "coder", (byte) -15);
        setIntField(term1499, term1499.getClass(), "count", -1048298087);
        setField(term1478, term1478.getClass(), "alternate", term1499);
        setIntField(term1478, term1478.getClass(), "maxLength", 292681826);
        setField(term1478, term1478.getClass(), "this$0", null);
        term1520 = new Integer(458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "pCTimMblYc";
        args[1] = term1478;
        args[2] = term1520;
        try {
            callMethod(klass, "handleSC", argTypes, term1464, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


