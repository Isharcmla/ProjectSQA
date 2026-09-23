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

public class POJOPropertyBuilder_merge_2033440902147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17257;
     Object term17294;
     Object term17290;

    public POJOPropertyBuilder_merge_2033440902147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17257 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        term17294 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term17294, term17294.getClass(), "value", null);
        setField(term17294, term17294.getClass(), "next", null);
        setField(term17294, term17294.getClass(), "name", null);
        setBooleanField(term17294, term17294.getClass(), "isNameExplicit", false);
        setBooleanField(term17294, term17294.getClass(), "isVisible", false);
        setBooleanField(term17294, term17294.getClass(), "isMarkedIgnored", false);
        term17290 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term17290, term17290.getClass(), "value", null);
        setField(term17290, term17290.getClass(), "next", null);
        setField(term17290, term17290.getClass(), "name", null);
        setBooleanField(term17290, term17290.getClass(), "isNameExplicit", false);
        setBooleanField(term17290, term17290.getClass(), "isVisible", false);
        setBooleanField(term17290, term17290.getClass(), "isMarkedIgnored", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        Object[] args = new Object[2];
        args[0] = term17257;
        args[1] = null;
        Object retValue = callMethod(klass, "merge", argTypes, null, args);
        assertTrue(recursiveEquals(term17257, term17294));
        assertTrue(recursiveEquals(retValue, term17290));
    }

};


