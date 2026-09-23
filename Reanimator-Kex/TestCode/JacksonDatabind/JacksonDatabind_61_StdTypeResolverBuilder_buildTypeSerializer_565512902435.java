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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term483562;
     Object term483824;
     Object term484879;
     Object term484883;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term484893 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term484892 = ((Class) term484893).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term484892).setAccessible(true);
        Object enum544 = ((Field) term484892).get((Object) null);
        term483562 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term483562, term483562.getClass(), "_appliesFor", enum544);
        Class<? extends Object> term483980 = Class.forName((String) "java.util.stream.DistinctOps$1");
        term483824 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term483944 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term483944, term483944.getClass(), "_class", term483980);
        setField(term483824, term483824.getClass(), "_referencedType", term483944);
        Class<? extends Object> term485346 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term485345 = ((Class) term485346).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term485345).setAccessible(true);
        Object enum545 = ((Field) term485345).get((Object) null);
        term484879 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term484879, term484879.getClass(), "_appliesFor", enum545);
        setField(term484879, term484879.getClass(), "_idType", null);
        setField(term484879, term484879.getClass(), "_includeAs", null);
        setField(term484879, term484879.getClass(), "_typeProperty", null);
        setBooleanField(term484879, term484879.getClass(), "_typeIdVisible", false);
        setField(term484879, term484879.getClass(), "_defaultImpl", null);
        setField(term484879, term484879.getClass(), "_customIdResolver", null);
        Class<? extends Object> term484885 = Class.forName((String) "com.fasterxml.jackson.databind.node.ArrayNode");
        term484883 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term484884 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term484884, term484884.getClass(), "_referencedType", null);
        setField(term484884, term484884.getClass(), "_superClass", null);
        setField(term484884, term484884.getClass(), "_superInterfaces", null);
        setField(term484884, term484884.getClass(), "_bindings", null);
        setField(term484884, term484884.getClass(), "_canonicalName", null);
        setField(term484884, term484884.getClass(), "_class", term484885);
        setIntField(term484884, term484884.getClass(), "_hash", 0);
        setField(term484884, term484884.getClass(), "_valueHandler", null);
        setField(term484884, term484884.getClass(), "_typeHandler", null);
        setBooleanField(term484884, term484884.getClass(), "_asStatic", false);
        setField(term484883, term484883.getClass(), "_referencedType", term484884);
        setField(term484883, term484883.getClass(), "_anchorType", null);
        setField(term484883, term484883.getClass(), "_superClass", null);
        setField(term484883, term484883.getClass(), "_superInterfaces", null);
        setField(term484883, term484883.getClass(), "_bindings", null);
        setField(term484883, term484883.getClass(), "_canonicalName", null);
        setField(term484883, term484883.getClass(), "_class", null);
        setIntField(term484883, term484883.getClass(), "_hash", 0);
        setField(term484883, term484883.getClass(), "_valueHandler", null);
        setField(term484883, term484883.getClass(), "_typeHandler", null);
        setBooleanField(term484883, term484883.getClass(), "_asStatic", false);
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
        args[1] = term483824;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term483562, args);
        assertTrue(recursiveEquals(term483562, term484879));
        assertTrue(recursiveEquals(term483824, null));
    }

};


