package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class SimpleType_buildSuperClass_77068937263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14627;
     Object term15735;
     Object term15728;

    public SimpleType_buildSuperClass_77068937263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14627 = Class.forName((String) "java.util.stream.Nodes$1");
        term15735 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIgnore");
        Class<? extends Object> term15608 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIgnore");
        term15728 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term15729 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term15730 = (Object[]) newArray("java.lang.String", 0);
        Object[] term15731 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term15728, term15728.getClass(), "_superClass", null);
        setField(term15728, term15728.getClass(), "_superInterfaces", null);
        setField(term15729, term15729.getClass(), "_names", term15730);
        setField(term15729, term15729.getClass(), "_types", term15731);
        setField(term15729, term15729.getClass(), "_unboundVariables", null);
        setIntField(term15729, term15729.getClass(), "_hashCode", 1);
        setField(term15728, term15728.getClass(), "_bindings", term15729);
        setField(term15728, term15728.getClass(), "_canonicalName", null);
        setField(term15728, term15728.getClass(), "_class", term15608);
        setIntField(term15728, term15728.getClass(), "_hash", -737598767);
        setField(term15728, term15728.getClass(), "_valueHandler", null);
        setField(term15728, term15728.getClass(), "_typeHandler", null);
        setBooleanField(term15728, term15728.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Object[] args = new Object[2];
        args[0] = term14627;
        args[1] = null;
        Object retValue = callMethod(klass, "_buildSuperClass", argTypes, null, args);
        assertTrue(recursiveEquals(term14627, null));
        assertTrue(recursiveEquals(retValue, term15728));
    }

};


