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

public class SerializationConfig_init_212228651155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53377;

    public SerializationConfig_init_212228651155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51106 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term51106, term51106.getClass(), "_base", null);
        setIntField(term51106, term51106.getClass(), "_mapperFeatures", 0);
        setField(term51106, term51106.getClass(), "_mixIns", null);
        setField(term51106, term51106.getClass(), "_subtypeResolver", null);
        setField(term51106, term51106.getClass(), "_rootNames", null);
        setField(term51106, term51106.getClass(), "_rootName", null);
        setField(term51106, term51106.getClass(), "_view", null);
        setField(term51106, term51106.getClass(), "_attributes", null);
        Class<? extends Object> term53428 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term53427 = ((Class) term53428).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term53427).setAccessible(true);
        Object enum7 = ((Field) term53427).get((Object) null);
        term53377 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term53378 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term53379 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term53380 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term53381 = (char[]) newCharArray(32);
        Object term53384 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term53387 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term53391 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term53392 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term53377, term53377.getClass(), "_filterProvider", null);
        setField(term53378, term53378.getClass(), "_arrayIndenter", term53379);
        setCharElement(term53381, 0, (char) 32);
        setCharElement(term53381, 1, (char) 32);
        setCharElement(term53381, 2, (char) 32);
        setCharElement(term53381, 3, (char) 32);
        setCharElement(term53381, 4, (char) 32);
        setCharElement(term53381, 5, (char) 32);
        setCharElement(term53381, 6, (char) 32);
        setCharElement(term53381, 7, (char) 32);
        setCharElement(term53381, 8, (char) 32);
        setCharElement(term53381, 9, (char) 32);
        setCharElement(term53381, 10, (char) 32);
        setCharElement(term53381, 11, (char) 32);
        setCharElement(term53381, 12, (char) 32);
        setCharElement(term53381, 13, (char) 32);
        setCharElement(term53381, 14, (char) 32);
        setCharElement(term53381, 15, (char) 32);
        setCharElement(term53381, 16, (char) 32);
        setCharElement(term53381, 17, (char) 32);
        setCharElement(term53381, 18, (char) 32);
        setCharElement(term53381, 19, (char) 32);
        setCharElement(term53381, 20, (char) 32);
        setCharElement(term53381, 21, (char) 32);
        setCharElement(term53381, 22, (char) 32);
        setCharElement(term53381, 23, (char) 32);
        setCharElement(term53381, 24, (char) 32);
        setCharElement(term53381, 25, (char) 32);
        setCharElement(term53381, 26, (char) 32);
        setCharElement(term53381, 27, (char) 32);
        setCharElement(term53381, 28, (char) 32);
        setCharElement(term53381, 29, (char) 32);
        setCharElement(term53381, 30, (char) 32);
        setCharElement(term53381, 31, (char) 32);
        setField(term53380, term53380.getClass(), "indents", term53381);
        setIntField(term53380, term53380.getClass(), "charsPerLevel", 2);
        setField(term53380, term53380.getClass(), "eol", "\n");
        setField(term53378, term53378.getClass(), "_objectIndenter", term53380);
        setField(term53384, term53384.getClass(), "_value", " ");
        setField(term53384, term53384.getClass(), "_quotedUTF8Ref", null);
        setField(term53384, term53384.getClass(), "_unquotedUTF8Ref", null);
        setField(term53384, term53384.getClass(), "_quotedChars", null);
        setField(term53384, term53384.getClass(), "_jdkSerializeValue", null);
        setField(term53378, term53378.getClass(), "_rootSeparator", term53384);
        setBooleanField(term53378, term53378.getClass(), "_spacesInObjectEntries", true);
        setIntField(term53378, term53378.getClass(), "_nesting", 0);
        setField(term53377, term53377.getClass(), "_defaultPrettyPrinter", term53378);
        setIntField(term53377, term53377.getClass(), "_serFeatures", 2722236);
        setIntField(term53377, term53377.getClass(), "_generatorFeatures", 0);
        setIntField(term53377, term53377.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term53377, term53377.getClass(), "_formatWriteFeatures", 0);
        setIntField(term53377, term53377.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term53387, term53387.getClass(), "_valueInclusion", enum7);
        setField(term53387, term53387.getClass(), "_contentInclusion", enum7);
        setField(term53377, term53377.getClass(), "_serializationInclusion", term53387);
        setField(term53377, term53377.getClass(), "_mixIns", null);
        setField(term53377, term53377.getClass(), "_subtypeResolver", null);
        setField(term53377, term53377.getClass(), "_rootName", null);
        setField(term53377, term53377.getClass(), "_view", null);
        setField(term53392, term53392.getClass(), "keySet", null);
        setField(term53392, term53392.getClass(), "values", null);
        setField(term53391, term53391.getClass(), "_shared", term53392);
        setField(term53391, term53391.getClass(), "_nonShared", null);
        setField(term53377, term53377.getClass(), "_attributes", term53391);
        setField(term53377, term53377.getClass(), "_rootNames", null);
        setIntField(term53377, term53377.getClass(), "_mapperFeatures", 1068991);
        setField(term53377, term53377.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term53377));
    }

};


