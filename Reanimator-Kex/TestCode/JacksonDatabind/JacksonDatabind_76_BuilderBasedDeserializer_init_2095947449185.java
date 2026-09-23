package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BuilderBasedDeserializer_init_2095947449185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84734;
     Object term85144;

    public BuilderBasedDeserializer_init_2095947449185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84606 = Class.forName((String) "java.util.zip.GZIPOutputStream");
        Object term84570 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term84570, term84570.getClass(), "_valueClass", term84606);
        setField(term84570, term84570.getClass(), "_classAnnotations", null);
        setField(term84570, term84570.getClass(), "_beanType", null);
        setField(term84570, term84570.getClass(), "_valueInstantiator", null);
        setField(term84570, term84570.getClass(), "_delegateDeserializer", null);
        setField(term84570, term84570.getClass(), "_propertyBasedCreator", null);
        setField(term84570, term84570.getClass(), "_backRefs", null);
        setField(term84570, term84570.getClass(), "_ignorableProps", null);
        Class<? extends Object> term84890 = Class.forName((String) "java.util.ArrayPrefixHelpers$DoubleCumulateTask");
        term84734 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term84854 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term85006 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term84854, term84854.getClass(), "_class", term84890);
        setField(term84734, term84734.getClass(), "_beanType", term84854);
        setField(term84734, term84734.getClass(), "_classAnnotations", term85006);
        setField(term84734, term84734.getClass(), "_valueInstantiator", null);
        setField(term84734, term84734.getClass(), "_delegateDeserializer", null);
        setField(term84734, term84734.getClass(), "_propertyBasedCreator", null);
        setField(term84734, term84734.getClass(), "_backRefs", null);
        setField(term84734, term84734.getClass(), "_ignorableProps", null);
        term85144 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term84734;
        args[1] = term85144;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


