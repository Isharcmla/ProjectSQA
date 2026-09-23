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
import java.lang.String;

public class TypeFactory_rawClass_461407293122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13682;
     Object term15471;
     Object term15188;

    public TypeFactory_rawClass_461407293122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13682 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer");
        term15471 = Class.forName((String) "com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer");
        term15188 = Class.forName((String) "com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[1];
        args[0] = term13682;
        Object retValue = callMethod(klass, "rawClass", argTypes, null, args);
        assertTrue(recursiveEquals(term13682, term15471));
        assertTrue(recursiveEquals(retValue, term15188));
    }

};


