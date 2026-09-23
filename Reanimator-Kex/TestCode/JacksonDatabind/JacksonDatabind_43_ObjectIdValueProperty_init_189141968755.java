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

public class ObjectIdValueProperty_init_189141968755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42508;
     Object term43018;
     Object term57459;
     Object term57467;
     Object term57473;

    public ObjectIdValueProperty_init_189141968755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42290 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term42390 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term42290, term42290.getClass(), "_metadata", term42390);
        setIntField(term42290, term42290.getClass(), "_propertyIndex", 0);
        term42508 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term42600 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term42758 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term42918 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer"));
        setField(term42600, term42600.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term42508, term42508.getClass(), "propertyName", term42600);
        setField(term42508, term42508.getClass(), "_idType", term42758);
        setField(term42508, term42508.getClass(), "_deserializer", term42918);
        term43018 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term57459 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term57460 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term57461 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term57462 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term57465 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer"));
        Object term57466 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term57461, term57461.getClass(), "_referencedType", null);
        setField(term57461, term57461.getClass(), "_superClass", null);
        setField(term57461, term57461.getClass(), "_superInterfaces", null);
        setField(term57461, term57461.getClass(), "_bindings", null);
        setField(term57461, term57461.getClass(), "_canonicalName", null);
        setField(term57461, term57461.getClass(), "_class", null);
        setIntField(term57461, term57461.getClass(), "_hash", 0);
        setField(term57461, term57461.getClass(), "_valueHandler", null);
        setField(term57461, term57461.getClass(), "_typeHandler", null);
        setBooleanField(term57461, term57461.getClass(), "_asStatic", false);
        setField(term57460, term57460.getClass(), "_idType", term57461);
        setField(term57462, term57462.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term57462, term57462.getClass(), "_namespace", null);
        setField(term57462, term57462.getClass(), "_encodedSimple", null);
        setField(term57460, term57460.getClass(), "propertyName", term57462);
        setField(term57460, term57460.getClass(), "generator", null);
        setField(term57460, term57460.getClass(), "resolver", null);
        setField(term57465, term57465.getClass(), "_nullValue", null);
        setBooleanField(term57465, term57465.getClass(), "_primitive", false);
        setField(term57465, term57465.getClass(), "_valueClass", null);
        setField(term57460, term57460.getClass(), "_deserializer", term57465);
        setField(term57460, term57460.getClass(), "idProperty", null);
        setField(term57459, term57459.getClass(), "_objectIdReader", term57460);
        setField(term57459, term57459.getClass(), "_propName", term57462);
        setField(term57459, term57459.getClass(), "_type", term57461);
        setField(term57459, term57459.getClass(), "_wrapperName", null);
        setField(term57459, term57459.getClass(), "_contextAnnotations", null);
        setField(term57459, term57459.getClass(), "_valueDeserializer", term57465);
        setField(term57459, term57459.getClass(), "_valueTypeDeserializer", null);
        setField(term57459, term57459.getClass(), "_managedReferenceName", null);
        setField(term57459, term57459.getClass(), "_objectIdInfo", null);
        setField(term57459, term57459.getClass(), "_viewMatcher", null);
        setIntField(term57459, term57459.getClass(), "_propertyIndex", -1);
        setField(term57466, term57466.getClass(), "_required", null);
        setField(term57466, term57466.getClass(), "_description", null);
        setField(term57466, term57466.getClass(), "_index", null);
        setField(term57466, term57466.getClass(), "_defaultValue", null);
        setField(term57459, term57459.getClass(), "_metadata", term57466);
        setField(term57459, term57459.getClass(), "_format", null);
        term57467 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term57468 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term57469 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term57472 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer"));
        setField(term57468, term57468.getClass(), "_referencedType", null);
        setField(term57468, term57468.getClass(), "_superClass", null);
        setField(term57468, term57468.getClass(), "_superInterfaces", null);
        setField(term57468, term57468.getClass(), "_bindings", null);
        setField(term57468, term57468.getClass(), "_canonicalName", null);
        setField(term57468, term57468.getClass(), "_class", null);
        setIntField(term57468, term57468.getClass(), "_hash", 0);
        setField(term57468, term57468.getClass(), "_valueHandler", null);
        setField(term57468, term57468.getClass(), "_typeHandler", null);
        setBooleanField(term57468, term57468.getClass(), "_asStatic", false);
        setField(term57467, term57467.getClass(), "_idType", term57468);
        setField(term57469, term57469.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term57469, term57469.getClass(), "_namespace", null);
        setField(term57469, term57469.getClass(), "_encodedSimple", null);
        setField(term57467, term57467.getClass(), "propertyName", term57469);
        setField(term57467, term57467.getClass(), "generator", null);
        setField(term57467, term57467.getClass(), "resolver", null);
        setField(term57472, term57472.getClass(), "_nullValue", null);
        setBooleanField(term57472, term57472.getClass(), "_primitive", false);
        setField(term57472, term57472.getClass(), "_valueClass", null);
        setField(term57467, term57467.getClass(), "_deserializer", term57472);
        setField(term57467, term57467.getClass(), "idProperty", null);
        term57473 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term57473, term57473.getClass(), "_required", null);
        setField(term57473, term57473.getClass(), "_description", null);
        setField(term57473, term57473.getClass(), "_index", null);
        setField(term57473, term57473.getClass(), "_defaultValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term42508;
        args[1] = term43018;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term57459));
        assertTrue(recursiveEquals(term42508, term57467));
        assertTrue(recursiveEquals(term43018, term57473));
    }

};


