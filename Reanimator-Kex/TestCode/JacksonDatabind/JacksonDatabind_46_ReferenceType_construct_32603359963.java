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

public class ReferenceType_construct_32603359963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12346;
     Object term12452;
     Object term12712;
     Object term12713;
     Object term12591;

    public ReferenceType_construct_32603359963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12346 = Class.forName((String) "java.io.FileNotFoundException");
        term12452 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term12452, term12452.getClass(), "_hash", 0);
        term12712 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term12712, term12712.getClass(), "_elementType", null);
        setField(term12712, term12712.getClass(), "_canonicalName", null);
        setField(term12712, term12712.getClass(), "_class", null);
        setIntField(term12712, term12712.getClass(), "_hash", 0);
        setField(term12712, term12712.getClass(), "_valueHandler", null);
        setField(term12712, term12712.getClass(), "_typeHandler", null);
        setBooleanField(term12712, term12712.getClass(), "_asStatic", false);
        term12713 = Class.forName((String) "com.fasterxml.jackson.core.io.InputDecorator");
        Class<? extends Object> term12592 = Class.forName((String) "com.fasterxml.jackson.core.io.InputDecorator");
        term12591 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term12588 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term12588, term12588.getClass(), "_elementType", null);
        setField(term12588, term12588.getClass(), "_canonicalName", null);
        setField(term12588, term12588.getClass(), "_class", null);
        setIntField(term12588, term12588.getClass(), "_hash", 0);
        setField(term12588, term12588.getClass(), "_valueHandler", null);
        setField(term12588, term12588.getClass(), "_typeHandler", null);
        setBooleanField(term12588, term12588.getClass(), "_asStatic", false);
        setField(term12591, term12591.getClass(), "_referencedType", term12588);
        setField(term12591, term12591.getClass(), "_typeParametersFor", term12592);
        setField(term12591, term12591.getClass(), "_typeParameters", null);
        setField(term12591, term12591.getClass(), "_typeNames", null);
        setField(term12591, term12591.getClass(), "_canonicalName", null);
        setField(term12591, term12591.getClass(), "_class", term12592);
        setIntField(term12591, term12591.getClass(), "_hash", 1325742642);
        setField(term12591, term12591.getClass(), "_valueHandler", null);
        setField(term12591, term12591.getClass(), "_typeHandler", null);
        setBooleanField(term12591, term12591.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.ReferenceType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = term12346;
        args[1] = term12452;
        args[2] = null;
        args[3] = null;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term12346, term12712));
        assertTrue(recursiveEquals(term12452, term12713));
        assertTrue(recursiveEquals(retValue, term12591));
    }

};


