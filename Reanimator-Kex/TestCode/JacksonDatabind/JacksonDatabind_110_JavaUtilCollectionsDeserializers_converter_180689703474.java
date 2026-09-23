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

public class JavaUtilCollectionsDeserializers_converter_180689703474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484648;
     Object term485046;

    public JavaUtilCollectionsDeserializers_converter_180689703474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term484684 = Class.forName((String) "java.lang.VirtualMachineError");
        Class<? extends Object> term484812 = Class.forName((String) "java.io.ObjectStreamClass$ClassDataSlot");
        term484648 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term484776 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term484904 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term485010 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term484648, term484648.getClass(), "_class", term484684);
        setField(term484776, term484776.getClass(), "_class", term484812);
        setField(term484904, term484904.getClass(), "_class", term484812);
        setField(term485010, term485010.getClass(), "_class", null);
        setField(term485010, term485010.getClass(), "_superClass", null);
        setField(term484904, term484904.getClass(), "_superClass", term485010);
        setField(term484776, term484776.getClass(), "_superClass", term484904);
        setField(term484648, term484648.getClass(), "_superClass", term484776);
        term485046 = Class.forName((String) "java.io.InputStream");
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
        args[1] = term484648;
        args[2] = term485046;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


