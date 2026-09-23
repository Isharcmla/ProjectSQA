package com.fasterxml.jackson.databind.introspect;

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
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ObjectIdInfo_init_184786796128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5103;
     Object term5139;
     Object term5175;
     Object term5211;

    public ObjectIdInfo_init_184786796128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5011 = Class.forName((String) "com.fasterxml.jackson.databind.exc.IgnoredPropertyException");
        Object term4883 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Object term4975 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term4883, term4883.getClass(), "_propertyName", term4975);
        setField(term4883, term4883.getClass(), "_scope", term5011);
        setField(term4883, term4883.getClass(), "_generator", null);
        setBooleanField(term4883, term4883.getClass(), "_alwaysAsId", false);
        term5103 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term5139 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$ValueIterator");
        term5175 = Class.forName((String) "java.nio.HeapDoubleBuffer");
        term5211 = Class.forName((String) "java.io.FileSystem");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.ObjectIdInfo");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.lang.Class");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Class");
        Object[] args = new Object[5];
        args[0] = term5103;
        args[1] = term5139;
        args[2] = term5175;
        args[3] = true;
        args[4] = term5211;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


