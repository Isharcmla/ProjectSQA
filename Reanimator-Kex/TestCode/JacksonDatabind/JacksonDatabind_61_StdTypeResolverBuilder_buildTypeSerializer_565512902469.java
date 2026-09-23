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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529537;
     Object term529799;
     Object term530940;
     Object term530944;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term530947 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term530946 = ((Class) term530947).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term530946).setAccessible(true);
        Object enum587 = ((Field) term530946).get((Object) null);
        term529537 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term529537, term529537.getClass(), "_appliesFor", enum587);
        term529799 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term529897 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term529799, term529799.getClass(), "_referencedType", term529897);
        Class<? extends Object> term531287 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term531286 = ((Class) term531287).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term531286).setAccessible(true);
        Object enum588 = ((Field) term531286).get((Object) null);
        term530940 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term530940, term530940.getClass(), "_appliesFor", enum588);
        setField(term530940, term530940.getClass(), "_idType", null);
        setField(term530940, term530940.getClass(), "_includeAs", null);
        setField(term530940, term530940.getClass(), "_typeProperty", null);
        setBooleanField(term530940, term530940.getClass(), "_typeIdVisible", false);
        setField(term530940, term530940.getClass(), "_defaultImpl", null);
        setField(term530940, term530940.getClass(), "_customIdResolver", null);
        term530944 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term530945 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term530945, term530945.getClass(), "_superClass", null);
        setField(term530945, term530945.getClass(), "_superInterfaces", null);
        setField(term530945, term530945.getClass(), "_bindings", null);
        setField(term530945, term530945.getClass(), "_canonicalName", null);
        setField(term530945, term530945.getClass(), "_class", null);
        setIntField(term530945, term530945.getClass(), "_hash", 0);
        setField(term530945, term530945.getClass(), "_valueHandler", null);
        setField(term530945, term530945.getClass(), "_typeHandler", null);
        setBooleanField(term530945, term530945.getClass(), "_asStatic", false);
        setField(term530944, term530944.getClass(), "_referencedType", term530945);
        setField(term530944, term530944.getClass(), "_anchorType", null);
        setField(term530944, term530944.getClass(), "_superClass", null);
        setField(term530944, term530944.getClass(), "_superInterfaces", null);
        setField(term530944, term530944.getClass(), "_bindings", null);
        setField(term530944, term530944.getClass(), "_canonicalName", null);
        setField(term530944, term530944.getClass(), "_class", null);
        setIntField(term530944, term530944.getClass(), "_hash", 0);
        setField(term530944, term530944.getClass(), "_valueHandler", null);
        setField(term530944, term530944.getClass(), "_typeHandler", null);
        setBooleanField(term530944, term530944.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term529799;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term529537, args);
        assertTrue(recursiveEquals(term529537, term530940));
        assertTrue(recursiveEquals(term529799, null));
    }

};


