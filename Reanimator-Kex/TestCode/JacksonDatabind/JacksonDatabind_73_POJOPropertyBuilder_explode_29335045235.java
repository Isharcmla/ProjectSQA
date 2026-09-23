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
import java.lang.Object;

public class POJOPropertyBuilder_explode_29335045235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50492;

    public POJOPropertyBuilder_explode_29335045235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50492 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term50634 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term50726 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term50868 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term51010 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term51102 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term51244 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term50492, term50492.getClass(), "_fields", null);
        setField(term50634, term50634.getClass(), "name", term50726);
        setBooleanField(term50634, term50634.getClass(), "isNameExplicit", false);
        setBooleanField(term50634, term50634.getClass(), "isVisible", false);
        setField(term50634, term50634.getClass(), "next", null);
        setField(term50492, term50492.getClass(), "_getters", term50634);
        setField(term50868, term50868.getClass(), "name", null);
        setBooleanField(term50868, term50868.getClass(), "isNameExplicit", false);
        setBooleanField(term50868, term50868.getClass(), "isVisible", false);
        setField(term51010, term51010.getClass(), "name", term51102);
        setBooleanField(term51010, term51010.getClass(), "isNameExplicit", false);
        setBooleanField(term51010, term51010.getClass(), "isVisible", false);
        setField(term51010, term51010.getClass(), "next", null);
        setField(term50868, term50868.getClass(), "next", term51010);
        setField(term50492, term50492.getClass(), "_setters", term50868);
        setField(term50492, term50492.getClass(), "_ctorParameters", term51244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term50492, args);
    }

};


