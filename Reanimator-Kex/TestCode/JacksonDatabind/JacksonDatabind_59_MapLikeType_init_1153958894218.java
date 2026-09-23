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
import java.lang.Object;
import java.lang.String;

public class MapLikeType_init_1153958894218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95914;
     Object term96010;
     Object term96124;
     Object term96643;
     Object term96668;
     Object term96669;
     Object term96670;

    public MapLikeType_init_1153958894218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term95878 = Class.forName((String) "java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory");
        Object term95842 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term95842, term95842.getClass(), "_class", term95878);
        term95914 = Class.forName((String) "java.util.ArrayList$ArrayListSpliterator");
        term96010 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term96010, term96010.getClass(), "_hash", 0);
        term96124 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setIntField(term96124, term96124.getClass(), "_hash", 0);
        Class<? extends Object> term96649 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonUnwrapped");
        term96643 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term96644 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term96645 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term96646 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term96647 = (Object[]) newArray("java.lang.String", 0);
        Object[] term96648 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term96644, term96644.getClass(), "_componentType", null);
        setField(term96644, term96644.getClass(), "_emptyArray", null);
        setField(term96644, term96644.getClass(), "_superClass", null);
        setField(term96644, term96644.getClass(), "_superInterfaces", null);
        setField(term96644, term96644.getClass(), "_bindings", null);
        setField(term96644, term96644.getClass(), "_canonicalName", null);
        setField(term96644, term96644.getClass(), "_class", null);
        setIntField(term96644, term96644.getClass(), "_hash", 0);
        setField(term96644, term96644.getClass(), "_valueHandler", null);
        setField(term96644, term96644.getClass(), "_typeHandler", null);
        setBooleanField(term96644, term96644.getClass(), "_asStatic", false);
        setField(term96643, term96643.getClass(), "_keyType", term96644);
        setField(term96645, term96645.getClass(), "_elementType", null);
        setField(term96645, term96645.getClass(), "_superClass", null);
        setField(term96645, term96645.getClass(), "_superInterfaces", null);
        setField(term96645, term96645.getClass(), "_bindings", null);
        setField(term96645, term96645.getClass(), "_canonicalName", null);
        setField(term96645, term96645.getClass(), "_class", null);
        setIntField(term96645, term96645.getClass(), "_hash", 0);
        setField(term96645, term96645.getClass(), "_valueHandler", null);
        setField(term96645, term96645.getClass(), "_typeHandler", null);
        setBooleanField(term96645, term96645.getClass(), "_asStatic", false);
        setField(term96643, term96643.getClass(), "_valueType", term96645);
        setField(term96643, term96643.getClass(), "_superClass", null);
        setField(term96643, term96643.getClass(), "_superInterfaces", null);
        setField(term96646, term96646.getClass(), "_names", term96647);
        setField(term96646, term96646.getClass(), "_types", term96648);
        setField(term96646, term96646.getClass(), "_unboundVariables", null);
        setIntField(term96646, term96646.getClass(), "_hashCode", 1);
        setField(term96643, term96643.getClass(), "_bindings", term96646);
        setField(term96643, term96643.getClass(), "_canonicalName", null);
        setField(term96643, term96643.getClass(), "_class", term96649);
        setIntField(term96643, term96643.getClass(), "_hash", 2111164013);
        setField(term96643, term96643.getClass(), "_valueHandler", null);
        setField(term96643, term96643.getClass(), "_typeHandler", null);
        setBooleanField(term96643, term96643.getClass(), "_asStatic", false);
        term96668 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term96668, term96668.getClass(), "_componentType", null);
        setField(term96668, term96668.getClass(), "_emptyArray", null);
        setField(term96668, term96668.getClass(), "_superClass", null);
        setField(term96668, term96668.getClass(), "_superInterfaces", null);
        setField(term96668, term96668.getClass(), "_bindings", null);
        setField(term96668, term96668.getClass(), "_canonicalName", null);
        setField(term96668, term96668.getClass(), "_class", null);
        setIntField(term96668, term96668.getClass(), "_hash", 0);
        setField(term96668, term96668.getClass(), "_valueHandler", null);
        setField(term96668, term96668.getClass(), "_typeHandler", null);
        setBooleanField(term96668, term96668.getClass(), "_asStatic", false);
        term96669 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term96669, term96669.getClass(), "_elementType", null);
        setField(term96669, term96669.getClass(), "_superClass", null);
        setField(term96669, term96669.getClass(), "_superInterfaces", null);
        setField(term96669, term96669.getClass(), "_bindings", null);
        setField(term96669, term96669.getClass(), "_canonicalName", null);
        setField(term96669, term96669.getClass(), "_class", null);
        setIntField(term96669, term96669.getClass(), "_hash", 0);
        setField(term96669, term96669.getClass(), "_valueHandler", null);
        setField(term96669, term96669.getClass(), "_typeHandler", null);
        setBooleanField(term96669, term96669.getClass(), "_asStatic", false);
        term96670 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonUnwrapped");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term95914;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term96010;
        args[5] = term96124;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term96643));
        assertTrue(recursiveEquals(term95914, term96668));
        assertTrue(recursiveEquals(term96010, null));
        assertTrue(recursiveEquals(term96124, false));
    }

};


