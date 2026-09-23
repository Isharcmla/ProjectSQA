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

public class CollectionLikeType_upgradeFrom_72599538753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6630;
     Object term7566;
     Object term7557;

    public CollectionLikeType_upgradeFrom_72599538753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6630 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term7566 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term7566, term7566.getClass(), "_keyType", null);
        setField(term7566, term7566.getClass(), "_valueType", null);
        setField(term7566, term7566.getClass(), "_superClass", null);
        setField(term7566, term7566.getClass(), "_superInterfaces", null);
        setField(term7566, term7566.getClass(), "_bindings", null);
        setField(term7566, term7566.getClass(), "_canonicalName", null);
        setField(term7566, term7566.getClass(), "_class", null);
        setIntField(term7566, term7566.getClass(), "_hash", 0);
        setField(term7566, term7566.getClass(), "_valueHandler", null);
        setField(term7566, term7566.getClass(), "_typeHandler", null);
        setBooleanField(term7566, term7566.getClass(), "_asStatic", false);
        term7557 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term7557, term7557.getClass(), "_elementType", null);
        setField(term7557, term7557.getClass(), "_superClass", null);
        setField(term7557, term7557.getClass(), "_superInterfaces", null);
        setField(term7557, term7557.getClass(), "_bindings", null);
        setField(term7557, term7557.getClass(), "_canonicalName", null);
        setField(term7557, term7557.getClass(), "_class", null);
        setIntField(term7557, term7557.getClass(), "_hash", 0);
        setField(term7557, term7557.getClass(), "_valueHandler", null);
        setField(term7557, term7557.getClass(), "_typeHandler", null);
        setBooleanField(term7557, term7557.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = term6630;
        args[1] = null;
        Object retValue = callMethod(klass, "upgradeFrom", argTypes, null, args);
        assertTrue(recursiveEquals(term6630, null));
        assertTrue(recursiveEquals(retValue, term7557));
    }

};


