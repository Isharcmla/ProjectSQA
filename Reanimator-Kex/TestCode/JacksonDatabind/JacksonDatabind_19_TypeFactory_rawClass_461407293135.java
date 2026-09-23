package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;

public class TypeFactory_rawClass_461407293135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14972;
     Object term18194;

    public TypeFactory_rawClass_461407293135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14972 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term18194 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term18194, term18194.getClass(), "_referencedType", null);
        setField(term18194, term18194.getClass(), "_typeParametersFor", null);
        setField(term18194, term18194.getClass(), "_typeParameters", null);
        setField(term18194, term18194.getClass(), "_typeNames", null);
        setField(term18194, term18194.getClass(), "_canonicalName", null);
        setField(term18194, term18194.getClass(), "_class", null);
        setIntField(term18194, term18194.getClass(), "_hash", 0);
        setField(term18194, term18194.getClass(), "_valueHandler", null);
        setField(term18194, term18194.getClass(), "_typeHandler", null);
        setBooleanField(term18194, term18194.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[1];
        args[0] = term14972;
        Object retValue = callMethod(klass, "rawClass", argTypes, null, args);
        assertTrue(recursiveEquals(term14972, term18194));
        assertTrue(recursiveEquals(retValue, null));
    }

};


