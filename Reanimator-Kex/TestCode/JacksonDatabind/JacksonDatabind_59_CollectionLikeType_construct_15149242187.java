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

public class CollectionLikeType_construct_15149242187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16083;
     Object term16183;
     Object term17583;
     Object term17584;
     Object term17449;

    public CollectionLikeType_construct_15149242187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16083 = Class.forName((String) "java.util.stream.IntPipeline$4$1");
        term16183 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setIntField(term16183, term16183.getClass(), "_hash", 0);
        term17583 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term17583, term17583.getClass(), "_keyType", null);
        setField(term17583, term17583.getClass(), "_valueType", null);
        setField(term17583, term17583.getClass(), "_superClass", null);
        setField(term17583, term17583.getClass(), "_superInterfaces", null);
        setField(term17583, term17583.getClass(), "_bindings", null);
        setField(term17583, term17583.getClass(), "_canonicalName", null);
        setField(term17583, term17583.getClass(), "_class", null);
        setIntField(term17583, term17583.getClass(), "_hash", 0);
        setField(term17583, term17583.getClass(), "_valueHandler", null);
        setField(term17583, term17583.getClass(), "_typeHandler", null);
        setBooleanField(term17583, term17583.getClass(), "_asStatic", false);
        term17584 = Class.forName((String) "com.fasterxml.jackson.databind.node.DoubleNode");
        Class<? extends Object> term17454 = Class.forName((String) "com.fasterxml.jackson.databind.node.DoubleNode");
        term17449 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term17446 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term17450 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term17451 = (Object[]) newArray("java.lang.String", 0);
        Object[] term17452 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term17446, term17446.getClass(), "_keyType", null);
        setField(term17446, term17446.getClass(), "_valueType", null);
        setField(term17446, term17446.getClass(), "_superClass", null);
        setField(term17446, term17446.getClass(), "_superInterfaces", null);
        setField(term17446, term17446.getClass(), "_bindings", null);
        setField(term17446, term17446.getClass(), "_canonicalName", null);
        setField(term17446, term17446.getClass(), "_class", null);
        setIntField(term17446, term17446.getClass(), "_hash", 0);
        setField(term17446, term17446.getClass(), "_valueHandler", null);
        setField(term17446, term17446.getClass(), "_typeHandler", null);
        setBooleanField(term17446, term17446.getClass(), "_asStatic", false);
        setField(term17449, term17449.getClass(), "_elementType", term17446);
        setField(term17449, term17449.getClass(), "_superClass", null);
        setField(term17449, term17449.getClass(), "_superInterfaces", null);
        setField(term17450, term17450.getClass(), "_names", term17451);
        setField(term17450, term17450.getClass(), "_types", term17452);
        setField(term17450, term17450.getClass(), "_unboundVariables", null);
        setIntField(term17450, term17450.getClass(), "_hashCode", 1);
        setField(term17449, term17449.getClass(), "_bindings", term17450);
        setField(term17449, term17449.getClass(), "_canonicalName", null);
        setField(term17449, term17449.getClass(), "_class", term17454);
        setIntField(term17449, term17449.getClass(), "_hash", -1657472192);
        setField(term17449, term17449.getClass(), "_valueHandler", null);
        setField(term17449, term17449.getClass(), "_typeHandler", null);
        setBooleanField(term17449, term17449.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[5];
        args[0] = term16083;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term16183;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term16083, term17583));
        assertTrue(recursiveEquals(term16183, null));
        assertTrue(recursiveEquals(retValue, term17449));
    }

};


