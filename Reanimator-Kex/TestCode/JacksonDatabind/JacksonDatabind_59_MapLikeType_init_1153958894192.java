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

public class MapLikeType_init_1153958894192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73550;
     Object term73670;
     Object term73784;
     Object term75174;
     Object term75199;
     Object term75200;
     Object term75201;

    public MapLikeType_init_1153958894192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73514 = Class.forName((String) "com.fasterxml.jackson.core.sym.Name1");
        Object term73478 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term73478, term73478.getClass(), "_class", term73514);
        term73550 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$1");
        term73670 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term73670, term73670.getClass(), "_hash", 0);
        term73784 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setIntField(term73784, term73784.getClass(), "_hash", 0);
        Class<? extends Object> term75180 = Class.forName((String) "com.fasterxml.jackson.databind.node.BaseJsonNode");
        term75174 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term75175 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term75176 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term75177 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term75178 = (Object[]) newArray("java.lang.String", 0);
        Object[] term75179 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term75175, term75175.getClass(), "_referencedType", null);
        setField(term75175, term75175.getClass(), "_superClass", null);
        setField(term75175, term75175.getClass(), "_superInterfaces", null);
        setField(term75175, term75175.getClass(), "_bindings", null);
        setField(term75175, term75175.getClass(), "_canonicalName", null);
        setField(term75175, term75175.getClass(), "_class", null);
        setIntField(term75175, term75175.getClass(), "_hash", 0);
        setField(term75175, term75175.getClass(), "_valueHandler", null);
        setField(term75175, term75175.getClass(), "_typeHandler", null);
        setBooleanField(term75175, term75175.getClass(), "_asStatic", false);
        setField(term75174, term75174.getClass(), "_keyType", term75175);
        setField(term75176, term75176.getClass(), "_elementType", null);
        setField(term75176, term75176.getClass(), "_superClass", null);
        setField(term75176, term75176.getClass(), "_superInterfaces", null);
        setField(term75176, term75176.getClass(), "_bindings", null);
        setField(term75176, term75176.getClass(), "_canonicalName", null);
        setField(term75176, term75176.getClass(), "_class", null);
        setIntField(term75176, term75176.getClass(), "_hash", 0);
        setField(term75176, term75176.getClass(), "_valueHandler", null);
        setField(term75176, term75176.getClass(), "_typeHandler", null);
        setBooleanField(term75176, term75176.getClass(), "_asStatic", false);
        setField(term75174, term75174.getClass(), "_valueType", term75176);
        setField(term75174, term75174.getClass(), "_superClass", null);
        setField(term75174, term75174.getClass(), "_superInterfaces", null);
        setField(term75177, term75177.getClass(), "_names", term75178);
        setField(term75177, term75177.getClass(), "_types", term75179);
        setField(term75177, term75177.getClass(), "_unboundVariables", null);
        setIntField(term75177, term75177.getClass(), "_hashCode", 1);
        setField(term75174, term75174.getClass(), "_bindings", term75177);
        setField(term75174, term75174.getClass(), "_canonicalName", null);
        setField(term75174, term75174.getClass(), "_class", term75180);
        setIntField(term75174, term75174.getClass(), "_hash", 354407304);
        setField(term75174, term75174.getClass(), "_valueHandler", null);
        setField(term75174, term75174.getClass(), "_typeHandler", null);
        setBooleanField(term75174, term75174.getClass(), "_asStatic", false);
        term75199 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term75199, term75199.getClass(), "_referencedType", null);
        setField(term75199, term75199.getClass(), "_superClass", null);
        setField(term75199, term75199.getClass(), "_superInterfaces", null);
        setField(term75199, term75199.getClass(), "_bindings", null);
        setField(term75199, term75199.getClass(), "_canonicalName", null);
        setField(term75199, term75199.getClass(), "_class", null);
        setIntField(term75199, term75199.getClass(), "_hash", 0);
        setField(term75199, term75199.getClass(), "_valueHandler", null);
        setField(term75199, term75199.getClass(), "_typeHandler", null);
        setBooleanField(term75199, term75199.getClass(), "_asStatic", false);
        term75200 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term75200, term75200.getClass(), "_elementType", null);
        setField(term75200, term75200.getClass(), "_superClass", null);
        setField(term75200, term75200.getClass(), "_superInterfaces", null);
        setField(term75200, term75200.getClass(), "_bindings", null);
        setField(term75200, term75200.getClass(), "_canonicalName", null);
        setField(term75200, term75200.getClass(), "_class", null);
        setIntField(term75200, term75200.getClass(), "_hash", 0);
        setField(term75200, term75200.getClass(), "_valueHandler", null);
        setField(term75200, term75200.getClass(), "_typeHandler", null);
        setBooleanField(term75200, term75200.getClass(), "_asStatic", false);
        term75201 = Class.forName((String) "com.fasterxml.jackson.databind.node.BaseJsonNode");
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
        args[0] = term73550;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term73670;
        args[5] = term73784;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term75174));
        assertTrue(recursiveEquals(term73550, term75199));
        assertTrue(recursiveEquals(term73670, null));
        assertTrue(recursiveEquals(term73784, false));
    }

};


