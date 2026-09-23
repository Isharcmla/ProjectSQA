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

public class JavaUtilCollectionsDeserializers_converter_180689703421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409078;
     Object term409832;

    public JavaUtilCollectionsDeserializers_converter_180689703421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term409114 = Class.forName((String) "java.util.DoubleSummaryStatistics");
        Class<? extends Object> term409254 = Class.forName((String) "java.nio.file.TempFileHelper$PosixPermissions");
        Class<? extends Object> term409410 = Class.forName((String) "java.nio.DirectByteBuffer$Deallocator");
        Class<? extends Object> term409566 = Class.forName((String) "java.util.zip.CheckedInputStream");
        term409832 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$EntrySpliterator");
        term409078 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term409218 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term409374 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term409530 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term409686 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term409778 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term409078, term409078.getClass(), "_class", term409114);
        setField(term409218, term409218.getClass(), "_class", term409254);
        setField(term409374, term409374.getClass(), "_class", term409410);
        setField(term409530, term409530.getClass(), "_class", term409566);
        setField(term409686, term409686.getClass(), "_class", null);
        setField(term409778, term409778.getClass(), "_class", term409832);
        setField(term409686, term409686.getClass(), "_superClass", term409778);
        setField(term409530, term409530.getClass(), "_superClass", term409686);
        setField(term409374, term409374.getClass(), "_superClass", term409530);
        setField(term409218, term409218.getClass(), "_superClass", term409374);
        setField(term409078, term409078.getClass(), "_superClass", term409218);
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
        args[1] = term409078;
        args[2] = term409832;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


