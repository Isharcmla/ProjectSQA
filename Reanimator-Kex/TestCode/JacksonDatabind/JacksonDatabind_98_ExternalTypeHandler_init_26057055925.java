package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class ExternalTypeHandler_init_26057055925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3560;
     Object term3695;
     Object term3701;

    public ExternalTypeHandler_init_26057055925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3680 = new HashMap();
        Object term3288 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        Object term3384 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term3288, term3288.getClass(), "_beanType", term3384);
        setField(term3288, term3288.getClass(), "_properties", null);
        setField(term3288, term3288.getClass(), "_nameToPropertyIndex", term3680);
        term3560 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        Object term3656 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object[] term3144 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(term3560, term3560.getClass(), "_beanType", term3656);
        setField(term3560, term3560.getClass(), "_properties", term3144);
        setField(term3560, term3560.getClass(), "_nameToPropertyIndex", term3680);
        HashMap term3698 = new HashMap();
        term3695 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        Object term3696 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object[] term3697 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Object[] term3699 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3700 = (Object[]) newArray("com.fasterxml.jackson.databind.util.TokenBuffer", 0);
        setField(term3696, term3696.getClass(), "_componentType", null);
        setField(term3696, term3696.getClass(), "_emptyArray", null);
        setField(term3696, term3696.getClass(), "_superClass", null);
        setField(term3696, term3696.getClass(), "_superInterfaces", null);
        setField(term3696, term3696.getClass(), "_bindings", null);
        setField(term3696, term3696.getClass(), "_canonicalName", null);
        setField(term3696, term3696.getClass(), "_class", null);
        setIntField(term3696, term3696.getClass(), "_hash", 0);
        setField(term3696, term3696.getClass(), "_valueHandler", null);
        setField(term3696, term3696.getClass(), "_typeHandler", null);
        setBooleanField(term3696, term3696.getClass(), "_asStatic", false);
        setField(term3695, term3695.getClass(), "_beanType", term3696);
        setField(term3695, term3695.getClass(), "_properties", term3697);
        setField(term3695, term3695.getClass(), "_nameToPropertyIndex", term3698);
        setField(term3695, term3695.getClass(), "_typeIds", term3699);
        setField(term3695, term3695.getClass(), "_tokens", term3700);
        HashMap term3704 = new HashMap();
        term3701 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        Object term3702 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object[] term3703 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(term3702, term3702.getClass(), "_componentType", null);
        setField(term3702, term3702.getClass(), "_emptyArray", null);
        setField(term3702, term3702.getClass(), "_superClass", null);
        setField(term3702, term3702.getClass(), "_superInterfaces", null);
        setField(term3702, term3702.getClass(), "_bindings", null);
        setField(term3702, term3702.getClass(), "_canonicalName", null);
        setField(term3702, term3702.getClass(), "_class", null);
        setIntField(term3702, term3702.getClass(), "_hash", 0);
        setField(term3702, term3702.getClass(), "_valueHandler", null);
        setField(term3702, term3702.getClass(), "_typeHandler", null);
        setBooleanField(term3702, term3702.getClass(), "_asStatic", false);
        setField(term3701, term3701.getClass(), "_beanType", term3702);
        setField(term3701, term3701.getClass(), "_properties", term3703);
        setField(term3701, term3701.getClass(), "_nameToPropertyIndex", term3704);
        setField(term3701, term3701.getClass(), "_typeIds", null);
        setField(term3701, term3701.getClass(), "_tokens", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Object[] args = new Object[1];
        args[0] = term3560;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3695));
        assertTrue(recursiveEquals(term3560, term3701));
    }

};


