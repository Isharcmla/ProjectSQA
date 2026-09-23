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
import java.lang.Double;

public class HashCodeBuilder_append_114816903457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364;
     Object term367;
     Object term5395;
     Object term5390;

    public HashCodeBuilder_append_114816903457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term364, term364.getClass(), "iConstant", 37);
        setIntField(term364, term364.getClass(), "iTotal", 17);
        term367 = new Double(0.13238746331190498);
        term5395 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5395, term5395.getClass(), "iConstant", 37);
        setIntField(term5395, term5395.getClass(), "iTotal", -1217828053);
        term5390 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5390, term5390.getClass(), "iConstant", 37);
        setIntField(term5390, term5390.getClass(), "iTotal", -1217828053);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term367;
        Object retValue = callMethod(klass, "append", argTypes, term364, args);
        assertTrue(recursiveEquals(term364, term5395));
        assertTrue(recursiveEquals(term367, 0.13238746331190498));
        assertTrue(recursiveEquals(retValue, term5390));
    }

};


