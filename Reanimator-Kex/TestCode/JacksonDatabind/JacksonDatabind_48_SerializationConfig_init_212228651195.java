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

public class SerializationConfig_init_212228651195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119946;

    public SerializationConfig_init_212228651195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term117675 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term117675, term117675.getClass(), "_base", null);
        setIntField(term117675, term117675.getClass(), "_mapperFeatures", 0);
        setField(term117675, term117675.getClass(), "_mixIns", null);
        setField(term117675, term117675.getClass(), "_subtypeResolver", null);
        setField(term117675, term117675.getClass(), "_rootNames", null);
        setField(term117675, term117675.getClass(), "_rootName", null);
        setField(term117675, term117675.getClass(), "_view", null);
        setField(term117675, term117675.getClass(), "_attributes", null);
        Class<? extends Object> term119997 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term119996 = ((Class) term119997).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term119996).setAccessible(true);
        Object enum23 = ((Field) term119996).get((Object) null);
        term119946 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term119947 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term119948 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term119949 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term119950 = (char[]) newCharArray(32);
        Object term119953 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term119956 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term119960 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term119961 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term119946, term119946.getClass(), "_filterProvider", null);
        setField(term119947, term119947.getClass(), "_arrayIndenter", term119948);
        setCharElement(term119950, 0, (char) 32);
        setCharElement(term119950, 1, (char) 32);
        setCharElement(term119950, 2, (char) 32);
        setCharElement(term119950, 3, (char) 32);
        setCharElement(term119950, 4, (char) 32);
        setCharElement(term119950, 5, (char) 32);
        setCharElement(term119950, 6, (char) 32);
        setCharElement(term119950, 7, (char) 32);
        setCharElement(term119950, 8, (char) 32);
        setCharElement(term119950, 9, (char) 32);
        setCharElement(term119950, 10, (char) 32);
        setCharElement(term119950, 11, (char) 32);
        setCharElement(term119950, 12, (char) 32);
        setCharElement(term119950, 13, (char) 32);
        setCharElement(term119950, 14, (char) 32);
        setCharElement(term119950, 15, (char) 32);
        setCharElement(term119950, 16, (char) 32);
        setCharElement(term119950, 17, (char) 32);
        setCharElement(term119950, 18, (char) 32);
        setCharElement(term119950, 19, (char) 32);
        setCharElement(term119950, 20, (char) 32);
        setCharElement(term119950, 21, (char) 32);
        setCharElement(term119950, 22, (char) 32);
        setCharElement(term119950, 23, (char) 32);
        setCharElement(term119950, 24, (char) 32);
        setCharElement(term119950, 25, (char) 32);
        setCharElement(term119950, 26, (char) 32);
        setCharElement(term119950, 27, (char) 32);
        setCharElement(term119950, 28, (char) 32);
        setCharElement(term119950, 29, (char) 32);
        setCharElement(term119950, 30, (char) 32);
        setCharElement(term119950, 31, (char) 32);
        setField(term119949, term119949.getClass(), "indents", term119950);
        setIntField(term119949, term119949.getClass(), "charsPerLevel", 2);
        setField(term119949, term119949.getClass(), "eol", "\n");
        setField(term119947, term119947.getClass(), "_objectIndenter", term119949);
        setField(term119953, term119953.getClass(), "_value", " ");
        setField(term119953, term119953.getClass(), "_quotedUTF8Ref", null);
        setField(term119953, term119953.getClass(), "_unquotedUTF8Ref", null);
        setField(term119953, term119953.getClass(), "_quotedChars", null);
        setField(term119953, term119953.getClass(), "_jdkSerializeValue", null);
        setField(term119947, term119947.getClass(), "_rootSeparator", term119953);
        setBooleanField(term119947, term119947.getClass(), "_spacesInObjectEntries", true);
        setIntField(term119947, term119947.getClass(), "_nesting", 0);
        setField(term119946, term119946.getClass(), "_defaultPrettyPrinter", term119947);
        setIntField(term119946, term119946.getClass(), "_serFeatures", 2722236);
        setIntField(term119946, term119946.getClass(), "_generatorFeatures", 0);
        setIntField(term119946, term119946.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term119946, term119946.getClass(), "_formatWriteFeatures", 0);
        setIntField(term119946, term119946.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term119956, term119956.getClass(), "_valueInclusion", enum23);
        setField(term119956, term119956.getClass(), "_contentInclusion", enum23);
        setField(term119946, term119946.getClass(), "_serializationInclusion", term119956);
        setField(term119946, term119946.getClass(), "_mixIns", null);
        setField(term119946, term119946.getClass(), "_subtypeResolver", null);
        setField(term119946, term119946.getClass(), "_rootName", null);
        setField(term119946, term119946.getClass(), "_view", null);
        setField(term119961, term119961.getClass(), "keySet", null);
        setField(term119961, term119961.getClass(), "values", null);
        setField(term119960, term119960.getClass(), "_shared", term119961);
        setField(term119960, term119960.getClass(), "_nonShared", null);
        setField(term119946, term119946.getClass(), "_attributes", term119960);
        setField(term119946, term119946.getClass(), "_rootNames", null);
        setIntField(term119946, term119946.getClass(), "_mapperFeatures", 1068991);
        setField(term119946, term119946.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term119946));
    }

};


