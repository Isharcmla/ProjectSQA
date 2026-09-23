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

public class TypeBindings_init_352540534246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79254;
     Object term79255;
     Object term80440;
     Object term80447;
     Object term80448;

    public TypeBindings_init_352540534246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term79419 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term79260 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term79419, term79419.getClass(), "_names", null);
        setField(term79419, term79419.getClass(), "_types", term79260);
        term79254 = (Object[]) newArray("java.lang.String", 4);
        term79255 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term79523 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term79619 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term79715 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term79819 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term79523, term79523.getClass(), "_hash", 0);
        setElement(term79255, 0, term79523);
        setIntField(term79619, term79619.getClass(), "_hash", 0);
        setElement(term79255, 1, term79619);
        setIntField(term79715, term79715.getClass(), "_hash", 0);
        setElement(term79255, 2, term79715);
        setElement(term79255, 3, term79819);
        term80440 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term80441 = (Object[]) newArray("java.lang.String", 4);
        Object[] term80442 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term80443 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term80444 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term80445 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term80446 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term80440, term80440.getClass(), "_names", term80441);
        setField(term80443, term80443.getClass(), "_referencedType", null);
        setField(term80443, term80443.getClass(), "_superClass", null);
        setField(term80443, term80443.getClass(), "_superInterfaces", null);
        setField(term80443, term80443.getClass(), "_bindings", null);
        setField(term80443, term80443.getClass(), "_canonicalName", null);
        setField(term80443, term80443.getClass(), "_class", null);
        setIntField(term80443, term80443.getClass(), "_hash", 0);
        setField(term80443, term80443.getClass(), "_valueHandler", null);
        setField(term80443, term80443.getClass(), "_typeHandler", null);
        setBooleanField(term80443, term80443.getClass(), "_asStatic", false);
        setElement(term80442, 0, term80443);
        setField(term80444, term80444.getClass(), "_componentType", null);
        setField(term80444, term80444.getClass(), "_emptyArray", null);
        setField(term80444, term80444.getClass(), "_superClass", null);
        setField(term80444, term80444.getClass(), "_superInterfaces", null);
        setField(term80444, term80444.getClass(), "_bindings", null);
        setField(term80444, term80444.getClass(), "_canonicalName", null);
        setField(term80444, term80444.getClass(), "_class", null);
        setIntField(term80444, term80444.getClass(), "_hash", 0);
        setField(term80444, term80444.getClass(), "_valueHandler", null);
        setField(term80444, term80444.getClass(), "_typeHandler", null);
        setBooleanField(term80444, term80444.getClass(), "_asStatic", false);
        setElement(term80442, 1, term80444);
        setField(term80445, term80445.getClass(), "_componentType", null);
        setField(term80445, term80445.getClass(), "_emptyArray", null);
        setField(term80445, term80445.getClass(), "_superClass", null);
        setField(term80445, term80445.getClass(), "_superInterfaces", null);
        setField(term80445, term80445.getClass(), "_bindings", null);
        setField(term80445, term80445.getClass(), "_canonicalName", null);
        setField(term80445, term80445.getClass(), "_class", null);
        setIntField(term80445, term80445.getClass(), "_hash", 0);
        setField(term80445, term80445.getClass(), "_valueHandler", null);
        setField(term80445, term80445.getClass(), "_typeHandler", null);
        setBooleanField(term80445, term80445.getClass(), "_asStatic", false);
        setElement(term80442, 2, term80445);
        setField(term80446, term80446.getClass(), "_referencedType", null);
        setField(term80446, term80446.getClass(), "_superClass", null);
        setField(term80446, term80446.getClass(), "_superInterfaces", null);
        setField(term80446, term80446.getClass(), "_bindings", null);
        setField(term80446, term80446.getClass(), "_canonicalName", null);
        setField(term80446, term80446.getClass(), "_class", null);
        setIntField(term80446, term80446.getClass(), "_hash", 0);
        setField(term80446, term80446.getClass(), "_valueHandler", null);
        setField(term80446, term80446.getClass(), "_typeHandler", null);
        setBooleanField(term80446, term80446.getClass(), "_asStatic", false);
        setElement(term80442, 3, term80446);
        setField(term80440, term80440.getClass(), "_types", term80442);
        setField(term80440, term80440.getClass(), "_unboundVariables", null);
        setIntField(term80440, term80440.getClass(), "_hashCode", 1);
        term80447 = (Object[]) newArray("java.lang.String", 4);
        term80448 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term80449 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term80450 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term80451 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term80452 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term80449, term80449.getClass(), "_referencedType", null);
        setField(term80449, term80449.getClass(), "_superClass", null);
        setField(term80449, term80449.getClass(), "_superInterfaces", null);
        setField(term80449, term80449.getClass(), "_bindings", null);
        setField(term80449, term80449.getClass(), "_canonicalName", null);
        setField(term80449, term80449.getClass(), "_class", null);
        setIntField(term80449, term80449.getClass(), "_hash", 0);
        setField(term80449, term80449.getClass(), "_valueHandler", null);
        setField(term80449, term80449.getClass(), "_typeHandler", null);
        setBooleanField(term80449, term80449.getClass(), "_asStatic", false);
        setElement(term80448, 0, term80449);
        setField(term80450, term80450.getClass(), "_componentType", null);
        setField(term80450, term80450.getClass(), "_emptyArray", null);
        setField(term80450, term80450.getClass(), "_superClass", null);
        setField(term80450, term80450.getClass(), "_superInterfaces", null);
        setField(term80450, term80450.getClass(), "_bindings", null);
        setField(term80450, term80450.getClass(), "_canonicalName", null);
        setField(term80450, term80450.getClass(), "_class", null);
        setIntField(term80450, term80450.getClass(), "_hash", 0);
        setField(term80450, term80450.getClass(), "_valueHandler", null);
        setField(term80450, term80450.getClass(), "_typeHandler", null);
        setBooleanField(term80450, term80450.getClass(), "_asStatic", false);
        setElement(term80448, 1, term80450);
        setField(term80451, term80451.getClass(), "_componentType", null);
        setField(term80451, term80451.getClass(), "_emptyArray", null);
        setField(term80451, term80451.getClass(), "_superClass", null);
        setField(term80451, term80451.getClass(), "_superInterfaces", null);
        setField(term80451, term80451.getClass(), "_bindings", null);
        setField(term80451, term80451.getClass(), "_canonicalName", null);
        setField(term80451, term80451.getClass(), "_class", null);
        setIntField(term80451, term80451.getClass(), "_hash", 0);
        setField(term80451, term80451.getClass(), "_valueHandler", null);
        setField(term80451, term80451.getClass(), "_typeHandler", null);
        setBooleanField(term80451, term80451.getClass(), "_asStatic", false);
        setElement(term80448, 2, term80451);
        setField(term80452, term80452.getClass(), "_referencedType", null);
        setField(term80452, term80452.getClass(), "_superClass", null);
        setField(term80452, term80452.getClass(), "_superInterfaces", null);
        setField(term80452, term80452.getClass(), "_bindings", null);
        setField(term80452, term80452.getClass(), "_canonicalName", null);
        setField(term80452, term80452.getClass(), "_class", null);
        setIntField(term80452, term80452.getClass(), "_hash", 0);
        setField(term80452, term80452.getClass(), "_valueHandler", null);
        setField(term80452, term80452.getClass(), "_typeHandler", null);
        setBooleanField(term80452, term80452.getClass(), "_asStatic", false);
        setElement(term80448, 3, term80452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term79254;
        args[1] = term79255;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term80440));
        assertTrue(recursiveEquals(term79254, term80447));
        assertTrue(recursiveEquals(term79255, term80448));
    }

};


