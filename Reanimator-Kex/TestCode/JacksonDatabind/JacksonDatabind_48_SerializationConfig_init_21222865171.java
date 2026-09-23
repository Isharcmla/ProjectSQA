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

public class SerializationConfig_init_21222865171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3041;

    public SerializationConfig_init_21222865171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3172 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term3171 = ((Class) term3172).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term3171).setAccessible(true);
        Object enum0 = ((Field) term3171).get((Object) null);
        term3041 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term3042 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term3043 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term3044 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term3045 = (char[]) newCharArray(32);
        Object term3048 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term3051 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term3055 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term3056 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term3041, term3041.getClass(), "_filterProvider", null);
        setField(term3042, term3042.getClass(), "_arrayIndenter", term3043);
        setCharElement(term3045, 0, (char) 32);
        setCharElement(term3045, 1, (char) 32);
        setCharElement(term3045, 2, (char) 32);
        setCharElement(term3045, 3, (char) 32);
        setCharElement(term3045, 4, (char) 32);
        setCharElement(term3045, 5, (char) 32);
        setCharElement(term3045, 6, (char) 32);
        setCharElement(term3045, 7, (char) 32);
        setCharElement(term3045, 8, (char) 32);
        setCharElement(term3045, 9, (char) 32);
        setCharElement(term3045, 10, (char) 32);
        setCharElement(term3045, 11, (char) 32);
        setCharElement(term3045, 12, (char) 32);
        setCharElement(term3045, 13, (char) 32);
        setCharElement(term3045, 14, (char) 32);
        setCharElement(term3045, 15, (char) 32);
        setCharElement(term3045, 16, (char) 32);
        setCharElement(term3045, 17, (char) 32);
        setCharElement(term3045, 18, (char) 32);
        setCharElement(term3045, 19, (char) 32);
        setCharElement(term3045, 20, (char) 32);
        setCharElement(term3045, 21, (char) 32);
        setCharElement(term3045, 22, (char) 32);
        setCharElement(term3045, 23, (char) 32);
        setCharElement(term3045, 24, (char) 32);
        setCharElement(term3045, 25, (char) 32);
        setCharElement(term3045, 26, (char) 32);
        setCharElement(term3045, 27, (char) 32);
        setCharElement(term3045, 28, (char) 32);
        setCharElement(term3045, 29, (char) 32);
        setCharElement(term3045, 30, (char) 32);
        setCharElement(term3045, 31, (char) 32);
        setField(term3044, term3044.getClass(), "indents", term3045);
        setIntField(term3044, term3044.getClass(), "charsPerLevel", 2);
        setField(term3044, term3044.getClass(), "eol", "\n");
        setField(term3042, term3042.getClass(), "_objectIndenter", term3044);
        setField(term3048, term3048.getClass(), "_value", " ");
        setField(term3048, term3048.getClass(), "_quotedUTF8Ref", null);
        setField(term3048, term3048.getClass(), "_unquotedUTF8Ref", null);
        setField(term3048, term3048.getClass(), "_quotedChars", null);
        setField(term3048, term3048.getClass(), "_jdkSerializeValue", null);
        setField(term3042, term3042.getClass(), "_rootSeparator", term3048);
        setBooleanField(term3042, term3042.getClass(), "_spacesInObjectEntries", true);
        setIntField(term3042, term3042.getClass(), "_nesting", 0);
        setField(term3041, term3041.getClass(), "_defaultPrettyPrinter", term3042);
        setIntField(term3041, term3041.getClass(), "_serFeatures", 2722236);
        setIntField(term3041, term3041.getClass(), "_generatorFeatures", 0);
        setIntField(term3041, term3041.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term3041, term3041.getClass(), "_formatWriteFeatures", 0);
        setIntField(term3041, term3041.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term3051, term3051.getClass(), "_valueInclusion", enum0);
        setField(term3051, term3051.getClass(), "_contentInclusion", enum0);
        setField(term3041, term3041.getClass(), "_serializationInclusion", term3051);
        setField(term3041, term3041.getClass(), "_mixIns", null);
        setField(term3041, term3041.getClass(), "_subtypeResolver", null);
        setField(term3041, term3041.getClass(), "_rootName", null);
        setField(term3041, term3041.getClass(), "_view", null);
        setField(term3056, term3056.getClass(), "keySet", null);
        setField(term3056, term3056.getClass(), "values", null);
        setField(term3055, term3055.getClass(), "_shared", term3056);
        setField(term3055, term3055.getClass(), "_nonShared", null);
        setField(term3041, term3041.getClass(), "_attributes", term3055);
        setField(term3041, term3041.getClass(), "_rootNames", null);
        setIntField(term3041, term3041.getClass(), "_mapperFeatures", 1068991);
        setField(term3041, term3041.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term3041));
    }

};


