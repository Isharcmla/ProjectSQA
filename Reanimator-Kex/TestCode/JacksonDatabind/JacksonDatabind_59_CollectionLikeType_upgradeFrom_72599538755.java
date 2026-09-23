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

public class CollectionLikeType_upgradeFrom_72599538755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7555;
     Object term7585;
     Object term7576;

    public CollectionLikeType_upgradeFrom_72599538755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7555 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term7585 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term7585, term7585.getClass(), "_referencedType", null);
        setField(term7585, term7585.getClass(), "_superClass", null);
        setField(term7585, term7585.getClass(), "_superInterfaces", null);
        setField(term7585, term7585.getClass(), "_bindings", null);
        setField(term7585, term7585.getClass(), "_canonicalName", null);
        setField(term7585, term7585.getClass(), "_class", null);
        setIntField(term7585, term7585.getClass(), "_hash", 0);
        setField(term7585, term7585.getClass(), "_valueHandler", null);
        setField(term7585, term7585.getClass(), "_typeHandler", null);
        setBooleanField(term7585, term7585.getClass(), "_asStatic", false);
        term7576 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term7576, term7576.getClass(), "_elementType", null);
        setField(term7576, term7576.getClass(), "_superClass", null);
        setField(term7576, term7576.getClass(), "_superInterfaces", null);
        setField(term7576, term7576.getClass(), "_bindings", null);
        setField(term7576, term7576.getClass(), "_canonicalName", null);
        setField(term7576, term7576.getClass(), "_class", null);
        setIntField(term7576, term7576.getClass(), "_hash", 0);
        setField(term7576, term7576.getClass(), "_valueHandler", null);
        setField(term7576, term7576.getClass(), "_typeHandler", null);
        setBooleanField(term7576, term7576.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = term7555;
        args[1] = null;
        Object retValue = callMethod(klass, "upgradeFrom", argTypes, null, args);
        assertTrue(recursiveEquals(term7555, null));
        assertTrue(recursiveEquals(retValue, term7576));
    }

};


