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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499259;
     Object term499521;
     Object term500916;
     Object term500920;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term500930 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term500929 = ((Class) term500930).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term500929).setAccessible(true);
        Object enum560 = ((Field) term500929).get((Object) null);
        term499259 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term499259, term499259.getClass(), "_appliesFor", enum560);
        Class<? extends Object> term499663 = Class.forName((String) "java.nio.LongBuffer");
        term499521 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term499627 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term499627, term499627.getClass(), "_class", term499663);
        setField(term499521, term499521.getClass(), "_referencedType", term499627);
        Class<? extends Object> term501350 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term501349 = ((Class) term501350).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term501349).setAccessible(true);
        Object enum561 = ((Field) term501349).get((Object) null);
        term500916 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term500916, term500916.getClass(), "_appliesFor", enum561);
        setField(term500916, term500916.getClass(), "_idType", null);
        setField(term500916, term500916.getClass(), "_includeAs", null);
        setField(term500916, term500916.getClass(), "_typeProperty", null);
        setBooleanField(term500916, term500916.getClass(), "_typeIdVisible", false);
        setField(term500916, term500916.getClass(), "_defaultImpl", null);
        setField(term500916, term500916.getClass(), "_customIdResolver", null);
        Class<? extends Object> term500922 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        term500920 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term500921 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term500921, term500921.getClass(), "_elementType", null);
        setField(term500921, term500921.getClass(), "_superClass", null);
        setField(term500921, term500921.getClass(), "_superInterfaces", null);
        setField(term500921, term500921.getClass(), "_bindings", null);
        setField(term500921, term500921.getClass(), "_canonicalName", null);
        setField(term500921, term500921.getClass(), "_class", term500922);
        setIntField(term500921, term500921.getClass(), "_hash", 0);
        setField(term500921, term500921.getClass(), "_valueHandler", null);
        setField(term500921, term500921.getClass(), "_typeHandler", null);
        setBooleanField(term500921, term500921.getClass(), "_asStatic", false);
        setField(term500920, term500920.getClass(), "_referencedType", term500921);
        setField(term500920, term500920.getClass(), "_anchorType", null);
        setField(term500920, term500920.getClass(), "_superClass", null);
        setField(term500920, term500920.getClass(), "_superInterfaces", null);
        setField(term500920, term500920.getClass(), "_bindings", null);
        setField(term500920, term500920.getClass(), "_canonicalName", null);
        setField(term500920, term500920.getClass(), "_class", null);
        setIntField(term500920, term500920.getClass(), "_hash", 0);
        setField(term500920, term500920.getClass(), "_valueHandler", null);
        setField(term500920, term500920.getClass(), "_typeHandler", null);
        setBooleanField(term500920, term500920.getClass(), "_asStatic", false);
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
        args[1] = term499521;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term499259, args);
        assertTrue(recursiveEquals(term499259, term500916));
        assertTrue(recursiveEquals(term499521, null));
    }

};


