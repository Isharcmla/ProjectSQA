package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class SimpleType_constructUnsafe_38941743446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6221;
     Object term7916;
     Object term7766;

    public SimpleType_constructUnsafe_38941743446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6221 = Class.forName((String) "java.nio.file.LinkOption");
        term7916 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase");
        Class<? extends Object> term7771 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase");
        term7766 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term7767 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term7768 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7769 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term7766, term7766.getClass(), "_superClass", null);
        setField(term7766, term7766.getClass(), "_superInterfaces", null);
        setField(term7767, term7767.getClass(), "_names", term7768);
        setField(term7767, term7767.getClass(), "_types", term7769);
        setField(term7767, term7767.getClass(), "_unboundVariables", null);
        setIntField(term7767, term7767.getClass(), "_hashCode", 1);
        setField(term7766, term7766.getClass(), "_bindings", term7767);
        setField(term7766, term7766.getClass(), "_canonicalName", null);
        setField(term7766, term7766.getClass(), "_class", term7771);
        setIntField(term7766, term7766.getClass(), "_hash", -1003557006);
        setField(term7766, term7766.getClass(), "_valueHandler", null);
        setField(term7766, term7766.getClass(), "_typeHandler", null);
        setBooleanField(term7766, term7766.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = term6221;
        Object retValue = callMethod(klass, "constructUnsafe", argTypes, null, args);
        assertTrue(recursiveEquals(term6221, term7916));
        assertTrue(recursiveEquals(retValue, term7766));
    }

};


