package com.fasterxml.jackson.databind.ser;

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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.EqualityUtils.*;

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_162360997087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17289;
     Object term17393;
     Object term17431;
     Object term17432;
     Object term17427;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_162360997087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17289 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setIntField(term17289, term17289.getClass(), "_mapperFeatures", 0);
        term17393 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term17431 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setIntField(term17431, term17431.getClass(), "_serFeatures", 0);
        setField(term17431, term17431.getClass(), "_serializationInclusion", null);
        setField(term17431, term17431.getClass(), "_filterProvider", null);
        setField(term17431, term17431.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term17431, term17431.getClass(), "_generatorFeatures", 0);
        setIntField(term17431, term17431.getClass(), "_generatorFeaturesToChange", 0);
        setField(term17431, term17431.getClass(), "_mixIns", null);
        setField(term17431, term17431.getClass(), "_subtypeResolver", null);
        setField(term17431, term17431.getClass(), "_rootName", null);
        setField(term17431, term17431.getClass(), "_view", null);
        setField(term17431, term17431.getClass(), "_attributes", null);
        setField(term17431, term17431.getClass(), "_rootNames", null);
        setIntField(term17431, term17431.getClass(), "_mapperFeatures", 0);
        setField(term17431, term17431.getClass(), "_base", null);
        term17432 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term17432, term17432.getClass(), "_referencedType", null);
        setField(term17432, term17432.getClass(), "_typeParametersFor", null);
        setField(term17432, term17432.getClass(), "_typeParameters", null);
        setField(term17432, term17432.getClass(), "_typeNames", null);
        setField(term17432, term17432.getClass(), "_canonicalName", null);
        setField(term17432, term17432.getClass(), "_class", null);
        setIntField(term17432, term17432.getClass(), "_hash", 0);
        setField(term17432, term17432.getClass(), "_valueHandler", null);
        setField(term17432, term17432.getClass(), "_typeHandler", null);
        setBooleanField(term17432, term17432.getClass(), "_asStatic", false);
        term17427 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term17427, term17427.getClass(), "_referencedType", null);
        setField(term17427, term17427.getClass(), "_typeParametersFor", null);
        setField(term17427, term17427.getClass(), "_typeParameters", null);
        setField(term17427, term17427.getClass(), "_typeNames", null);
        setField(term17427, term17427.getClass(), "_canonicalName", null);
        setField(term17427, term17427.getClass(), "_class", null);
        setIntField(term17427, term17427.getClass(), "_hash", 0);
        setField(term17427, term17427.getClass(), "_valueHandler", null);
        setField(term17427, term17427.getClass(), "_typeHandler", null);
        setBooleanField(term17427, term17427.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term17289;
        args[1] = null;
        args[2] = term17393;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term17289, term17431));
        assertTrue(recursiveEquals(term17393, null));
        assertTrue(recursiveEquals(retValue, term17427));
    }

};


