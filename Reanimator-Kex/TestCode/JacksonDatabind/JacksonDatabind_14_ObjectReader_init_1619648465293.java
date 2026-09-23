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

public class ObjectReader_init_1619648465293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91667;
     Object term92617;

    public ObjectReader_init_1619648465293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term91135 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term91217 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term91299 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term91405 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term91575 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer"));
        Object term91010 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term91135, term91135.getClass(), "_config", null);
        setField(term91135, term91135.getClass(), "_context", null);
        setField(term91135, term91135.getClass(), "_rootDeserializers", term91217);
        setField(term91135, term91135.getClass(), "_parserFactory", term91299);
        setField(term91135, term91135.getClass(), "_rootNames", null);
        setField(term91135, term91135.getClass(), "_valueType", term91405);
        setField(term91135, term91135.getClass(), "_rootDeserializer", term91575);
        setField(term91135, term91135.getClass(), "_valueToUpdate", null);
        setField(term91135, term91135.getClass(), "_schema", term91010);
        setField(term91135, term91135.getClass(), "_injectableValues", null);
        term91667 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term91815 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term91897 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term91979 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term92085 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term92185 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term92317 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term92399 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term91009 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term92507 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term91667, term91667.getClass(), "_context", term91815);
        setField(term91667, term91667.getClass(), "_rootDeserializers", term91897);
        setField(term91667, term91667.getClass(), "_parserFactory", term91979);
        setField(term91667, term91667.getClass(), "_rootNames", term92085);
        setField(term91667, term91667.getClass(), "_valueType", term92185);
        setField(term91667, term91667.getClass(), "_rootDeserializer", term92317);
        setField(term91667, term91667.getClass(), "_valueToUpdate", term92399);
        setField(term91667, term91667.getClass(), "_schema", term91009);
        setField(term91667, term91667.getClass(), "_injectableValues", term92507);
        term92617 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term92617, term92617.getClass(), "_rootName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term91667;
        args[1] = term92617;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


