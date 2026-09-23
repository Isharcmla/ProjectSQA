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

public class ObjectReader_init_2022192560436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219289;
     Object term219629;
     Object term219863;
     Object term220001;
     Object term220083;
     Object term218320;
     Object term220191;

    public ObjectReader_init_2022192560436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term218463 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term218573 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term218721 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term218803 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term218903 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term219051 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        Object term219089 = newInstance(Class.forName("java.lang.Object"));
        term218320 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term219197 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term218463, term218463.getClass(), "_config", term218573);
        setField(term218463, term218463.getClass(), "_context", term218721);
        setField(term218463, term218463.getClass(), "_rootDeserializers", null);
        setField(term218463, term218463.getClass(), "_parserFactory", term218803);
        setField(term218463, term218463.getClass(), "_valueType", term218903);
        setField(term218463, term218463.getClass(), "_rootDeserializer", term219051);
        setField(term218463, term218463.getClass(), "_valueToUpdate", term219089);
        setField(term218463, term218463.getClass(), "_schema", term218320);
        setField(term218463, term218463.getClass(), "_injectableValues", term219197);
        term219289 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term219437 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term219519 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term219289, term219289.getClass(), "_context", term219437);
        setField(term219289, term219289.getClass(), "_rootDeserializers", null);
        setField(term219289, term219289.getClass(), "_parserFactory", term219519);
        term219629 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term219721 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term219721, term219721.getClass(), "_namespace", null);
        setField(term219721, term219721.getClass(), "_simpleName", "");
        setField(term219629, term219629.getClass(), "_rootName", term219721);
        term219863 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term220001 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
        term220083 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        term220191 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term219289;
        args[1] = term219629;
        args[2] = term219863;
        args[3] = term220001;
        args[4] = term220083;
        args[5] = term218320;
        args[6] = term220191;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


