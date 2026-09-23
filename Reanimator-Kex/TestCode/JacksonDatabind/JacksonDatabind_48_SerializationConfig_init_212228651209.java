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

public class SerializationConfig_init_212228651209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142432;
     Object term144704;
     Object term144721;

    public SerializationConfig_init_212228651209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term142204 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term142304 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term142204, term142204.getClass(), "_base", term142304);
        setIntField(term142204, term142204.getClass(), "_mapperFeatures", 0);
        setField(term142204, term142204.getClass(), "_mixIns", null);
        setField(term142204, term142204.getClass(), "_subtypeResolver", null);
        setField(term142204, term142204.getClass(), "_rootNames", null);
        setField(term142204, term142204.getClass(), "_rootName", null);
        setField(term142204, term142204.getClass(), "_view", null);
        setField(term142204, term142204.getClass(), "_attributes", null);
        term142432 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Class<? extends Object> term144757 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term144756 = ((Class) term144757).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term144756).setAccessible(true);
        Object enum29 = ((Field) term144756).get((Object) null);
        term144704 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term144705 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term144706 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term144707 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term144708 = (char[]) newCharArray(32);
        Object term144711 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term144714 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term144718 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term144719 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term144720 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term144704, term144704.getClass(), "_filterProvider", null);
        setField(term144705, term144705.getClass(), "_arrayIndenter", term144706);
        setCharElement(term144708, 0, (char) 32);
        setCharElement(term144708, 1, (char) 32);
        setCharElement(term144708, 2, (char) 32);
        setCharElement(term144708, 3, (char) 32);
        setCharElement(term144708, 4, (char) 32);
        setCharElement(term144708, 5, (char) 32);
        setCharElement(term144708, 6, (char) 32);
        setCharElement(term144708, 7, (char) 32);
        setCharElement(term144708, 8, (char) 32);
        setCharElement(term144708, 9, (char) 32);
        setCharElement(term144708, 10, (char) 32);
        setCharElement(term144708, 11, (char) 32);
        setCharElement(term144708, 12, (char) 32);
        setCharElement(term144708, 13, (char) 32);
        setCharElement(term144708, 14, (char) 32);
        setCharElement(term144708, 15, (char) 32);
        setCharElement(term144708, 16, (char) 32);
        setCharElement(term144708, 17, (char) 32);
        setCharElement(term144708, 18, (char) 32);
        setCharElement(term144708, 19, (char) 32);
        setCharElement(term144708, 20, (char) 32);
        setCharElement(term144708, 21, (char) 32);
        setCharElement(term144708, 22, (char) 32);
        setCharElement(term144708, 23, (char) 32);
        setCharElement(term144708, 24, (char) 32);
        setCharElement(term144708, 25, (char) 32);
        setCharElement(term144708, 26, (char) 32);
        setCharElement(term144708, 27, (char) 32);
        setCharElement(term144708, 28, (char) 32);
        setCharElement(term144708, 29, (char) 32);
        setCharElement(term144708, 30, (char) 32);
        setCharElement(term144708, 31, (char) 32);
        setField(term144707, term144707.getClass(), "indents", term144708);
        setIntField(term144707, term144707.getClass(), "charsPerLevel", 2);
        setField(term144707, term144707.getClass(), "eol", "\n");
        setField(term144705, term144705.getClass(), "_objectIndenter", term144707);
        setField(term144711, term144711.getClass(), "_value", " ");
        setField(term144711, term144711.getClass(), "_quotedUTF8Ref", null);
        setField(term144711, term144711.getClass(), "_unquotedUTF8Ref", null);
        setField(term144711, term144711.getClass(), "_quotedChars", null);
        setField(term144711, term144711.getClass(), "_jdkSerializeValue", null);
        setField(term144705, term144705.getClass(), "_rootSeparator", term144711);
        setBooleanField(term144705, term144705.getClass(), "_spacesInObjectEntries", true);
        setIntField(term144705, term144705.getClass(), "_nesting", 0);
        setField(term144704, term144704.getClass(), "_defaultPrettyPrinter", term144705);
        setIntField(term144704, term144704.getClass(), "_serFeatures", 2722236);
        setIntField(term144704, term144704.getClass(), "_generatorFeatures", 0);
        setIntField(term144704, term144704.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term144704, term144704.getClass(), "_formatWriteFeatures", 0);
        setIntField(term144704, term144704.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term144714, term144714.getClass(), "_valueInclusion", enum29);
        setField(term144714, term144714.getClass(), "_contentInclusion", enum29);
        setField(term144704, term144704.getClass(), "_serializationInclusion", term144714);
        setField(term144718, term144718.getClass(), "_overrides", null);
        setField(term144718, term144718.getClass(), "_localMixIns", null);
        setField(term144704, term144704.getClass(), "_mixIns", term144718);
        setField(term144704, term144704.getClass(), "_subtypeResolver", null);
        setField(term144704, term144704.getClass(), "_rootName", null);
        setField(term144704, term144704.getClass(), "_view", null);
        setField(term144720, term144720.getClass(), "keySet", null);
        setField(term144720, term144720.getClass(), "values", null);
        setField(term144719, term144719.getClass(), "_shared", term144720);
        setField(term144719, term144719.getClass(), "_nonShared", null);
        setField(term144704, term144704.getClass(), "_attributes", term144719);
        setField(term144704, term144704.getClass(), "_rootNames", null);
        setIntField(term144704, term144704.getClass(), "_mapperFeatures", 1068991);
        setField(term144704, term144704.getClass(), "_base", null);
        term144721 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term144721, term144721.getClass(), "_overrides", null);
        setField(term144721, term144721.getClass(), "_localMixIns", null);
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
        args[2] = term142432;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term144704));
        assertTrue(recursiveEquals(term142432, term144721));
    }

};


