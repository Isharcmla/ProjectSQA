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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116483;
     Object term117029;
     Object term117724;
     Object term117736;
     Object term117715;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term117738 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term117737 = ((Class) term117738).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term117737).setAccessible(true);
        Object enum177 = ((Field) term117737).get((Object) null);
        Class<? extends Object> term118024 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term118023 = ((Class) term118024).getDeclaredField((String) "WRAPPER_OBJECT");
        ((Field) term118023).setAccessible(true);
        Object enum178 = ((Field) term118023).get((Object) null);
        term116483 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term116755 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term116483, term116483.getClass(), "_idType", enum177);
        setField(term116483, term116483.getClass(), "_customIdResolver", term116755);
        setField(term116483, term116483.getClass(), "_defaultImpl", null);
        setField(term116483, term116483.getClass(), "_includeAs", enum178);
        setField(term116483, term116483.getClass(), "_typeProperty", "");
        setBooleanField(term116483, term116483.getClass(), "_typeIdVisible", false);
        term117029 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Class<? extends Object> term118313 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term118312 = ((Class) term118313).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term118312).setAccessible(true);
        Object enum179 = ((Field) term118312).get((Object) null);
        Class<? extends Object> term118599 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term118598 = ((Class) term118599).getDeclaredField((String) "WRAPPER_OBJECT");
        ((Field) term118598).setAccessible(true);
        Object enum180 = ((Field) term118598).get((Object) null);
        term117724 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term117735 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term117724, term117724.getClass(), "_idType", enum179);
        setField(term117724, term117724.getClass(), "_includeAs", enum180);
        setField(term117724, term117724.getClass(), "_typeProperty", "");
        setBooleanField(term117724, term117724.getClass(), "_typeIdVisible", false);
        setField(term117724, term117724.getClass(), "_defaultImpl", null);
        setField(term117735, term117735.getClass(), "_config", null);
        setField(term117735, term117735.getClass(), "_typeToId", null);
        setField(term117735, term117735.getClass(), "_idToType", null);
        setField(term117735, term117735.getClass(), "_typeFactory", null);
        setField(term117735, term117735.getClass(), "_baseType", null);
        setField(term117724, term117724.getClass(), "_customIdResolver", term117735);
        term117736 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term117736, term117736.getClass(), "_componentType", null);
        setField(term117736, term117736.getClass(), "_emptyArray", null);
        setField(term117736, term117736.getClass(), "_superClass", null);
        setField(term117736, term117736.getClass(), "_superInterfaces", null);
        setField(term117736, term117736.getClass(), "_bindings", null);
        setField(term117736, term117736.getClass(), "_canonicalName", null);
        setField(term117736, term117736.getClass(), "_class", null);
        setIntField(term117736, term117736.getClass(), "_hash", 0);
        setField(term117736, term117736.getClass(), "_valueHandler", null);
        setField(term117736, term117736.getClass(), "_typeHandler", null);
        setBooleanField(term117736, term117736.getClass(), "_asStatic", false);
        term117715 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term117691 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        Object term117692 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term117719 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term117691, term117691.getClass(), "_config", null);
        setField(term117691, term117691.getClass(), "_typeToId", null);
        setField(term117691, term117691.getClass(), "_idToType", null);
        setField(term117691, term117691.getClass(), "_typeFactory", null);
        setField(term117691, term117691.getClass(), "_baseType", null);
        setField(term117715, term117715.getClass(), "_idResolver", term117691);
        setField(term117692, term117692.getClass(), "_componentType", null);
        setField(term117692, term117692.getClass(), "_emptyArray", null);
        setField(term117692, term117692.getClass(), "_superClass", null);
        setField(term117692, term117692.getClass(), "_superInterfaces", null);
        setField(term117692, term117692.getClass(), "_bindings", null);
        setField(term117692, term117692.getClass(), "_canonicalName", null);
        setField(term117692, term117692.getClass(), "_class", null);
        setIntField(term117692, term117692.getClass(), "_hash", 0);
        setField(term117692, term117692.getClass(), "_valueHandler", null);
        setField(term117692, term117692.getClass(), "_typeHandler", null);
        setBooleanField(term117692, term117692.getClass(), "_asStatic", false);
        setField(term117715, term117715.getClass(), "_baseType", term117692);
        setField(term117715, term117715.getClass(), "_property", null);
        setField(term117715, term117715.getClass(), "_defaultImpl", null);
        setField(term117715, term117715.getClass(), "_typePropertyName", "");
        setBooleanField(term117715, term117715.getClass(), "_typeIdVisible", false);
        setField(term117719, term117719.getClass(), "table", null);
        setField(term117719, term117719.getClass(), "nextTable", null);
        setLongField(term117719, term117719.getClass(), "baseCount", 0L);
        setIntField(term117719, term117719.getClass(), "sizeCtl", 32);
        setIntField(term117719, term117719.getClass(), "transferIndex", 0);
        setIntField(term117719, term117719.getClass(), "cellsBusy", 0);
        setField(term117719, term117719.getClass(), "counterCells", null);
        setField(term117719, term117719.getClass(), "keySet", null);
        setField(term117719, term117719.getClass(), "values", null);
        setField(term117719, term117719.getClass(), "entrySet", null);
        setField(term117719, term117719.getClass(), "keySet", null);
        setField(term117719, term117719.getClass(), "values", null);
        setField(term117715, term117715.getClass(), "_deserializers", term117719);
        setField(term117715, term117715.getClass(), "_defaultImplDeserializer", null);
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
        args[1] = term117029;
        args[2] = null;
        Object retValue = callMethod(klass, "buildTypeDeserializer", argTypes, term116483, args);
        assertTrue(recursiveEquals(term116483, term117724));
        assertTrue(recursiveEquals(term117029, term117736));
        assertTrue(recursiveEquals(retValue, term117715));
    }

};


