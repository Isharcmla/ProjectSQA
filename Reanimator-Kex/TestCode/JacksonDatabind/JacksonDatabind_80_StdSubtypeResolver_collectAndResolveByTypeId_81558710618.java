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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class StdSubtypeResolver_collectAndResolveByTypeId_81558710618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;
     Object term22;

    public StdSubtypeResolver_collectAndResolveByTypeId_81558710618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13 = new HashMap();
        Set<Object> term2046 =  ((Map) term13).keySet();
        term12 = new HashSet((Collection<? extends Object>) term2046);
        term22 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.NamedType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[3] = Class.forName("java.util.Set");
        argTypes[4] = Class.forName("java.util.Map");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term12;
        args[4] = term22;
        try {
            callMethod(klass, "_collectAndResolveByTypeId", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


