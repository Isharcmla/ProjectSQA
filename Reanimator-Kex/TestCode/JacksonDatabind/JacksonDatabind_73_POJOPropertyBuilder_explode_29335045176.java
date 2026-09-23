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

public class POJOPropertyBuilder_explode_29335045176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22560;
     Object term23173;
     Object term23167;

    public POJOPropertyBuilder_explode_29335045176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22560 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term22702 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term22844 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term22560, term22560.getClass(), "_fields", null);
        setField(term22560, term22560.getClass(), "_getters", null);
        setField(term22702, term22702.getClass(), "name", null);
        setBooleanField(term22702, term22702.getClass(), "isNameExplicit", true);
        setBooleanField(term22702, term22702.getClass(), "isVisible", false);
        setField(term22702, term22702.getClass(), "next", null);
        setField(term22560, term22560.getClass(), "_setters", term22702);
        setField(term22560, term22560.getClass(), "_ctorParameters", term22844);
        term23173 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term23174 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term23175 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term23173, term23173.getClass(), "_forSerialization", false);
        setField(term23173, term23173.getClass(), "_config", null);
        setField(term23173, term23173.getClass(), "_annotationIntrospector", null);
        setField(term23173, term23173.getClass(), "_name", null);
        setField(term23173, term23173.getClass(), "_internalName", null);
        setField(term23173, term23173.getClass(), "_fields", null);
        setField(term23174, term23174.getClass(), "value", null);
        setField(term23174, term23174.getClass(), "next", null);
        setField(term23174, term23174.getClass(), "name", null);
        setBooleanField(term23174, term23174.getClass(), "isNameExplicit", false);
        setBooleanField(term23174, term23174.getClass(), "isVisible", false);
        setBooleanField(term23174, term23174.getClass(), "isMarkedIgnored", false);
        setField(term23173, term23173.getClass(), "_ctorParameters", term23174);
        setField(term23173, term23173.getClass(), "_getters", null);
        setField(term23175, term23175.getClass(), "value", null);
        setField(term23175, term23175.getClass(), "next", null);
        setField(term23175, term23175.getClass(), "name", null);
        setBooleanField(term23175, term23175.getClass(), "isNameExplicit", true);
        setBooleanField(term23175, term23175.getClass(), "isVisible", false);
        setBooleanField(term23175, term23175.getClass(), "isMarkedIgnored", false);
        setField(term23173, term23173.getClass(), "_setters", term23175);
        HashMap term23168 = new HashMap();
        term23167 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term23167, term23167.getClass(), "this$0", term23168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term22560, args);
        assertTrue(recursiveEquals(term22560, term23173));
        assertTrue(recursiveEquals(retValue, term23167));
    }

};


