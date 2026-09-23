package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;

public class ObjectIdValueProperty_init_189141968745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22390;
     Object term26585;
     Object term26592;

    public ObjectIdValueProperty_init_189141968745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22172 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term22272 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term22172, term22172.getClass(), "_metadata", term22272);
        setIntField(term22172, term22172.getClass(), "_propertyIndex", 0);
        term22390 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term22482 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term22624 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term22482, term22482.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term22390, term22390.getClass(), "propertyName", term22482);
        setField(term22390, term22390.getClass(), "_idType", term22624);
        setField(term22390, term22390.getClass(), "_deserializer", null);
        term26585 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term26586 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term26587 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term26588 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term26591 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term26587, term26587.getClass(), "_referencedType", null);
        setField(term26587, term26587.getClass(), "_superClass", null);
        setField(term26587, term26587.getClass(), "_superInterfaces", null);
        setField(term26587, term26587.getClass(), "_bindings", null);
        setField(term26587, term26587.getClass(), "_canonicalName", null);
        setField(term26587, term26587.getClass(), "_class", null);
        setIntField(term26587, term26587.getClass(), "_hash", 0);
        setField(term26587, term26587.getClass(), "_valueHandler", null);
        setField(term26587, term26587.getClass(), "_typeHandler", null);
        setBooleanField(term26587, term26587.getClass(), "_asStatic", false);
        setField(term26586, term26586.getClass(), "_idType", term26587);
        setField(term26588, term26588.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term26588, term26588.getClass(), "_namespace", null);
        setField(term26588, term26588.getClass(), "_encodedSimple", null);
        setField(term26586, term26586.getClass(), "propertyName", term26588);
        setField(term26586, term26586.getClass(), "generator", null);
        setField(term26586, term26586.getClass(), "resolver", null);
        setField(term26586, term26586.getClass(), "_deserializer", null);
        setField(term26586, term26586.getClass(), "idProperty", null);
        setField(term26585, term26585.getClass(), "_objectIdReader", term26586);
        setField(term26585, term26585.getClass(), "_propName", term26588);
        setField(term26585, term26585.getClass(), "_type", term26587);
        setField(term26585, term26585.getClass(), "_wrapperName", null);
        setField(term26585, term26585.getClass(), "_contextAnnotations", null);
        setField(term26585, term26585.getClass(), "_valueDeserializer", null);
        setField(term26585, term26585.getClass(), "_valueTypeDeserializer", null);
        setField(term26585, term26585.getClass(), "_managedReferenceName", null);
        setField(term26585, term26585.getClass(), "_objectIdInfo", null);
        setField(term26585, term26585.getClass(), "_viewMatcher", null);
        setIntField(term26585, term26585.getClass(), "_propertyIndex", -1);
        setField(term26591, term26591.getClass(), "_required", null);
        setField(term26591, term26591.getClass(), "_description", null);
        setField(term26591, term26591.getClass(), "_index", null);
        setField(term26591, term26591.getClass(), "_defaultValue", null);
        setField(term26585, term26585.getClass(), "_metadata", term26591);
        setField(term26585, term26585.getClass(), "_format", null);
        term26592 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term26593 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term26594 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term26593, term26593.getClass(), "_referencedType", null);
        setField(term26593, term26593.getClass(), "_superClass", null);
        setField(term26593, term26593.getClass(), "_superInterfaces", null);
        setField(term26593, term26593.getClass(), "_bindings", null);
        setField(term26593, term26593.getClass(), "_canonicalName", null);
        setField(term26593, term26593.getClass(), "_class", null);
        setIntField(term26593, term26593.getClass(), "_hash", 0);
        setField(term26593, term26593.getClass(), "_valueHandler", null);
        setField(term26593, term26593.getClass(), "_typeHandler", null);
        setBooleanField(term26593, term26593.getClass(), "_asStatic", false);
        setField(term26592, term26592.getClass(), "_idType", term26593);
        setField(term26594, term26594.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term26594, term26594.getClass(), "_namespace", null);
        setField(term26594, term26594.getClass(), "_encodedSimple", null);
        setField(term26592, term26592.getClass(), "propertyName", term26594);
        setField(term26592, term26592.getClass(), "generator", null);
        setField(term26592, term26592.getClass(), "resolver", null);
        setField(term26592, term26592.getClass(), "_deserializer", null);
        setField(term26592, term26592.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term22390;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term26585));
        assertTrue(recursiveEquals(term22390, term26592));
    }

};


