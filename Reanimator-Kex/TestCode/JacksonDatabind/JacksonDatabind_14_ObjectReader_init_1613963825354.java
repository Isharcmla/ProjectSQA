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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import org.mockito.Mockito;

public class ObjectReader_init_1613963825354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155677;

    public ObjectReader_init_1613963825354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term155049 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term155159 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term155241 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term155347 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term155439 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term155477 = newInstance(Class.forName("java.lang.Object"));
        Object term154934 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term155585 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term155049, term155049.getClass(), "_config", term155159);
        setField(term155049, term155049.getClass(), "_context", null);
        setField(term155049, term155049.getClass(), "_rootDeserializers", null);
        setField(term155049, term155049.getClass(), "_parserFactory", term155241);
        setField(term155049, term155049.getClass(), "_rootNames", term155347);
        setField(term155049, term155049.getClass(), "_valueType", term155439);
        setField(term155049, term155049.getClass(), "_valueToUpdate", term155477);
        setField(term155049, term155049.getClass(), "_schema", term154934);
        setField(term155049, term155049.getClass(), "_injectableValues", term155585);
        term155677 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term155825 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term155907 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term155989 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term156095 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term155677, term155677.getClass(), "_deserializationContext", term155825);
        setField(term155677, term155677.getClass(), "_rootDeserializers", term155907);
        setField(term155677, term155677.getClass(), "_jsonFactory", term155989);
        setField(term155677, term155677.getClass(), "_rootNames", term156095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term155677;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


