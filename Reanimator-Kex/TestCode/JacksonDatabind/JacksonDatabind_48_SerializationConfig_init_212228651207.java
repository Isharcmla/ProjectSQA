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

public class SerializationConfig_init_212228651207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138489;
     Object term140761;
     Object term140778;

    public SerializationConfig_init_212228651207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term138289 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term138389 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term138289, term138289.getClass(), "_base", term138389);
        setIntField(term138289, term138289.getClass(), "_mapperFeatures", 0);
        setField(term138289, term138289.getClass(), "_mixIns", null);
        setField(term138289, term138289.getClass(), "_subtypeResolver", null);
        setField(term138289, term138289.getClass(), "_rootNames", null);
        setField(term138289, term138289.getClass(), "_rootName", null);
        setField(term138289, term138289.getClass(), "_view", null);
        setField(term138289, term138289.getClass(), "_attributes", null);
        term138489 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Class<? extends Object> term140814 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term140813 = ((Class) term140814).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term140813).setAccessible(true);
        Object enum28 = ((Field) term140813).get((Object) null);
        term140761 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term140762 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term140763 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term140764 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term140765 = (char[]) newCharArray(32);
        Object term140768 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term140771 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term140775 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term140776 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term140777 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term140761, term140761.getClass(), "_filterProvider", null);
        setField(term140762, term140762.getClass(), "_arrayIndenter", term140763);
        setCharElement(term140765, 0, (char) 32);
        setCharElement(term140765, 1, (char) 32);
        setCharElement(term140765, 2, (char) 32);
        setCharElement(term140765, 3, (char) 32);
        setCharElement(term140765, 4, (char) 32);
        setCharElement(term140765, 5, (char) 32);
        setCharElement(term140765, 6, (char) 32);
        setCharElement(term140765, 7, (char) 32);
        setCharElement(term140765, 8, (char) 32);
        setCharElement(term140765, 9, (char) 32);
        setCharElement(term140765, 10, (char) 32);
        setCharElement(term140765, 11, (char) 32);
        setCharElement(term140765, 12, (char) 32);
        setCharElement(term140765, 13, (char) 32);
        setCharElement(term140765, 14, (char) 32);
        setCharElement(term140765, 15, (char) 32);
        setCharElement(term140765, 16, (char) 32);
        setCharElement(term140765, 17, (char) 32);
        setCharElement(term140765, 18, (char) 32);
        setCharElement(term140765, 19, (char) 32);
        setCharElement(term140765, 20, (char) 32);
        setCharElement(term140765, 21, (char) 32);
        setCharElement(term140765, 22, (char) 32);
        setCharElement(term140765, 23, (char) 32);
        setCharElement(term140765, 24, (char) 32);
        setCharElement(term140765, 25, (char) 32);
        setCharElement(term140765, 26, (char) 32);
        setCharElement(term140765, 27, (char) 32);
        setCharElement(term140765, 28, (char) 32);
        setCharElement(term140765, 29, (char) 32);
        setCharElement(term140765, 30, (char) 32);
        setCharElement(term140765, 31, (char) 32);
        setField(term140764, term140764.getClass(), "indents", term140765);
        setIntField(term140764, term140764.getClass(), "charsPerLevel", 2);
        setField(term140764, term140764.getClass(), "eol", "\n");
        setField(term140762, term140762.getClass(), "_objectIndenter", term140764);
        setField(term140768, term140768.getClass(), "_value", " ");
        setField(term140768, term140768.getClass(), "_quotedUTF8Ref", null);
        setField(term140768, term140768.getClass(), "_unquotedUTF8Ref", null);
        setField(term140768, term140768.getClass(), "_quotedChars", null);
        setField(term140768, term140768.getClass(), "_jdkSerializeValue", null);
        setField(term140762, term140762.getClass(), "_rootSeparator", term140768);
        setBooleanField(term140762, term140762.getClass(), "_spacesInObjectEntries", true);
        setIntField(term140762, term140762.getClass(), "_nesting", 0);
        setField(term140761, term140761.getClass(), "_defaultPrettyPrinter", term140762);
        setIntField(term140761, term140761.getClass(), "_serFeatures", 2722236);
        setIntField(term140761, term140761.getClass(), "_generatorFeatures", 0);
        setIntField(term140761, term140761.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term140761, term140761.getClass(), "_formatWriteFeatures", 0);
        setIntField(term140761, term140761.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term140771, term140771.getClass(), "_valueInclusion", enum28);
        setField(term140771, term140771.getClass(), "_contentInclusion", enum28);
        setField(term140761, term140761.getClass(), "_serializationInclusion", term140771);
        setField(term140761, term140761.getClass(), "_mixIns", null);
        setField(term140761, term140761.getClass(), "_subtypeResolver", null);
        setField(term140761, term140761.getClass(), "_rootName", null);
        setField(term140761, term140761.getClass(), "_view", null);
        setField(term140776, term140776.getClass(), "keySet", null);
        setField(term140776, term140776.getClass(), "values", null);
        setField(term140775, term140775.getClass(), "_shared", term140776);
        setField(term140775, term140775.getClass(), "_nonShared", null);
        setField(term140761, term140761.getClass(), "_attributes", term140775);
        setField(term140761, term140761.getClass(), "_rootNames", null);
        setIntField(term140761, term140761.getClass(), "_mapperFeatures", 1068991);
        setField(term140777, term140777.getClass(), "_classIntrospector", null);
        setField(term140777, term140777.getClass(), "_annotationIntrospector", null);
        setField(term140777, term140777.getClass(), "_visibilityChecker", null);
        setField(term140777, term140777.getClass(), "_propertyNamingStrategy", null);
        setField(term140777, term140777.getClass(), "_typeFactory", null);
        setField(term140777, term140777.getClass(), "_typeResolverBuilder", null);
        setField(term140777, term140777.getClass(), "_dateFormat", null);
        setField(term140777, term140777.getClass(), "_handlerInstantiator", null);
        setField(term140777, term140777.getClass(), "_locale", null);
        setField(term140777, term140777.getClass(), "_timeZone", null);
        setField(term140777, term140777.getClass(), "_defaultBase64", null);
        setField(term140761, term140761.getClass(), "_base", term140777);
        term140778 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term140778, term140778.getClass(), "_classIntrospector", null);
        setField(term140778, term140778.getClass(), "_annotationIntrospector", null);
        setField(term140778, term140778.getClass(), "_visibilityChecker", null);
        setField(term140778, term140778.getClass(), "_propertyNamingStrategy", null);
        setField(term140778, term140778.getClass(), "_typeFactory", null);
        setField(term140778, term140778.getClass(), "_typeResolverBuilder", null);
        setField(term140778, term140778.getClass(), "_dateFormat", null);
        setField(term140778, term140778.getClass(), "_handlerInstantiator", null);
        setField(term140778, term140778.getClass(), "_locale", null);
        setField(term140778, term140778.getClass(), "_timeZone", null);
        setField(term140778, term140778.getClass(), "_defaultBase64", null);
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
        args[0] = term138489;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term140761));
        assertTrue(recursiveEquals(term138489, term140778));
    }

};


