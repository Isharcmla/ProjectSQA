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

public class SerializationConfig_init_212228651161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64085;
     Object term66357;
     Object term66374;

    public SerializationConfig_init_212228651161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63857 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term63957 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term63857, term63857.getClass(), "_base", term63957);
        setIntField(term63857, term63857.getClass(), "_mapperFeatures", 0);
        setField(term63857, term63857.getClass(), "_mixIns", null);
        setField(term63857, term63857.getClass(), "_subtypeResolver", null);
        setField(term63857, term63857.getClass(), "_rootNames", null);
        setField(term63857, term63857.getClass(), "_rootName", null);
        setField(term63857, term63857.getClass(), "_view", null);
        setField(term63857, term63857.getClass(), "_attributes", null);
        term64085 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Class<? extends Object> term66410 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term66409 = ((Class) term66410).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term66409).setAccessible(true);
        Object enum10 = ((Field) term66409).get((Object) null);
        term66357 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term66358 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term66359 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term66360 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term66361 = (char[]) newCharArray(32);
        Object term66364 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term66367 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term66371 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term66372 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term66373 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term66357, term66357.getClass(), "_filterProvider", null);
        setField(term66358, term66358.getClass(), "_arrayIndenter", term66359);
        setCharElement(term66361, 0, (char) 32);
        setCharElement(term66361, 1, (char) 32);
        setCharElement(term66361, 2, (char) 32);
        setCharElement(term66361, 3, (char) 32);
        setCharElement(term66361, 4, (char) 32);
        setCharElement(term66361, 5, (char) 32);
        setCharElement(term66361, 6, (char) 32);
        setCharElement(term66361, 7, (char) 32);
        setCharElement(term66361, 8, (char) 32);
        setCharElement(term66361, 9, (char) 32);
        setCharElement(term66361, 10, (char) 32);
        setCharElement(term66361, 11, (char) 32);
        setCharElement(term66361, 12, (char) 32);
        setCharElement(term66361, 13, (char) 32);
        setCharElement(term66361, 14, (char) 32);
        setCharElement(term66361, 15, (char) 32);
        setCharElement(term66361, 16, (char) 32);
        setCharElement(term66361, 17, (char) 32);
        setCharElement(term66361, 18, (char) 32);
        setCharElement(term66361, 19, (char) 32);
        setCharElement(term66361, 20, (char) 32);
        setCharElement(term66361, 21, (char) 32);
        setCharElement(term66361, 22, (char) 32);
        setCharElement(term66361, 23, (char) 32);
        setCharElement(term66361, 24, (char) 32);
        setCharElement(term66361, 25, (char) 32);
        setCharElement(term66361, 26, (char) 32);
        setCharElement(term66361, 27, (char) 32);
        setCharElement(term66361, 28, (char) 32);
        setCharElement(term66361, 29, (char) 32);
        setCharElement(term66361, 30, (char) 32);
        setCharElement(term66361, 31, (char) 32);
        setField(term66360, term66360.getClass(), "indents", term66361);
        setIntField(term66360, term66360.getClass(), "charsPerLevel", 2);
        setField(term66360, term66360.getClass(), "eol", "\n");
        setField(term66358, term66358.getClass(), "_objectIndenter", term66360);
        setField(term66364, term66364.getClass(), "_value", " ");
        setField(term66364, term66364.getClass(), "_quotedUTF8Ref", null);
        setField(term66364, term66364.getClass(), "_unquotedUTF8Ref", null);
        setField(term66364, term66364.getClass(), "_quotedChars", null);
        setField(term66364, term66364.getClass(), "_jdkSerializeValue", null);
        setField(term66358, term66358.getClass(), "_rootSeparator", term66364);
        setBooleanField(term66358, term66358.getClass(), "_spacesInObjectEntries", true);
        setIntField(term66358, term66358.getClass(), "_nesting", 0);
        setField(term66357, term66357.getClass(), "_defaultPrettyPrinter", term66358);
        setIntField(term66357, term66357.getClass(), "_serFeatures", 2722236);
        setIntField(term66357, term66357.getClass(), "_generatorFeatures", 0);
        setIntField(term66357, term66357.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term66357, term66357.getClass(), "_formatWriteFeatures", 0);
        setIntField(term66357, term66357.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term66367, term66367.getClass(), "_valueInclusion", enum10);
        setField(term66367, term66367.getClass(), "_contentInclusion", enum10);
        setField(term66357, term66357.getClass(), "_serializationInclusion", term66367);
        setField(term66371, term66371.getClass(), "_overrides", null);
        setField(term66371, term66371.getClass(), "_localMixIns", null);
        setField(term66357, term66357.getClass(), "_mixIns", term66371);
        setField(term66357, term66357.getClass(), "_subtypeResolver", null);
        setField(term66357, term66357.getClass(), "_rootName", null);
        setField(term66357, term66357.getClass(), "_view", null);
        setField(term66373, term66373.getClass(), "keySet", null);
        setField(term66373, term66373.getClass(), "values", null);
        setField(term66372, term66372.getClass(), "_shared", term66373);
        setField(term66372, term66372.getClass(), "_nonShared", null);
        setField(term66357, term66357.getClass(), "_attributes", term66372);
        setField(term66357, term66357.getClass(), "_rootNames", null);
        setIntField(term66357, term66357.getClass(), "_mapperFeatures", 1068991);
        setField(term66357, term66357.getClass(), "_base", null);
        term66374 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term66374, term66374.getClass(), "_overrides", null);
        setField(term66374, term66374.getClass(), "_localMixIns", null);
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
        args[2] = term64085;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term66357));
        assertTrue(recursiveEquals(term64085, term66374));
    }

};


