package com.fasterxml.jackson.databind.introspect;

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
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.introspect.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class POJOPropertyBuilder_explode_29335045179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23352;
     Object term23933;
     Object term23927;

    public POJOPropertyBuilder_explode_29335045179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23352 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term23494 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term23636 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term23494, term23494.getClass(), "name", null);
        setBooleanField(term23494, term23494.getClass(), "isNameExplicit", false);
        setBooleanField(term23494, term23494.getClass(), "isVisible", false);
        setField(term23494, term23494.getClass(), "next", null);
        setField(term23352, term23352.getClass(), "_fields", term23494);
        setField(term23352, term23352.getClass(), "_getters", null);
        setField(term23352, term23352.getClass(), "_setters", null);
        setField(term23352, term23352.getClass(), "_ctorParameters", term23636);
        term23933 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term23934 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term23935 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term23933, term23933.getClass(), "_forSerialization", false);
        setField(term23933, term23933.getClass(), "_config", null);
        setField(term23933, term23933.getClass(), "_annotationIntrospector", null);
        setField(term23933, term23933.getClass(), "_name", null);
        setField(term23933, term23933.getClass(), "_internalName", null);
        setField(term23934, term23934.getClass(), "value", null);
        setField(term23934, term23934.getClass(), "next", null);
        setField(term23934, term23934.getClass(), "name", null);
        setBooleanField(term23934, term23934.getClass(), "isNameExplicit", false);
        setBooleanField(term23934, term23934.getClass(), "isVisible", false);
        setBooleanField(term23934, term23934.getClass(), "isMarkedIgnored", false);
        setField(term23933, term23933.getClass(), "_fields", term23934);
        setField(term23935, term23935.getClass(), "value", null);
        setField(term23935, term23935.getClass(), "next", null);
        setField(term23935, term23935.getClass(), "name", null);
        setBooleanField(term23935, term23935.getClass(), "isNameExplicit", false);
        setBooleanField(term23935, term23935.getClass(), "isVisible", false);
        setBooleanField(term23935, term23935.getClass(), "isMarkedIgnored", false);
        setField(term23933, term23933.getClass(), "_ctorParameters", term23935);
        setField(term23933, term23933.getClass(), "_getters", null);
        setField(term23933, term23933.getClass(), "_setters", null);
        HashMap term23928 = new HashMap();
        term23927 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term23927, term23927.getClass(), "this$0", term23928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term23352, args);
        assertTrue(recursiveEquals(term23352, term23933));
        assertTrue(recursiveEquals(retValue, term23927));
    }

};


