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

public class ObjectIdValueProperty_init_189141968743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15825;
     Object term16331;
     Object term20435;
     Object term20443;
     Object term20449;

    public ObjectIdValueProperty_init_189141968743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15707 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term15707, term15707.getClass(), "_metadata", null);
        setIntField(term15707, term15707.getClass(), "_propertyIndex", 0);
        term15825 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term15917 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term16059 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term16231 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer"));
        setField(term15917, term15917.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term15825, term15825.getClass(), "propertyName", term15917);
        setField(term15825, term15825.getClass(), "_idType", term16059);
        setField(term15825, term15825.getClass(), "_deserializer", term16231);
        term16331 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term20435 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term20436 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term20437 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term20438 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term20441 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer"));
        Object term20442 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term20437, term20437.getClass(), "_referencedType", null);
        setField(term20437, term20437.getClass(), "_superClass", null);
        setField(term20437, term20437.getClass(), "_superInterfaces", null);
        setField(term20437, term20437.getClass(), "_bindings", null);
        setField(term20437, term20437.getClass(), "_canonicalName", null);
        setField(term20437, term20437.getClass(), "_class", null);
        setIntField(term20437, term20437.getClass(), "_hash", 0);
        setField(term20437, term20437.getClass(), "_valueHandler", null);
        setField(term20437, term20437.getClass(), "_typeHandler", null);
        setBooleanField(term20437, term20437.getClass(), "_asStatic", false);
        setField(term20436, term20436.getClass(), "_idType", term20437);
        setField(term20438, term20438.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term20438, term20438.getClass(), "_namespace", null);
        setField(term20438, term20438.getClass(), "_encodedSimple", null);
        setField(term20436, term20436.getClass(), "propertyName", term20438);
        setField(term20436, term20436.getClass(), "generator", null);
        setField(term20436, term20436.getClass(), "resolver", null);
        setField(term20441, term20441.getClass(), "_valueClass", null);
        setField(term20436, term20436.getClass(), "_deserializer", term20441);
        setField(term20436, term20436.getClass(), "idProperty", null);
        setField(term20435, term20435.getClass(), "_objectIdReader", term20436);
        setField(term20435, term20435.getClass(), "_propName", term20438);
        setField(term20435, term20435.getClass(), "_type", term20437);
        setField(term20435, term20435.getClass(), "_wrapperName", null);
        setField(term20435, term20435.getClass(), "_contextAnnotations", null);
        setField(term20435, term20435.getClass(), "_valueDeserializer", term20441);
        setField(term20435, term20435.getClass(), "_valueTypeDeserializer", null);
        setField(term20435, term20435.getClass(), "_managedReferenceName", null);
        setField(term20435, term20435.getClass(), "_objectIdInfo", null);
        setField(term20435, term20435.getClass(), "_viewMatcher", null);
        setIntField(term20435, term20435.getClass(), "_propertyIndex", -1);
        setField(term20442, term20442.getClass(), "_required", null);
        setField(term20442, term20442.getClass(), "_description", null);
        setField(term20442, term20442.getClass(), "_index", null);
        setField(term20442, term20442.getClass(), "_defaultValue", null);
        setField(term20435, term20435.getClass(), "_metadata", term20442);
        setField(term20435, term20435.getClass(), "_format", null);
        term20443 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term20444 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term20445 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term20448 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer"));
        setField(term20444, term20444.getClass(), "_referencedType", null);
        setField(term20444, term20444.getClass(), "_superClass", null);
        setField(term20444, term20444.getClass(), "_superInterfaces", null);
        setField(term20444, term20444.getClass(), "_bindings", null);
        setField(term20444, term20444.getClass(), "_canonicalName", null);
        setField(term20444, term20444.getClass(), "_class", null);
        setIntField(term20444, term20444.getClass(), "_hash", 0);
        setField(term20444, term20444.getClass(), "_valueHandler", null);
        setField(term20444, term20444.getClass(), "_typeHandler", null);
        setBooleanField(term20444, term20444.getClass(), "_asStatic", false);
        setField(term20443, term20443.getClass(), "_idType", term20444);
        setField(term20445, term20445.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term20445, term20445.getClass(), "_namespace", null);
        setField(term20445, term20445.getClass(), "_encodedSimple", null);
        setField(term20443, term20443.getClass(), "propertyName", term20445);
        setField(term20443, term20443.getClass(), "generator", null);
        setField(term20443, term20443.getClass(), "resolver", null);
        setField(term20448, term20448.getClass(), "_valueClass", null);
        setField(term20443, term20443.getClass(), "_deserializer", term20448);
        setField(term20443, term20443.getClass(), "idProperty", null);
        term20449 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term20449, term20449.getClass(), "_required", null);
        setField(term20449, term20449.getClass(), "_description", null);
        setField(term20449, term20449.getClass(), "_index", null);
        setField(term20449, term20449.getClass(), "_defaultValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term15825;
        args[1] = term16331;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20435));
        assertTrue(recursiveEquals(term15825, term20443));
        assertTrue(recursiveEquals(term16331, term20449));
    }

};


