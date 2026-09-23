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

public class ObjectReader_init_2022192560351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120312;
     Object term120504;
     Object term120624;
     Object term120673;
     Object term120677;
     Object term120678;
     Object term120680;

    public ObjectReader_init_2022192560351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term119792 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term119902 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term120050 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term120220 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumDeserializer$FactoryBasedDeserializer"));
        setField(term119792, term119792.getClass(), "_config", term119902);
        setField(term119792, term119792.getClass(), "_context", term120050);
        setField(term119792, term119792.getClass(), "_rootDeserializers", null);
        setField(term119792, term119792.getClass(), "_parserFactory", null);
        setField(term119792, term119792.getClass(), "_valueType", null);
        setField(term119792, term119792.getClass(), "_rootDeserializer", term120220);
        setField(term119792, term119792.getClass(), "_valueToUpdate", null);
        setField(term119792, term119792.getClass(), "_schema", null);
        setField(term119792, term119792.getClass(), "_injectableValues", null);
        term120312 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term120394 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term120312, term120312.getClass(), "_context", null);
        setField(term120312, term120312.getClass(), "_rootDeserializers", term120394);
        setField(term120312, term120312.getClass(), "_parserFactory", null);
        term120504 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term120504, term120504.getClass(), "_rootName", null);
        setIntField(term120504, term120504.getClass(), "_deserFeatures", -1);
        term120624 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term120673 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term120674 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term120675 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term120676 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term120674, term120674.getClass(), "_problemHandlers", null);
        setField(term120674, term120674.getClass(), "_nodeFactory", null);
        setIntField(term120674, term120674.getClass(), "_deserFeatures", -1);
        setIntField(term120674, term120674.getClass(), "_parserFeatures", 0);
        setIntField(term120674, term120674.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term120674, term120674.getClass(), "_formatReadFeatures", 0);
        setIntField(term120674, term120674.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term120674, term120674.getClass(), "_mixIns", null);
        setField(term120674, term120674.getClass(), "_subtypeResolver", null);
        setField(term120674, term120674.getClass(), "_rootName", null);
        setField(term120674, term120674.getClass(), "_view", null);
        setField(term120674, term120674.getClass(), "_attributes", null);
        setField(term120674, term120674.getClass(), "_rootNames", null);
        setIntField(term120674, term120674.getClass(), "_mapperFeatures", 0);
        setField(term120674, term120674.getClass(), "_base", null);
        setField(term120673, term120673.getClass(), "_config", term120674);
        setField(term120673, term120673.getClass(), "_context", null);
        setField(term120673, term120673.getClass(), "_parserFactory", null);
        setBooleanField(term120673, term120673.getClass(), "_unwrapRoot", true);
        setField(term120673, term120673.getClass(), "_filter", null);
        setField(term120675, term120675.getClass(), "_referencedType", null);
        setField(term120675, term120675.getClass(), "_superClass", null);
        setField(term120675, term120675.getClass(), "_superInterfaces", null);
        setField(term120675, term120675.getClass(), "_bindings", null);
        setField(term120675, term120675.getClass(), "_canonicalName", null);
        setField(term120675, term120675.getClass(), "_class", null);
        setIntField(term120675, term120675.getClass(), "_hash", 0);
        setField(term120675, term120675.getClass(), "_valueHandler", null);
        setField(term120675, term120675.getClass(), "_typeHandler", null);
        setBooleanField(term120675, term120675.getClass(), "_asStatic", false);
        setField(term120673, term120673.getClass(), "_valueType", term120675);
        setField(term120673, term120673.getClass(), "_rootDeserializer", null);
        setField(term120673, term120673.getClass(), "_valueToUpdate", null);
        setField(term120673, term120673.getClass(), "_schema", null);
        setField(term120673, term120673.getClass(), "_injectableValues", null);
        setField(term120673, term120673.getClass(), "_dataFormatReaders", null);
        setField(term120676, term120676.getClass(), "table", null);
        setField(term120676, term120676.getClass(), "nextTable", null);
        setLongField(term120676, term120676.getClass(), "baseCount", 0L);
        setIntField(term120676, term120676.getClass(), "sizeCtl", 0);
        setIntField(term120676, term120676.getClass(), "transferIndex", 0);
        setIntField(term120676, term120676.getClass(), "cellsBusy", 0);
        setField(term120676, term120676.getClass(), "counterCells", null);
        setField(term120676, term120676.getClass(), "keySet", null);
        setField(term120676, term120676.getClass(), "values", null);
        setField(term120676, term120676.getClass(), "entrySet", null);
        setField(term120676, term120676.getClass(), "keySet", null);
        setField(term120676, term120676.getClass(), "values", null);
        setField(term120673, term120673.getClass(), "_rootDeserializers", term120676);
        term120677 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term120677, term120677.getClass(), "_problemHandlers", null);
        setField(term120677, term120677.getClass(), "_nodeFactory", null);
        setIntField(term120677, term120677.getClass(), "_deserFeatures", -1);
        setIntField(term120677, term120677.getClass(), "_parserFeatures", 0);
        setIntField(term120677, term120677.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term120677, term120677.getClass(), "_formatReadFeatures", 0);
        setIntField(term120677, term120677.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term120677, term120677.getClass(), "_mixIns", null);
        setField(term120677, term120677.getClass(), "_subtypeResolver", null);
        setField(term120677, term120677.getClass(), "_rootName", null);
        setField(term120677, term120677.getClass(), "_view", null);
        setField(term120677, term120677.getClass(), "_attributes", null);
        setField(term120677, term120677.getClass(), "_rootNames", null);
        setIntField(term120677, term120677.getClass(), "_mapperFeatures", 0);
        setField(term120677, term120677.getClass(), "_base", null);
        term120678 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term120679 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term120678, term120678.getClass(), "_config", null);
        setField(term120678, term120678.getClass(), "_context", null);
        setField(term120678, term120678.getClass(), "_parserFactory", null);
        setBooleanField(term120678, term120678.getClass(), "_unwrapRoot", false);
        setField(term120678, term120678.getClass(), "_filter", null);
        setField(term120678, term120678.getClass(), "_valueType", null);
        setField(term120678, term120678.getClass(), "_rootDeserializer", null);
        setField(term120678, term120678.getClass(), "_valueToUpdate", null);
        setField(term120678, term120678.getClass(), "_schema", null);
        setField(term120678, term120678.getClass(), "_injectableValues", null);
        setField(term120678, term120678.getClass(), "_dataFormatReaders", null);
        setField(term120679, term120679.getClass(), "table", null);
        setField(term120679, term120679.getClass(), "nextTable", null);
        setLongField(term120679, term120679.getClass(), "baseCount", 0L);
        setIntField(term120679, term120679.getClass(), "sizeCtl", 0);
        setIntField(term120679, term120679.getClass(), "transferIndex", 0);
        setIntField(term120679, term120679.getClass(), "cellsBusy", 0);
        setField(term120679, term120679.getClass(), "counterCells", null);
        setField(term120679, term120679.getClass(), "keySet", null);
        setField(term120679, term120679.getClass(), "values", null);
        setField(term120679, term120679.getClass(), "entrySet", null);
        setField(term120679, term120679.getClass(), "keySet", null);
        setField(term120679, term120679.getClass(), "values", null);
        setField(term120678, term120678.getClass(), "_rootDeserializers", term120679);
        term120680 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term120680, term120680.getClass(), "_referencedType", null);
        setField(term120680, term120680.getClass(), "_superClass", null);
        setField(term120680, term120680.getClass(), "_superInterfaces", null);
        setField(term120680, term120680.getClass(), "_bindings", null);
        setField(term120680, term120680.getClass(), "_canonicalName", null);
        setField(term120680, term120680.getClass(), "_class", null);
        setIntField(term120680, term120680.getClass(), "_hash", 0);
        setField(term120680, term120680.getClass(), "_valueHandler", null);
        setField(term120680, term120680.getClass(), "_typeHandler", null);
        setBooleanField(term120680, term120680.getClass(), "_asStatic", false);
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
        args[0] = term120312;
        args[1] = term120504;
        args[2] = term120624;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term120673));
        assertTrue(recursiveEquals(term120312, term120677));
        assertTrue(recursiveEquals(term120504, term120678));
        assertTrue(recursiveEquals(term120624, term120680));
    }

};


