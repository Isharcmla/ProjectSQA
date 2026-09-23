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

public class SerializationConfig_init_212228651227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175540;
     Object term177931;
     Object term177948;

    public SerializationConfig_init_212228651227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term175412 = Class.forName((String) "java.nio.charset.CoderMalfunctionError");
        Object term175276 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term175376 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term175276, term175276.getClass(), "_base", term175376);
        setIntField(term175276, term175276.getClass(), "_mapperFeatures", 0);
        setField(term175276, term175276.getClass(), "_mixIns", null);
        setField(term175276, term175276.getClass(), "_subtypeResolver", null);
        setField(term175276, term175276.getClass(), "_rootNames", null);
        setField(term175276, term175276.getClass(), "_rootName", null);
        setField(term175276, term175276.getClass(), "_view", term175412);
        setField(term175276, term175276.getClass(), "_attributes", null);
        term175540 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Class<? extends Object> term178100 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term178099 = ((Class) term178100).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term178099).setAccessible(true);
        Object enum37 = ((Field) term178099).get((Object) null);
        term177931 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term177932 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term177933 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term177934 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term177935 = (char[]) newCharArray(32);
        Object term177938 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term177941 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term177945 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term177946 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term177947 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term177931, term177931.getClass(), "_filterProvider", null);
        setField(term177932, term177932.getClass(), "_arrayIndenter", term177933);
        setCharElement(term177935, 0, (char) 32);
        setCharElement(term177935, 1, (char) 32);
        setCharElement(term177935, 2, (char) 32);
        setCharElement(term177935, 3, (char) 32);
        setCharElement(term177935, 4, (char) 32);
        setCharElement(term177935, 5, (char) 32);
        setCharElement(term177935, 6, (char) 32);
        setCharElement(term177935, 7, (char) 32);
        setCharElement(term177935, 8, (char) 32);
        setCharElement(term177935, 9, (char) 32);
        setCharElement(term177935, 10, (char) 32);
        setCharElement(term177935, 11, (char) 32);
        setCharElement(term177935, 12, (char) 32);
        setCharElement(term177935, 13, (char) 32);
        setCharElement(term177935, 14, (char) 32);
        setCharElement(term177935, 15, (char) 32);
        setCharElement(term177935, 16, (char) 32);
        setCharElement(term177935, 17, (char) 32);
        setCharElement(term177935, 18, (char) 32);
        setCharElement(term177935, 19, (char) 32);
        setCharElement(term177935, 20, (char) 32);
        setCharElement(term177935, 21, (char) 32);
        setCharElement(term177935, 22, (char) 32);
        setCharElement(term177935, 23, (char) 32);
        setCharElement(term177935, 24, (char) 32);
        setCharElement(term177935, 25, (char) 32);
        setCharElement(term177935, 26, (char) 32);
        setCharElement(term177935, 27, (char) 32);
        setCharElement(term177935, 28, (char) 32);
        setCharElement(term177935, 29, (char) 32);
        setCharElement(term177935, 30, (char) 32);
        setCharElement(term177935, 31, (char) 32);
        setField(term177934, term177934.getClass(), "indents", term177935);
        setIntField(term177934, term177934.getClass(), "charsPerLevel", 2);
        setField(term177934, term177934.getClass(), "eol", "\n");
        setField(term177932, term177932.getClass(), "_objectIndenter", term177934);
        setField(term177938, term177938.getClass(), "_value", " ");
        setField(term177938, term177938.getClass(), "_quotedUTF8Ref", null);
        setField(term177938, term177938.getClass(), "_unquotedUTF8Ref", null);
        setField(term177938, term177938.getClass(), "_quotedChars", null);
        setField(term177938, term177938.getClass(), "_jdkSerializeValue", null);
        setField(term177932, term177932.getClass(), "_rootSeparator", term177938);
        setBooleanField(term177932, term177932.getClass(), "_spacesInObjectEntries", true);
        setIntField(term177932, term177932.getClass(), "_nesting", 0);
        setField(term177931, term177931.getClass(), "_defaultPrettyPrinter", term177932);
        setIntField(term177931, term177931.getClass(), "_serFeatures", 2722236);
        setIntField(term177931, term177931.getClass(), "_generatorFeatures", 0);
        setIntField(term177931, term177931.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term177931, term177931.getClass(), "_formatWriteFeatures", 0);
        setIntField(term177931, term177931.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term177941, term177941.getClass(), "_valueInclusion", enum37);
        setField(term177941, term177941.getClass(), "_contentInclusion", enum37);
        setField(term177931, term177931.getClass(), "_serializationInclusion", term177941);
        setField(term177945, term177945.getClass(), "_overrides", null);
        setField(term177945, term177945.getClass(), "_localMixIns", null);
        setField(term177931, term177931.getClass(), "_mixIns", term177945);
        setField(term177931, term177931.getClass(), "_subtypeResolver", null);
        setField(term177931, term177931.getClass(), "_rootName", null);
        setField(term177931, term177931.getClass(), "_view", null);
        setField(term177947, term177947.getClass(), "keySet", null);
        setField(term177947, term177947.getClass(), "values", null);
        setField(term177946, term177946.getClass(), "_shared", term177947);
        setField(term177946, term177946.getClass(), "_nonShared", null);
        setField(term177931, term177931.getClass(), "_attributes", term177946);
        setField(term177931, term177931.getClass(), "_rootNames", null);
        setIntField(term177931, term177931.getClass(), "_mapperFeatures", 1068991);
        setField(term177931, term177931.getClass(), "_base", null);
        term177948 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term177948, term177948.getClass(), "_overrides", null);
        setField(term177948, term177948.getClass(), "_localMixIns", null);
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
        args[2] = term175540;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term177931));
        assertTrue(recursiveEquals(term175540, term177948));
    }

};


