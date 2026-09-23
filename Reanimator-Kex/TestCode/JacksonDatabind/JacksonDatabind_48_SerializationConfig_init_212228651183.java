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

public class SerializationConfig_init_212228651183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103647;

    public SerializationConfig_init_212228651183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101276 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term101376 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term101276, term101276.getClass(), "_base", term101376);
        setIntField(term101276, term101276.getClass(), "_mapperFeatures", 0);
        setField(term101276, term101276.getClass(), "_mixIns", null);
        setField(term101276, term101276.getClass(), "_subtypeResolver", null);
        setField(term101276, term101276.getClass(), "_rootNames", null);
        setField(term101276, term101276.getClass(), "_rootName", null);
        setField(term101276, term101276.getClass(), "_view", null);
        setField(term101276, term101276.getClass(), "_attributes", null);
        Class<? extends Object> term103698 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term103697 = ((Class) term103698).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term103697).setAccessible(true);
        Object enum19 = ((Field) term103697).get((Object) null);
        term103647 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term103648 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term103649 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term103650 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term103651 = (char[]) newCharArray(32);
        Object term103654 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term103657 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term103661 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term103662 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term103647, term103647.getClass(), "_filterProvider", null);
        setField(term103648, term103648.getClass(), "_arrayIndenter", term103649);
        setCharElement(term103651, 0, (char) 32);
        setCharElement(term103651, 1, (char) 32);
        setCharElement(term103651, 2, (char) 32);
        setCharElement(term103651, 3, (char) 32);
        setCharElement(term103651, 4, (char) 32);
        setCharElement(term103651, 5, (char) 32);
        setCharElement(term103651, 6, (char) 32);
        setCharElement(term103651, 7, (char) 32);
        setCharElement(term103651, 8, (char) 32);
        setCharElement(term103651, 9, (char) 32);
        setCharElement(term103651, 10, (char) 32);
        setCharElement(term103651, 11, (char) 32);
        setCharElement(term103651, 12, (char) 32);
        setCharElement(term103651, 13, (char) 32);
        setCharElement(term103651, 14, (char) 32);
        setCharElement(term103651, 15, (char) 32);
        setCharElement(term103651, 16, (char) 32);
        setCharElement(term103651, 17, (char) 32);
        setCharElement(term103651, 18, (char) 32);
        setCharElement(term103651, 19, (char) 32);
        setCharElement(term103651, 20, (char) 32);
        setCharElement(term103651, 21, (char) 32);
        setCharElement(term103651, 22, (char) 32);
        setCharElement(term103651, 23, (char) 32);
        setCharElement(term103651, 24, (char) 32);
        setCharElement(term103651, 25, (char) 32);
        setCharElement(term103651, 26, (char) 32);
        setCharElement(term103651, 27, (char) 32);
        setCharElement(term103651, 28, (char) 32);
        setCharElement(term103651, 29, (char) 32);
        setCharElement(term103651, 30, (char) 32);
        setCharElement(term103651, 31, (char) 32);
        setField(term103650, term103650.getClass(), "indents", term103651);
        setIntField(term103650, term103650.getClass(), "charsPerLevel", 2);
        setField(term103650, term103650.getClass(), "eol", "\n");
        setField(term103648, term103648.getClass(), "_objectIndenter", term103650);
        setField(term103654, term103654.getClass(), "_value", " ");
        setField(term103654, term103654.getClass(), "_quotedUTF8Ref", null);
        setField(term103654, term103654.getClass(), "_unquotedUTF8Ref", null);
        setField(term103654, term103654.getClass(), "_quotedChars", null);
        setField(term103654, term103654.getClass(), "_jdkSerializeValue", null);
        setField(term103648, term103648.getClass(), "_rootSeparator", term103654);
        setBooleanField(term103648, term103648.getClass(), "_spacesInObjectEntries", true);
        setIntField(term103648, term103648.getClass(), "_nesting", 0);
        setField(term103647, term103647.getClass(), "_defaultPrettyPrinter", term103648);
        setIntField(term103647, term103647.getClass(), "_serFeatures", 2722236);
        setIntField(term103647, term103647.getClass(), "_generatorFeatures", 0);
        setIntField(term103647, term103647.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term103647, term103647.getClass(), "_formatWriteFeatures", 0);
        setIntField(term103647, term103647.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term103657, term103657.getClass(), "_valueInclusion", enum19);
        setField(term103657, term103657.getClass(), "_contentInclusion", enum19);
        setField(term103647, term103647.getClass(), "_serializationInclusion", term103657);
        setField(term103647, term103647.getClass(), "_mixIns", null);
        setField(term103647, term103647.getClass(), "_subtypeResolver", null);
        setField(term103647, term103647.getClass(), "_rootName", null);
        setField(term103647, term103647.getClass(), "_view", null);
        setField(term103662, term103662.getClass(), "keySet", null);
        setField(term103662, term103662.getClass(), "values", null);
        setField(term103661, term103661.getClass(), "_shared", term103662);
        setField(term103661, term103661.getClass(), "_nonShared", null);
        setField(term103647, term103647.getClass(), "_attributes", term103661);
        setField(term103647, term103647.getClass(), "_rootNames", null);
        setIntField(term103647, term103647.getClass(), "_mapperFeatures", 1068991);
        setField(term103647, term103647.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term103647));
    }

};


