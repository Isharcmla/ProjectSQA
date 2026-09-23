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

public class SerializationConfig_init_212228651217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154556;
     Object term156828;
     Object term156845;

    public SerializationConfig_init_212228651217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term154356 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term154456 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term154356, term154356.getClass(), "_base", term154456);
        setIntField(term154356, term154356.getClass(), "_mapperFeatures", 0);
        setField(term154356, term154356.getClass(), "_mixIns", null);
        setField(term154356, term154356.getClass(), "_subtypeResolver", null);
        setField(term154356, term154356.getClass(), "_rootNames", null);
        setField(term154356, term154356.getClass(), "_rootName", null);
        setField(term154356, term154356.getClass(), "_view", null);
        setField(term154356, term154356.getClass(), "_attributes", null);
        term154556 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Class<? extends Object> term156881 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term156880 = ((Class) term156881).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term156880).setAccessible(true);
        Object enum32 = ((Field) term156880).get((Object) null);
        term156828 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term156829 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term156830 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term156831 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term156832 = (char[]) newCharArray(32);
        Object term156835 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term156838 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term156842 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term156843 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term156844 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term156828, term156828.getClass(), "_filterProvider", null);
        setField(term156829, term156829.getClass(), "_arrayIndenter", term156830);
        setCharElement(term156832, 0, (char) 32);
        setCharElement(term156832, 1, (char) 32);
        setCharElement(term156832, 2, (char) 32);
        setCharElement(term156832, 3, (char) 32);
        setCharElement(term156832, 4, (char) 32);
        setCharElement(term156832, 5, (char) 32);
        setCharElement(term156832, 6, (char) 32);
        setCharElement(term156832, 7, (char) 32);
        setCharElement(term156832, 8, (char) 32);
        setCharElement(term156832, 9, (char) 32);
        setCharElement(term156832, 10, (char) 32);
        setCharElement(term156832, 11, (char) 32);
        setCharElement(term156832, 12, (char) 32);
        setCharElement(term156832, 13, (char) 32);
        setCharElement(term156832, 14, (char) 32);
        setCharElement(term156832, 15, (char) 32);
        setCharElement(term156832, 16, (char) 32);
        setCharElement(term156832, 17, (char) 32);
        setCharElement(term156832, 18, (char) 32);
        setCharElement(term156832, 19, (char) 32);
        setCharElement(term156832, 20, (char) 32);
        setCharElement(term156832, 21, (char) 32);
        setCharElement(term156832, 22, (char) 32);
        setCharElement(term156832, 23, (char) 32);
        setCharElement(term156832, 24, (char) 32);
        setCharElement(term156832, 25, (char) 32);
        setCharElement(term156832, 26, (char) 32);
        setCharElement(term156832, 27, (char) 32);
        setCharElement(term156832, 28, (char) 32);
        setCharElement(term156832, 29, (char) 32);
        setCharElement(term156832, 30, (char) 32);
        setCharElement(term156832, 31, (char) 32);
        setField(term156831, term156831.getClass(), "indents", term156832);
        setIntField(term156831, term156831.getClass(), "charsPerLevel", 2);
        setField(term156831, term156831.getClass(), "eol", "\n");
        setField(term156829, term156829.getClass(), "_objectIndenter", term156831);
        setField(term156835, term156835.getClass(), "_value", " ");
        setField(term156835, term156835.getClass(), "_quotedUTF8Ref", null);
        setField(term156835, term156835.getClass(), "_unquotedUTF8Ref", null);
        setField(term156835, term156835.getClass(), "_quotedChars", null);
        setField(term156835, term156835.getClass(), "_jdkSerializeValue", null);
        setField(term156829, term156829.getClass(), "_rootSeparator", term156835);
        setBooleanField(term156829, term156829.getClass(), "_spacesInObjectEntries", true);
        setIntField(term156829, term156829.getClass(), "_nesting", 0);
        setField(term156828, term156828.getClass(), "_defaultPrettyPrinter", term156829);
        setIntField(term156828, term156828.getClass(), "_serFeatures", 2722236);
        setIntField(term156828, term156828.getClass(), "_generatorFeatures", 0);
        setIntField(term156828, term156828.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term156828, term156828.getClass(), "_formatWriteFeatures", 0);
        setIntField(term156828, term156828.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term156838, term156838.getClass(), "_valueInclusion", enum32);
        setField(term156838, term156838.getClass(), "_contentInclusion", enum32);
        setField(term156828, term156828.getClass(), "_serializationInclusion", term156838);
        setField(term156828, term156828.getClass(), "_mixIns", null);
        setField(term156828, term156828.getClass(), "_subtypeResolver", null);
        setField(term156828, term156828.getClass(), "_rootName", null);
        setField(term156828, term156828.getClass(), "_view", null);
        setField(term156843, term156843.getClass(), "keySet", null);
        setField(term156843, term156843.getClass(), "values", null);
        setField(term156842, term156842.getClass(), "_shared", term156843);
        setField(term156842, term156842.getClass(), "_nonShared", null);
        setField(term156828, term156828.getClass(), "_attributes", term156842);
        setField(term156828, term156828.getClass(), "_rootNames", null);
        setIntField(term156828, term156828.getClass(), "_mapperFeatures", 1068991);
        setField(term156844, term156844.getClass(), "_classIntrospector", null);
        setField(term156844, term156844.getClass(), "_annotationIntrospector", null);
        setField(term156844, term156844.getClass(), "_visibilityChecker", null);
        setField(term156844, term156844.getClass(), "_propertyNamingStrategy", null);
        setField(term156844, term156844.getClass(), "_typeFactory", null);
        setField(term156844, term156844.getClass(), "_typeResolverBuilder", null);
        setField(term156844, term156844.getClass(), "_dateFormat", null);
        setField(term156844, term156844.getClass(), "_handlerInstantiator", null);
        setField(term156844, term156844.getClass(), "_locale", null);
        setField(term156844, term156844.getClass(), "_timeZone", null);
        setField(term156844, term156844.getClass(), "_defaultBase64", null);
        setField(term156828, term156828.getClass(), "_base", term156844);
        term156845 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term156845, term156845.getClass(), "_classIntrospector", null);
        setField(term156845, term156845.getClass(), "_annotationIntrospector", null);
        setField(term156845, term156845.getClass(), "_visibilityChecker", null);
        setField(term156845, term156845.getClass(), "_propertyNamingStrategy", null);
        setField(term156845, term156845.getClass(), "_typeFactory", null);
        setField(term156845, term156845.getClass(), "_typeResolverBuilder", null);
        setField(term156845, term156845.getClass(), "_dateFormat", null);
        setField(term156845, term156845.getClass(), "_handlerInstantiator", null);
        setField(term156845, term156845.getClass(), "_locale", null);
        setField(term156845, term156845.getClass(), "_timeZone", null);
        setField(term156845, term156845.getClass(), "_defaultBase64", null);
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
        args[0] = term154556;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term156828));
        assertTrue(recursiveEquals(term154556, term156845));
    }

};


