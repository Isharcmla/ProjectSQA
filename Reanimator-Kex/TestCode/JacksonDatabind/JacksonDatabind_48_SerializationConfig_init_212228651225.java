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

public class SerializationConfig_init_212228651225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171272;
     Object term173544;
     Object term173561;

    public SerializationConfig_init_212228651225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term171040 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term171140 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term171040, term171040.getClass(), "_base", term171140);
        setIntField(term171040, term171040.getClass(), "_mapperFeatures", 0);
        setField(term171040, term171040.getClass(), "_mixIns", null);
        setField(term171040, term171040.getClass(), "_subtypeResolver", null);
        setField(term171040, term171040.getClass(), "_rootNames", null);
        setField(term171040, term171040.getClass(), "_rootName", null);
        setField(term171040, term171040.getClass(), "_view", null);
        setField(term171040, term171040.getClass(), "_attributes", null);
        term171272 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        Class<? extends Object> term173597 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term173596 = ((Class) term173597).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term173596).setAccessible(true);
        Object enum36 = ((Field) term173596).get((Object) null);
        term173544 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term173545 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term173546 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term173547 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term173548 = (char[]) newCharArray(32);
        Object term173551 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term173554 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term173558 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        Object term173559 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term173560 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term173544, term173544.getClass(), "_filterProvider", null);
        setField(term173545, term173545.getClass(), "_arrayIndenter", term173546);
        setCharElement(term173548, 0, (char) 32);
        setCharElement(term173548, 1, (char) 32);
        setCharElement(term173548, 2, (char) 32);
        setCharElement(term173548, 3, (char) 32);
        setCharElement(term173548, 4, (char) 32);
        setCharElement(term173548, 5, (char) 32);
        setCharElement(term173548, 6, (char) 32);
        setCharElement(term173548, 7, (char) 32);
        setCharElement(term173548, 8, (char) 32);
        setCharElement(term173548, 9, (char) 32);
        setCharElement(term173548, 10, (char) 32);
        setCharElement(term173548, 11, (char) 32);
        setCharElement(term173548, 12, (char) 32);
        setCharElement(term173548, 13, (char) 32);
        setCharElement(term173548, 14, (char) 32);
        setCharElement(term173548, 15, (char) 32);
        setCharElement(term173548, 16, (char) 32);
        setCharElement(term173548, 17, (char) 32);
        setCharElement(term173548, 18, (char) 32);
        setCharElement(term173548, 19, (char) 32);
        setCharElement(term173548, 20, (char) 32);
        setCharElement(term173548, 21, (char) 32);
        setCharElement(term173548, 22, (char) 32);
        setCharElement(term173548, 23, (char) 32);
        setCharElement(term173548, 24, (char) 32);
        setCharElement(term173548, 25, (char) 32);
        setCharElement(term173548, 26, (char) 32);
        setCharElement(term173548, 27, (char) 32);
        setCharElement(term173548, 28, (char) 32);
        setCharElement(term173548, 29, (char) 32);
        setCharElement(term173548, 30, (char) 32);
        setCharElement(term173548, 31, (char) 32);
        setField(term173547, term173547.getClass(), "indents", term173548);
        setIntField(term173547, term173547.getClass(), "charsPerLevel", 2);
        setField(term173547, term173547.getClass(), "eol", "\n");
        setField(term173545, term173545.getClass(), "_objectIndenter", term173547);
        setField(term173551, term173551.getClass(), "_value", " ");
        setField(term173551, term173551.getClass(), "_quotedUTF8Ref", null);
        setField(term173551, term173551.getClass(), "_unquotedUTF8Ref", null);
        setField(term173551, term173551.getClass(), "_quotedChars", null);
        setField(term173551, term173551.getClass(), "_jdkSerializeValue", null);
        setField(term173545, term173545.getClass(), "_rootSeparator", term173551);
        setBooleanField(term173545, term173545.getClass(), "_spacesInObjectEntries", true);
        setIntField(term173545, term173545.getClass(), "_nesting", 0);
        setField(term173544, term173544.getClass(), "_defaultPrettyPrinter", term173545);
        setIntField(term173544, term173544.getClass(), "_serFeatures", 2722236);
        setIntField(term173544, term173544.getClass(), "_generatorFeatures", 0);
        setIntField(term173544, term173544.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term173544, term173544.getClass(), "_formatWriteFeatures", 0);
        setIntField(term173544, term173544.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term173554, term173554.getClass(), "_valueInclusion", enum36);
        setField(term173554, term173554.getClass(), "_contentInclusion", enum36);
        setField(term173544, term173544.getClass(), "_serializationInclusion", term173554);
        setField(term173544, term173544.getClass(), "_mixIns", null);
        setField(term173558, term173558.getClass(), "_registeredSubtypes", null);
        setField(term173544, term173544.getClass(), "_subtypeResolver", term173558);
        setField(term173544, term173544.getClass(), "_rootName", null);
        setField(term173544, term173544.getClass(), "_view", null);
        setField(term173560, term173560.getClass(), "keySet", null);
        setField(term173560, term173560.getClass(), "values", null);
        setField(term173559, term173559.getClass(), "_shared", term173560);
        setField(term173559, term173559.getClass(), "_nonShared", null);
        setField(term173544, term173544.getClass(), "_attributes", term173559);
        setField(term173544, term173544.getClass(), "_rootNames", null);
        setIntField(term173544, term173544.getClass(), "_mapperFeatures", 1068991);
        setField(term173544, term173544.getClass(), "_base", null);
        term173561 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        setField(term173561, term173561.getClass(), "_registeredSubtypes", null);
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
        args[1] = term171272;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term173544));
        assertTrue(recursiveEquals(term171272, term173561));
    }

};


