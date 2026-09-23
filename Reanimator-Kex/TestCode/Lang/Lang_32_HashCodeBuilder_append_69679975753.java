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
import java.lang.Byte;

public class HashCodeBuilder_append_69679975753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332;
     Object term335;
     Object term5333;
     Object term5329;

    public HashCodeBuilder_append_69679975753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term332, term332.getClass(), "iConstant", 37);
        setIntField(term332, term332.getClass(), "iTotal", 17);
        term335 = new Byte((byte) 47);
        term5333 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5333, term5333.getClass(), "iConstant", 37);
        setIntField(term5333, term5333.getClass(), "iTotal", 676);
        term5329 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5329, term5329.getClass(), "iConstant", 37);
        setIntField(term5329, term5329.getClass(), "iTotal", 676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term335;
        Object retValue = callMethod(klass, "append", argTypes, term332, args);
        assertTrue(recursiveEquals(term332, term5333));
        assertTrue(recursiveEquals(term335, (byte) 47));
        assertTrue(recursiveEquals(retValue, term5329));
    }

};


