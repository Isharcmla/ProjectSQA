package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339681;

    public StdValueInstantiator_init_1394365189295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term339577 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term339717 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        Class term339895 = byte.class;
        Class<? extends Object> term340075 = Class.forName((String) "java.lang.Object");
        Class<? extends Object> term340255 = Class.forName((String) "kex.java.util.HashMap$KeySet");
        term339681 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term339859 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term340039 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term340219 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term339681, term339681.getClass(), "_class", term339717);
        setField(term339859, term339859.getClass(), "_canonicalName", null);
        setField(term339859, term339859.getClass(), "_class", term339895);
        setField(term340039, term340039.getClass(), "_canonicalName", null);
        setField(term340039, term340039.getClass(), "_class", term340075);
        setField(term340219, term340219.getClass(), "_canonicalName", null);
        setField(term340219, term340219.getClass(), "_class", term340255);
        setField(term340039, term340039.getClass(), "_elementType", term340219);
        setField(term339859, term339859.getClass(), "_referencedType", term340039);
        setField(term339681, term339681.getClass(), "_referencedType", term339859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term339681;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


