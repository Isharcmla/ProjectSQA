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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class BeanPropertyWriter_init_401600180113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15577;
     Object term16341;

    public BeanPropertyWriter_init_401600180113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21463 = Class.forName((String) "java.util.stream.Nodes$AbstractConcNode");
        Object[] term21632 = (Object[]) newArray("java.lang.Class", 0);
        Method term15413 = ((Class) term21463).getDeclaredMethod((String) "count", (Class[]) term21632);
        ((Method) term15413).setAccessible(false);
        Class<? extends Object> term21634 = Class.forName((String) "java.util.Collections$SynchronizedList");
        Field term15465 = ((Class) term21634).getDeclaredField((String) "serialVersionUID");
        ((Field) term15465).setAccessible(false);
        Object term14827 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term14925 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term15017 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term15151 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term15267 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term15831 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term14827, term14827.getClass(), "_name", term14925);
        setField(term14827, term14827.getClass(), "_wrapperName", term15017);
        setField(term14827, term14827.getClass(), "_member", term15151);
        setField(term14827, term14827.getClass(), "_contextAnnotations", term15267);
        setField(term14827, term14827.getClass(), "_declaredType", term15831);
        setField(term14827, term14827.getClass(), "_accessorMethod", term15413);
        setField(term14827, term14827.getClass(), "_field", term15465);
        setField(term14827, term14827.getClass(), "_serializer", null);
        setField(term14827, term14827.getClass(), "_nullSerializer", null);
        Class<? extends Object> term22126 = Class.forName((String) "java.util.stream.ReduceOps$2ReducingSink");
        Class<? extends Object> term22345 = Class.forName((String) "java.util.stream.ReduceOps$2ReducingSink");
        Object[] term22346 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term22346, 0, term22345);
        Method term15885 = ((Class) term22126).getDeclaredMethod((String) "combine", (Class[]) term22346);
        ((Method) term15885).setAccessible(false);
        Class<? extends Object> term22468 = Class.forName((String) "java.lang.FdLibm$Hypot");
        Field term15937 = ((Class) term22468).getDeclaredField((String) "TWO_MINUS_600");
        ((Field) term15937).setAccessible(false);
        HashMap term16243 = new HashMap();
        term15577 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term15669 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term15785 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term16047 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.RawSerializer"));
        Object term16195 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer"));
        setField(term15577, term15577.getClass(), "_wrapperName", term15669);
        setField(term15577, term15577.getClass(), "_member", null);
        setField(term15577, term15577.getClass(), "_contextAnnotations", term15785);
        setField(term15577, term15577.getClass(), "_declaredType", term15831);
        setField(term15577, term15577.getClass(), "_accessorMethod", term15885);
        setField(term15577, term15577.getClass(), "_field", term15937);
        setField(term15577, term15577.getClass(), "_serializer", term16047);
        setField(term15577, term15577.getClass(), "_nullSerializer", term16195);
        setField(term15577, term15577.getClass(), "_internalSettings", term16243);
        term16341 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.io.SerializedString");
        Object[] args = new Object[2];
        args[0] = term15577;
        args[1] = term16341;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


