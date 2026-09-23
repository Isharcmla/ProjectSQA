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

public class SerializationConfig_init_212228651229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181902;

    public SerializationConfig_init_212228651229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term179531 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term179631 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term179531, term179531.getClass(), "_base", term179631);
        setIntField(term179531, term179531.getClass(), "_mapperFeatures", 0);
        setField(term179531, term179531.getClass(), "_mixIns", null);
        setField(term179531, term179531.getClass(), "_subtypeResolver", null);
        setField(term179531, term179531.getClass(), "_rootNames", null);
        setField(term179531, term179531.getClass(), "_rootName", null);
        setField(term179531, term179531.getClass(), "_view", null);
        setField(term179531, term179531.getClass(), "_attributes", null);
        Class<? extends Object> term181953 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term181952 = ((Class) term181953).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term181952).setAccessible(true);
        Object enum38 = ((Field) term181952).get((Object) null);
        term181902 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term181903 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term181904 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term181905 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term181906 = (char[]) newCharArray(32);
        Object term181909 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term181912 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term181916 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term181917 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term181902, term181902.getClass(), "_filterProvider", null);
        setField(term181903, term181903.getClass(), "_arrayIndenter", term181904);
        setCharElement(term181906, 0, (char) 32);
        setCharElement(term181906, 1, (char) 32);
        setCharElement(term181906, 2, (char) 32);
        setCharElement(term181906, 3, (char) 32);
        setCharElement(term181906, 4, (char) 32);
        setCharElement(term181906, 5, (char) 32);
        setCharElement(term181906, 6, (char) 32);
        setCharElement(term181906, 7, (char) 32);
        setCharElement(term181906, 8, (char) 32);
        setCharElement(term181906, 9, (char) 32);
        setCharElement(term181906, 10, (char) 32);
        setCharElement(term181906, 11, (char) 32);
        setCharElement(term181906, 12, (char) 32);
        setCharElement(term181906, 13, (char) 32);
        setCharElement(term181906, 14, (char) 32);
        setCharElement(term181906, 15, (char) 32);
        setCharElement(term181906, 16, (char) 32);
        setCharElement(term181906, 17, (char) 32);
        setCharElement(term181906, 18, (char) 32);
        setCharElement(term181906, 19, (char) 32);
        setCharElement(term181906, 20, (char) 32);
        setCharElement(term181906, 21, (char) 32);
        setCharElement(term181906, 22, (char) 32);
        setCharElement(term181906, 23, (char) 32);
        setCharElement(term181906, 24, (char) 32);
        setCharElement(term181906, 25, (char) 32);
        setCharElement(term181906, 26, (char) 32);
        setCharElement(term181906, 27, (char) 32);
        setCharElement(term181906, 28, (char) 32);
        setCharElement(term181906, 29, (char) 32);
        setCharElement(term181906, 30, (char) 32);
        setCharElement(term181906, 31, (char) 32);
        setField(term181905, term181905.getClass(), "indents", term181906);
        setIntField(term181905, term181905.getClass(), "charsPerLevel", 2);
        setField(term181905, term181905.getClass(), "eol", "\n");
        setField(term181903, term181903.getClass(), "_objectIndenter", term181905);
        setField(term181909, term181909.getClass(), "_value", " ");
        setField(term181909, term181909.getClass(), "_quotedUTF8Ref", null);
        setField(term181909, term181909.getClass(), "_unquotedUTF8Ref", null);
        setField(term181909, term181909.getClass(), "_quotedChars", null);
        setField(term181909, term181909.getClass(), "_jdkSerializeValue", null);
        setField(term181903, term181903.getClass(), "_rootSeparator", term181909);
        setBooleanField(term181903, term181903.getClass(), "_spacesInObjectEntries", true);
        setIntField(term181903, term181903.getClass(), "_nesting", 0);
        setField(term181902, term181902.getClass(), "_defaultPrettyPrinter", term181903);
        setIntField(term181902, term181902.getClass(), "_serFeatures", 2722236);
        setIntField(term181902, term181902.getClass(), "_generatorFeatures", 0);
        setIntField(term181902, term181902.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term181902, term181902.getClass(), "_formatWriteFeatures", 0);
        setIntField(term181902, term181902.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term181912, term181912.getClass(), "_valueInclusion", enum38);
        setField(term181912, term181912.getClass(), "_contentInclusion", enum38);
        setField(term181902, term181902.getClass(), "_serializationInclusion", term181912);
        setField(term181902, term181902.getClass(), "_mixIns", null);
        setField(term181902, term181902.getClass(), "_subtypeResolver", null);
        setField(term181902, term181902.getClass(), "_rootName", null);
        setField(term181902, term181902.getClass(), "_view", null);
        setField(term181917, term181917.getClass(), "keySet", null);
        setField(term181917, term181917.getClass(), "values", null);
        setField(term181916, term181916.getClass(), "_shared", term181917);
        setField(term181916, term181916.getClass(), "_nonShared", null);
        setField(term181902, term181902.getClass(), "_attributes", term181916);
        setField(term181902, term181902.getClass(), "_rootNames", null);
        setIntField(term181902, term181902.getClass(), "_mapperFeatures", 1068991);
        setField(term181902, term181902.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term181902));
    }

};


