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
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.builder.EqualityUtils.*;

public class HashCodeBuilder_append_69679975754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337;
     Object term340;
     Object term5343;
     Object term5344;
     Object term5336;

    public HashCodeBuilder_append_69679975754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term337, term337.getClass(), "iConstant", 37);
        setIntField(term337, term337.getClass(), "iTotal", 17);
        term340 = (byte[]) newByteArray(1);
        setByteElement(term340, 0, (byte) 48);
        term5343 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5343, term5343.getClass(), "iConstant", 37);
        setIntField(term5343, term5343.getClass(), "iTotal", 677);
        term5344 = (byte[]) newByteArray(1);
        setByteElement(term5344, 0, (byte) 48);
        term5336 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5336, term5336.getClass(), "iConstant", 37);
        setIntField(term5336, term5336.getClass(), "iTotal", 677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term340;
        Object retValue = callMethod(klass, "append", argTypes, term337, args);
        assertTrue(recursiveEquals(term337, term5343));
        assertTrue(recursiveEquals(term340, term5344));
        assertTrue(recursiveEquals(retValue, term5336));
    }

};


