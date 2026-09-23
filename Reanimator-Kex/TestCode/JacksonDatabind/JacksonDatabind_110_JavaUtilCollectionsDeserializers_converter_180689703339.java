package com.fasterxml.jackson.databind.deser.impl;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307050;
     Object term307742;

    public JavaUtilCollectionsDeserializers_converter_180689703339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term307086 = Class.forName((String) "java.lang.StringUTF16$LinesSpliterator");
        Class<? extends Object> term307226 = Class.forName((String) "java.util.concurrent.CompletableFuture$OrApply");
        Class<? extends Object> term307368 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIdentityInfo");
        Class<? extends Object> term307510 = Class.forName((String) "com.fasterxml.jackson.databind.deser.ValueInstantiator$Gettable");
        term307050 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term307190 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term307332 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term307474 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term307614 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term307706 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term307050, term307050.getClass(), "_class", term307086);
        setField(term307190, term307190.getClass(), "_class", term307226);
        setField(term307332, term307332.getClass(), "_class", term307368);
        setField(term307474, term307474.getClass(), "_class", term307510);
        setField(term307614, term307614.getClass(), "_class", null);
        setField(term307614, term307614.getClass(), "_superClass", term307706);
        setField(term307474, term307474.getClass(), "_superClass", term307614);
        setField(term307332, term307332.getClass(), "_superClass", term307474);
        setField(term307190, term307190.getClass(), "_superClass", term307332);
        setField(term307050, term307050.getClass(), "_superClass", term307190);
        term307742 = Class.forName((String) "java.util.stream.StreamSpliterators$InfiniteSupplyingSpliterator");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term307050;
        args[2] = term307742;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


