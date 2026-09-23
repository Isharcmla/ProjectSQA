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

public class SerializationConfig_init_212228651174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90445;

    public SerializationConfig_init_212228651174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term88008 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term88008, term88008.getClass(), "_base", null);
        setIntField(term88008, term88008.getClass(), "_mapperFeatures", 0);
        setField(term88008, term88008.getClass(), "_mixIns", null);
        setField(term88008, term88008.getClass(), "_subtypeResolver", null);
        setField(term88008, term88008.getClass(), "_rootNames", null);
        setField(term88008, term88008.getClass(), "_rootName", null);
        setField(term88008, term88008.getClass(), "_view", null);
        setField(term88008, term88008.getClass(), "_attributes", null);
        Class<? extends Object> term90496 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term90495 = ((Class) term90496).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term90495).setAccessible(true);
        Object enum16 = ((Field) term90495).get((Object) null);
        term90445 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term90446 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term90447 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term90448 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term90449 = (char[]) newCharArray(32);
        Object term90452 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term90455 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term90459 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term90460 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term90445, term90445.getClass(), "_filterProvider", null);
        setField(term90446, term90446.getClass(), "_arrayIndenter", term90447);
        setCharElement(term90449, 0, (char) 32);
        setCharElement(term90449, 1, (char) 32);
        setCharElement(term90449, 2, (char) 32);
        setCharElement(term90449, 3, (char) 32);
        setCharElement(term90449, 4, (char) 32);
        setCharElement(term90449, 5, (char) 32);
        setCharElement(term90449, 6, (char) 32);
        setCharElement(term90449, 7, (char) 32);
        setCharElement(term90449, 8, (char) 32);
        setCharElement(term90449, 9, (char) 32);
        setCharElement(term90449, 10, (char) 32);
        setCharElement(term90449, 11, (char) 32);
        setCharElement(term90449, 12, (char) 32);
        setCharElement(term90449, 13, (char) 32);
        setCharElement(term90449, 14, (char) 32);
        setCharElement(term90449, 15, (char) 32);
        setCharElement(term90449, 16, (char) 32);
        setCharElement(term90449, 17, (char) 32);
        setCharElement(term90449, 18, (char) 32);
        setCharElement(term90449, 19, (char) 32);
        setCharElement(term90449, 20, (char) 32);
        setCharElement(term90449, 21, (char) 32);
        setCharElement(term90449, 22, (char) 32);
        setCharElement(term90449, 23, (char) 32);
        setCharElement(term90449, 24, (char) 32);
        setCharElement(term90449, 25, (char) 32);
        setCharElement(term90449, 26, (char) 32);
        setCharElement(term90449, 27, (char) 32);
        setCharElement(term90449, 28, (char) 32);
        setCharElement(term90449, 29, (char) 32);
        setCharElement(term90449, 30, (char) 32);
        setCharElement(term90449, 31, (char) 32);
        setField(term90448, term90448.getClass(), "indents", term90449);
        setIntField(term90448, term90448.getClass(), "charsPerLevel", 2);
        setField(term90448, term90448.getClass(), "eol", "\n");
        setField(term90446, term90446.getClass(), "_objectIndenter", term90448);
        setField(term90452, term90452.getClass(), "_value", " ");
        setField(term90452, term90452.getClass(), "_quotedUTF8Ref", null);
        setField(term90452, term90452.getClass(), "_unquotedUTF8Ref", null);
        setField(term90452, term90452.getClass(), "_quotedChars", null);
        setField(term90452, term90452.getClass(), "_jdkSerializeValue", null);
        setField(term90446, term90446.getClass(), "_rootSeparator", term90452);
        setBooleanField(term90446, term90446.getClass(), "_spacesInObjectEntries", true);
        setIntField(term90446, term90446.getClass(), "_nesting", 0);
        setField(term90445, term90445.getClass(), "_defaultPrettyPrinter", term90446);
        setIntField(term90445, term90445.getClass(), "_serFeatures", 2722236);
        setIntField(term90445, term90445.getClass(), "_generatorFeatures", 0);
        setIntField(term90445, term90445.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term90445, term90445.getClass(), "_formatWriteFeatures", 0);
        setIntField(term90445, term90445.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term90455, term90455.getClass(), "_valueInclusion", enum16);
        setField(term90455, term90455.getClass(), "_contentInclusion", enum16);
        setField(term90445, term90445.getClass(), "_serializationInclusion", term90455);
        setField(term90445, term90445.getClass(), "_mixIns", null);
        setField(term90445, term90445.getClass(), "_subtypeResolver", null);
        setField(term90445, term90445.getClass(), "_rootName", null);
        setField(term90445, term90445.getClass(), "_view", null);
        setField(term90460, term90460.getClass(), "keySet", null);
        setField(term90460, term90460.getClass(), "values", null);
        setField(term90459, term90459.getClass(), "_shared", term90460);
        setField(term90459, term90459.getClass(), "_nonShared", null);
        setField(term90445, term90445.getClass(), "_attributes", term90459);
        setField(term90445, term90445.getClass(), "_rootNames", null);
        setIntField(term90445, term90445.getClass(), "_mapperFeatures", 1068991);
        setField(term90445, term90445.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term90445));
    }

};


