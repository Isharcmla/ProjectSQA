package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.std.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class MapDeserializer_init_1785886176123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66214;
     Object term66360;
     Object term66527;
     Object term66530;
     Object term66531;

    public MapDeserializer_init_1785886176123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65842 = Class.forName((String) "java.lang.SuppressWarnings");
        Object term65806 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term65948 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term66086 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term65806, term65806.getClass(), "_valueClass", term65842);
        setField(term65806, term65806.getClass(), "_mapType", term65948);
        setField(term65806, term65806.getClass(), "_keyDeserializer", null);
        setField(term65806, term65806.getClass(), "_valueDeserializer", null);
        setField(term65806, term65806.getClass(), "_valueTypeDeserializer", null);
        setField(term65806, term65806.getClass(), "_valueInstantiator", term66086);
        setBooleanField(term65806, term65806.getClass(), "_hasDefaultCreator", false);
        setField(term65806, term65806.getClass(), "_delegateDeserializer", null);
        setField(term65806, term65806.getClass(), "_propertyBasedCreator", null);
        term66214 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term66214, term66214.getClass(), "_defaultCreator", null);
        term66360 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        term66527 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term66528 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term66529 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term66527, term66527.getClass(), "_mapType", null);
        setField(term66527, term66527.getClass(), "_keyDeserializer", null);
        setBooleanField(term66527, term66527.getClass(), "_standardStringKey", true);
        setField(term66527, term66527.getClass(), "_valueDeserializer", null);
        setField(term66528, term66528.getClass(), "_idResolver", null);
        setField(term66528, term66528.getClass(), "_baseType", null);
        setField(term66528, term66528.getClass(), "_property", null);
        setField(term66528, term66528.getClass(), "_defaultImpl", null);
        setField(term66528, term66528.getClass(), "_typePropertyName", null);
        setBooleanField(term66528, term66528.getClass(), "_typeIdVisible", false);
        setField(term66528, term66528.getClass(), "_deserializers", null);
        setField(term66528, term66528.getClass(), "_defaultImplDeserializer", null);
        setField(term66527, term66527.getClass(), "_valueTypeDeserializer", term66528);
        setField(term66529, term66529.getClass(), "_valueTypeDesc", null);
        setField(term66529, term66529.getClass(), "_defaultCreator", null);
        setField(term66529, term66529.getClass(), "_withArgsCreator", null);
        setField(term66529, term66529.getClass(), "_constructorArguments", null);
        setField(term66529, term66529.getClass(), "_delegateType", null);
        setField(term66529, term66529.getClass(), "_delegateCreator", null);
        setField(term66529, term66529.getClass(), "_delegateArguments", null);
        setField(term66529, term66529.getClass(), "_fromStringCreator", null);
        setField(term66529, term66529.getClass(), "_fromIntCreator", null);
        setField(term66529, term66529.getClass(), "_fromLongCreator", null);
        setField(term66529, term66529.getClass(), "_fromDoubleCreator", null);
        setField(term66529, term66529.getClass(), "_fromBooleanCreator", null);
        setField(term66529, term66529.getClass(), "_incompleteParameter", null);
        setField(term66527, term66527.getClass(), "_valueInstantiator", term66529);
        setBooleanField(term66527, term66527.getClass(), "_hasDefaultCreator", false);
        setField(term66527, term66527.getClass(), "_delegateDeserializer", null);
        setField(term66527, term66527.getClass(), "_propertyBasedCreator", null);
        setField(term66527, term66527.getClass(), "_ignorableProperties", null);
        setField(term66527, term66527.getClass(), "_valueClass", null);
        term66530 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term66530, term66530.getClass(), "_valueTypeDesc", null);
        setField(term66530, term66530.getClass(), "_defaultCreator", null);
        setField(term66530, term66530.getClass(), "_withArgsCreator", null);
        setField(term66530, term66530.getClass(), "_constructorArguments", null);
        setField(term66530, term66530.getClass(), "_delegateType", null);
        setField(term66530, term66530.getClass(), "_delegateCreator", null);
        setField(term66530, term66530.getClass(), "_delegateArguments", null);
        setField(term66530, term66530.getClass(), "_fromStringCreator", null);
        setField(term66530, term66530.getClass(), "_fromIntCreator", null);
        setField(term66530, term66530.getClass(), "_fromLongCreator", null);
        setField(term66530, term66530.getClass(), "_fromDoubleCreator", null);
        setField(term66530, term66530.getClass(), "_fromBooleanCreator", null);
        setField(term66530, term66530.getClass(), "_incompleteParameter", null);
        term66531 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term66531, term66531.getClass(), "_idResolver", null);
        setField(term66531, term66531.getClass(), "_baseType", null);
        setField(term66531, term66531.getClass(), "_property", null);
        setField(term66531, term66531.getClass(), "_defaultImpl", null);
        setField(term66531, term66531.getClass(), "_typePropertyName", null);
        setBooleanField(term66531, term66531.getClass(), "_typeIdVisible", false);
        setField(term66531, term66531.getClass(), "_deserializers", null);
        setField(term66531, term66531.getClass(), "_defaultImplDeserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.KeyDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term66214;
        args[2] = null;
        args[3] = null;
        args[4] = term66360;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term66527));
        assertTrue(recursiveEquals(term66214, term66530));
        assertTrue(recursiveEquals(term66360, term66531));
    }

};


