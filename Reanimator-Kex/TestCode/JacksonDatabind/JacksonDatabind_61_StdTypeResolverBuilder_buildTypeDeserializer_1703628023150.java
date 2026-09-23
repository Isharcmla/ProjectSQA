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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125159;
     Object term125675;
     Object term127269;
     Object term127279;
     Object term127260;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term127281 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term127280 = ((Class) term127281).getDeclaredField((String) "CLASS");
        ((Field) term127280).setAccessible(true);
        Object enum191 = ((Field) term127280).get((Object) null);
        Class<? extends Object> term127543 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term127542 = ((Class) term127543).getDeclaredField((String) "EXTERNAL_PROPERTY");
        ((Field) term127542).setAccessible(true);
        Object enum192 = ((Field) term127542).get((Object) null);
        term125159 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term125431 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term125159, term125159.getClass(), "_idType", enum191);
        setField(term125159, term125159.getClass(), "_customIdResolver", term125431);
        setField(term125159, term125159.getClass(), "_defaultImpl", null);
        setField(term125159, term125159.getClass(), "_includeAs", enum192);
        setField(term125159, term125159.getClass(), "_typeProperty", null);
        setBooleanField(term125159, term125159.getClass(), "_typeIdVisible", false);
        term125675 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class<? extends Object> term127841 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term127840 = ((Class) term127841).getDeclaredField((String) "CLASS");
        ((Field) term127840).setAccessible(true);
        Object enum193 = ((Field) term127840).get((Object) null);
        Class<? extends Object> term128103 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term128102 = ((Class) term128103).getDeclaredField((String) "EXTERNAL_PROPERTY");
        ((Field) term128102).setAccessible(true);
        Object enum194 = ((Field) term128102).get((Object) null);
        term127269 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term127278 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term127269, term127269.getClass(), "_idType", enum193);
        setField(term127269, term127269.getClass(), "_includeAs", enum194);
        setField(term127269, term127269.getClass(), "_typeProperty", null);
        setBooleanField(term127269, term127269.getClass(), "_typeIdVisible", false);
        setField(term127269, term127269.getClass(), "_defaultImpl", null);
        setField(term127278, term127278.getClass(), "_config", null);
        setField(term127278, term127278.getClass(), "_typeToId", null);
        setField(term127278, term127278.getClass(), "_idToType", null);
        setField(term127278, term127278.getClass(), "_typeFactory", null);
        setField(term127278, term127278.getClass(), "_baseType", null);
        setField(term127269, term127269.getClass(), "_customIdResolver", term127278);
        term127279 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term127279, term127279.getClass(), "_referencedType", null);
        setField(term127279, term127279.getClass(), "_anchorType", null);
        setField(term127279, term127279.getClass(), "_superClass", null);
        setField(term127279, term127279.getClass(), "_superInterfaces", null);
        setField(term127279, term127279.getClass(), "_bindings", null);
        setField(term127279, term127279.getClass(), "_canonicalName", null);
        setField(term127279, term127279.getClass(), "_class", null);
        setIntField(term127279, term127279.getClass(), "_hash", 0);
        setField(term127279, term127279.getClass(), "_valueHandler", null);
        setField(term127279, term127279.getClass(), "_typeHandler", null);
        setBooleanField(term127279, term127279.getClass(), "_asStatic", false);
        term127260 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        Object term127238 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        Object term127239 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term127264 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term127238, term127238.getClass(), "_config", null);
        setField(term127238, term127238.getClass(), "_typeToId", null);
        setField(term127238, term127238.getClass(), "_idToType", null);
        setField(term127238, term127238.getClass(), "_typeFactory", null);
        setField(term127238, term127238.getClass(), "_baseType", null);
        setField(term127260, term127260.getClass(), "_idResolver", term127238);
        setField(term127239, term127239.getClass(), "_referencedType", null);
        setField(term127239, term127239.getClass(), "_anchorType", null);
        setField(term127239, term127239.getClass(), "_superClass", null);
        setField(term127239, term127239.getClass(), "_superInterfaces", null);
        setField(term127239, term127239.getClass(), "_bindings", null);
        setField(term127239, term127239.getClass(), "_canonicalName", null);
        setField(term127239, term127239.getClass(), "_class", null);
        setIntField(term127239, term127239.getClass(), "_hash", 0);
        setField(term127239, term127239.getClass(), "_valueHandler", null);
        setField(term127239, term127239.getClass(), "_typeHandler", null);
        setBooleanField(term127239, term127239.getClass(), "_asStatic", false);
        setField(term127260, term127260.getClass(), "_baseType", term127239);
        setField(term127260, term127260.getClass(), "_property", null);
        setField(term127260, term127260.getClass(), "_defaultImpl", null);
        setField(term127260, term127260.getClass(), "_typePropertyName", "");
        setBooleanField(term127260, term127260.getClass(), "_typeIdVisible", false);
        setField(term127264, term127264.getClass(), "table", null);
        setField(term127264, term127264.getClass(), "nextTable", null);
        setLongField(term127264, term127264.getClass(), "baseCount", 0L);
        setIntField(term127264, term127264.getClass(), "sizeCtl", 32);
        setIntField(term127264, term127264.getClass(), "transferIndex", 0);
        setIntField(term127264, term127264.getClass(), "cellsBusy", 0);
        setField(term127264, term127264.getClass(), "counterCells", null);
        setField(term127264, term127264.getClass(), "keySet", null);
        setField(term127264, term127264.getClass(), "values", null);
        setField(term127264, term127264.getClass(), "entrySet", null);
        setField(term127264, term127264.getClass(), "keySet", null);
        setField(term127264, term127264.getClass(), "values", null);
        setField(term127260, term127260.getClass(), "_deserializers", term127264);
        setField(term127260, term127260.getClass(), "_defaultImplDeserializer", null);
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
        args[1] = term125675;
        args[2] = null;
        Object retValue = callMethod(klass, "buildTypeDeserializer", argTypes, term125159, args);
        assertTrue(recursiveEquals(term125159, term127269));
        assertTrue(recursiveEquals(term125675, term127279));
        assertTrue(recursiveEquals(retValue, term127260));
    }

};


