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

public class ObjectReader_init_2073957032277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53262;
     Object term53533;
     Object term53478;
     Object term53620;
     Object term53623;
     Object term53624;
     Object term53625;
     Object term53626;

    public ObjectReader_init_2073957032277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term52992 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term53074 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term53170 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term52992, term52992.getClass(), "_config", null);
        setField(term52992, term52992.getClass(), "_context", null);
        setField(term52992, term52992.getClass(), "_rootDeserializers", null);
        setField(term52992, term52992.getClass(), "_parserFactory", term53074);
        setField(term52992, term52992.getClass(), "_valueType", term53170);
        setField(term52992, term52992.getClass(), "_valueToUpdate", term53170);
        setField(term52992, term52992.getClass(), "_schema", null);
        setField(term52992, term52992.getClass(), "_injectableValues", null);
        term53262 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term53262, term53262.getClass(), "_deserializationContext", null);
        setField(term53262, term53262.getClass(), "_rootDeserializers", null);
        setField(term53262, term53262.getClass(), "_jsonFactory", null);
        term53533 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term53478 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term53620 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term53621 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term53622 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term53621, term53621.getClass(), "_problemHandlers", null);
        setField(term53621, term53621.getClass(), "_nodeFactory", null);
        setIntField(term53621, term53621.getClass(), "_deserFeatures", 0);
        setIntField(term53621, term53621.getClass(), "_parserFeatures", 0);
        setIntField(term53621, term53621.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term53621, term53621.getClass(), "_formatReadFeatures", 0);
        setIntField(term53621, term53621.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term53621, term53621.getClass(), "_mixIns", null);
        setField(term53621, term53621.getClass(), "_subtypeResolver", null);
        setField(term53621, term53621.getClass(), "_rootName", null);
        setField(term53621, term53621.getClass(), "_view", null);
        setField(term53621, term53621.getClass(), "_attributes", null);
        setField(term53621, term53621.getClass(), "_rootNames", null);
        setIntField(term53621, term53621.getClass(), "_mapperFeatures", 0);
        setField(term53621, term53621.getClass(), "_base", null);
        setField(term53620, term53620.getClass(), "_config", term53621);
        setField(term53620, term53620.getClass(), "_context", null);
        setField(term53620, term53620.getClass(), "_parserFactory", null);
        setBooleanField(term53620, term53620.getClass(), "_unwrapRoot", false);
        setField(term53620, term53620.getClass(), "_filter", null);
        setField(term53622, term53622.getClass(), "_elementType", null);
        setField(term53622, term53622.getClass(), "_superClass", null);
        setField(term53622, term53622.getClass(), "_superInterfaces", null);
        setField(term53622, term53622.getClass(), "_bindings", null);
        setField(term53622, term53622.getClass(), "_canonicalName", null);
        setField(term53622, term53622.getClass(), "_class", null);
        setIntField(term53622, term53622.getClass(), "_hash", 0);
        setField(term53622, term53622.getClass(), "_valueHandler", null);
        setField(term53622, term53622.getClass(), "_typeHandler", null);
        setBooleanField(term53622, term53622.getClass(), "_asStatic", false);
        setField(term53620, term53620.getClass(), "_valueType", term53622);
        setField(term53620, term53620.getClass(), "_rootDeserializer", null);
        setField(term53620, term53620.getClass(), "_valueToUpdate", term53621);
        setField(term53620, term53620.getClass(), "_schema", null);
        setField(term53620, term53620.getClass(), "_injectableValues", null);
        setField(term53620, term53620.getClass(), "_dataFormatReaders", null);
        setField(term53620, term53620.getClass(), "_rootDeserializers", null);
        term53623 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term53623, term53623.getClass(), "_elementType", null);
        setField(term53623, term53623.getClass(), "_superClass", null);
        setField(term53623, term53623.getClass(), "_superInterfaces", null);
        setField(term53623, term53623.getClass(), "_bindings", null);
        setField(term53623, term53623.getClass(), "_canonicalName", null);
        setField(term53623, term53623.getClass(), "_class", null);
        setIntField(term53623, term53623.getClass(), "_hash", 0);
        setField(term53623, term53623.getClass(), "_valueHandler", null);
        setField(term53623, term53623.getClass(), "_typeHandler", null);
        setBooleanField(term53623, term53623.getClass(), "_asStatic", false);
        term53624 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term53624, term53624.getClass(), "_problemHandlers", null);
        setField(term53624, term53624.getClass(), "_nodeFactory", null);
        setIntField(term53624, term53624.getClass(), "_deserFeatures", 0);
        setIntField(term53624, term53624.getClass(), "_parserFeatures", 0);
        setIntField(term53624, term53624.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term53624, term53624.getClass(), "_formatReadFeatures", 0);
        setIntField(term53624, term53624.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term53624, term53624.getClass(), "_mixIns", null);
        setField(term53624, term53624.getClass(), "_subtypeResolver", null);
        setField(term53624, term53624.getClass(), "_rootName", null);
        setField(term53624, term53624.getClass(), "_view", null);
        setField(term53624, term53624.getClass(), "_attributes", null);
        setField(term53624, term53624.getClass(), "_rootNames", null);
        setIntField(term53624, term53624.getClass(), "_mapperFeatures", 0);
        setField(term53624, term53624.getClass(), "_base", null);
        term53625 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term53625, term53625.getClass(), "_jsonFactory", null);
        setField(term53625, term53625.getClass(), "_typeFactory", null);
        setField(term53625, term53625.getClass(), "_injectableValues", null);
        setField(term53625, term53625.getClass(), "_subtypeResolver", null);
        setField(term53625, term53625.getClass(), "_mixIns", null);
        setField(term53625, term53625.getClass(), "_serializationConfig", null);
        setField(term53625, term53625.getClass(), "_serializerProvider", null);
        setField(term53625, term53625.getClass(), "_serializerFactory", null);
        setField(term53625, term53625.getClass(), "_deserializationConfig", null);
        setField(term53625, term53625.getClass(), "_deserializationContext", null);
        setField(term53625, term53625.getClass(), "_registeredModuleTypes", null);
        setField(term53625, term53625.getClass(), "_rootDeserializers", null);
        term53626 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term53626, term53626.getClass(), "_problemHandlers", null);
        setField(term53626, term53626.getClass(), "_nodeFactory", null);
        setIntField(term53626, term53626.getClass(), "_deserFeatures", 0);
        setIntField(term53626, term53626.getClass(), "_parserFeatures", 0);
        setIntField(term53626, term53626.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term53626, term53626.getClass(), "_formatReadFeatures", 0);
        setIntField(term53626, term53626.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term53626, term53626.getClass(), "_mixIns", null);
        setField(term53626, term53626.getClass(), "_subtypeResolver", null);
        setField(term53626, term53626.getClass(), "_rootName", null);
        setField(term53626, term53626.getClass(), "_view", null);
        setField(term53626, term53626.getClass(), "_attributes", null);
        setField(term53626, term53626.getClass(), "_rootNames", null);
        setIntField(term53626, term53626.getClass(), "_mapperFeatures", 0);
        setField(term53626, term53626.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("java.lang.Object");
        argTypes[4] = Class.forName("com.fasterxml.jackson.core.FormatSchema");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.InjectableValues");
        Object[] args = new Object[6];
        args[0] = term53262;
        args[1] = term53533;
        args[2] = term53478;
        args[3] = term53533;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term53620));
        assertTrue(recursiveEquals(term53262, term53623));
        assertTrue(recursiveEquals(term53533, term53624));
        assertTrue(recursiveEquals(term53478, term53625));
        assertTrue(recursiveEquals(term53533, term53626));
    }

};


