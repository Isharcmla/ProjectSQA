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

public class TypeBindings_init_352540534181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60305;
     Object term60306;
     Object term60717;
     Object term60722;
     Object term60723;

    public TypeBindings_init_352540534181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term60450 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term60309 = (Object[]) newArray("java.lang.String", 0);
        Object[] term60310 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term60450, term60450.getClass(), "_names", term60309);
        setField(term60450, term60450.getClass(), "_types", term60310);
        term60305 = (Object[]) newArray("java.lang.String", 2);
        term60306 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term60570 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term60690 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term60570, term60570.getClass(), "_hash", 0);
        setElement(term60306, 0, term60570);
        setElement(term60306, 1, term60690);
        term60717 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term60718 = (Object[]) newArray("java.lang.String", 2);
        Object[] term60719 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term60720 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term60721 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term60717, term60717.getClass(), "_names", term60718);
        setField(term60720, term60720.getClass(), "_referencedType", null);
        setField(term60720, term60720.getClass(), "_superClass", null);
        setField(term60720, term60720.getClass(), "_superInterfaces", null);
        setField(term60720, term60720.getClass(), "_bindings", null);
        setField(term60720, term60720.getClass(), "_canonicalName", null);
        setField(term60720, term60720.getClass(), "_class", null);
        setIntField(term60720, term60720.getClass(), "_hash", 0);
        setField(term60720, term60720.getClass(), "_valueHandler", null);
        setField(term60720, term60720.getClass(), "_typeHandler", null);
        setBooleanField(term60720, term60720.getClass(), "_asStatic", false);
        setElement(term60719, 0, term60720);
        setField(term60721, term60721.getClass(), "_referencedType", null);
        setField(term60721, term60721.getClass(), "_superClass", null);
        setField(term60721, term60721.getClass(), "_superInterfaces", null);
        setField(term60721, term60721.getClass(), "_bindings", null);
        setField(term60721, term60721.getClass(), "_canonicalName", null);
        setField(term60721, term60721.getClass(), "_class", null);
        setIntField(term60721, term60721.getClass(), "_hash", 0);
        setField(term60721, term60721.getClass(), "_valueHandler", null);
        setField(term60721, term60721.getClass(), "_typeHandler", null);
        setBooleanField(term60721, term60721.getClass(), "_asStatic", false);
        setElement(term60719, 1, term60721);
        setField(term60717, term60717.getClass(), "_types", term60719);
        setField(term60717, term60717.getClass(), "_unboundVariables", null);
        setIntField(term60717, term60717.getClass(), "_hashCode", 1);
        term60722 = (Object[]) newArray("java.lang.String", 2);
        term60723 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term60724 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term60725 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term60724, term60724.getClass(), "_referencedType", null);
        setField(term60724, term60724.getClass(), "_superClass", null);
        setField(term60724, term60724.getClass(), "_superInterfaces", null);
        setField(term60724, term60724.getClass(), "_bindings", null);
        setField(term60724, term60724.getClass(), "_canonicalName", null);
        setField(term60724, term60724.getClass(), "_class", null);
        setIntField(term60724, term60724.getClass(), "_hash", 0);
        setField(term60724, term60724.getClass(), "_valueHandler", null);
        setField(term60724, term60724.getClass(), "_typeHandler", null);
        setBooleanField(term60724, term60724.getClass(), "_asStatic", false);
        setElement(term60723, 0, term60724);
        setField(term60725, term60725.getClass(), "_referencedType", null);
        setField(term60725, term60725.getClass(), "_superClass", null);
        setField(term60725, term60725.getClass(), "_superInterfaces", null);
        setField(term60725, term60725.getClass(), "_bindings", null);
        setField(term60725, term60725.getClass(), "_canonicalName", null);
        setField(term60725, term60725.getClass(), "_class", null);
        setIntField(term60725, term60725.getClass(), "_hash", 0);
        setField(term60725, term60725.getClass(), "_valueHandler", null);
        setField(term60725, term60725.getClass(), "_typeHandler", null);
        setBooleanField(term60725, term60725.getClass(), "_asStatic", false);
        setElement(term60723, 1, term60725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term60305;
        args[1] = term60306;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term60717));
        assertTrue(recursiveEquals(term60305, term60722));
        assertTrue(recursiveEquals(term60306, term60723));
    }

};


