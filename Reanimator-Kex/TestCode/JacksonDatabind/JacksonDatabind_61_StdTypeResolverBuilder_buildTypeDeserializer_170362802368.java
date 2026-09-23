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
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_170362802368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32797;
     Object term37722;
     Object term37713;

    public StdTypeResolverBuilder_buildTypeDeserializer_170362802368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37733 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term37732 = ((Class) term37733).getDeclaredField((String) "CLASS");
        ((Field) term37732).setAccessible(true);
        Object enum50 = ((Field) term37732).get((Object) null);
        Class<? extends Object> term37995 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term37994 = ((Class) term37995).getDeclaredField((String) "WRAPPER_ARRAY");
        ((Field) term37994).setAccessible(true);
        Object enum51 = ((Field) term37994).get((Object) null);
        term32797 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term33069 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term32797, term32797.getClass(), "_idType", enum50);
        setField(term32797, term32797.getClass(), "_customIdResolver", term33069);
        setField(term32797, term32797.getClass(), "_defaultImpl", null);
        setField(term32797, term32797.getClass(), "_includeAs", enum51);
        Class<? extends Object> term38281 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term38280 = ((Class) term38281).getDeclaredField((String) "CLASS");
        ((Field) term38280).setAccessible(true);
        Object enum52 = ((Field) term38280).get((Object) null);
        Class<? extends Object> term38543 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term38542 = ((Class) term38543).getDeclaredField((String) "WRAPPER_ARRAY");
        ((Field) term38542).setAccessible(true);
        Object enum53 = ((Field) term38542).get((Object) null);
        term37722 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term37731 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term37722, term37722.getClass(), "_idType", enum52);
        setField(term37722, term37722.getClass(), "_includeAs", enum53);
        setField(term37722, term37722.getClass(), "_typeProperty", null);
        setBooleanField(term37722, term37722.getClass(), "_typeIdVisible", false);
        setField(term37722, term37722.getClass(), "_defaultImpl", null);
        setField(term37731, term37731.getClass(), "_config", null);
        setField(term37731, term37731.getClass(), "_typeToId", null);
        setField(term37731, term37731.getClass(), "_idToType", null);
        setField(term37731, term37731.getClass(), "_typeFactory", null);
        setField(term37731, term37731.getClass(), "_baseType", null);
        setField(term37722, term37722.getClass(), "_customIdResolver", term37731);
        term37713 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        Object term37697 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        Object term37717 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term37697, term37697.getClass(), "_config", null);
        setField(term37697, term37697.getClass(), "_typeToId", null);
        setField(term37697, term37697.getClass(), "_idToType", null);
        setField(term37697, term37697.getClass(), "_typeFactory", null);
        setField(term37697, term37697.getClass(), "_baseType", null);
        setField(term37713, term37713.getClass(), "_idResolver", term37697);
        setField(term37713, term37713.getClass(), "_baseType", null);
        setField(term37713, term37713.getClass(), "_property", null);
        setField(term37713, term37713.getClass(), "_defaultImpl", null);
        setField(term37713, term37713.getClass(), "_typePropertyName", "");
        setBooleanField(term37713, term37713.getClass(), "_typeIdVisible", false);
        setField(term37717, term37717.getClass(), "table", null);
        setField(term37717, term37717.getClass(), "nextTable", null);
        setLongField(term37717, term37717.getClass(), "baseCount", 0L);
        setIntField(term37717, term37717.getClass(), "sizeCtl", 32);
        setIntField(term37717, term37717.getClass(), "transferIndex", 0);
        setIntField(term37717, term37717.getClass(), "cellsBusy", 0);
        setField(term37717, term37717.getClass(), "counterCells", null);
        setField(term37717, term37717.getClass(), "keySet", null);
        setField(term37717, term37717.getClass(), "values", null);
        setField(term37717, term37717.getClass(), "entrySet", null);
        setField(term37717, term37717.getClass(), "keySet", null);
        setField(term37717, term37717.getClass(), "values", null);
        setField(term37713, term37713.getClass(), "_deserializers", term37717);
        setField(term37713, term37713.getClass(), "_defaultImplDeserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "buildTypeDeserializer", argTypes, term32797, args);
        assertTrue(recursiveEquals(term32797, term37722));
        assertTrue(recursiveEquals(retValue, term37713));
    }

};


