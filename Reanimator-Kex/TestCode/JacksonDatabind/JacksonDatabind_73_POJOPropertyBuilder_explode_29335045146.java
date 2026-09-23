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

public class POJOPropertyBuilder_explode_29335045146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16967;
     Object term17286;
     Object term17280;

    public POJOPropertyBuilder_explode_29335045146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16967 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term17109 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term16967, term16967.getClass(), "_fields", null);
        setField(term16967, term16967.getClass(), "_getters", term17109);
        term17286 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term17287 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term17286, term17286.getClass(), "_forSerialization", false);
        setField(term17286, term17286.getClass(), "_config", null);
        setField(term17286, term17286.getClass(), "_annotationIntrospector", null);
        setField(term17286, term17286.getClass(), "_name", null);
        setField(term17286, term17286.getClass(), "_internalName", null);
        setField(term17286, term17286.getClass(), "_fields", null);
        setField(term17286, term17286.getClass(), "_ctorParameters", null);
        setField(term17287, term17287.getClass(), "value", null);
        setField(term17287, term17287.getClass(), "next", null);
        setField(term17287, term17287.getClass(), "name", null);
        setBooleanField(term17287, term17287.getClass(), "isNameExplicit", false);
        setBooleanField(term17287, term17287.getClass(), "isVisible", false);
        setBooleanField(term17287, term17287.getClass(), "isMarkedIgnored", false);
        setField(term17286, term17286.getClass(), "_getters", term17287);
        setField(term17286, term17286.getClass(), "_setters", null);
        HashMap term17281 = new HashMap();
        term17280 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term17280, term17280.getClass(), "this$0", term17281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term16967, args);
        assertTrue(recursiveEquals(term16967, term17286));
        assertTrue(recursiveEquals(retValue, term17280));
    }

};


