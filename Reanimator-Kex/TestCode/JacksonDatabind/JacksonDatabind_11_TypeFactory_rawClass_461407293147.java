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

public class TypeFactory_rawClass_461407293147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20746;
     Object term20783;

    public TypeFactory_rawClass_461407293147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20746 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term20783 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term20783, term20783.getClass(), "_typeParametersFor", null);
        setField(term20783, term20783.getClass(), "_typeParameters", null);
        setField(term20783, term20783.getClass(), "_typeNames", null);
        setField(term20783, term20783.getClass(), "_canonicalName", null);
        setField(term20783, term20783.getClass(), "_class", null);
        setIntField(term20783, term20783.getClass(), "_hash", 0);
        setField(term20783, term20783.getClass(), "_valueHandler", null);
        setField(term20783, term20783.getClass(), "_typeHandler", null);
        setBooleanField(term20783, term20783.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[1];
        args[0] = term20746;
        Object retValue = callMethod(klass, "rawClass", argTypes, null, args);
        assertTrue(recursiveEquals(term20746, term20783));
        assertTrue(recursiveEquals(retValue, null));
    }

};


