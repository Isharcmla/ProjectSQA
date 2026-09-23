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

public class SerializationConfig_init_212228651187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111513;

    public SerializationConfig_init_212228651187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term109142 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term109242 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term109142, term109142.getClass(), "_base", term109242);
        setIntField(term109142, term109142.getClass(), "_mapperFeatures", 0);
        setField(term109142, term109142.getClass(), "_mixIns", null);
        setField(term109142, term109142.getClass(), "_subtypeResolver", null);
        setField(term109142, term109142.getClass(), "_rootNames", null);
        setField(term109142, term109142.getClass(), "_rootName", null);
        setField(term109142, term109142.getClass(), "_view", null);
        setField(term109142, term109142.getClass(), "_attributes", null);
        Class<? extends Object> term111564 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term111563 = ((Class) term111564).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term111563).setAccessible(true);
        Object enum21 = ((Field) term111563).get((Object) null);
        term111513 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term111514 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term111515 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term111516 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term111517 = (char[]) newCharArray(32);
        Object term111520 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term111523 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term111527 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term111528 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term111513, term111513.getClass(), "_filterProvider", null);
        setField(term111514, term111514.getClass(), "_arrayIndenter", term111515);
        setCharElement(term111517, 0, (char) 32);
        setCharElement(term111517, 1, (char) 32);
        setCharElement(term111517, 2, (char) 32);
        setCharElement(term111517, 3, (char) 32);
        setCharElement(term111517, 4, (char) 32);
        setCharElement(term111517, 5, (char) 32);
        setCharElement(term111517, 6, (char) 32);
        setCharElement(term111517, 7, (char) 32);
        setCharElement(term111517, 8, (char) 32);
        setCharElement(term111517, 9, (char) 32);
        setCharElement(term111517, 10, (char) 32);
        setCharElement(term111517, 11, (char) 32);
        setCharElement(term111517, 12, (char) 32);
        setCharElement(term111517, 13, (char) 32);
        setCharElement(term111517, 14, (char) 32);
        setCharElement(term111517, 15, (char) 32);
        setCharElement(term111517, 16, (char) 32);
        setCharElement(term111517, 17, (char) 32);
        setCharElement(term111517, 18, (char) 32);
        setCharElement(term111517, 19, (char) 32);
        setCharElement(term111517, 20, (char) 32);
        setCharElement(term111517, 21, (char) 32);
        setCharElement(term111517, 22, (char) 32);
        setCharElement(term111517, 23, (char) 32);
        setCharElement(term111517, 24, (char) 32);
        setCharElement(term111517, 25, (char) 32);
        setCharElement(term111517, 26, (char) 32);
        setCharElement(term111517, 27, (char) 32);
        setCharElement(term111517, 28, (char) 32);
        setCharElement(term111517, 29, (char) 32);
        setCharElement(term111517, 30, (char) 32);
        setCharElement(term111517, 31, (char) 32);
        setField(term111516, term111516.getClass(), "indents", term111517);
        setIntField(term111516, term111516.getClass(), "charsPerLevel", 2);
        setField(term111516, term111516.getClass(), "eol", "\n");
        setField(term111514, term111514.getClass(), "_objectIndenter", term111516);
        setField(term111520, term111520.getClass(), "_value", " ");
        setField(term111520, term111520.getClass(), "_quotedUTF8Ref", null);
        setField(term111520, term111520.getClass(), "_unquotedUTF8Ref", null);
        setField(term111520, term111520.getClass(), "_quotedChars", null);
        setField(term111520, term111520.getClass(), "_jdkSerializeValue", null);
        setField(term111514, term111514.getClass(), "_rootSeparator", term111520);
        setBooleanField(term111514, term111514.getClass(), "_spacesInObjectEntries", true);
        setIntField(term111514, term111514.getClass(), "_nesting", 0);
        setField(term111513, term111513.getClass(), "_defaultPrettyPrinter", term111514);
        setIntField(term111513, term111513.getClass(), "_serFeatures", 2722236);
        setIntField(term111513, term111513.getClass(), "_generatorFeatures", 0);
        setIntField(term111513, term111513.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term111513, term111513.getClass(), "_formatWriteFeatures", 0);
        setIntField(term111513, term111513.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term111523, term111523.getClass(), "_valueInclusion", enum21);
        setField(term111523, term111523.getClass(), "_contentInclusion", enum21);
        setField(term111513, term111513.getClass(), "_serializationInclusion", term111523);
        setField(term111513, term111513.getClass(), "_mixIns", null);
        setField(term111513, term111513.getClass(), "_subtypeResolver", null);
        setField(term111513, term111513.getClass(), "_rootName", null);
        setField(term111513, term111513.getClass(), "_view", null);
        setField(term111528, term111528.getClass(), "keySet", null);
        setField(term111528, term111528.getClass(), "values", null);
        setField(term111527, term111527.getClass(), "_shared", term111528);
        setField(term111527, term111527.getClass(), "_nonShared", null);
        setField(term111513, term111513.getClass(), "_attributes", term111527);
        setField(term111513, term111513.getClass(), "_rootNames", null);
        setIntField(term111513, term111513.getClass(), "_mapperFeatures", 1068991);
        setField(term111513, term111513.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term111513));
    }

};


