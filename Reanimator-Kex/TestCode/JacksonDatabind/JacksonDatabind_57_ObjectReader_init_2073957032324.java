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

public class ObjectReader_init_2073957032324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97452;
     Object term97792;
     Object term98028;
     Object term98120;
     Object term96656;
     Object term98228;

    public ObjectReader_init_2073957032324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term96798 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term96946 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term97028 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term97110 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term97214 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term97252 = newInstance(Class.forName("java.lang.Object"));
        Object term96665 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term97360 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term96798, term96798.getClass(), "_config", null);
        setField(term96798, term96798.getClass(), "_context", term96946);
        setField(term96798, term96798.getClass(), "_rootDeserializers", term97028);
        setField(term96798, term96798.getClass(), "_parserFactory", term97110);
        setField(term96798, term96798.getClass(), "_valueType", term97214);
        setField(term96798, term96798.getClass(), "_valueToUpdate", term97252);
        setField(term96798, term96798.getClass(), "_schema", term96665);
        setField(term96798, term96798.getClass(), "_injectableValues", term97360);
        term97452 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term97600 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term97682 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term97452, term97452.getClass(), "_deserializationContext", term97600);
        setField(term97452, term97452.getClass(), "_rootDeserializers", null);
        setField(term97452, term97452.getClass(), "_jsonFactory", term97682);
        term97792 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term97884 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term97884, term97884.getClass(), "_namespace", null);
        setField(term97884, term97884.getClass(), "_simpleName", "");
        setField(term97792, term97792.getClass(), "_rootName", term97884);
        term98028 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term98120 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term96656 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term98228 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term97452;
        args[1] = term97792;
        args[2] = term98028;
        args[3] = term98120;
        args[4] = term96656;
        args[5] = term98228;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


