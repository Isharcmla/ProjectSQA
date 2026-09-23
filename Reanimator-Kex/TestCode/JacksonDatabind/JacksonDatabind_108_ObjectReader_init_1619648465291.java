package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.lang.Object;
import org.mockito.Mockito;

public class ObjectReader_init_1619648465291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60300;
     Object term60840;
     Object term61000;
     Object term61009;
     Object term61013;

    public ObjectReader_init_1619648465291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term59420 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term59530 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term59678 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term59760 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term59842 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term59934 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term60062 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        Object term60100 = newInstance(Class.forName("java.lang.Object"));
        Object term59295 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term60622 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term59420, term59420.getClass(), "_config", term59530);
        setField(term59420, term59420.getClass(), "_context", term59678);
        setField(term59420, term59420.getClass(), "_rootDeserializers", term59760);
        setField(term59420, term59420.getClass(), "_parserFactory", term59842);
        setField(term59420, term59420.getClass(), "_valueType", term59934);
        setField(term59420, term59420.getClass(), "_rootDeserializer", term60062);
        setField(term59420, term59420.getClass(), "_valueToUpdate", term60100);
        setField(term59420, term59420.getClass(), "_schema", term59295);
        setField(term59420, term59420.getClass(), "_injectableValues", term60622);
        term60300 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term60404 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term60568 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        Object term60730 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term60300, term60300.getClass(), "_context", null);
        setField(term60300, term60300.getClass(), "_rootDeserializers", null);
        setField(term60300, term60300.getClass(), "_parserFactory", null);
        setField(term60300, term60300.getClass(), "_valueType", term60404);
        setField(term60300, term60300.getClass(), "_rootDeserializer", term60568);
        setField(term60300, term60300.getClass(), "_valueToUpdate", term60622);
        setField(term60300, term60300.getClass(), "_schema", null);
        setField(term60300, term60300.getClass(), "_injectableValues", term60730);
        term60840 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term60932 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term60932, term60932.getClass(), "_namespace", "");
        setField(term60840, term60840.getClass(), "_rootName", term60932);
        term61000 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term61001 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term61002 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term61005 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term61006 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        Object term61007 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        Object term61008 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term61001, term61001.getClass(), "_problemHandlers", null);
        setField(term61001, term61001.getClass(), "_nodeFactory", null);
        setIntField(term61001, term61001.getClass(), "_deserFeatures", 0);
        setIntField(term61001, term61001.getClass(), "_parserFeatures", 0);
        setIntField(term61001, term61001.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term61001, term61001.getClass(), "_formatReadFeatures", 0);
        setIntField(term61001, term61001.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term61001, term61001.getClass(), "_mixIns", null);
        setField(term61001, term61001.getClass(), "_subtypeResolver", null);
        setField(term61002, term61002.getClass(), "_simpleName", null);
        setField(term61002, term61002.getClass(), "_namespace", "");
        setField(term61002, term61002.getClass(), "_encodedSimple", null);
        setField(term61001, term61001.getClass(), "_rootName", term61002);
        setField(term61001, term61001.getClass(), "_view", null);
        setField(term61001, term61001.getClass(), "_attributes", null);
        setField(term61001, term61001.getClass(), "_rootNames", null);
        setField(term61001, term61001.getClass(), "_configOverrides", null);
        setIntField(term61001, term61001.getClass(), "_mapperFeatures", 0);
        setField(term61001, term61001.getClass(), "_base", null);
        setField(term61000, term61000.getClass(), "_config", term61001);
        setField(term61000, term61000.getClass(), "_context", null);
        setField(term61000, term61000.getClass(), "_parserFactory", null);
        setBooleanField(term61000, term61000.getClass(), "_unwrapRoot", true);
        setField(term61000, term61000.getClass(), "_filter", null);
        setField(term61005, term61005.getClass(), "_referencedType", null);
        setField(term61005, term61005.getClass(), "_anchorType", null);
        setField(term61005, term61005.getClass(), "_superClass", null);
        setField(term61005, term61005.getClass(), "_superInterfaces", null);
        setField(term61005, term61005.getClass(), "_bindings", null);
        setField(term61005, term61005.getClass(), "_canonicalName", null);
        setField(term61005, term61005.getClass(), "_class", null);
        setIntField(term61005, term61005.getClass(), "_hash", 0);
        setField(term61005, term61005.getClass(), "_valueHandler", null);
        setField(term61005, term61005.getClass(), "_typeHandler", null);
        setBooleanField(term61005, term61005.getClass(), "_asStatic", false);
        setField(term61000, term61000.getClass(), "_valueType", term61005);
        setField(term61006, term61006.getClass(), "_nullValue", null);
        setField(term61006, term61006.getClass(), "_emptyValue", null);
        setBooleanField(term61006, term61006.getClass(), "_primitive", false);
        setField(term61006, term61006.getClass(), "_valueClass", null);
        setField(term61000, term61000.getClass(), "_rootDeserializer", term61006);
        setField(term61007, term61007.getClass(), "_values", null);
        setField(term61000, term61000.getClass(), "_valueToUpdate", term61007);
        setField(term61000, term61000.getClass(), "_schema", null);
        setField(term61008, term61008.getClass(), "_values", null);
        setField(term61000, term61000.getClass(), "_injectableValues", term61008);
        setField(term61000, term61000.getClass(), "_dataFormatReaders", null);
        setField(term61000, term61000.getClass(), "_rootDeserializers", null);
        term61009 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term61010 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term61009, term61009.getClass(), "_problemHandlers", null);
        setField(term61009, term61009.getClass(), "_nodeFactory", null);
        setIntField(term61009, term61009.getClass(), "_deserFeatures", 0);
        setIntField(term61009, term61009.getClass(), "_parserFeatures", 0);
        setIntField(term61009, term61009.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term61009, term61009.getClass(), "_formatReadFeatures", 0);
        setIntField(term61009, term61009.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term61009, term61009.getClass(), "_mixIns", null);
        setField(term61009, term61009.getClass(), "_subtypeResolver", null);
        setField(term61010, term61010.getClass(), "_simpleName", null);
        setField(term61010, term61010.getClass(), "_namespace", "");
        setField(term61010, term61010.getClass(), "_encodedSimple", null);
        setField(term61009, term61009.getClass(), "_rootName", term61010);
        setField(term61009, term61009.getClass(), "_view", null);
        setField(term61009, term61009.getClass(), "_attributes", null);
        setField(term61009, term61009.getClass(), "_rootNames", null);
        setField(term61009, term61009.getClass(), "_configOverrides", null);
        setIntField(term61009, term61009.getClass(), "_mapperFeatures", 0);
        setField(term61009, term61009.getClass(), "_base", null);
        term61013 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term61014 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term61015 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        Object term61016 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        Object term61017 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term61013, term61013.getClass(), "_config", null);
        setField(term61013, term61013.getClass(), "_context", null);
        setField(term61013, term61013.getClass(), "_parserFactory", null);
        setBooleanField(term61013, term61013.getClass(), "_unwrapRoot", false);
        setField(term61013, term61013.getClass(), "_filter", null);
        setField(term61014, term61014.getClass(), "_referencedType", null);
        setField(term61014, term61014.getClass(), "_anchorType", null);
        setField(term61014, term61014.getClass(), "_superClass", null);
        setField(term61014, term61014.getClass(), "_superInterfaces", null);
        setField(term61014, term61014.getClass(), "_bindings", null);
        setField(term61014, term61014.getClass(), "_canonicalName", null);
        setField(term61014, term61014.getClass(), "_class", null);
        setIntField(term61014, term61014.getClass(), "_hash", 0);
        setField(term61014, term61014.getClass(), "_valueHandler", null);
        setField(term61014, term61014.getClass(), "_typeHandler", null);
        setBooleanField(term61014, term61014.getClass(), "_asStatic", false);
        setField(term61013, term61013.getClass(), "_valueType", term61014);
        setField(term61015, term61015.getClass(), "_nullValue", null);
        setField(term61015, term61015.getClass(), "_emptyValue", null);
        setBooleanField(term61015, term61015.getClass(), "_primitive", false);
        setField(term61015, term61015.getClass(), "_valueClass", null);
        setField(term61013, term61013.getClass(), "_rootDeserializer", term61015);
        setField(term61016, term61016.getClass(), "_values", null);
        setField(term61013, term61013.getClass(), "_valueToUpdate", term61016);
        setField(term61013, term61013.getClass(), "_schema", null);
        setField(term61017, term61017.getClass(), "_values", null);
        setField(term61013, term61013.getClass(), "_injectableValues", term61017);
        setField(term61013, term61013.getClass(), "_dataFormatReaders", null);
        setField(term61013, term61013.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term60300;
        args[1] = term60840;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term61000));
        assertTrue(recursiveEquals(term60300, term61009));
        assertTrue(recursiveEquals(term60840, term61013));
    }

};


