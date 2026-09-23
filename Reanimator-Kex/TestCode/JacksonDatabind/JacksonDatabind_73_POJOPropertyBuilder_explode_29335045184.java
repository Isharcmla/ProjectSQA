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

public class POJOPropertyBuilder_explode_29335045184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24529;
     Object term26077;
     Object term26071;

    public POJOPropertyBuilder_explode_29335045184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24529 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term24671 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term24813 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term24905 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term25047 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term24529, term24529.getClass(), "_fields", null);
        setField(term24529, term24529.getClass(), "_getters", null);
        setField(term24671, term24671.getClass(), "name", null);
        setBooleanField(term24671, term24671.getClass(), "isNameExplicit", false);
        setBooleanField(term24671, term24671.getClass(), "isVisible", false);
        setField(term24813, term24813.getClass(), "name", term24905);
        setBooleanField(term24813, term24813.getClass(), "isNameExplicit", false);
        setBooleanField(term24813, term24813.getClass(), "isVisible", false);
        setField(term24813, term24813.getClass(), "next", null);
        setField(term24671, term24671.getClass(), "next", term24813);
        setField(term24529, term24529.getClass(), "_setters", term24671);
        setField(term24529, term24529.getClass(), "_ctorParameters", term25047);
        term26077 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term26078 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term26079 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term26080 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term26081 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term26077, term26077.getClass(), "_forSerialization", false);
        setField(term26077, term26077.getClass(), "_config", null);
        setField(term26077, term26077.getClass(), "_annotationIntrospector", null);
        setField(term26077, term26077.getClass(), "_name", null);
        setField(term26077, term26077.getClass(), "_internalName", null);
        setField(term26077, term26077.getClass(), "_fields", null);
        setField(term26078, term26078.getClass(), "value", null);
        setField(term26078, term26078.getClass(), "next", null);
        setField(term26078, term26078.getClass(), "name", null);
        setBooleanField(term26078, term26078.getClass(), "isNameExplicit", false);
        setBooleanField(term26078, term26078.getClass(), "isVisible", false);
        setBooleanField(term26078, term26078.getClass(), "isMarkedIgnored", false);
        setField(term26077, term26077.getClass(), "_ctorParameters", term26078);
        setField(term26077, term26077.getClass(), "_getters", null);
        setField(term26079, term26079.getClass(), "value", null);
        setField(term26080, term26080.getClass(), "value", null);
        setField(term26080, term26080.getClass(), "next", null);
        setField(term26081, term26081.getClass(), "_simpleName", null);
        setField(term26081, term26081.getClass(), "_namespace", null);
        setField(term26081, term26081.getClass(), "_encodedSimple", null);
        setField(term26080, term26080.getClass(), "name", term26081);
        setBooleanField(term26080, term26080.getClass(), "isNameExplicit", false);
        setBooleanField(term26080, term26080.getClass(), "isVisible", false);
        setBooleanField(term26080, term26080.getClass(), "isMarkedIgnored", false);
        setField(term26079, term26079.getClass(), "next", term26080);
        setField(term26079, term26079.getClass(), "name", null);
        setBooleanField(term26079, term26079.getClass(), "isNameExplicit", false);
        setBooleanField(term26079, term26079.getClass(), "isVisible", false);
        setBooleanField(term26079, term26079.getClass(), "isMarkedIgnored", false);
        setField(term26077, term26077.getClass(), "_setters", term26079);
        HashMap term26072 = new HashMap();
        term26071 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term26071, term26071.getClass(), "this$0", term26072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term24529, args);
        assertTrue(recursiveEquals(term24529, term26077));
        assertTrue(recursiveEquals(retValue, term26071));
    }

};


