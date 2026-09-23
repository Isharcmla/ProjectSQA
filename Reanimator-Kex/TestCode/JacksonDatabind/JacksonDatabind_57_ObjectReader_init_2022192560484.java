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
import java.lang.Object;
import org.mockito.Mockito;

public class ObjectReader_init_2022192560484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283559;
     Object term283866;
     Object term284162;
     Object term282003;
     Object term284270;

    public ObjectReader_init_2022192560484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term282661 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term282771 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term283633 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term283001 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term283756 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term283189 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term283359 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer"));
        Object term283467 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term282661, term282661.getClass(), "_config", term282771);
        setField(term282661, term282661.getClass(), "_context", term283633);
        setField(term282661, term282661.getClass(), "_rootDeserializers", term283001);
        setField(term282661, term282661.getClass(), "_parserFactory", term283756);
        setField(term282661, term282661.getClass(), "_valueType", term283189);
        setField(term282661, term282661.getClass(), "_rootDeserializer", term283359);
        setField(term282661, term282661.getClass(), "_valueToUpdate", term282771);
        setField(term282661, term282661.getClass(), "_schema", null);
        setField(term282661, term282661.getClass(), "_injectableValues", term283467);
        term283559 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term283715 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term283559, term283559.getClass(), "_context", term283633);
        setField(term283559, term283559.getClass(), "_rootDeserializers", term283715);
        setField(term283559, term283559.getClass(), "_parserFactory", term283756);
        term283866 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term283958 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term283958, term283958.getClass(), "_namespace", null);
        setField(term283958, term283958.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term283866, term283866.getClass(), "_rootName", term283958);
        term284162 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$DoubleDeser"));
        term282003 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term284270 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("java.lang.Object");
        argTypes[5] = Class.forName("com.fasterxml.jackson.core.FormatSchema");
        argTypes[6] = Class.forName("com.fasterxml.jackson.databind.InjectableValues");
        argTypes[7] = Class.forName("com.fasterxml.jackson.databind.deser.DataFormatReaders");
        Object[] args = new Object[8];
        args[0] = term283559;
        args[1] = term283866;
        args[2] = null;
        args[3] = term284162;
        args[4] = null;
        args[5] = term282003;
        args[6] = term284270;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


