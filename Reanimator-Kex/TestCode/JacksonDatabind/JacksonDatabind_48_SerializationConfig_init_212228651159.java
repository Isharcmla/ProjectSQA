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

public class SerializationConfig_init_212228651159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59816;
     Object term59922;
     Object term62195;
     Object term62213;
     Object term62214;

    public SerializationConfig_init_212228651159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term59624 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term59716 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term59624, term59624.getClass(), "_base", null);
        setIntField(term59624, term59624.getClass(), "_mapperFeatures", 0);
        setField(term59624, term59624.getClass(), "_mixIns", null);
        setField(term59624, term59624.getClass(), "_subtypeResolver", null);
        setField(term59624, term59624.getClass(), "_rootNames", null);
        setField(term59624, term59624.getClass(), "_rootName", term59716);
        setField(term59624, term59624.getClass(), "_view", null);
        setField(term59624, term59624.getClass(), "_attributes", null);
        term59816 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term59922 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Class<? extends Object> term62250 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term62249 = ((Class) term62250).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term62249).setAccessible(true);
        Object enum9 = ((Field) term62249).get((Object) null);
        term62195 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term62196 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term62197 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term62198 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term62199 = (char[]) newCharArray(32);
        Object term62202 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term62205 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term62209 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term62210 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term62211 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term62212 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term62195, term62195.getClass(), "_filterProvider", null);
        setField(term62196, term62196.getClass(), "_arrayIndenter", term62197);
        setCharElement(term62199, 0, (char) 32);
        setCharElement(term62199, 1, (char) 32);
        setCharElement(term62199, 2, (char) 32);
        setCharElement(term62199, 3, (char) 32);
        setCharElement(term62199, 4, (char) 32);
        setCharElement(term62199, 5, (char) 32);
        setCharElement(term62199, 6, (char) 32);
        setCharElement(term62199, 7, (char) 32);
        setCharElement(term62199, 8, (char) 32);
        setCharElement(term62199, 9, (char) 32);
        setCharElement(term62199, 10, (char) 32);
        setCharElement(term62199, 11, (char) 32);
        setCharElement(term62199, 12, (char) 32);
        setCharElement(term62199, 13, (char) 32);
        setCharElement(term62199, 14, (char) 32);
        setCharElement(term62199, 15, (char) 32);
        setCharElement(term62199, 16, (char) 32);
        setCharElement(term62199, 17, (char) 32);
        setCharElement(term62199, 18, (char) 32);
        setCharElement(term62199, 19, (char) 32);
        setCharElement(term62199, 20, (char) 32);
        setCharElement(term62199, 21, (char) 32);
        setCharElement(term62199, 22, (char) 32);
        setCharElement(term62199, 23, (char) 32);
        setCharElement(term62199, 24, (char) 32);
        setCharElement(term62199, 25, (char) 32);
        setCharElement(term62199, 26, (char) 32);
        setCharElement(term62199, 27, (char) 32);
        setCharElement(term62199, 28, (char) 32);
        setCharElement(term62199, 29, (char) 32);
        setCharElement(term62199, 30, (char) 32);
        setCharElement(term62199, 31, (char) 32);
        setField(term62198, term62198.getClass(), "indents", term62199);
        setIntField(term62198, term62198.getClass(), "charsPerLevel", 2);
        setField(term62198, term62198.getClass(), "eol", "\n");
        setField(term62196, term62196.getClass(), "_objectIndenter", term62198);
        setField(term62202, term62202.getClass(), "_value", " ");
        setField(term62202, term62202.getClass(), "_quotedUTF8Ref", null);
        setField(term62202, term62202.getClass(), "_unquotedUTF8Ref", null);
        setField(term62202, term62202.getClass(), "_quotedChars", null);
        setField(term62202, term62202.getClass(), "_jdkSerializeValue", null);
        setField(term62196, term62196.getClass(), "_rootSeparator", term62202);
        setBooleanField(term62196, term62196.getClass(), "_spacesInObjectEntries", true);
        setIntField(term62196, term62196.getClass(), "_nesting", 0);
        setField(term62195, term62195.getClass(), "_defaultPrettyPrinter", term62196);
        setIntField(term62195, term62195.getClass(), "_serFeatures", 2722236);
        setIntField(term62195, term62195.getClass(), "_generatorFeatures", 0);
        setIntField(term62195, term62195.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term62195, term62195.getClass(), "_formatWriteFeatures", 0);
        setIntField(term62195, term62195.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term62205, term62205.getClass(), "_valueInclusion", enum9);
        setField(term62205, term62205.getClass(), "_contentInclusion", enum9);
        setField(term62195, term62195.getClass(), "_serializationInclusion", term62205);
        setField(term62195, term62195.getClass(), "_mixIns", null);
        setField(term62195, term62195.getClass(), "_subtypeResolver", null);
        setField(term62195, term62195.getClass(), "_rootName", null);
        setField(term62195, term62195.getClass(), "_view", null);
        setField(term62210, term62210.getClass(), "keySet", null);
        setField(term62210, term62210.getClass(), "values", null);
        setField(term62209, term62209.getClass(), "_shared", term62210);
        setField(term62209, term62209.getClass(), "_nonShared", null);
        setField(term62195, term62195.getClass(), "_attributes", term62209);
        setField(term62211, term62211.getClass(), "_rootNames", null);
        setField(term62195, term62195.getClass(), "_rootNames", term62211);
        setIntField(term62195, term62195.getClass(), "_mapperFeatures", 1068991);
        setField(term62212, term62212.getClass(), "_classIntrospector", null);
        setField(term62212, term62212.getClass(), "_annotationIntrospector", null);
        setField(term62212, term62212.getClass(), "_visibilityChecker", null);
        setField(term62212, term62212.getClass(), "_propertyNamingStrategy", null);
        setField(term62212, term62212.getClass(), "_typeFactory", null);
        setField(term62212, term62212.getClass(), "_typeResolverBuilder", null);
        setField(term62212, term62212.getClass(), "_dateFormat", null);
        setField(term62212, term62212.getClass(), "_handlerInstantiator", null);
        setField(term62212, term62212.getClass(), "_locale", null);
        setField(term62212, term62212.getClass(), "_timeZone", null);
        setField(term62212, term62212.getClass(), "_defaultBase64", null);
        setField(term62195, term62195.getClass(), "_base", term62212);
        term62213 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term62213, term62213.getClass(), "_classIntrospector", null);
        setField(term62213, term62213.getClass(), "_annotationIntrospector", null);
        setField(term62213, term62213.getClass(), "_visibilityChecker", null);
        setField(term62213, term62213.getClass(), "_propertyNamingStrategy", null);
        setField(term62213, term62213.getClass(), "_typeFactory", null);
        setField(term62213, term62213.getClass(), "_typeResolverBuilder", null);
        setField(term62213, term62213.getClass(), "_dateFormat", null);
        setField(term62213, term62213.getClass(), "_handlerInstantiator", null);
        setField(term62213, term62213.getClass(), "_locale", null);
        setField(term62213, term62213.getClass(), "_timeZone", null);
        setField(term62213, term62213.getClass(), "_defaultBase64", null);
        term62214 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term62214, term62214.getClass(), "_rootNames", null);
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
        args[0] = term59816;
        args[1] = null;
        args[2] = null;
        args[3] = term59922;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term62195));
        assertTrue(recursiveEquals(term59816, term62213));
        assertTrue(recursiveEquals(term59922, term62214));
    }

};


