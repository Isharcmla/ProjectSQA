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
import java.lang.Object;

public class HashCodeBuilder_append_62694370497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13364;
     Object term13061;
     Object term17546;
     Object term17547;
     Object term17525;

    public HashCodeBuilder_append_62694370497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13364 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        term13061 = (Object[]) newArray("java.lang.Object", 2);
        Object term13415 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setElement(term13061, 0, term13415);
        setElement(term13061, 1, "int");
        term17546 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term17546, term17546.getClass(), "iConstant", 0);
        setIntField(term17546, term17546.getClass(), "iTotal", 104431);
        term17547 = (Object[]) newArray("java.lang.Object", 2);
        Object term17548 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term17548, term17548.getClass(), "iConstant", 0);
        setIntField(term17548, term17548.getClass(), "iTotal", 0);
        setElement(term17547, 0, term17548);
        setElement(term17547, 1, "int");
        term17525 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term17525, term17525.getClass(), "iConstant", 0);
        setIntField(term17525, term17525.getClass(), "iTotal", 104431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term13061;
        Object retValue = callMethod(klass, "append", argTypes, term13364, args);
        assertTrue(recursiveEquals(term13364, term17546));
        assertTrue(recursiveEquals(term13061, term17547));
        assertTrue(recursiveEquals(retValue, term17525));
    }

};


