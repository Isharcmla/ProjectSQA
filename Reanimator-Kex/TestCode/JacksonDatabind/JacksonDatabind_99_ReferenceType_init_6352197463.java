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

public class ReferenceType_init_6352197463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9786;
     Object term9890;
     Object term10300;
     Object term10324;
     Object term10325;

    public ReferenceType_init_6352197463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9750 = Class.forName((String) "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Bucket");
        Object term9714 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term9714, term9714.getClass(), "_class", term9750);
        term9786 = Class.forName((String) "java.util.ArrayPrefixHelpers$IntCumulateTask");
        term9890 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term9890, term9890.getClass(), "_hash", 0);
        Class<? extends Object> term10305 = Class.forName((String) "kex.java.util.LinkedList$ListItr");
        term10300 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term10301 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term10302 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term10303 = (Object[]) newArray("java.lang.String", 0);
        Object[] term10304 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term10301, term10301.getClass(), "_referencedType", null);
        setField(term10301, term10301.getClass(), "_anchorType", null);
        setField(term10301, term10301.getClass(), "_superClass", null);
        setField(term10301, term10301.getClass(), "_superInterfaces", null);
        setField(term10301, term10301.getClass(), "_bindings", null);
        setField(term10301, term10301.getClass(), "_canonicalName", null);
        setField(term10301, term10301.getClass(), "_class", null);
        setIntField(term10301, term10301.getClass(), "_hash", 0);
        setField(term10301, term10301.getClass(), "_valueHandler", null);
        setField(term10301, term10301.getClass(), "_typeHandler", null);
        setBooleanField(term10301, term10301.getClass(), "_asStatic", false);
        setField(term10300, term10300.getClass(), "_referencedType", term10301);
        setField(term10300, term10300.getClass(), "_anchorType", term10300);
        setField(term10300, term10300.getClass(), "_superClass", null);
        setField(term10300, term10300.getClass(), "_superInterfaces", null);
        setField(term10302, term10302.getClass(), "_names", term10303);
        setField(term10302, term10302.getClass(), "_types", term10304);
        setField(term10302, term10302.getClass(), "_unboundVariables", null);
        setIntField(term10302, term10302.getClass(), "_hashCode", 1);
        setField(term10300, term10300.getClass(), "_bindings", term10302);
        setField(term10300, term10300.getClass(), "_canonicalName", null);
        setField(term10300, term10300.getClass(), "_class", term10305);
        setIntField(term10300, term10300.getClass(), "_hash", -913716980);
        setField(term10300, term10300.getClass(), "_valueHandler", null);
        setField(term10300, term10300.getClass(), "_typeHandler", null);
        setBooleanField(term10300, term10300.getClass(), "_asStatic", false);
        term10324 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term10324, term10324.getClass(), "_referencedType", null);
        setField(term10324, term10324.getClass(), "_anchorType", null);
        setField(term10324, term10324.getClass(), "_superClass", null);
        setField(term10324, term10324.getClass(), "_superInterfaces", null);
        setField(term10324, term10324.getClass(), "_bindings", null);
        setField(term10324, term10324.getClass(), "_canonicalName", null);
        setField(term10324, term10324.getClass(), "_class", null);
        setIntField(term10324, term10324.getClass(), "_hash", 0);
        setField(term10324, term10324.getClass(), "_valueHandler", null);
        setField(term10324, term10324.getClass(), "_typeHandler", null);
        setBooleanField(term10324, term10324.getClass(), "_asStatic", false);
        term10325 = Class.forName((String) "kex.java.util.LinkedList$ListItr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.ReferenceType");
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
        args[0] = term9786;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term9890;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10300));
        assertTrue(recursiveEquals(term9786, term10324));
        assertTrue(recursiveEquals(term9890, false));
    }

};


