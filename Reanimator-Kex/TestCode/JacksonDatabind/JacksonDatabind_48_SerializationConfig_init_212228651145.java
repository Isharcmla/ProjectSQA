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

public class SerializationConfig_init_212228651145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30527;
     Object term32799;
     Object term32816;

    public SerializationConfig_init_212228651145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30399 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term30399, term30399.getClass(), "_base", null);
        setIntField(term30399, term30399.getClass(), "_mapperFeatures", 0);
        setField(term30399, term30399.getClass(), "_mixIns", null);
        setField(term30399, term30399.getClass(), "_subtypeResolver", null);
        setField(term30399, term30399.getClass(), "_rootNames", null);
        setField(term30399, term30399.getClass(), "_rootName", null);
        setField(term30399, term30399.getClass(), "_view", null);
        setField(term30399, term30399.getClass(), "_attributes", null);
        term30527 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Class<? extends Object> term32852 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term32851 = ((Class) term32852).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term32851).setAccessible(true);
        Object enum2 = ((Field) term32851).get((Object) null);
        term32799 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term32800 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term32801 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term32802 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term32803 = (char[]) newCharArray(32);
        Object term32806 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term32809 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term32813 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term32814 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term32815 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term32799, term32799.getClass(), "_filterProvider", null);
        setField(term32800, term32800.getClass(), "_arrayIndenter", term32801);
        setCharElement(term32803, 0, (char) 32);
        setCharElement(term32803, 1, (char) 32);
        setCharElement(term32803, 2, (char) 32);
        setCharElement(term32803, 3, (char) 32);
        setCharElement(term32803, 4, (char) 32);
        setCharElement(term32803, 5, (char) 32);
        setCharElement(term32803, 6, (char) 32);
        setCharElement(term32803, 7, (char) 32);
        setCharElement(term32803, 8, (char) 32);
        setCharElement(term32803, 9, (char) 32);
        setCharElement(term32803, 10, (char) 32);
        setCharElement(term32803, 11, (char) 32);
        setCharElement(term32803, 12, (char) 32);
        setCharElement(term32803, 13, (char) 32);
        setCharElement(term32803, 14, (char) 32);
        setCharElement(term32803, 15, (char) 32);
        setCharElement(term32803, 16, (char) 32);
        setCharElement(term32803, 17, (char) 32);
        setCharElement(term32803, 18, (char) 32);
        setCharElement(term32803, 19, (char) 32);
        setCharElement(term32803, 20, (char) 32);
        setCharElement(term32803, 21, (char) 32);
        setCharElement(term32803, 22, (char) 32);
        setCharElement(term32803, 23, (char) 32);
        setCharElement(term32803, 24, (char) 32);
        setCharElement(term32803, 25, (char) 32);
        setCharElement(term32803, 26, (char) 32);
        setCharElement(term32803, 27, (char) 32);
        setCharElement(term32803, 28, (char) 32);
        setCharElement(term32803, 29, (char) 32);
        setCharElement(term32803, 30, (char) 32);
        setCharElement(term32803, 31, (char) 32);
        setField(term32802, term32802.getClass(), "indents", term32803);
        setIntField(term32802, term32802.getClass(), "charsPerLevel", 2);
        setField(term32802, term32802.getClass(), "eol", "\n");
        setField(term32800, term32800.getClass(), "_objectIndenter", term32802);
        setField(term32806, term32806.getClass(), "_value", " ");
        setField(term32806, term32806.getClass(), "_quotedUTF8Ref", null);
        setField(term32806, term32806.getClass(), "_unquotedUTF8Ref", null);
        setField(term32806, term32806.getClass(), "_quotedChars", null);
        setField(term32806, term32806.getClass(), "_jdkSerializeValue", null);
        setField(term32800, term32800.getClass(), "_rootSeparator", term32806);
        setBooleanField(term32800, term32800.getClass(), "_spacesInObjectEntries", true);
        setIntField(term32800, term32800.getClass(), "_nesting", 0);
        setField(term32799, term32799.getClass(), "_defaultPrettyPrinter", term32800);
        setIntField(term32799, term32799.getClass(), "_serFeatures", 2722236);
        setIntField(term32799, term32799.getClass(), "_generatorFeatures", 0);
        setIntField(term32799, term32799.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term32799, term32799.getClass(), "_formatWriteFeatures", 0);
        setIntField(term32799, term32799.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term32809, term32809.getClass(), "_valueInclusion", enum2);
        setField(term32809, term32809.getClass(), "_contentInclusion", enum2);
        setField(term32799, term32799.getClass(), "_serializationInclusion", term32809);
        setField(term32813, term32813.getClass(), "_overrides", null);
        setField(term32813, term32813.getClass(), "_localMixIns", null);
        setField(term32799, term32799.getClass(), "_mixIns", term32813);
        setField(term32799, term32799.getClass(), "_subtypeResolver", null);
        setField(term32799, term32799.getClass(), "_rootName", null);
        setField(term32799, term32799.getClass(), "_view", null);
        setField(term32815, term32815.getClass(), "keySet", null);
        setField(term32815, term32815.getClass(), "values", null);
        setField(term32814, term32814.getClass(), "_shared", term32815);
        setField(term32814, term32814.getClass(), "_nonShared", null);
        setField(term32799, term32799.getClass(), "_attributes", term32814);
        setField(term32799, term32799.getClass(), "_rootNames", null);
        setIntField(term32799, term32799.getClass(), "_mapperFeatures", 1068991);
        setField(term32799, term32799.getClass(), "_base", null);
        term32816 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term32816, term32816.getClass(), "_overrides", null);
        setField(term32816, term32816.getClass(), "_localMixIns", null);
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
        args[2] = term30527;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32799));
        assertTrue(recursiveEquals(term30527, term32816));
    }

};


