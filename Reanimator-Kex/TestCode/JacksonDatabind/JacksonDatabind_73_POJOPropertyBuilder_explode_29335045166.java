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

public class POJOPropertyBuilder_explode_29335045166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20285;
     Object term21111;
     Object term21105;

    public POJOPropertyBuilder_explode_29335045166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20285 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term20427 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term20569 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term20285, term20285.getClass(), "_fields", null);
        setField(term20285, term20285.getClass(), "_getters", null);
        setField(term20427, term20427.getClass(), "name", null);
        setBooleanField(term20427, term20427.getClass(), "isNameExplicit", false);
        setBooleanField(term20427, term20427.getClass(), "isVisible", false);
        setField(term20427, term20427.getClass(), "next", term20569);
        setField(term20285, term20285.getClass(), "_setters", term20427);
        term21111 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term21112 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term21113 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term21111, term21111.getClass(), "_forSerialization", false);
        setField(term21111, term21111.getClass(), "_config", null);
        setField(term21111, term21111.getClass(), "_annotationIntrospector", null);
        setField(term21111, term21111.getClass(), "_name", null);
        setField(term21111, term21111.getClass(), "_internalName", null);
        setField(term21111, term21111.getClass(), "_fields", null);
        setField(term21111, term21111.getClass(), "_ctorParameters", null);
        setField(term21111, term21111.getClass(), "_getters", null);
        setField(term21112, term21112.getClass(), "value", null);
        setField(term21113, term21113.getClass(), "value", null);
        setField(term21113, term21113.getClass(), "next", null);
        setField(term21113, term21113.getClass(), "name", null);
        setBooleanField(term21113, term21113.getClass(), "isNameExplicit", false);
        setBooleanField(term21113, term21113.getClass(), "isVisible", false);
        setBooleanField(term21113, term21113.getClass(), "isMarkedIgnored", false);
        setField(term21112, term21112.getClass(), "next", term21113);
        setField(term21112, term21112.getClass(), "name", null);
        setBooleanField(term21112, term21112.getClass(), "isNameExplicit", false);
        setBooleanField(term21112, term21112.getClass(), "isVisible", false);
        setBooleanField(term21112, term21112.getClass(), "isMarkedIgnored", false);
        setField(term21111, term21111.getClass(), "_setters", term21112);
        HashMap term21106 = new HashMap();
        term21105 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term21105, term21105.getClass(), "this$0", term21106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term20285, args);
        assertTrue(recursiveEquals(term20285, term21111));
        assertTrue(recursiveEquals(retValue, term21105));
    }

};


