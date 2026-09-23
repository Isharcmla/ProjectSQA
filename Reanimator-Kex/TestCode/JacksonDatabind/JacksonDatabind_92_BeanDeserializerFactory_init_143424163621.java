package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class BeanDeserializerFactory_init_143424163621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;

    public BeanDeserializerFactory_init_143424163621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term58 = new HashMap();
        Set<Object> term60 =  ((Map) term58).keySet();
        HashSet term57 = new HashSet((Collection<? extends Object>) term60);
        term55 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        Object term56 = newInstance(Class.forName("java.util.Collections$UnmodifiableSet"));
        setField(term56, term56.getClass(), "c", term57);
        setField(term55, term55.getClass(), "_cfgIllegalClassNames", term56);
        setField(term55, term55.getClass(), "_factoryConfig", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term55));
    }

};


