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

public class SerializationConfig_init_212228651163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68198;
     Object term68304;
     Object term70577;
     Object term70595;
     Object term70596;

    public SerializationConfig_init_212228651163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term68098 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term68098, term68098.getClass(), "_base", null);
        setIntField(term68098, term68098.getClass(), "_mapperFeatures", 0);
        setField(term68098, term68098.getClass(), "_mixIns", null);
        setField(term68098, term68098.getClass(), "_subtypeResolver", null);
        setField(term68098, term68098.getClass(), "_rootNames", null);
        setField(term68098, term68098.getClass(), "_rootName", null);
        setField(term68098, term68098.getClass(), "_view", null);
        setField(term68098, term68098.getClass(), "_attributes", null);
        term68198 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term68304 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Class<? extends Object> term70632 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term70631 = ((Class) term70632).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term70631).setAccessible(true);
        Object enum11 = ((Field) term70631).get((Object) null);
        term70577 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term70578 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term70579 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term70580 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term70581 = (char[]) newCharArray(32);
        Object term70584 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term70587 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term70591 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term70592 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term70593 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term70594 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term70577, term70577.getClass(), "_filterProvider", null);
        setField(term70578, term70578.getClass(), "_arrayIndenter", term70579);
        setCharElement(term70581, 0, (char) 32);
        setCharElement(term70581, 1, (char) 32);
        setCharElement(term70581, 2, (char) 32);
        setCharElement(term70581, 3, (char) 32);
        setCharElement(term70581, 4, (char) 32);
        setCharElement(term70581, 5, (char) 32);
        setCharElement(term70581, 6, (char) 32);
        setCharElement(term70581, 7, (char) 32);
        setCharElement(term70581, 8, (char) 32);
        setCharElement(term70581, 9, (char) 32);
        setCharElement(term70581, 10, (char) 32);
        setCharElement(term70581, 11, (char) 32);
        setCharElement(term70581, 12, (char) 32);
        setCharElement(term70581, 13, (char) 32);
        setCharElement(term70581, 14, (char) 32);
        setCharElement(term70581, 15, (char) 32);
        setCharElement(term70581, 16, (char) 32);
        setCharElement(term70581, 17, (char) 32);
        setCharElement(term70581, 18, (char) 32);
        setCharElement(term70581, 19, (char) 32);
        setCharElement(term70581, 20, (char) 32);
        setCharElement(term70581, 21, (char) 32);
        setCharElement(term70581, 22, (char) 32);
        setCharElement(term70581, 23, (char) 32);
        setCharElement(term70581, 24, (char) 32);
        setCharElement(term70581, 25, (char) 32);
        setCharElement(term70581, 26, (char) 32);
        setCharElement(term70581, 27, (char) 32);
        setCharElement(term70581, 28, (char) 32);
        setCharElement(term70581, 29, (char) 32);
        setCharElement(term70581, 30, (char) 32);
        setCharElement(term70581, 31, (char) 32);
        setField(term70580, term70580.getClass(), "indents", term70581);
        setIntField(term70580, term70580.getClass(), "charsPerLevel", 2);
        setField(term70580, term70580.getClass(), "eol", "\n");
        setField(term70578, term70578.getClass(), "_objectIndenter", term70580);
        setField(term70584, term70584.getClass(), "_value", " ");
        setField(term70584, term70584.getClass(), "_quotedUTF8Ref", null);
        setField(term70584, term70584.getClass(), "_unquotedUTF8Ref", null);
        setField(term70584, term70584.getClass(), "_quotedChars", null);
        setField(term70584, term70584.getClass(), "_jdkSerializeValue", null);
        setField(term70578, term70578.getClass(), "_rootSeparator", term70584);
        setBooleanField(term70578, term70578.getClass(), "_spacesInObjectEntries", true);
        setIntField(term70578, term70578.getClass(), "_nesting", 0);
        setField(term70577, term70577.getClass(), "_defaultPrettyPrinter", term70578);
        setIntField(term70577, term70577.getClass(), "_serFeatures", 2722236);
        setIntField(term70577, term70577.getClass(), "_generatorFeatures", 0);
        setIntField(term70577, term70577.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term70577, term70577.getClass(), "_formatWriteFeatures", 0);
        setIntField(term70577, term70577.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term70587, term70587.getClass(), "_valueInclusion", enum11);
        setField(term70587, term70587.getClass(), "_contentInclusion", enum11);
        setField(term70577, term70577.getClass(), "_serializationInclusion", term70587);
        setField(term70577, term70577.getClass(), "_mixIns", null);
        setField(term70577, term70577.getClass(), "_subtypeResolver", null);
        setField(term70577, term70577.getClass(), "_rootName", null);
        setField(term70577, term70577.getClass(), "_view", null);
        setField(term70592, term70592.getClass(), "keySet", null);
        setField(term70592, term70592.getClass(), "values", null);
        setField(term70591, term70591.getClass(), "_shared", term70592);
        setField(term70591, term70591.getClass(), "_nonShared", null);
        setField(term70577, term70577.getClass(), "_attributes", term70591);
        setField(term70593, term70593.getClass(), "_rootNames", null);
        setField(term70577, term70577.getClass(), "_rootNames", term70593);
        setIntField(term70577, term70577.getClass(), "_mapperFeatures", 1068991);
        setField(term70594, term70594.getClass(), "_classIntrospector", null);
        setField(term70594, term70594.getClass(), "_annotationIntrospector", null);
        setField(term70594, term70594.getClass(), "_visibilityChecker", null);
        setField(term70594, term70594.getClass(), "_propertyNamingStrategy", null);
        setField(term70594, term70594.getClass(), "_typeFactory", null);
        setField(term70594, term70594.getClass(), "_typeResolverBuilder", null);
        setField(term70594, term70594.getClass(), "_dateFormat", null);
        setField(term70594, term70594.getClass(), "_handlerInstantiator", null);
        setField(term70594, term70594.getClass(), "_locale", null);
        setField(term70594, term70594.getClass(), "_timeZone", null);
        setField(term70594, term70594.getClass(), "_defaultBase64", null);
        setField(term70577, term70577.getClass(), "_base", term70594);
        term70595 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term70595, term70595.getClass(), "_classIntrospector", null);
        setField(term70595, term70595.getClass(), "_annotationIntrospector", null);
        setField(term70595, term70595.getClass(), "_visibilityChecker", null);
        setField(term70595, term70595.getClass(), "_propertyNamingStrategy", null);
        setField(term70595, term70595.getClass(), "_typeFactory", null);
        setField(term70595, term70595.getClass(), "_typeResolverBuilder", null);
        setField(term70595, term70595.getClass(), "_dateFormat", null);
        setField(term70595, term70595.getClass(), "_handlerInstantiator", null);
        setField(term70595, term70595.getClass(), "_locale", null);
        setField(term70595, term70595.getClass(), "_timeZone", null);
        setField(term70595, term70595.getClass(), "_defaultBase64", null);
        term70596 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term70596, term70596.getClass(), "_rootNames", null);
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
        args[0] = term68198;
        args[1] = null;
        args[2] = null;
        args[3] = term68304;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term70577));
        assertTrue(recursiveEquals(term68198, term70595));
        assertTrue(recursiveEquals(term68304, term70596));
    }

};


