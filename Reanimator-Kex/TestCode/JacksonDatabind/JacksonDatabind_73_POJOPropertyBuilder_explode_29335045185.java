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

public class POJOPropertyBuilder_explode_29335045185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25506;
     Object term26134;
     Object term26128;

    public POJOPropertyBuilder_explode_29335045185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25506 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term25648 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term25790 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term25882 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term26024 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term25506, term25506.getClass(), "_fields", null);
        setField(term25648, term25648.getClass(), "name", null);
        setBooleanField(term25648, term25648.getClass(), "isNameExplicit", false);
        setBooleanField(term25648, term25648.getClass(), "isVisible", false);
        setField(term25648, term25648.getClass(), "next", null);
        setField(term25506, term25506.getClass(), "_getters", term25648);
        setField(term25790, term25790.getClass(), "name", term25882);
        setBooleanField(term25790, term25790.getClass(), "isNameExplicit", false);
        setBooleanField(term25790, term25790.getClass(), "isVisible", false);
        setField(term25790, term25790.getClass(), "next", term26024);
        setField(term25506, term25506.getClass(), "_setters", term25790);
        term26134 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term26135 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term26136 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term26137 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term26138 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term26134, term26134.getClass(), "_forSerialization", false);
        setField(term26134, term26134.getClass(), "_config", null);
        setField(term26134, term26134.getClass(), "_annotationIntrospector", null);
        setField(term26134, term26134.getClass(), "_name", null);
        setField(term26134, term26134.getClass(), "_internalName", null);
        setField(term26134, term26134.getClass(), "_fields", null);
        setField(term26134, term26134.getClass(), "_ctorParameters", null);
        setField(term26135, term26135.getClass(), "value", null);
        setField(term26135, term26135.getClass(), "next", null);
        setField(term26135, term26135.getClass(), "name", null);
        setBooleanField(term26135, term26135.getClass(), "isNameExplicit", false);
        setBooleanField(term26135, term26135.getClass(), "isVisible", false);
        setBooleanField(term26135, term26135.getClass(), "isMarkedIgnored", false);
        setField(term26134, term26134.getClass(), "_getters", term26135);
        setField(term26136, term26136.getClass(), "value", null);
        setField(term26137, term26137.getClass(), "value", null);
        setField(term26137, term26137.getClass(), "next", null);
        setField(term26137, term26137.getClass(), "name", null);
        setBooleanField(term26137, term26137.getClass(), "isNameExplicit", false);
        setBooleanField(term26137, term26137.getClass(), "isVisible", false);
        setBooleanField(term26137, term26137.getClass(), "isMarkedIgnored", false);
        setField(term26136, term26136.getClass(), "next", term26137);
        setField(term26138, term26138.getClass(), "_simpleName", null);
        setField(term26138, term26138.getClass(), "_namespace", null);
        setField(term26138, term26138.getClass(), "_encodedSimple", null);
        setField(term26136, term26136.getClass(), "name", term26138);
        setBooleanField(term26136, term26136.getClass(), "isNameExplicit", false);
        setBooleanField(term26136, term26136.getClass(), "isVisible", false);
        setBooleanField(term26136, term26136.getClass(), "isMarkedIgnored", false);
        setField(term26134, term26134.getClass(), "_setters", term26136);
        HashMap term26129 = new HashMap();
        term26128 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term26128, term26128.getClass(), "this$0", term26129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term25506, args);
        assertTrue(recursiveEquals(term25506, term26134));
        assertTrue(recursiveEquals(retValue, term26128));
    }

};


