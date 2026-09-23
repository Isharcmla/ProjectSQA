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

public class SerializationConfig_init_212228651151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43100;
     Object term43228;
     Object term45551;
     Object term45569;
     Object term45570;

    public SerializationConfig_init_212228651151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42740 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term42868 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term43000 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        setField(term42740, term42740.getClass(), "_base", null);
        setIntField(term42740, term42740.getClass(), "_mapperFeatures", 0);
        setField(term42740, term42740.getClass(), "_mixIns", term42868);
        setField(term42740, term42740.getClass(), "_subtypeResolver", term43000);
        setField(term42740, term42740.getClass(), "_rootNames", null);
        setField(term42740, term42740.getClass(), "_rootName", null);
        setField(term42740, term42740.getClass(), "_view", null);
        setField(term42740, term42740.getClass(), "_attributes", null);
        term43100 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term43228 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Class<? extends Object> term45606 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term45605 = ((Class) term45606).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term45605).setAccessible(true);
        Object enum5 = ((Field) term45605).get((Object) null);
        term45551 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term45552 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term45553 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term45554 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term45555 = (char[]) newCharArray(32);
        Object term45558 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term45561 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term45565 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term45566 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term45567 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term45568 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term45551, term45551.getClass(), "_filterProvider", null);
        setField(term45552, term45552.getClass(), "_arrayIndenter", term45553);
        setCharElement(term45555, 0, (char) 32);
        setCharElement(term45555, 1, (char) 32);
        setCharElement(term45555, 2, (char) 32);
        setCharElement(term45555, 3, (char) 32);
        setCharElement(term45555, 4, (char) 32);
        setCharElement(term45555, 5, (char) 32);
        setCharElement(term45555, 6, (char) 32);
        setCharElement(term45555, 7, (char) 32);
        setCharElement(term45555, 8, (char) 32);
        setCharElement(term45555, 9, (char) 32);
        setCharElement(term45555, 10, (char) 32);
        setCharElement(term45555, 11, (char) 32);
        setCharElement(term45555, 12, (char) 32);
        setCharElement(term45555, 13, (char) 32);
        setCharElement(term45555, 14, (char) 32);
        setCharElement(term45555, 15, (char) 32);
        setCharElement(term45555, 16, (char) 32);
        setCharElement(term45555, 17, (char) 32);
        setCharElement(term45555, 18, (char) 32);
        setCharElement(term45555, 19, (char) 32);
        setCharElement(term45555, 20, (char) 32);
        setCharElement(term45555, 21, (char) 32);
        setCharElement(term45555, 22, (char) 32);
        setCharElement(term45555, 23, (char) 32);
        setCharElement(term45555, 24, (char) 32);
        setCharElement(term45555, 25, (char) 32);
        setCharElement(term45555, 26, (char) 32);
        setCharElement(term45555, 27, (char) 32);
        setCharElement(term45555, 28, (char) 32);
        setCharElement(term45555, 29, (char) 32);
        setCharElement(term45555, 30, (char) 32);
        setCharElement(term45555, 31, (char) 32);
        setField(term45554, term45554.getClass(), "indents", term45555);
        setIntField(term45554, term45554.getClass(), "charsPerLevel", 2);
        setField(term45554, term45554.getClass(), "eol", "\n");
        setField(term45552, term45552.getClass(), "_objectIndenter", term45554);
        setField(term45558, term45558.getClass(), "_value", " ");
        setField(term45558, term45558.getClass(), "_quotedUTF8Ref", null);
        setField(term45558, term45558.getClass(), "_unquotedUTF8Ref", null);
        setField(term45558, term45558.getClass(), "_quotedChars", null);
        setField(term45558, term45558.getClass(), "_jdkSerializeValue", null);
        setField(term45552, term45552.getClass(), "_rootSeparator", term45558);
        setBooleanField(term45552, term45552.getClass(), "_spacesInObjectEntries", true);
        setIntField(term45552, term45552.getClass(), "_nesting", 0);
        setField(term45551, term45551.getClass(), "_defaultPrettyPrinter", term45552);
        setIntField(term45551, term45551.getClass(), "_serFeatures", 2722236);
        setIntField(term45551, term45551.getClass(), "_generatorFeatures", 0);
        setIntField(term45551, term45551.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term45551, term45551.getClass(), "_formatWriteFeatures", 0);
        setIntField(term45551, term45551.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term45561, term45561.getClass(), "_valueInclusion", enum5);
        setField(term45561, term45561.getClass(), "_contentInclusion", enum5);
        setField(term45551, term45551.getClass(), "_serializationInclusion", term45561);
        setField(term45565, term45565.getClass(), "_overrides", null);
        setField(term45565, term45565.getClass(), "_localMixIns", null);
        setField(term45551, term45551.getClass(), "_mixIns", term45565);
        setField(term45551, term45551.getClass(), "_subtypeResolver", null);
        setField(term45551, term45551.getClass(), "_rootName", null);
        setField(term45551, term45551.getClass(), "_view", null);
        setField(term45567, term45567.getClass(), "keySet", null);
        setField(term45567, term45567.getClass(), "values", null);
        setField(term45566, term45566.getClass(), "_shared", term45567);
        setField(term45566, term45566.getClass(), "_nonShared", null);
        setField(term45551, term45551.getClass(), "_attributes", term45566);
        setField(term45551, term45551.getClass(), "_rootNames", null);
        setIntField(term45551, term45551.getClass(), "_mapperFeatures", 1068991);
        setField(term45568, term45568.getClass(), "_classIntrospector", null);
        setField(term45568, term45568.getClass(), "_annotationIntrospector", null);
        setField(term45568, term45568.getClass(), "_visibilityChecker", null);
        setField(term45568, term45568.getClass(), "_propertyNamingStrategy", null);
        setField(term45568, term45568.getClass(), "_typeFactory", null);
        setField(term45568, term45568.getClass(), "_typeResolverBuilder", null);
        setField(term45568, term45568.getClass(), "_dateFormat", null);
        setField(term45568, term45568.getClass(), "_handlerInstantiator", null);
        setField(term45568, term45568.getClass(), "_locale", null);
        setField(term45568, term45568.getClass(), "_timeZone", null);
        setField(term45568, term45568.getClass(), "_defaultBase64", null);
        setField(term45551, term45551.getClass(), "_base", term45568);
        term45569 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term45569, term45569.getClass(), "_classIntrospector", null);
        setField(term45569, term45569.getClass(), "_annotationIntrospector", null);
        setField(term45569, term45569.getClass(), "_visibilityChecker", null);
        setField(term45569, term45569.getClass(), "_propertyNamingStrategy", null);
        setField(term45569, term45569.getClass(), "_typeFactory", null);
        setField(term45569, term45569.getClass(), "_typeResolverBuilder", null);
        setField(term45569, term45569.getClass(), "_dateFormat", null);
        setField(term45569, term45569.getClass(), "_handlerInstantiator", null);
        setField(term45569, term45569.getClass(), "_locale", null);
        setField(term45569, term45569.getClass(), "_timeZone", null);
        setField(term45569, term45569.getClass(), "_defaultBase64", null);
        term45570 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term45570, term45570.getClass(), "_overrides", null);
        setField(term45570, term45570.getClass(), "_localMixIns", null);
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
        args[0] = term43100;
        args[1] = null;
        args[2] = term43228;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45551));
        assertTrue(recursiveEquals(term43100, term45569));
        assertTrue(recursiveEquals(term43228, term45570));
    }

};


