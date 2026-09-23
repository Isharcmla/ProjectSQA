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

public class TypeBindings_init_352540534318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106545;
     Object term106546;
     Object term107651;
     Object term107657;
     Object term107658;

    public TypeBindings_init_352540534318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term106699 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term106550 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term106699, term106699.getClass(), "_names", null);
        setField(term106699, term106699.getClass(), "_types", term106550);
        term106545 = (Object[]) newArray("java.lang.String", 4);
        term106546 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term106803 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term106907 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term107027 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term106803, term106803.getClass(), "_hash", 0);
        setElement(term106546, 0, term106803);
        setIntField(term106907, term106907.getClass(), "_hash", 0);
        setElement(term106546, 1, term106907);
        setElement(term106546, 2, term107027);
        setElement(term106546, 3, term107027);
        term107651 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term107652 = (Object[]) newArray("java.lang.String", 4);
        Object[] term107653 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term107654 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term107655 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term107656 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term107651, term107651.getClass(), "_names", term107652);
        setField(term107654, term107654.getClass(), "_referencedType", null);
        setField(term107654, term107654.getClass(), "_superClass", null);
        setField(term107654, term107654.getClass(), "_superInterfaces", null);
        setField(term107654, term107654.getClass(), "_bindings", null);
        setField(term107654, term107654.getClass(), "_canonicalName", null);
        setField(term107654, term107654.getClass(), "_class", null);
        setIntField(term107654, term107654.getClass(), "_hash", 0);
        setField(term107654, term107654.getClass(), "_valueHandler", null);
        setField(term107654, term107654.getClass(), "_typeHandler", null);
        setBooleanField(term107654, term107654.getClass(), "_asStatic", false);
        setElement(term107653, 0, term107654);
        setField(term107655, term107655.getClass(), "_referencedType", null);
        setField(term107655, term107655.getClass(), "_superClass", null);
        setField(term107655, term107655.getClass(), "_superInterfaces", null);
        setField(term107655, term107655.getClass(), "_bindings", null);
        setField(term107655, term107655.getClass(), "_canonicalName", null);
        setField(term107655, term107655.getClass(), "_class", null);
        setIntField(term107655, term107655.getClass(), "_hash", 0);
        setField(term107655, term107655.getClass(), "_valueHandler", null);
        setField(term107655, term107655.getClass(), "_typeHandler", null);
        setBooleanField(term107655, term107655.getClass(), "_asStatic", false);
        setElement(term107653, 1, term107655);
        setField(term107656, term107656.getClass(), "_referencedType", null);
        setField(term107656, term107656.getClass(), "_superClass", null);
        setField(term107656, term107656.getClass(), "_superInterfaces", null);
        setField(term107656, term107656.getClass(), "_bindings", null);
        setField(term107656, term107656.getClass(), "_canonicalName", null);
        setField(term107656, term107656.getClass(), "_class", null);
        setIntField(term107656, term107656.getClass(), "_hash", 0);
        setField(term107656, term107656.getClass(), "_valueHandler", null);
        setField(term107656, term107656.getClass(), "_typeHandler", null);
        setBooleanField(term107656, term107656.getClass(), "_asStatic", false);
        setElement(term107653, 2, term107656);
        setElement(term107653, 3, term107656);
        setField(term107651, term107651.getClass(), "_types", term107653);
        setField(term107651, term107651.getClass(), "_unboundVariables", null);
        setIntField(term107651, term107651.getClass(), "_hashCode", 1);
        term107657 = (Object[]) newArray("java.lang.String", 4);
        term107658 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term107659 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term107660 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term107661 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term107659, term107659.getClass(), "_referencedType", null);
        setField(term107659, term107659.getClass(), "_superClass", null);
        setField(term107659, term107659.getClass(), "_superInterfaces", null);
        setField(term107659, term107659.getClass(), "_bindings", null);
        setField(term107659, term107659.getClass(), "_canonicalName", null);
        setField(term107659, term107659.getClass(), "_class", null);
        setIntField(term107659, term107659.getClass(), "_hash", 0);
        setField(term107659, term107659.getClass(), "_valueHandler", null);
        setField(term107659, term107659.getClass(), "_typeHandler", null);
        setBooleanField(term107659, term107659.getClass(), "_asStatic", false);
        setElement(term107658, 0, term107659);
        setField(term107660, term107660.getClass(), "_referencedType", null);
        setField(term107660, term107660.getClass(), "_superClass", null);
        setField(term107660, term107660.getClass(), "_superInterfaces", null);
        setField(term107660, term107660.getClass(), "_bindings", null);
        setField(term107660, term107660.getClass(), "_canonicalName", null);
        setField(term107660, term107660.getClass(), "_class", null);
        setIntField(term107660, term107660.getClass(), "_hash", 0);
        setField(term107660, term107660.getClass(), "_valueHandler", null);
        setField(term107660, term107660.getClass(), "_typeHandler", null);
        setBooleanField(term107660, term107660.getClass(), "_asStatic", false);
        setElement(term107658, 1, term107660);
        setField(term107661, term107661.getClass(), "_referencedType", null);
        setField(term107661, term107661.getClass(), "_superClass", null);
        setField(term107661, term107661.getClass(), "_superInterfaces", null);
        setField(term107661, term107661.getClass(), "_bindings", null);
        setField(term107661, term107661.getClass(), "_canonicalName", null);
        setField(term107661, term107661.getClass(), "_class", null);
        setIntField(term107661, term107661.getClass(), "_hash", 0);
        setField(term107661, term107661.getClass(), "_valueHandler", null);
        setField(term107661, term107661.getClass(), "_typeHandler", null);
        setBooleanField(term107661, term107661.getClass(), "_asStatic", false);
        setElement(term107658, 2, term107661);
        setElement(term107658, 3, term107661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term106545;
        args[1] = term106546;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term107651));
        assertTrue(recursiveEquals(term106545, term107657));
        assertTrue(recursiveEquals(term106546, term107658));
    }

};


