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

public class SerializationConfig_init_212228651211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146348;
     Object term148620;
     Object term148637;

    public SerializationConfig_init_212228651211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term146198 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        term146348 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term146198, term146198.getClass(), "_base", term146348);
        setIntField(term146198, term146198.getClass(), "_mapperFeatures", 0);
        setField(term146198, term146198.getClass(), "_mixIns", null);
        setField(term146198, term146198.getClass(), "_subtypeResolver", null);
        setField(term146198, term146198.getClass(), "_rootNames", null);
        setField(term146198, term146198.getClass(), "_rootName", null);
        setField(term146198, term146198.getClass(), "_view", null);
        setField(term146198, term146198.getClass(), "_attributes", null);
        Class<? extends Object> term148673 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term148672 = ((Class) term148673).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term148672).setAccessible(true);
        Object enum30 = ((Field) term148672).get((Object) null);
        term148620 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term148621 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term148622 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term148623 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term148624 = (char[]) newCharArray(32);
        Object term148627 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term148630 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term148634 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term148635 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term148636 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term148620, term148620.getClass(), "_filterProvider", null);
        setField(term148621, term148621.getClass(), "_arrayIndenter", term148622);
        setCharElement(term148624, 0, (char) 32);
        setCharElement(term148624, 1, (char) 32);
        setCharElement(term148624, 2, (char) 32);
        setCharElement(term148624, 3, (char) 32);
        setCharElement(term148624, 4, (char) 32);
        setCharElement(term148624, 5, (char) 32);
        setCharElement(term148624, 6, (char) 32);
        setCharElement(term148624, 7, (char) 32);
        setCharElement(term148624, 8, (char) 32);
        setCharElement(term148624, 9, (char) 32);
        setCharElement(term148624, 10, (char) 32);
        setCharElement(term148624, 11, (char) 32);
        setCharElement(term148624, 12, (char) 32);
        setCharElement(term148624, 13, (char) 32);
        setCharElement(term148624, 14, (char) 32);
        setCharElement(term148624, 15, (char) 32);
        setCharElement(term148624, 16, (char) 32);
        setCharElement(term148624, 17, (char) 32);
        setCharElement(term148624, 18, (char) 32);
        setCharElement(term148624, 19, (char) 32);
        setCharElement(term148624, 20, (char) 32);
        setCharElement(term148624, 21, (char) 32);
        setCharElement(term148624, 22, (char) 32);
        setCharElement(term148624, 23, (char) 32);
        setCharElement(term148624, 24, (char) 32);
        setCharElement(term148624, 25, (char) 32);
        setCharElement(term148624, 26, (char) 32);
        setCharElement(term148624, 27, (char) 32);
        setCharElement(term148624, 28, (char) 32);
        setCharElement(term148624, 29, (char) 32);
        setCharElement(term148624, 30, (char) 32);
        setCharElement(term148624, 31, (char) 32);
        setField(term148623, term148623.getClass(), "indents", term148624);
        setIntField(term148623, term148623.getClass(), "charsPerLevel", 2);
        setField(term148623, term148623.getClass(), "eol", "\n");
        setField(term148621, term148621.getClass(), "_objectIndenter", term148623);
        setField(term148627, term148627.getClass(), "_value", " ");
        setField(term148627, term148627.getClass(), "_quotedUTF8Ref", null);
        setField(term148627, term148627.getClass(), "_unquotedUTF8Ref", null);
        setField(term148627, term148627.getClass(), "_quotedChars", null);
        setField(term148627, term148627.getClass(), "_jdkSerializeValue", null);
        setField(term148621, term148621.getClass(), "_rootSeparator", term148627);
        setBooleanField(term148621, term148621.getClass(), "_spacesInObjectEntries", true);
        setIntField(term148621, term148621.getClass(), "_nesting", 0);
        setField(term148620, term148620.getClass(), "_defaultPrettyPrinter", term148621);
        setIntField(term148620, term148620.getClass(), "_serFeatures", 2722236);
        setIntField(term148620, term148620.getClass(), "_generatorFeatures", 0);
        setIntField(term148620, term148620.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term148620, term148620.getClass(), "_formatWriteFeatures", 0);
        setIntField(term148620, term148620.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term148630, term148630.getClass(), "_valueInclusion", enum30);
        setField(term148630, term148630.getClass(), "_contentInclusion", enum30);
        setField(term148620, term148620.getClass(), "_serializationInclusion", term148630);
        setField(term148620, term148620.getClass(), "_mixIns", null);
        setField(term148620, term148620.getClass(), "_subtypeResolver", null);
        setField(term148620, term148620.getClass(), "_rootName", null);
        setField(term148620, term148620.getClass(), "_view", null);
        setField(term148635, term148635.getClass(), "keySet", null);
        setField(term148635, term148635.getClass(), "values", null);
        setField(term148634, term148634.getClass(), "_shared", term148635);
        setField(term148634, term148634.getClass(), "_nonShared", null);
        setField(term148620, term148620.getClass(), "_attributes", term148634);
        setField(term148620, term148620.getClass(), "_rootNames", null);
        setIntField(term148620, term148620.getClass(), "_mapperFeatures", 1068991);
        setField(term148636, term148636.getClass(), "_classIntrospector", null);
        setField(term148636, term148636.getClass(), "_annotationIntrospector", null);
        setField(term148636, term148636.getClass(), "_visibilityChecker", null);
        setField(term148636, term148636.getClass(), "_propertyNamingStrategy", null);
        setField(term148636, term148636.getClass(), "_typeFactory", null);
        setField(term148636, term148636.getClass(), "_typeResolverBuilder", null);
        setField(term148636, term148636.getClass(), "_dateFormat", null);
        setField(term148636, term148636.getClass(), "_handlerInstantiator", null);
        setField(term148636, term148636.getClass(), "_locale", null);
        setField(term148636, term148636.getClass(), "_timeZone", null);
        setField(term148636, term148636.getClass(), "_defaultBase64", null);
        setField(term148620, term148620.getClass(), "_base", term148636);
        term148637 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term148637, term148637.getClass(), "_classIntrospector", null);
        setField(term148637, term148637.getClass(), "_annotationIntrospector", null);
        setField(term148637, term148637.getClass(), "_visibilityChecker", null);
        setField(term148637, term148637.getClass(), "_propertyNamingStrategy", null);
        setField(term148637, term148637.getClass(), "_typeFactory", null);
        setField(term148637, term148637.getClass(), "_typeResolverBuilder", null);
        setField(term148637, term148637.getClass(), "_dateFormat", null);
        setField(term148637, term148637.getClass(), "_handlerInstantiator", null);
        setField(term148637, term148637.getClass(), "_locale", null);
        setField(term148637, term148637.getClass(), "_timeZone", null);
        setField(term148637, term148637.getClass(), "_defaultBase64", null);
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
        args[0] = term146348;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term148620));
        assertTrue(recursiveEquals(term146348, term148637));
    }

};


