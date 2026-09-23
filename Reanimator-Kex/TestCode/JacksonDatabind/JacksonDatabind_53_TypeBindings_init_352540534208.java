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

public class TypeBindings_init_352540534208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68769;
     Object term68772;
     Object term69589;
     Object term69598;
     Object term69603;

    public TypeBindings_init_352540534208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term68921 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term68775 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term68921, term68921.getClass(), "_names", null);
        setField(term68921, term68921.getClass(), "_types", term68775);
        term68769 = (Object[]) newArray("java.lang.String", 2);
        setElement(term68769, 0, "");
        setElement(term68769, 1, "");
        term68772 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term69103 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term69207 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term69103, term69103.getClass(), "_hash", 0);
        setElement(term68772, 0, term69103);
        setIntField(term69207, term69207.getClass(), "_hash", 0);
        setElement(term68772, 1, term69207);
        term69589 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term69590 = (Object[]) newArray("java.lang.String", 2);
        Object[] term69595 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term69596 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term69597 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setElement(term69590, 0, "");
        setElement(term69590, 1, "");
        setField(term69589, term69589.getClass(), "_names", term69590);
        setField(term69596, term69596.getClass(), "_elementType", null);
        setField(term69596, term69596.getClass(), "_superClass", null);
        setField(term69596, term69596.getClass(), "_superInterfaces", null);
        setField(term69596, term69596.getClass(), "_bindings", null);
        setField(term69596, term69596.getClass(), "_canonicalName", null);
        setField(term69596, term69596.getClass(), "_class", null);
        setIntField(term69596, term69596.getClass(), "_hash", 0);
        setField(term69596, term69596.getClass(), "_valueHandler", null);
        setField(term69596, term69596.getClass(), "_typeHandler", null);
        setBooleanField(term69596, term69596.getClass(), "_asStatic", false);
        setElement(term69595, 0, term69596);
        setField(term69597, term69597.getClass(), "_referencedType", null);
        setField(term69597, term69597.getClass(), "_superClass", null);
        setField(term69597, term69597.getClass(), "_superInterfaces", null);
        setField(term69597, term69597.getClass(), "_bindings", null);
        setField(term69597, term69597.getClass(), "_canonicalName", null);
        setField(term69597, term69597.getClass(), "_class", null);
        setIntField(term69597, term69597.getClass(), "_hash", 0);
        setField(term69597, term69597.getClass(), "_valueHandler", null);
        setField(term69597, term69597.getClass(), "_typeHandler", null);
        setBooleanField(term69597, term69597.getClass(), "_asStatic", false);
        setElement(term69595, 1, term69597);
        setField(term69589, term69589.getClass(), "_types", term69595);
        setField(term69589, term69589.getClass(), "_unboundVariables", null);
        setIntField(term69589, term69589.getClass(), "_hashCode", 1);
        term69598 = (Object[]) newArray("java.lang.String", 2);
        setElement(term69598, 0, "");
        setElement(term69598, 1, "");
        term69603 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term69604 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term69605 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term69604, term69604.getClass(), "_elementType", null);
        setField(term69604, term69604.getClass(), "_superClass", null);
        setField(term69604, term69604.getClass(), "_superInterfaces", null);
        setField(term69604, term69604.getClass(), "_bindings", null);
        setField(term69604, term69604.getClass(), "_canonicalName", null);
        setField(term69604, term69604.getClass(), "_class", null);
        setIntField(term69604, term69604.getClass(), "_hash", 0);
        setField(term69604, term69604.getClass(), "_valueHandler", null);
        setField(term69604, term69604.getClass(), "_typeHandler", null);
        setBooleanField(term69604, term69604.getClass(), "_asStatic", false);
        setElement(term69603, 0, term69604);
        setField(term69605, term69605.getClass(), "_referencedType", null);
        setField(term69605, term69605.getClass(), "_superClass", null);
        setField(term69605, term69605.getClass(), "_superInterfaces", null);
        setField(term69605, term69605.getClass(), "_bindings", null);
        setField(term69605, term69605.getClass(), "_canonicalName", null);
        setField(term69605, term69605.getClass(), "_class", null);
        setIntField(term69605, term69605.getClass(), "_hash", 0);
        setField(term69605, term69605.getClass(), "_valueHandler", null);
        setField(term69605, term69605.getClass(), "_typeHandler", null);
        setBooleanField(term69605, term69605.getClass(), "_asStatic", false);
        setElement(term69603, 1, term69605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term68769;
        args[1] = term68772;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term69589));
        assertTrue(recursiveEquals(term68769, term69598));
        assertTrue(recursiveEquals(term68772, term69603));
    }

};


