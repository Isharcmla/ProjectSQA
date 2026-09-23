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

public class SerializationConfig_init_212228651179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92768;
     Object term95117;
     Object term95134;

    public SerializationConfig_init_212228651179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92640 = Class.forName((String) "java.lang.AutoCloseable");
        Object term92398 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term92498 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term92604 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term92398, term92398.getClass(), "_base", term92498);
        setIntField(term92398, term92398.getClass(), "_mapperFeatures", 0);
        setField(term92398, term92398.getClass(), "_mixIns", null);
        setField(term92398, term92398.getClass(), "_subtypeResolver", null);
        setField(term92398, term92398.getClass(), "_rootNames", term92604);
        setField(term92398, term92398.getClass(), "_rootName", null);
        setField(term92398, term92398.getClass(), "_view", term92640);
        setField(term92398, term92398.getClass(), "_attributes", null);
        term92768 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Class<? extends Object> term95241 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term95240 = ((Class) term95241).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term95240).setAccessible(true);
        Object enum17 = ((Field) term95240).get((Object) null);
        term95117 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term95118 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term95119 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term95120 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term95121 = (char[]) newCharArray(32);
        Object term95124 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term95127 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term95131 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term95132 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term95133 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term95117, term95117.getClass(), "_filterProvider", null);
        setField(term95118, term95118.getClass(), "_arrayIndenter", term95119);
        setCharElement(term95121, 0, (char) 32);
        setCharElement(term95121, 1, (char) 32);
        setCharElement(term95121, 2, (char) 32);
        setCharElement(term95121, 3, (char) 32);
        setCharElement(term95121, 4, (char) 32);
        setCharElement(term95121, 5, (char) 32);
        setCharElement(term95121, 6, (char) 32);
        setCharElement(term95121, 7, (char) 32);
        setCharElement(term95121, 8, (char) 32);
        setCharElement(term95121, 9, (char) 32);
        setCharElement(term95121, 10, (char) 32);
        setCharElement(term95121, 11, (char) 32);
        setCharElement(term95121, 12, (char) 32);
        setCharElement(term95121, 13, (char) 32);
        setCharElement(term95121, 14, (char) 32);
        setCharElement(term95121, 15, (char) 32);
        setCharElement(term95121, 16, (char) 32);
        setCharElement(term95121, 17, (char) 32);
        setCharElement(term95121, 18, (char) 32);
        setCharElement(term95121, 19, (char) 32);
        setCharElement(term95121, 20, (char) 32);
        setCharElement(term95121, 21, (char) 32);
        setCharElement(term95121, 22, (char) 32);
        setCharElement(term95121, 23, (char) 32);
        setCharElement(term95121, 24, (char) 32);
        setCharElement(term95121, 25, (char) 32);
        setCharElement(term95121, 26, (char) 32);
        setCharElement(term95121, 27, (char) 32);
        setCharElement(term95121, 28, (char) 32);
        setCharElement(term95121, 29, (char) 32);
        setCharElement(term95121, 30, (char) 32);
        setCharElement(term95121, 31, (char) 32);
        setField(term95120, term95120.getClass(), "indents", term95121);
        setIntField(term95120, term95120.getClass(), "charsPerLevel", 2);
        setField(term95120, term95120.getClass(), "eol", "\n");
        setField(term95118, term95118.getClass(), "_objectIndenter", term95120);
        setField(term95124, term95124.getClass(), "_value", " ");
        setField(term95124, term95124.getClass(), "_quotedUTF8Ref", null);
        setField(term95124, term95124.getClass(), "_unquotedUTF8Ref", null);
        setField(term95124, term95124.getClass(), "_quotedChars", null);
        setField(term95124, term95124.getClass(), "_jdkSerializeValue", null);
        setField(term95118, term95118.getClass(), "_rootSeparator", term95124);
        setBooleanField(term95118, term95118.getClass(), "_spacesInObjectEntries", true);
        setIntField(term95118, term95118.getClass(), "_nesting", 0);
        setField(term95117, term95117.getClass(), "_defaultPrettyPrinter", term95118);
        setIntField(term95117, term95117.getClass(), "_serFeatures", 2722236);
        setIntField(term95117, term95117.getClass(), "_generatorFeatures", 0);
        setIntField(term95117, term95117.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term95117, term95117.getClass(), "_formatWriteFeatures", 0);
        setIntField(term95117, term95117.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term95127, term95127.getClass(), "_valueInclusion", enum17);
        setField(term95127, term95127.getClass(), "_contentInclusion", enum17);
        setField(term95117, term95117.getClass(), "_serializationInclusion", term95127);
        setField(term95131, term95131.getClass(), "_overrides", null);
        setField(term95131, term95131.getClass(), "_localMixIns", null);
        setField(term95117, term95117.getClass(), "_mixIns", term95131);
        setField(term95117, term95117.getClass(), "_subtypeResolver", null);
        setField(term95117, term95117.getClass(), "_rootName", null);
        setField(term95117, term95117.getClass(), "_view", null);
        setField(term95133, term95133.getClass(), "keySet", null);
        setField(term95133, term95133.getClass(), "values", null);
        setField(term95132, term95132.getClass(), "_shared", term95133);
        setField(term95132, term95132.getClass(), "_nonShared", null);
        setField(term95117, term95117.getClass(), "_attributes", term95132);
        setField(term95117, term95117.getClass(), "_rootNames", null);
        setIntField(term95117, term95117.getClass(), "_mapperFeatures", 1068991);
        setField(term95117, term95117.getClass(), "_base", null);
        term95134 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term95134, term95134.getClass(), "_overrides", null);
        setField(term95134, term95134.getClass(), "_localMixIns", null);
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
        args[2] = term92768;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term95117));
        assertTrue(recursiveEquals(term92768, term95134));
    }

};


