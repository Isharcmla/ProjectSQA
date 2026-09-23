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

public class SerializationConfig_init_212228651199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125934;
     Object term128206;
     Object term128223;

    public SerializationConfig_init_212228651199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term125678 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term125806 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term125678, term125678.getClass(), "_base", null);
        setIntField(term125678, term125678.getClass(), "_mapperFeatures", 0);
        setField(term125678, term125678.getClass(), "_mixIns", term125806);
        setField(term125678, term125678.getClass(), "_subtypeResolver", null);
        setField(term125678, term125678.getClass(), "_rootNames", null);
        setField(term125678, term125678.getClass(), "_rootName", null);
        setField(term125678, term125678.getClass(), "_view", null);
        setField(term125678, term125678.getClass(), "_attributes", null);
        term125934 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Class<? extends Object> term128259 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term128258 = ((Class) term128259).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term128258).setAccessible(true);
        Object enum25 = ((Field) term128258).get((Object) null);
        term128206 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term128207 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term128208 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term128209 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term128210 = (char[]) newCharArray(32);
        Object term128213 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term128216 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term128220 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term128221 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term128222 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term128206, term128206.getClass(), "_filterProvider", null);
        setField(term128207, term128207.getClass(), "_arrayIndenter", term128208);
        setCharElement(term128210, 0, (char) 32);
        setCharElement(term128210, 1, (char) 32);
        setCharElement(term128210, 2, (char) 32);
        setCharElement(term128210, 3, (char) 32);
        setCharElement(term128210, 4, (char) 32);
        setCharElement(term128210, 5, (char) 32);
        setCharElement(term128210, 6, (char) 32);
        setCharElement(term128210, 7, (char) 32);
        setCharElement(term128210, 8, (char) 32);
        setCharElement(term128210, 9, (char) 32);
        setCharElement(term128210, 10, (char) 32);
        setCharElement(term128210, 11, (char) 32);
        setCharElement(term128210, 12, (char) 32);
        setCharElement(term128210, 13, (char) 32);
        setCharElement(term128210, 14, (char) 32);
        setCharElement(term128210, 15, (char) 32);
        setCharElement(term128210, 16, (char) 32);
        setCharElement(term128210, 17, (char) 32);
        setCharElement(term128210, 18, (char) 32);
        setCharElement(term128210, 19, (char) 32);
        setCharElement(term128210, 20, (char) 32);
        setCharElement(term128210, 21, (char) 32);
        setCharElement(term128210, 22, (char) 32);
        setCharElement(term128210, 23, (char) 32);
        setCharElement(term128210, 24, (char) 32);
        setCharElement(term128210, 25, (char) 32);
        setCharElement(term128210, 26, (char) 32);
        setCharElement(term128210, 27, (char) 32);
        setCharElement(term128210, 28, (char) 32);
        setCharElement(term128210, 29, (char) 32);
        setCharElement(term128210, 30, (char) 32);
        setCharElement(term128210, 31, (char) 32);
        setField(term128209, term128209.getClass(), "indents", term128210);
        setIntField(term128209, term128209.getClass(), "charsPerLevel", 2);
        setField(term128209, term128209.getClass(), "eol", "\n");
        setField(term128207, term128207.getClass(), "_objectIndenter", term128209);
        setField(term128213, term128213.getClass(), "_value", " ");
        setField(term128213, term128213.getClass(), "_quotedUTF8Ref", null);
        setField(term128213, term128213.getClass(), "_unquotedUTF8Ref", null);
        setField(term128213, term128213.getClass(), "_quotedChars", null);
        setField(term128213, term128213.getClass(), "_jdkSerializeValue", null);
        setField(term128207, term128207.getClass(), "_rootSeparator", term128213);
        setBooleanField(term128207, term128207.getClass(), "_spacesInObjectEntries", true);
        setIntField(term128207, term128207.getClass(), "_nesting", 0);
        setField(term128206, term128206.getClass(), "_defaultPrettyPrinter", term128207);
        setIntField(term128206, term128206.getClass(), "_serFeatures", 2722236);
        setIntField(term128206, term128206.getClass(), "_generatorFeatures", 0);
        setIntField(term128206, term128206.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term128206, term128206.getClass(), "_formatWriteFeatures", 0);
        setIntField(term128206, term128206.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term128216, term128216.getClass(), "_valueInclusion", enum25);
        setField(term128216, term128216.getClass(), "_contentInclusion", enum25);
        setField(term128206, term128206.getClass(), "_serializationInclusion", term128216);
        setField(term128220, term128220.getClass(), "_overrides", null);
        setField(term128220, term128220.getClass(), "_localMixIns", null);
        setField(term128206, term128206.getClass(), "_mixIns", term128220);
        setField(term128206, term128206.getClass(), "_subtypeResolver", null);
        setField(term128206, term128206.getClass(), "_rootName", null);
        setField(term128206, term128206.getClass(), "_view", null);
        setField(term128222, term128222.getClass(), "keySet", null);
        setField(term128222, term128222.getClass(), "values", null);
        setField(term128221, term128221.getClass(), "_shared", term128222);
        setField(term128221, term128221.getClass(), "_nonShared", null);
        setField(term128206, term128206.getClass(), "_attributes", term128221);
        setField(term128206, term128206.getClass(), "_rootNames", null);
        setIntField(term128206, term128206.getClass(), "_mapperFeatures", 1068991);
        setField(term128206, term128206.getClass(), "_base", null);
        term128223 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term128223, term128223.getClass(), "_overrides", null);
        setField(term128223, term128223.getClass(), "_localMixIns", null);
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
        args[2] = term125934;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term128206));
        assertTrue(recursiveEquals(term125934, term128223));
    }

};


