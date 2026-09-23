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

public class ObjectReader_init_1619648465273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50632;
     Object term51132;
     Object term51291;
     Object term51300;
     Object term51304;

    public ObjectReader_init_1619648465273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49742 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term49852 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term50000 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term50082 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term50164 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term50268 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term50394 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer"));
        Object term50432 = newInstance(Class.forName("java.lang.Object"));
        Object term49617 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term50914 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term49742, term49742.getClass(), "_config", term49852);
        setField(term49742, term49742.getClass(), "_context", term50000);
        setField(term49742, term49742.getClass(), "_rootDeserializers", term50082);
        setField(term49742, term49742.getClass(), "_parserFactory", term50164);
        setField(term49742, term49742.getClass(), "_valueType", term50268);
        setField(term49742, term49742.getClass(), "_rootDeserializer", term50394);
        setField(term49742, term49742.getClass(), "_valueToUpdate", term50432);
        setField(term49742, term49742.getClass(), "_schema", term49617);
        setField(term49742, term49742.getClass(), "_injectableValues", term50914);
        term50632 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term50736 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term50860 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        Object term51022 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term50632, term50632.getClass(), "_context", null);
        setField(term50632, term50632.getClass(), "_rootDeserializers", null);
        setField(term50632, term50632.getClass(), "_parserFactory", null);
        setField(term50632, term50632.getClass(), "_valueType", term50736);
        setField(term50632, term50632.getClass(), "_rootDeserializer", term50860);
        setField(term50632, term50632.getClass(), "_valueToUpdate", term50914);
        setField(term50632, term50632.getClass(), "_schema", null);
        setField(term50632, term50632.getClass(), "_injectableValues", term51022);
        term51132 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term51224 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term51224, term51224.getClass(), "_namespace", "");
        setField(term51132, term51132.getClass(), "_rootName", term51224);
        term51291 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term51292 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term51293 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term51296 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term51297 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        Object term51298 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        Object term51299 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term51292, term51292.getClass(), "_problemHandlers", null);
        setField(term51292, term51292.getClass(), "_nodeFactory", null);
        setIntField(term51292, term51292.getClass(), "_deserFeatures", 0);
        setIntField(term51292, term51292.getClass(), "_parserFeatures", 0);
        setIntField(term51292, term51292.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term51292, term51292.getClass(), "_formatReadFeatures", 0);
        setIntField(term51292, term51292.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term51292, term51292.getClass(), "_mixIns", null);
        setField(term51292, term51292.getClass(), "_subtypeResolver", null);
        setField(term51293, term51293.getClass(), "_simpleName", null);
        setField(term51293, term51293.getClass(), "_namespace", "");
        setField(term51293, term51293.getClass(), "_encodedSimple", null);
        setField(term51292, term51292.getClass(), "_rootName", term51293);
        setField(term51292, term51292.getClass(), "_view", null);
        setField(term51292, term51292.getClass(), "_attributes", null);
        setField(term51292, term51292.getClass(), "_rootNames", null);
        setIntField(term51292, term51292.getClass(), "_mapperFeatures", 0);
        setField(term51292, term51292.getClass(), "_base", null);
        setField(term51291, term51291.getClass(), "_config", term51292);
        setField(term51291, term51291.getClass(), "_context", null);
        setField(term51291, term51291.getClass(), "_parserFactory", null);
        setBooleanField(term51291, term51291.getClass(), "_unwrapRoot", true);
        setField(term51291, term51291.getClass(), "_filter", null);
        setField(term51296, term51296.getClass(), "_referencedType", null);
        setField(term51296, term51296.getClass(), "_superClass", null);
        setField(term51296, term51296.getClass(), "_superInterfaces", null);
        setField(term51296, term51296.getClass(), "_bindings", null);
        setField(term51296, term51296.getClass(), "_canonicalName", null);
        setField(term51296, term51296.getClass(), "_class", null);
        setIntField(term51296, term51296.getClass(), "_hash", 0);
        setField(term51296, term51296.getClass(), "_valueHandler", null);
        setField(term51296, term51296.getClass(), "_typeHandler", null);
        setBooleanField(term51296, term51296.getClass(), "_asStatic", false);
        setField(term51291, term51291.getClass(), "_valueType", term51296);
        setField(term51297, term51297.getClass(), "_valueClass", null);
        setField(term51291, term51291.getClass(), "_rootDeserializer", term51297);
        setField(term51298, term51298.getClass(), "_values", null);
        setField(term51291, term51291.getClass(), "_valueToUpdate", term51298);
        setField(term51291, term51291.getClass(), "_schema", null);
        setField(term51299, term51299.getClass(), "_values", null);
        setField(term51291, term51291.getClass(), "_injectableValues", term51299);
        setField(term51291, term51291.getClass(), "_dataFormatReaders", null);
        setField(term51291, term51291.getClass(), "_rootDeserializers", null);
        term51300 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term51301 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term51300, term51300.getClass(), "_problemHandlers", null);
        setField(term51300, term51300.getClass(), "_nodeFactory", null);
        setIntField(term51300, term51300.getClass(), "_deserFeatures", 0);
        setIntField(term51300, term51300.getClass(), "_parserFeatures", 0);
        setIntField(term51300, term51300.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term51300, term51300.getClass(), "_formatReadFeatures", 0);
        setIntField(term51300, term51300.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term51300, term51300.getClass(), "_mixIns", null);
        setField(term51300, term51300.getClass(), "_subtypeResolver", null);
        setField(term51301, term51301.getClass(), "_simpleName", null);
        setField(term51301, term51301.getClass(), "_namespace", "");
        setField(term51301, term51301.getClass(), "_encodedSimple", null);
        setField(term51300, term51300.getClass(), "_rootName", term51301);
        setField(term51300, term51300.getClass(), "_view", null);
        setField(term51300, term51300.getClass(), "_attributes", null);
        setField(term51300, term51300.getClass(), "_rootNames", null);
        setIntField(term51300, term51300.getClass(), "_mapperFeatures", 0);
        setField(term51300, term51300.getClass(), "_base", null);
        term51304 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term51305 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term51306 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        Object term51307 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        Object term51308 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term51304, term51304.getClass(), "_config", null);
        setField(term51304, term51304.getClass(), "_context", null);
        setField(term51304, term51304.getClass(), "_parserFactory", null);
        setBooleanField(term51304, term51304.getClass(), "_unwrapRoot", false);
        setField(term51304, term51304.getClass(), "_filter", null);
        setField(term51305, term51305.getClass(), "_referencedType", null);
        setField(term51305, term51305.getClass(), "_superClass", null);
        setField(term51305, term51305.getClass(), "_superInterfaces", null);
        setField(term51305, term51305.getClass(), "_bindings", null);
        setField(term51305, term51305.getClass(), "_canonicalName", null);
        setField(term51305, term51305.getClass(), "_class", null);
        setIntField(term51305, term51305.getClass(), "_hash", 0);
        setField(term51305, term51305.getClass(), "_valueHandler", null);
        setField(term51305, term51305.getClass(), "_typeHandler", null);
        setBooleanField(term51305, term51305.getClass(), "_asStatic", false);
        setField(term51304, term51304.getClass(), "_valueType", term51305);
        setField(term51306, term51306.getClass(), "_valueClass", null);
        setField(term51304, term51304.getClass(), "_rootDeserializer", term51306);
        setField(term51307, term51307.getClass(), "_values", null);
        setField(term51304, term51304.getClass(), "_valueToUpdate", term51307);
        setField(term51304, term51304.getClass(), "_schema", null);
        setField(term51308, term51308.getClass(), "_values", null);
        setField(term51304, term51304.getClass(), "_injectableValues", term51308);
        setField(term51304, term51304.getClass(), "_dataFormatReaders", null);
        setField(term51304, term51304.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term50632;
        args[1] = term51132;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term51291));
        assertTrue(recursiveEquals(term50632, term51300));
        assertTrue(recursiveEquals(term51132, term51304));
    }

};


