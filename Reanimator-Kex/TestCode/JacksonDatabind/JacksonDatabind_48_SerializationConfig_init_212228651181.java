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

public class SerializationConfig_init_212228651181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97159;
     Object term99484;
     Object term99501;

    public SerializationConfig_init_212228651181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96911 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer");
        Object term96775 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term96875 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term97031 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        setField(term96775, term96775.getClass(), "_base", term96875);
        setIntField(term96775, term96775.getClass(), "_mapperFeatures", 0);
        setField(term96775, term96775.getClass(), "_mixIns", null);
        setField(term96775, term96775.getClass(), "_subtypeResolver", null);
        setField(term96775, term96775.getClass(), "_rootNames", null);
        setField(term96775, term96775.getClass(), "_rootName", null);
        setField(term96775, term96775.getClass(), "_view", term96911);
        setField(term96775, term96775.getClass(), "_attributes", term97031);
        term97159 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Class<? extends Object> term99722 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term99721 = ((Class) term99722).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term99721).setAccessible(true);
        Object enum18 = ((Field) term99721).get((Object) null);
        term99484 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term99485 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term99486 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term99487 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term99488 = (char[]) newCharArray(32);
        Object term99491 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term99494 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term99498 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term99499 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term99500 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term99484, term99484.getClass(), "_filterProvider", null);
        setField(term99485, term99485.getClass(), "_arrayIndenter", term99486);
        setCharElement(term99488, 0, (char) 32);
        setCharElement(term99488, 1, (char) 32);
        setCharElement(term99488, 2, (char) 32);
        setCharElement(term99488, 3, (char) 32);
        setCharElement(term99488, 4, (char) 32);
        setCharElement(term99488, 5, (char) 32);
        setCharElement(term99488, 6, (char) 32);
        setCharElement(term99488, 7, (char) 32);
        setCharElement(term99488, 8, (char) 32);
        setCharElement(term99488, 9, (char) 32);
        setCharElement(term99488, 10, (char) 32);
        setCharElement(term99488, 11, (char) 32);
        setCharElement(term99488, 12, (char) 32);
        setCharElement(term99488, 13, (char) 32);
        setCharElement(term99488, 14, (char) 32);
        setCharElement(term99488, 15, (char) 32);
        setCharElement(term99488, 16, (char) 32);
        setCharElement(term99488, 17, (char) 32);
        setCharElement(term99488, 18, (char) 32);
        setCharElement(term99488, 19, (char) 32);
        setCharElement(term99488, 20, (char) 32);
        setCharElement(term99488, 21, (char) 32);
        setCharElement(term99488, 22, (char) 32);
        setCharElement(term99488, 23, (char) 32);
        setCharElement(term99488, 24, (char) 32);
        setCharElement(term99488, 25, (char) 32);
        setCharElement(term99488, 26, (char) 32);
        setCharElement(term99488, 27, (char) 32);
        setCharElement(term99488, 28, (char) 32);
        setCharElement(term99488, 29, (char) 32);
        setCharElement(term99488, 30, (char) 32);
        setCharElement(term99488, 31, (char) 32);
        setField(term99487, term99487.getClass(), "indents", term99488);
        setIntField(term99487, term99487.getClass(), "charsPerLevel", 2);
        setField(term99487, term99487.getClass(), "eol", "\n");
        setField(term99485, term99485.getClass(), "_objectIndenter", term99487);
        setField(term99491, term99491.getClass(), "_value", " ");
        setField(term99491, term99491.getClass(), "_quotedUTF8Ref", null);
        setField(term99491, term99491.getClass(), "_unquotedUTF8Ref", null);
        setField(term99491, term99491.getClass(), "_quotedChars", null);
        setField(term99491, term99491.getClass(), "_jdkSerializeValue", null);
        setField(term99485, term99485.getClass(), "_rootSeparator", term99491);
        setBooleanField(term99485, term99485.getClass(), "_spacesInObjectEntries", true);
        setIntField(term99485, term99485.getClass(), "_nesting", 0);
        setField(term99484, term99484.getClass(), "_defaultPrettyPrinter", term99485);
        setIntField(term99484, term99484.getClass(), "_serFeatures", 2722236);
        setIntField(term99484, term99484.getClass(), "_generatorFeatures", 0);
        setIntField(term99484, term99484.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term99484, term99484.getClass(), "_formatWriteFeatures", 0);
        setIntField(term99484, term99484.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term99494, term99494.getClass(), "_valueInclusion", enum18);
        setField(term99494, term99494.getClass(), "_contentInclusion", enum18);
        setField(term99484, term99484.getClass(), "_serializationInclusion", term99494);
        setField(term99498, term99498.getClass(), "_overrides", null);
        setField(term99498, term99498.getClass(), "_localMixIns", null);
        setField(term99484, term99484.getClass(), "_mixIns", term99498);
        setField(term99484, term99484.getClass(), "_subtypeResolver", null);
        setField(term99484, term99484.getClass(), "_rootName", null);
        setField(term99484, term99484.getClass(), "_view", null);
        setField(term99500, term99500.getClass(), "keySet", null);
        setField(term99500, term99500.getClass(), "values", null);
        setField(term99499, term99499.getClass(), "_shared", term99500);
        setField(term99499, term99499.getClass(), "_nonShared", null);
        setField(term99484, term99484.getClass(), "_attributes", term99499);
        setField(term99484, term99484.getClass(), "_rootNames", null);
        setIntField(term99484, term99484.getClass(), "_mapperFeatures", 1068991);
        setField(term99484, term99484.getClass(), "_base", null);
        term99501 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term99501, term99501.getClass(), "_overrides", null);
        setField(term99501, term99501.getClass(), "_localMixIns", null);
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
        args[2] = term97159;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term99484));
        assertTrue(recursiveEquals(term97159, term99501));
    }

};


