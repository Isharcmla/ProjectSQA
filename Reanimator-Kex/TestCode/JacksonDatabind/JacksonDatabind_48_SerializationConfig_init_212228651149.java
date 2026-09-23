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

public class SerializationConfig_init_212228651149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38797;
     Object term38925;
     Object term41198;
     Object term41216;
     Object term41217;

    public SerializationConfig_init_212228651149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38469 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term38569 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term38697 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term38469, term38469.getClass(), "_base", term38569);
        setIntField(term38469, term38469.getClass(), "_mapperFeatures", 0);
        setField(term38469, term38469.getClass(), "_mixIns", term38697);
        setField(term38469, term38469.getClass(), "_subtypeResolver", null);
        setField(term38469, term38469.getClass(), "_rootNames", null);
        setField(term38469, term38469.getClass(), "_rootName", null);
        setField(term38469, term38469.getClass(), "_view", null);
        setField(term38469, term38469.getClass(), "_attributes", null);
        term38797 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term38925 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Class<? extends Object> term41253 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term41252 = ((Class) term41253).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term41252).setAccessible(true);
        Object enum4 = ((Field) term41252).get((Object) null);
        term41198 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term41199 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term41200 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term41201 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term41202 = (char[]) newCharArray(32);
        Object term41205 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term41208 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term41212 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term41213 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term41214 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term41215 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term41198, term41198.getClass(), "_filterProvider", null);
        setField(term41199, term41199.getClass(), "_arrayIndenter", term41200);
        setCharElement(term41202, 0, (char) 32);
        setCharElement(term41202, 1, (char) 32);
        setCharElement(term41202, 2, (char) 32);
        setCharElement(term41202, 3, (char) 32);
        setCharElement(term41202, 4, (char) 32);
        setCharElement(term41202, 5, (char) 32);
        setCharElement(term41202, 6, (char) 32);
        setCharElement(term41202, 7, (char) 32);
        setCharElement(term41202, 8, (char) 32);
        setCharElement(term41202, 9, (char) 32);
        setCharElement(term41202, 10, (char) 32);
        setCharElement(term41202, 11, (char) 32);
        setCharElement(term41202, 12, (char) 32);
        setCharElement(term41202, 13, (char) 32);
        setCharElement(term41202, 14, (char) 32);
        setCharElement(term41202, 15, (char) 32);
        setCharElement(term41202, 16, (char) 32);
        setCharElement(term41202, 17, (char) 32);
        setCharElement(term41202, 18, (char) 32);
        setCharElement(term41202, 19, (char) 32);
        setCharElement(term41202, 20, (char) 32);
        setCharElement(term41202, 21, (char) 32);
        setCharElement(term41202, 22, (char) 32);
        setCharElement(term41202, 23, (char) 32);
        setCharElement(term41202, 24, (char) 32);
        setCharElement(term41202, 25, (char) 32);
        setCharElement(term41202, 26, (char) 32);
        setCharElement(term41202, 27, (char) 32);
        setCharElement(term41202, 28, (char) 32);
        setCharElement(term41202, 29, (char) 32);
        setCharElement(term41202, 30, (char) 32);
        setCharElement(term41202, 31, (char) 32);
        setField(term41201, term41201.getClass(), "indents", term41202);
        setIntField(term41201, term41201.getClass(), "charsPerLevel", 2);
        setField(term41201, term41201.getClass(), "eol", "\n");
        setField(term41199, term41199.getClass(), "_objectIndenter", term41201);
        setField(term41205, term41205.getClass(), "_value", " ");
        setField(term41205, term41205.getClass(), "_quotedUTF8Ref", null);
        setField(term41205, term41205.getClass(), "_unquotedUTF8Ref", null);
        setField(term41205, term41205.getClass(), "_quotedChars", null);
        setField(term41205, term41205.getClass(), "_jdkSerializeValue", null);
        setField(term41199, term41199.getClass(), "_rootSeparator", term41205);
        setBooleanField(term41199, term41199.getClass(), "_spacesInObjectEntries", true);
        setIntField(term41199, term41199.getClass(), "_nesting", 0);
        setField(term41198, term41198.getClass(), "_defaultPrettyPrinter", term41199);
        setIntField(term41198, term41198.getClass(), "_serFeatures", 2722236);
        setIntField(term41198, term41198.getClass(), "_generatorFeatures", 0);
        setIntField(term41198, term41198.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term41198, term41198.getClass(), "_formatWriteFeatures", 0);
        setIntField(term41198, term41198.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term41208, term41208.getClass(), "_valueInclusion", enum4);
        setField(term41208, term41208.getClass(), "_contentInclusion", enum4);
        setField(term41198, term41198.getClass(), "_serializationInclusion", term41208);
        setField(term41212, term41212.getClass(), "_overrides", null);
        setField(term41212, term41212.getClass(), "_localMixIns", null);
        setField(term41198, term41198.getClass(), "_mixIns", term41212);
        setField(term41198, term41198.getClass(), "_subtypeResolver", null);
        setField(term41198, term41198.getClass(), "_rootName", null);
        setField(term41198, term41198.getClass(), "_view", null);
        setField(term41214, term41214.getClass(), "keySet", null);
        setField(term41214, term41214.getClass(), "values", null);
        setField(term41213, term41213.getClass(), "_shared", term41214);
        setField(term41213, term41213.getClass(), "_nonShared", null);
        setField(term41198, term41198.getClass(), "_attributes", term41213);
        setField(term41198, term41198.getClass(), "_rootNames", null);
        setIntField(term41198, term41198.getClass(), "_mapperFeatures", 1068991);
        setField(term41215, term41215.getClass(), "_classIntrospector", null);
        setField(term41215, term41215.getClass(), "_annotationIntrospector", null);
        setField(term41215, term41215.getClass(), "_visibilityChecker", null);
        setField(term41215, term41215.getClass(), "_propertyNamingStrategy", null);
        setField(term41215, term41215.getClass(), "_typeFactory", null);
        setField(term41215, term41215.getClass(), "_typeResolverBuilder", null);
        setField(term41215, term41215.getClass(), "_dateFormat", null);
        setField(term41215, term41215.getClass(), "_handlerInstantiator", null);
        setField(term41215, term41215.getClass(), "_locale", null);
        setField(term41215, term41215.getClass(), "_timeZone", null);
        setField(term41215, term41215.getClass(), "_defaultBase64", null);
        setField(term41198, term41198.getClass(), "_base", term41215);
        term41216 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term41216, term41216.getClass(), "_classIntrospector", null);
        setField(term41216, term41216.getClass(), "_annotationIntrospector", null);
        setField(term41216, term41216.getClass(), "_visibilityChecker", null);
        setField(term41216, term41216.getClass(), "_propertyNamingStrategy", null);
        setField(term41216, term41216.getClass(), "_typeFactory", null);
        setField(term41216, term41216.getClass(), "_typeResolverBuilder", null);
        setField(term41216, term41216.getClass(), "_dateFormat", null);
        setField(term41216, term41216.getClass(), "_handlerInstantiator", null);
        setField(term41216, term41216.getClass(), "_locale", null);
        setField(term41216, term41216.getClass(), "_timeZone", null);
        setField(term41216, term41216.getClass(), "_defaultBase64", null);
        term41217 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term41217, term41217.getClass(), "_overrides", null);
        setField(term41217, term41217.getClass(), "_localMixIns", null);
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
        args[0] = term38797;
        args[1] = null;
        args[2] = term38925;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term41198));
        assertTrue(recursiveEquals(term38797, term41216));
        assertTrue(recursiveEquals(term38925, term41217));
    }

};


