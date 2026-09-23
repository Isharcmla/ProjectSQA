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
import java.lang.String;
import java.lang.Object;

public class MapType_construct_872158618199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74505;
     Object term74645;
     Object term74749;
     Object term74853;
     Object term75148;
     Object term75149;
     Object term75150;
     Object term75174;
     Object term75006;

    public MapType_construct_872158618199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74505 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings");
        term74645 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term74749 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term74749, term74749.getClass(), "_hash", 0);
        term74853 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term74853, term74853.getClass(), "_hash", 0);
        term75148 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term75148, term75148.getClass(), "_referencedType", null);
        setField(term75148, term75148.getClass(), "_superClass", null);
        setField(term75148, term75148.getClass(), "_superInterfaces", null);
        setField(term75148, term75148.getClass(), "_bindings", null);
        setField(term75148, term75148.getClass(), "_canonicalName", null);
        setField(term75148, term75148.getClass(), "_class", null);
        setIntField(term75148, term75148.getClass(), "_hash", 0);
        setField(term75148, term75148.getClass(), "_valueHandler", null);
        setField(term75148, term75148.getClass(), "_typeHandler", null);
        setBooleanField(term75148, term75148.getClass(), "_asStatic", false);
        term75149 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term75149, term75149.getClass(), "_referencedType", null);
        setField(term75149, term75149.getClass(), "_superClass", null);
        setField(term75149, term75149.getClass(), "_superInterfaces", null);
        setField(term75149, term75149.getClass(), "_bindings", null);
        setField(term75149, term75149.getClass(), "_canonicalName", null);
        setField(term75149, term75149.getClass(), "_class", null);
        setIntField(term75149, term75149.getClass(), "_hash", 0);
        setField(term75149, term75149.getClass(), "_valueHandler", null);
        setField(term75149, term75149.getClass(), "_typeHandler", null);
        setBooleanField(term75149, term75149.getClass(), "_asStatic", false);
        term75150 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings");
        term75174 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term75174, term75174.getClass(), "_names", null);
        setField(term75174, term75174.getClass(), "_types", null);
        setField(term75174, term75174.getClass(), "_unboundVariables", null);
        setIntField(term75174, term75174.getClass(), "_hashCode", 0);
        Class<? extends Object> term75009 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings");
        term75006 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term74999 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term75003 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term75007 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term74999, term74999.getClass(), "_referencedType", null);
        setField(term74999, term74999.getClass(), "_superClass", null);
        setField(term74999, term74999.getClass(), "_superInterfaces", null);
        setField(term74999, term74999.getClass(), "_bindings", null);
        setField(term74999, term74999.getClass(), "_canonicalName", null);
        setField(term74999, term74999.getClass(), "_class", null);
        setIntField(term74999, term74999.getClass(), "_hash", 0);
        setField(term74999, term74999.getClass(), "_valueHandler", null);
        setField(term74999, term74999.getClass(), "_typeHandler", null);
        setBooleanField(term74999, term74999.getClass(), "_asStatic", false);
        setField(term75006, term75006.getClass(), "_keyType", term74999);
        setField(term75003, term75003.getClass(), "_referencedType", null);
        setField(term75003, term75003.getClass(), "_superClass", null);
        setField(term75003, term75003.getClass(), "_superInterfaces", null);
        setField(term75003, term75003.getClass(), "_bindings", null);
        setField(term75003, term75003.getClass(), "_canonicalName", null);
        setField(term75003, term75003.getClass(), "_class", null);
        setIntField(term75003, term75003.getClass(), "_hash", 0);
        setField(term75003, term75003.getClass(), "_valueHandler", null);
        setField(term75003, term75003.getClass(), "_typeHandler", null);
        setBooleanField(term75003, term75003.getClass(), "_asStatic", false);
        setField(term75006, term75006.getClass(), "_valueType", term75003);
        setField(term75006, term75006.getClass(), "_superClass", null);
        setField(term75006, term75006.getClass(), "_superInterfaces", null);
        setField(term75007, term75007.getClass(), "_names", null);
        setField(term75007, term75007.getClass(), "_types", null);
        setField(term75007, term75007.getClass(), "_unboundVariables", null);
        setIntField(term75007, term75007.getClass(), "_hashCode", 0);
        setField(term75006, term75006.getClass(), "_bindings", term75007);
        setField(term75006, term75006.getClass(), "_canonicalName", null);
        setField(term75006, term75006.getClass(), "_class", term75009);
        setIntField(term75006, term75006.getClass(), "_hash", 1340834877);
        setField(term75006, term75006.getClass(), "_valueHandler", null);
        setField(term75006, term75006.getClass(), "_typeHandler", null);
        setBooleanField(term75006, term75006.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapType");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[6];
        args[0] = term74505;
        args[1] = term74645;
        args[2] = null;
        args[3] = null;
        args[4] = term74749;
        args[5] = term74853;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term74505, term75148));
        assertTrue(recursiveEquals(term74645, term75149));
        assertTrue(recursiveEquals(term74749, null));
        assertTrue(recursiveEquals(term74853, null));
        assertTrue(recursiveEquals(retValue, term75006));
    }

};


