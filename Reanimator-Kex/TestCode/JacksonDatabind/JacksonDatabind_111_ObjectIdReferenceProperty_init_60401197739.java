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

public class ObjectIdReferenceProperty_init_60401197739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9162;
     Object term9374;
     Object term9385;
     Object term9388;
     Object term9390;

    public ObjectIdReferenceProperty_init_60401197739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8588 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        Object term8688 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term8792 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term8884 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term9022 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
        setField(term8588, term8588.getClass(), "_metadata", term8688);
        setField(term8588, term8588.getClass(), "_propertyFormat", term8792);
        setIntField(term8588, term8588.getClass(), "_propertyIndex", 0);
        setField(term8588, term8588.getClass(), "_propName", term8884);
        setField(term8588, term8588.getClass(), "_type", null);
        setField(term8588, term8588.getClass(), "_wrapperName", null);
        setField(term8588, term8588.getClass(), "_contextAnnotations", null);
        setField(term8588, term8588.getClass(), "_valueTypeDeserializer", null);
        setField(term8588, term8588.getClass(), "_managedReferenceName", null);
        setField(term8588, term8588.getClass(), "_valueDeserializer", term9022);
        setField(term8588, term8588.getClass(), "_viewMatcher", null);
        term9162 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        Object term9254 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term9162, term9162.getClass(), "_metadata", null);
        setField(term9162, term9162.getClass(), "_propertyFormat", null);
        setField(term9162, term9162.getClass(), "_propName", null);
        setField(term9162, term9162.getClass(), "_type", term9254);
        setField(term9162, term9162.getClass(), "_wrapperName", null);
        setField(term9162, term9162.getClass(), "_contextAnnotations", null);
        setField(term9162, term9162.getClass(), "_valueTypeDeserializer", null);
        setField(term9162, term9162.getClass(), "_managedReferenceName", null);
        setIntField(term9162, term9162.getClass(), "_propertyIndex", 0);
        setField(term9162, term9162.getClass(), "_viewMatcher", null);
        term9374 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumDeserializer"));
        term9385 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        Object term9386 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term9387 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumDeserializer"));
        setField(term9385, term9385.getClass(), "_forward", null);
        setField(term9385, term9385.getClass(), "_propName", null);
        setField(term9386, term9386.getClass(), "_keyType", null);
        setField(term9386, term9386.getClass(), "_valueType", null);
        setField(term9386, term9386.getClass(), "_superClass", null);
        setField(term9386, term9386.getClass(), "_superInterfaces", null);
        setField(term9386, term9386.getClass(), "_bindings", null);
        setField(term9386, term9386.getClass(), "_canonicalName", null);
        setField(term9386, term9386.getClass(), "_class", null);
        setIntField(term9386, term9386.getClass(), "_hash", 0);
        setField(term9386, term9386.getClass(), "_valueHandler", null);
        setField(term9386, term9386.getClass(), "_typeHandler", null);
        setBooleanField(term9386, term9386.getClass(), "_asStatic", false);
        setField(term9385, term9385.getClass(), "_type", term9386);
        setField(term9385, term9385.getClass(), "_wrapperName", null);
        setField(term9385, term9385.getClass(), "_contextAnnotations", null);
        setField(term9387, term9387.getClass(), "_enumsByIndex", null);
        setField(term9387, term9387.getClass(), "_enumDefaultValue", null);
        setField(term9387, term9387.getClass(), "_lookupByName", null);
        setField(term9387, term9387.getClass(), "_lookupByToString", null);
        setField(term9387, term9387.getClass(), "_caseInsensitive", null);
        setField(term9387, term9387.getClass(), "_valueClass", null);
        setField(term9385, term9385.getClass(), "_valueDeserializer", term9387);
        setField(term9385, term9385.getClass(), "_valueTypeDeserializer", null);
        setField(term9385, term9385.getClass(), "_nullProvider", null);
        setField(term9385, term9385.getClass(), "_managedReferenceName", null);
        setField(term9385, term9385.getClass(), "_objectIdInfo", null);
        setField(term9385, term9385.getClass(), "_viewMatcher", null);
        setIntField(term9385, term9385.getClass(), "_propertyIndex", 0);
        setField(term9385, term9385.getClass(), "_metadata", null);
        setField(term9385, term9385.getClass(), "_propertyFormat", null);
        setField(term9385, term9385.getClass(), "_aliases", null);
        term9388 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        Object term9389 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term9388, term9388.getClass(), "_forward", null);
        setField(term9388, term9388.getClass(), "_propName", null);
        setField(term9389, term9389.getClass(), "_keyType", null);
        setField(term9389, term9389.getClass(), "_valueType", null);
        setField(term9389, term9389.getClass(), "_superClass", null);
        setField(term9389, term9389.getClass(), "_superInterfaces", null);
        setField(term9389, term9389.getClass(), "_bindings", null);
        setField(term9389, term9389.getClass(), "_canonicalName", null);
        setField(term9389, term9389.getClass(), "_class", null);
        setIntField(term9389, term9389.getClass(), "_hash", 0);
        setField(term9389, term9389.getClass(), "_valueHandler", null);
        setField(term9389, term9389.getClass(), "_typeHandler", null);
        setBooleanField(term9389, term9389.getClass(), "_asStatic", false);
        setField(term9388, term9388.getClass(), "_type", term9389);
        setField(term9388, term9388.getClass(), "_wrapperName", null);
        setField(term9388, term9388.getClass(), "_contextAnnotations", null);
        setField(term9388, term9388.getClass(), "_valueDeserializer", null);
        setField(term9388, term9388.getClass(), "_valueTypeDeserializer", null);
        setField(term9388, term9388.getClass(), "_nullProvider", null);
        setField(term9388, term9388.getClass(), "_managedReferenceName", null);
        setField(term9388, term9388.getClass(), "_objectIdInfo", null);
        setField(term9388, term9388.getClass(), "_viewMatcher", null);
        setIntField(term9388, term9388.getClass(), "_propertyIndex", 0);
        setField(term9388, term9388.getClass(), "_metadata", null);
        setField(term9388, term9388.getClass(), "_propertyFormat", null);
        setField(term9388, term9388.getClass(), "_aliases", null);
        term9390 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumDeserializer"));
        setField(term9390, term9390.getClass(), "_enumsByIndex", null);
        setField(term9390, term9390.getClass(), "_enumDefaultValue", null);
        setField(term9390, term9390.getClass(), "_lookupByName", null);
        setField(term9390, term9390.getClass(), "_lookupByToString", null);
        setField(term9390, term9390.getClass(), "_caseInsensitive", null);
        setField(term9390, term9390.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term9162;
        args[1] = term9374;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9385));
        assertTrue(recursiveEquals(term9162, term9388));
        assertTrue(recursiveEquals(term9374, term9390));
    }

};


