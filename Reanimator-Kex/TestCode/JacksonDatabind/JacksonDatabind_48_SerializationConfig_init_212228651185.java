package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class SerializationConfig_init_212228651185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107562;

    public SerializationConfig_init_212228651185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105291 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term105291, term105291.getClass(), "_base", null);
        setIntField(term105291, term105291.getClass(), "_mapperFeatures", 0);
        setField(term105291, term105291.getClass(), "_mixIns", null);
        setField(term105291, term105291.getClass(), "_subtypeResolver", null);
        setField(term105291, term105291.getClass(), "_rootNames", null);
        setField(term105291, term105291.getClass(), "_rootName", null);
        setField(term105291, term105291.getClass(), "_view", null);
        setField(term105291, term105291.getClass(), "_attributes", null);
        Class<? extends Object> term107613 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term107612 = ((Class) term107613).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term107612).setAccessible(true);
        Object enum20 = ((Field) term107612).get((Object) null);
        term107562 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term107563 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term107564 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term107565 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term107566 = (char[]) newCharArray(32);
        Object term107569 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term107572 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term107576 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term107577 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term107562, term107562.getClass(), "_filterProvider", null);
        setField(term107563, term107563.getClass(), "_arrayIndenter", term107564);
        setCharElement(term107566, 0, (char) 32);
        setCharElement(term107566, 1, (char) 32);
        setCharElement(term107566, 2, (char) 32);
        setCharElement(term107566, 3, (char) 32);
        setCharElement(term107566, 4, (char) 32);
        setCharElement(term107566, 5, (char) 32);
        setCharElement(term107566, 6, (char) 32);
        setCharElement(term107566, 7, (char) 32);
        setCharElement(term107566, 8, (char) 32);
        setCharElement(term107566, 9, (char) 32);
        setCharElement(term107566, 10, (char) 32);
        setCharElement(term107566, 11, (char) 32);
        setCharElement(term107566, 12, (char) 32);
        setCharElement(term107566, 13, (char) 32);
        setCharElement(term107566, 14, (char) 32);
        setCharElement(term107566, 15, (char) 32);
        setCharElement(term107566, 16, (char) 32);
        setCharElement(term107566, 17, (char) 32);
        setCharElement(term107566, 18, (char) 32);
        setCharElement(term107566, 19, (char) 32);
        setCharElement(term107566, 20, (char) 32);
        setCharElement(term107566, 21, (char) 32);
        setCharElement(term107566, 22, (char) 32);
        setCharElement(term107566, 23, (char) 32);
        setCharElement(term107566, 24, (char) 32);
        setCharElement(term107566, 25, (char) 32);
        setCharElement(term107566, 26, (char) 32);
        setCharElement(term107566, 27, (char) 32);
        setCharElement(term107566, 28, (char) 32);
        setCharElement(term107566, 29, (char) 32);
        setCharElement(term107566, 30, (char) 32);
        setCharElement(term107566, 31, (char) 32);
        setField(term107565, term107565.getClass(), "indents", term107566);
        setIntField(term107565, term107565.getClass(), "charsPerLevel", 2);
        setField(term107565, term107565.getClass(), "eol", "\n");
        setField(term107563, term107563.getClass(), "_objectIndenter", term107565);
        setField(term107569, term107569.getClass(), "_value", " ");
        setField(term107569, term107569.getClass(), "_quotedUTF8Ref", null);
        setField(term107569, term107569.getClass(), "_unquotedUTF8Ref", null);
        setField(term107569, term107569.getClass(), "_quotedChars", null);
        setField(term107569, term107569.getClass(), "_jdkSerializeValue", null);
        setField(term107563, term107563.getClass(), "_rootSeparator", term107569);
        setBooleanField(term107563, term107563.getClass(), "_spacesInObjectEntries", true);
        setIntField(term107563, term107563.getClass(), "_nesting", 0);
        setField(term107562, term107562.getClass(), "_defaultPrettyPrinter", term107563);
        setIntField(term107562, term107562.getClass(), "_serFeatures", 2722236);
        setIntField(term107562, term107562.getClass(), "_generatorFeatures", 0);
        setIntField(term107562, term107562.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term107562, term107562.getClass(), "_formatWriteFeatures", 0);
        setIntField(term107562, term107562.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term107572, term107572.getClass(), "_valueInclusion", enum20);
        setField(term107572, term107572.getClass(), "_contentInclusion", enum20);
        setField(term107562, term107562.getClass(), "_serializationInclusion", term107572);
        setField(term107562, term107562.getClass(), "_mixIns", null);
        setField(term107562, term107562.getClass(), "_subtypeResolver", null);
        setField(term107562, term107562.getClass(), "_rootName", null);
        setField(term107562, term107562.getClass(), "_view", null);
        setField(term107577, term107577.getClass(), "keySet", null);
        setField(term107577, term107577.getClass(), "values", null);
        setField(term107576, term107576.getClass(), "_shared", term107577);
        setField(term107576, term107576.getClass(), "_nonShared", null);
        setField(term107562, term107562.getClass(), "_attributes", term107576);
        setField(term107562, term107562.getClass(), "_rootNames", null);
        setIntField(term107562, term107562.getClass(), "_mapperFeatures", 1068991);
        setField(term107562, term107562.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.SubtypeResolver");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term107562));
    }

};


