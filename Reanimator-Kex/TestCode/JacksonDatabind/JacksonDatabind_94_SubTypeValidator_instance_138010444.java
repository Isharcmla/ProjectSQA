package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class SubTypeValidator_instance_138010444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;

    public SubTypeValidator_instance_138010444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19 = new HashMap();
        Set<Object> term25 =  ((Map) term19).keySet();
        HashSet term18 = new HashSet((Collection<? extends Object>) term25);
        term16 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator"));
        Object term17 = newInstance(Class.forName("java.util.Collections$UnmodifiableSet"));
        setField(term17, term17.getClass(), "c", term18);
        setField(term16, term16.getClass(), "_cfgIllegalClassNames", term17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "instance", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term16));
    }

};


