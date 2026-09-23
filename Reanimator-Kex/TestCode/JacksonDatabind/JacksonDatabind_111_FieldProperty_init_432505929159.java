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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;

public class FieldProperty_init_432505929159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126471;
     Object term126745;
     Object term126761;
     Object term126764;
     Object term126766;

    public FieldProperty_init_432505929159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term125945 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term126045 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term126149 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term126241 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term126355 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.NioPathDeserializer"));
        setField(term125945, term125945.getClass(), "_metadata", term126045);
        setField(term125945, term125945.getClass(), "_propertyFormat", term126149);
        setIntField(term125945, term125945.getClass(), "_propertyIndex", 0);
        setField(term125945, term125945.getClass(), "_propName", term126241);
        setField(term125945, term125945.getClass(), "_type", null);
        setField(term125945, term125945.getClass(), "_wrapperName", null);
        setField(term125945, term125945.getClass(), "_contextAnnotations", null);
        setField(term125945, term125945.getClass(), "_valueTypeDeserializer", null);
        setField(term125945, term125945.getClass(), "_managedReferenceName", null);
        setField(term125945, term125945.getClass(), "_valueDeserializer", term126355);
        setField(term125945, term125945.getClass(), "_viewMatcher", null);
        term126471 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term126591 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term126471, term126471.getClass(), "_metadata", null);
        setField(term126471, term126471.getClass(), "_propertyFormat", null);
        setField(term126471, term126471.getClass(), "_propName", null);
        setField(term126471, term126471.getClass(), "_type", term126591);
        setField(term126471, term126471.getClass(), "_wrapperName", null);
        setField(term126471, term126471.getClass(), "_contextAnnotations", null);
        setField(term126471, term126471.getClass(), "_valueTypeDeserializer", null);
        setField(term126471, term126471.getClass(), "_managedReferenceName", null);
        setIntField(term126471, term126471.getClass(), "_propertyIndex", 0);
        setField(term126471, term126471.getClass(), "_viewMatcher", null);
        term126745 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla"));
        term126761 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term126762 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term126763 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla"));
        setField(term126761, term126761.getClass(), "_annotated", null);
        setField(term126761, term126761.getClass(), "_field", null);
        setBooleanField(term126761, term126761.getClass(), "_skipNulls", false);
        setField(term126761, term126761.getClass(), "_propName", null);
        setField(term126762, term126762.getClass(), "_referencedType", null);
        setField(term126762, term126762.getClass(), "_superClass", null);
        setField(term126762, term126762.getClass(), "_superInterfaces", null);
        setField(term126762, term126762.getClass(), "_bindings", null);
        setField(term126762, term126762.getClass(), "_canonicalName", null);
        setField(term126762, term126762.getClass(), "_class", null);
        setIntField(term126762, term126762.getClass(), "_hash", 0);
        setField(term126762, term126762.getClass(), "_valueHandler", null);
        setField(term126762, term126762.getClass(), "_typeHandler", null);
        setBooleanField(term126762, term126762.getClass(), "_asStatic", false);
        setField(term126761, term126761.getClass(), "_type", term126762);
        setField(term126761, term126761.getClass(), "_wrapperName", null);
        setField(term126761, term126761.getClass(), "_contextAnnotations", null);
        setBooleanField(term126763, term126763.getClass(), "_nonMerging", false);
        setField(term126763, term126763.getClass(), "_valueClass", null);
        setField(term126761, term126761.getClass(), "_valueDeserializer", term126763);
        setField(term126761, term126761.getClass(), "_valueTypeDeserializer", null);
        setField(term126761, term126761.getClass(), "_nullProvider", null);
        setField(term126761, term126761.getClass(), "_managedReferenceName", null);
        setField(term126761, term126761.getClass(), "_objectIdInfo", null);
        setField(term126761, term126761.getClass(), "_viewMatcher", null);
        setIntField(term126761, term126761.getClass(), "_propertyIndex", 0);
        setField(term126761, term126761.getClass(), "_metadata", null);
        setField(term126761, term126761.getClass(), "_propertyFormat", null);
        setField(term126761, term126761.getClass(), "_aliases", null);
        term126764 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term126765 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term126764, term126764.getClass(), "_annotated", null);
        setField(term126764, term126764.getClass(), "_field", null);
        setBooleanField(term126764, term126764.getClass(), "_skipNulls", false);
        setField(term126764, term126764.getClass(), "_propName", null);
        setField(term126765, term126765.getClass(), "_referencedType", null);
        setField(term126765, term126765.getClass(), "_superClass", null);
        setField(term126765, term126765.getClass(), "_superInterfaces", null);
        setField(term126765, term126765.getClass(), "_bindings", null);
        setField(term126765, term126765.getClass(), "_canonicalName", null);
        setField(term126765, term126765.getClass(), "_class", null);
        setIntField(term126765, term126765.getClass(), "_hash", 0);
        setField(term126765, term126765.getClass(), "_valueHandler", null);
        setField(term126765, term126765.getClass(), "_typeHandler", null);
        setBooleanField(term126765, term126765.getClass(), "_asStatic", false);
        setField(term126764, term126764.getClass(), "_type", term126765);
        setField(term126764, term126764.getClass(), "_wrapperName", null);
        setField(term126764, term126764.getClass(), "_contextAnnotations", null);
        setField(term126764, term126764.getClass(), "_valueDeserializer", null);
        setField(term126764, term126764.getClass(), "_valueTypeDeserializer", null);
        setField(term126764, term126764.getClass(), "_nullProvider", null);
        setField(term126764, term126764.getClass(), "_managedReferenceName", null);
        setField(term126764, term126764.getClass(), "_objectIdInfo", null);
        setField(term126764, term126764.getClass(), "_viewMatcher", null);
        setIntField(term126764, term126764.getClass(), "_propertyIndex", 0);
        setField(term126764, term126764.getClass(), "_metadata", null);
        setField(term126764, term126764.getClass(), "_propertyFormat", null);
        setField(term126764, term126764.getClass(), "_aliases", null);
        term126766 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla"));
        setBooleanField(term126766, term126766.getClass(), "_nonMerging", false);
        setField(term126766, term126766.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term126471;
        args[1] = term126745;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term126761));
        assertTrue(recursiveEquals(term126471, term126764));
        assertTrue(recursiveEquals(term126745, term126766));
    }

};


