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

public class POJOPropertyBuilder_explode_29335045191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28561;

    public POJOPropertyBuilder_explode_29335045191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28561 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term28703 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term28845 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term28937 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term29079 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term28561, term28561.getClass(), "_fields", null);
        setField(term28561, term28561.getClass(), "_getters", null);
        setField(term28703, term28703.getClass(), "name", null);
        setBooleanField(term28703, term28703.getClass(), "isNameExplicit", false);
        setBooleanField(term28703, term28703.getClass(), "isVisible", false);
        setField(term28703, term28703.getClass(), "next", null);
        setField(term28561, term28561.getClass(), "_setters", term28703);
        setField(term28845, term28845.getClass(), "name", term28937);
        setBooleanField(term28845, term28845.getClass(), "isNameExplicit", false);
        setBooleanField(term28845, term28845.getClass(), "isVisible", false);
        setField(term28845, term28845.getClass(), "next", term29079);
        setField(term28561, term28561.getClass(), "_ctorParameters", term28845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term28561, args);
    }

};


