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

public class ReferenceType_upgradeFrom_139116921160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8544;
     Object term8664;
     Object term9392;
     Object term9393;
     Object term9380;

    public ReferenceType_upgradeFrom_139116921160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8544 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term8664 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term9392 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term9392, term9392.getClass(), "_referencedType", null);
        setField(term9392, term9392.getClass(), "_superClass", null);
        setField(term9392, term9392.getClass(), "_superInterfaces", null);
        setField(term9392, term9392.getClass(), "_bindings", null);
        setField(term9392, term9392.getClass(), "_canonicalName", null);
        setField(term9392, term9392.getClass(), "_class", null);
        setIntField(term9392, term9392.getClass(), "_hash", 0);
        setField(term9392, term9392.getClass(), "_valueHandler", null);
        setField(term9392, term9392.getClass(), "_typeHandler", null);
        setBooleanField(term9392, term9392.getClass(), "_asStatic", false);
        term9393 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term9393, term9393.getClass(), "_referencedType", null);
        setField(term9393, term9393.getClass(), "_anchorType", null);
        setField(term9393, term9393.getClass(), "_superClass", null);
        setField(term9393, term9393.getClass(), "_superInterfaces", null);
        setField(term9393, term9393.getClass(), "_bindings", null);
        setField(term9393, term9393.getClass(), "_canonicalName", null);
        setField(term9393, term9393.getClass(), "_class", null);
        setIntField(term9393, term9393.getClass(), "_hash", 0);
        setField(term9393, term9393.getClass(), "_valueHandler", null);
        setField(term9393, term9393.getClass(), "_typeHandler", null);
        setBooleanField(term9393, term9393.getClass(), "_asStatic", false);
        term9380 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term9381 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term9381, term9381.getClass(), "_referencedType", null);
        setField(term9381, term9381.getClass(), "_superClass", null);
        setField(term9381, term9381.getClass(), "_superInterfaces", null);
        setField(term9381, term9381.getClass(), "_bindings", null);
        setField(term9381, term9381.getClass(), "_canonicalName", null);
        setField(term9381, term9381.getClass(), "_class", null);
        setIntField(term9381, term9381.getClass(), "_hash", 0);
        setField(term9381, term9381.getClass(), "_valueHandler", null);
        setField(term9381, term9381.getClass(), "_typeHandler", null);
        setBooleanField(term9381, term9381.getClass(), "_asStatic", false);
        setField(term9380, term9380.getClass(), "_referencedType", term9381);
        setField(term9380, term9380.getClass(), "_anchorType", term9380);
        setField(term9380, term9380.getClass(), "_superClass", null);
        setField(term9380, term9380.getClass(), "_superInterfaces", null);
        setField(term9380, term9380.getClass(), "_bindings", null);
        setField(term9380, term9380.getClass(), "_canonicalName", null);
        setField(term9380, term9380.getClass(), "_class", null);
        setIntField(term9380, term9380.getClass(), "_hash", 0);
        setField(term9380, term9380.getClass(), "_valueHandler", null);
        setField(term9380, term9380.getClass(), "_typeHandler", null);
        setBooleanField(term9380, term9380.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.ReferenceType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = term8544;
        args[1] = term8664;
        Object retValue = callMethod(klass, "upgradeFrom", argTypes, null, args);
        assertTrue(recursiveEquals(term8544, term9392));
        assertTrue(recursiveEquals(term8664, term9393));
        assertTrue(recursiveEquals(retValue, term9380));
    }

};


