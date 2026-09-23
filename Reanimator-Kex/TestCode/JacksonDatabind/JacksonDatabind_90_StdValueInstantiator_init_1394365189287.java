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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326219;

    public StdValueInstantiator_init_1394365189287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term326115 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term326255 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        Class<? extends Object> term327737 = Class.forName((String) "java.util.stream.Nodes$InternalNodeSpliterator$OfInt");
        Class term327728 = Array.newInstance(term327737, 0).getClass();
        Class term327713 = Array.newInstance(term327728, 0).getClass();
        Class term326421 = Array.newInstance(term327713, 0).getClass();
        Class<? extends Object> term326729 = Class.forName((String) "java.util.concurrent.atomic.AtomicIntegerFieldUpdater$AtomicIntegerFieldUpdaterImpl");
        term326219 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term326385 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term326551 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term326693 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term326219, term326219.getClass(), "_class", term326255);
        setField(term326385, term326385.getClass(), "_canonicalName", null);
        setField(term326385, term326385.getClass(), "_class", term326421);
        setField(term326551, term326551.getClass(), "_canonicalName", "");
        setField(term326385, term326385.getClass(), "_keyType", term326551);
        setField(term326693, term326693.getClass(), "_canonicalName", null);
        setField(term326693, term326693.getClass(), "_class", term326729);
        setField(term326385, term326385.getClass(), "_valueType", term326693);
        setField(term326219, term326219.getClass(), "_referencedType", term326385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term326219;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


