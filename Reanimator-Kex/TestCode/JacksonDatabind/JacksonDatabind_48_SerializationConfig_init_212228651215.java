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

public class SerializationConfig_init_212228651215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152813;

    public SerializationConfig_init_212228651215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term150542 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term150542, term150542.getClass(), "_base", null);
        setIntField(term150542, term150542.getClass(), "_mapperFeatures", 0);
        setField(term150542, term150542.getClass(), "_mixIns", null);
        setField(term150542, term150542.getClass(), "_subtypeResolver", null);
        setField(term150542, term150542.getClass(), "_rootNames", null);
        setField(term150542, term150542.getClass(), "_rootName", null);
        setField(term150542, term150542.getClass(), "_view", null);
        setField(term150542, term150542.getClass(), "_attributes", null);
        Class<? extends Object> term152864 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term152863 = ((Class) term152864).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term152863).setAccessible(true);
        Object enum31 = ((Field) term152863).get((Object) null);
        term152813 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term152814 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term152815 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term152816 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term152817 = (char[]) newCharArray(32);
        Object term152820 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term152823 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term152827 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term152828 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term152813, term152813.getClass(), "_filterProvider", null);
        setField(term152814, term152814.getClass(), "_arrayIndenter", term152815);
        setCharElement(term152817, 0, (char) 32);
        setCharElement(term152817, 1, (char) 32);
        setCharElement(term152817, 2, (char) 32);
        setCharElement(term152817, 3, (char) 32);
        setCharElement(term152817, 4, (char) 32);
        setCharElement(term152817, 5, (char) 32);
        setCharElement(term152817, 6, (char) 32);
        setCharElement(term152817, 7, (char) 32);
        setCharElement(term152817, 8, (char) 32);
        setCharElement(term152817, 9, (char) 32);
        setCharElement(term152817, 10, (char) 32);
        setCharElement(term152817, 11, (char) 32);
        setCharElement(term152817, 12, (char) 32);
        setCharElement(term152817, 13, (char) 32);
        setCharElement(term152817, 14, (char) 32);
        setCharElement(term152817, 15, (char) 32);
        setCharElement(term152817, 16, (char) 32);
        setCharElement(term152817, 17, (char) 32);
        setCharElement(term152817, 18, (char) 32);
        setCharElement(term152817, 19, (char) 32);
        setCharElement(term152817, 20, (char) 32);
        setCharElement(term152817, 21, (char) 32);
        setCharElement(term152817, 22, (char) 32);
        setCharElement(term152817, 23, (char) 32);
        setCharElement(term152817, 24, (char) 32);
        setCharElement(term152817, 25, (char) 32);
        setCharElement(term152817, 26, (char) 32);
        setCharElement(term152817, 27, (char) 32);
        setCharElement(term152817, 28, (char) 32);
        setCharElement(term152817, 29, (char) 32);
        setCharElement(term152817, 30, (char) 32);
        setCharElement(term152817, 31, (char) 32);
        setField(term152816, term152816.getClass(), "indents", term152817);
        setIntField(term152816, term152816.getClass(), "charsPerLevel", 2);
        setField(term152816, term152816.getClass(), "eol", "\n");
        setField(term152814, term152814.getClass(), "_objectIndenter", term152816);
        setField(term152820, term152820.getClass(), "_value", " ");
        setField(term152820, term152820.getClass(), "_quotedUTF8Ref", null);
        setField(term152820, term152820.getClass(), "_unquotedUTF8Ref", null);
        setField(term152820, term152820.getClass(), "_quotedChars", null);
        setField(term152820, term152820.getClass(), "_jdkSerializeValue", null);
        setField(term152814, term152814.getClass(), "_rootSeparator", term152820);
        setBooleanField(term152814, term152814.getClass(), "_spacesInObjectEntries", true);
        setIntField(term152814, term152814.getClass(), "_nesting", 0);
        setField(term152813, term152813.getClass(), "_defaultPrettyPrinter", term152814);
        setIntField(term152813, term152813.getClass(), "_serFeatures", 2722236);
        setIntField(term152813, term152813.getClass(), "_generatorFeatures", 0);
        setIntField(term152813, term152813.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term152813, term152813.getClass(), "_formatWriteFeatures", 0);
        setIntField(term152813, term152813.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term152823, term152823.getClass(), "_valueInclusion", enum31);
        setField(term152823, term152823.getClass(), "_contentInclusion", enum31);
        setField(term152813, term152813.getClass(), "_serializationInclusion", term152823);
        setField(term152813, term152813.getClass(), "_mixIns", null);
        setField(term152813, term152813.getClass(), "_subtypeResolver", null);
        setField(term152813, term152813.getClass(), "_rootName", null);
        setField(term152813, term152813.getClass(), "_view", null);
        setField(term152828, term152828.getClass(), "keySet", null);
        setField(term152828, term152828.getClass(), "values", null);
        setField(term152827, term152827.getClass(), "_shared", term152828);
        setField(term152827, term152827.getClass(), "_nonShared", null);
        setField(term152813, term152813.getClass(), "_attributes", term152827);
        setField(term152813, term152813.getClass(), "_rootNames", null);
        setIntField(term152813, term152813.getClass(), "_mapperFeatures", 1068991);
        setField(term152813, term152813.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term152813));
    }

};


