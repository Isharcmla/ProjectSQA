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

public class JavaUtilCollectionsDeserializers_converter_180689703376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354561;
     Object term355297;

    public JavaUtilCollectionsDeserializers_converter_180689703376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term354597 = Class.forName((String) "java.lang.System$Logger");
        Class<? extends Object> term354737 = Class.forName((String) "java.util.Scanner$PatternLRUCache");
        Class<? extends Object> term355013 = Class.forName((String) "java.lang.StringCoding$1");
        Class<? extends Object> term355169 = Class.forName((String) "java.io.SerializablePermission");
        term354561 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term354701 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term354857 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term354977 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term355133 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term355261 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term354561, term354561.getClass(), "_class", term354597);
        setField(term354701, term354701.getClass(), "_class", term354737);
        setField(term354857, term354857.getClass(), "_class", null);
        setField(term354977, term354977.getClass(), "_class", term355013);
        setField(term355133, term355133.getClass(), "_class", term355169);
        setField(term355133, term355133.getClass(), "_superClass", term355261);
        setField(term354977, term354977.getClass(), "_superClass", term355133);
        setField(term354857, term354857.getClass(), "_superClass", term354977);
        setField(term354701, term354701.getClass(), "_superClass", term354857);
        setField(term354561, term354561.getClass(), "_superClass", term354701);
        term355297 = Class.forName((String) "java.lang.StringUTF16");
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
        args[1] = term354561;
        args[2] = term355297;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


