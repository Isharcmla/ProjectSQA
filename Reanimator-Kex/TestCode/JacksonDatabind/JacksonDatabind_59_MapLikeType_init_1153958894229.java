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
import java.lang.Object;
import java.lang.String;

public class MapLikeType_init_1153958894229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105386;
     Object term105526;
     Object term105646;
     Object term105750;
     Object term106100;
     Object term106130;
     Object term106131;
     Object term106132;
     Object term106158;

    public MapLikeType_init_1153958894229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105350 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term105350, term105350.getClass(), "_class", null);
        setIntField(term105350, term105350.getClass(), "_hash", 0);
        setField(term105350, term105350.getClass(), "_valueHandler", null);
        setField(term105350, term105350.getClass(), "_typeHandler", null);
        setBooleanField(term105350, term105350.getClass(), "_asStatic", false);
        term105386 = Class.forName((String) "com.fasterxml.jackson.databind.type.ReferenceType");
        term105526 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term105646 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term105646, term105646.getClass(), "_hash", 0);
        term105750 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term105750, term105750.getClass(), "_hash", 0);
        Class<? extends Object> term106104 = Class.forName((String) "com.fasterxml.jackson.databind.type.ReferenceType");
        term106100 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term106101 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term106102 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term106103 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term106101, term106101.getClass(), "_referencedType", null);
        setField(term106101, term106101.getClass(), "_superClass", null);
        setField(term106101, term106101.getClass(), "_superInterfaces", null);
        setField(term106101, term106101.getClass(), "_bindings", null);
        setField(term106101, term106101.getClass(), "_canonicalName", null);
        setField(term106101, term106101.getClass(), "_class", null);
        setIntField(term106101, term106101.getClass(), "_hash", 0);
        setField(term106101, term106101.getClass(), "_valueHandler", null);
        setField(term106101, term106101.getClass(), "_typeHandler", null);
        setBooleanField(term106101, term106101.getClass(), "_asStatic", false);
        setField(term106100, term106100.getClass(), "_keyType", term106101);
        setField(term106102, term106102.getClass(), "_referencedType", null);
        setField(term106102, term106102.getClass(), "_anchorType", null);
        setField(term106102, term106102.getClass(), "_superClass", null);
        setField(term106102, term106102.getClass(), "_superInterfaces", null);
        setField(term106102, term106102.getClass(), "_bindings", null);
        setField(term106102, term106102.getClass(), "_canonicalName", null);
        setField(term106102, term106102.getClass(), "_class", null);
        setIntField(term106102, term106102.getClass(), "_hash", 0);
        setField(term106102, term106102.getClass(), "_valueHandler", null);
        setField(term106102, term106102.getClass(), "_typeHandler", null);
        setBooleanField(term106102, term106102.getClass(), "_asStatic", false);
        setField(term106100, term106100.getClass(), "_valueType", term106102);
        setField(term106100, term106100.getClass(), "_superClass", null);
        setField(term106100, term106100.getClass(), "_superInterfaces", null);
        setField(term106103, term106103.getClass(), "_names", null);
        setField(term106103, term106103.getClass(), "_types", null);
        setField(term106103, term106103.getClass(), "_unboundVariables", null);
        setIntField(term106103, term106103.getClass(), "_hashCode", 0);
        setField(term106100, term106100.getClass(), "_bindings", term106103);
        setField(term106100, term106100.getClass(), "_canonicalName", null);
        setField(term106100, term106100.getClass(), "_class", term106104);
        setIntField(term106100, term106100.getClass(), "_hash", -1861851280);
        setField(term106100, term106100.getClass(), "_valueHandler", "int");
        setField(term106100, term106100.getClass(), "_typeHandler", null);
        setBooleanField(term106100, term106100.getClass(), "_asStatic", true);
        term106130 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term106130, term106130.getClass(), "_referencedType", null);
        setField(term106130, term106130.getClass(), "_superClass", null);
        setField(term106130, term106130.getClass(), "_superInterfaces", null);
        setField(term106130, term106130.getClass(), "_bindings", null);
        setField(term106130, term106130.getClass(), "_canonicalName", null);
        setField(term106130, term106130.getClass(), "_class", null);
        setIntField(term106130, term106130.getClass(), "_hash", 0);
        setField(term106130, term106130.getClass(), "_valueHandler", null);
        setField(term106130, term106130.getClass(), "_typeHandler", null);
        setBooleanField(term106130, term106130.getClass(), "_asStatic", false);
        term106131 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term106131, term106131.getClass(), "_referencedType", null);
        setField(term106131, term106131.getClass(), "_anchorType", null);
        setField(term106131, term106131.getClass(), "_superClass", null);
        setField(term106131, term106131.getClass(), "_superInterfaces", null);
        setField(term106131, term106131.getClass(), "_bindings", null);
        setField(term106131, term106131.getClass(), "_canonicalName", null);
        setField(term106131, term106131.getClass(), "_class", null);
        setIntField(term106131, term106131.getClass(), "_hash", 0);
        setField(term106131, term106131.getClass(), "_valueHandler", null);
        setField(term106131, term106131.getClass(), "_typeHandler", null);
        setBooleanField(term106131, term106131.getClass(), "_asStatic", false);
        term106132 = Class.forName((String) "com.fasterxml.jackson.databind.type.ReferenceType");
        term106158 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term106158, term106158.getClass(), "_names", null);
        setField(term106158, term106158.getClass(), "_types", null);
        setField(term106158, term106158.getClass(), "_unboundVariables", null);
        setIntField(term106158, term106158.getClass(), "_hashCode", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term105386;
        args[1] = term105526;
        args[2] = null;
        args[3] = null;
        args[4] = term105646;
        args[5] = term105750;
        args[6] = "int";
        args[7] = null;
        args[8] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term106100));
        assertTrue(recursiveEquals(term105386, term106130));
        assertTrue(recursiveEquals(term105526, term106131));
        assertTrue(recursiveEquals(term105646, null));
        assertTrue(recursiveEquals(term105750, true));
    }

};


