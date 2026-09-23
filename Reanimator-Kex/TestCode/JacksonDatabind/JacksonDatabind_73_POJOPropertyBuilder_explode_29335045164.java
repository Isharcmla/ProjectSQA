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

public class POJOPropertyBuilder_explode_29335045164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19825;
     Object term20609;
     Object term20603;

    public POJOPropertyBuilder_explode_29335045164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19825 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term19967 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term20109 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term19825, term19825.getClass(), "_fields", null);
        setField(term19967, term19967.getClass(), "name", null);
        setBooleanField(term19967, term19967.getClass(), "isNameExplicit", false);
        setBooleanField(term19967, term19967.getClass(), "isVisible", false);
        setField(term19967, term19967.getClass(), "next", term20109);
        setField(term19825, term19825.getClass(), "_getters", term19967);
        term20609 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term20610 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term20611 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term20609, term20609.getClass(), "_forSerialization", false);
        setField(term20609, term20609.getClass(), "_config", null);
        setField(term20609, term20609.getClass(), "_annotationIntrospector", null);
        setField(term20609, term20609.getClass(), "_name", null);
        setField(term20609, term20609.getClass(), "_internalName", null);
        setField(term20609, term20609.getClass(), "_fields", null);
        setField(term20609, term20609.getClass(), "_ctorParameters", null);
        setField(term20610, term20610.getClass(), "value", null);
        setField(term20611, term20611.getClass(), "value", null);
        setField(term20611, term20611.getClass(), "next", null);
        setField(term20611, term20611.getClass(), "name", null);
        setBooleanField(term20611, term20611.getClass(), "isNameExplicit", false);
        setBooleanField(term20611, term20611.getClass(), "isVisible", false);
        setBooleanField(term20611, term20611.getClass(), "isMarkedIgnored", false);
        setField(term20610, term20610.getClass(), "next", term20611);
        setField(term20610, term20610.getClass(), "name", null);
        setBooleanField(term20610, term20610.getClass(), "isNameExplicit", false);
        setBooleanField(term20610, term20610.getClass(), "isVisible", false);
        setBooleanField(term20610, term20610.getClass(), "isMarkedIgnored", false);
        setField(term20609, term20609.getClass(), "_getters", term20610);
        setField(term20609, term20609.getClass(), "_setters", null);
        HashMap term20604 = new HashMap();
        term20603 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term20603, term20603.getClass(), "this$0", term20604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term19825, args);
        assertTrue(recursiveEquals(term19825, term20609));
        assertTrue(recursiveEquals(retValue, term20603));
    }

};


