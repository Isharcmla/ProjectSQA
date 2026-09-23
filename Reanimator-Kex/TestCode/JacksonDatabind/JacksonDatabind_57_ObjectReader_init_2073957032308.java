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

public class ObjectReader_init_2073957032308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79917;
     Object term80257;
     Object term80507;
     Object term78833;

    public ObjectReader_init_2073957032308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term79485 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term79595 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term79743 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term79825 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term79485, term79485.getClass(), "_config", term79595);
        setField(term79485, term79485.getClass(), "_context", term79743);
        setField(term79485, term79485.getClass(), "_rootDeserializers", term79825);
        setField(term79485, term79485.getClass(), "_parserFactory", null);
        setField(term79485, term79485.getClass(), "_valueType", null);
        setField(term79485, term79485.getClass(), "_valueToUpdate", null);
        setField(term79485, term79485.getClass(), "_schema", null);
        setField(term79485, term79485.getClass(), "_injectableValues", null);
        term79917 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term80065 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term80147 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term79917, term79917.getClass(), "_deserializationContext", term80065);
        setField(term79917, term79917.getClass(), "_rootDeserializers", null);
        setField(term79917, term79917.getClass(), "_jsonFactory", term80147);
        term80257 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term80349 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term80349, term80349.getClass(), "_namespace", null);
        setField(term80349, term80349.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term80257, term80257.getClass(), "_rootName", term80349);
        term80507 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term78833 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term79917;
        args[1] = term80257;
        args[2] = term80507;
        args[3] = null;
        args[4] = term78833;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


