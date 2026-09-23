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

public class SerializationConfig_init_212228651143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28788;

    public SerializationConfig_init_212228651143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26417 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term26517 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term26417, term26417.getClass(), "_base", term26517);
        setIntField(term26417, term26417.getClass(), "_mapperFeatures", 0);
        setField(term26417, term26417.getClass(), "_mixIns", null);
        setField(term26417, term26417.getClass(), "_subtypeResolver", null);
        setField(term26417, term26417.getClass(), "_rootNames", null);
        setField(term26417, term26417.getClass(), "_rootName", null);
        setField(term26417, term26417.getClass(), "_view", null);
        setField(term26417, term26417.getClass(), "_attributes", null);
        Class<? extends Object> term28839 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term28838 = ((Class) term28839).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term28838).setAccessible(true);
        Object enum1 = ((Field) term28838).get((Object) null);
        term28788 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term28789 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term28790 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term28791 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term28792 = (char[]) newCharArray(32);
        Object term28795 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term28798 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term28802 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term28803 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term28788, term28788.getClass(), "_filterProvider", null);
        setField(term28789, term28789.getClass(), "_arrayIndenter", term28790);
        setCharElement(term28792, 0, (char) 32);
        setCharElement(term28792, 1, (char) 32);
        setCharElement(term28792, 2, (char) 32);
        setCharElement(term28792, 3, (char) 32);
        setCharElement(term28792, 4, (char) 32);
        setCharElement(term28792, 5, (char) 32);
        setCharElement(term28792, 6, (char) 32);
        setCharElement(term28792, 7, (char) 32);
        setCharElement(term28792, 8, (char) 32);
        setCharElement(term28792, 9, (char) 32);
        setCharElement(term28792, 10, (char) 32);
        setCharElement(term28792, 11, (char) 32);
        setCharElement(term28792, 12, (char) 32);
        setCharElement(term28792, 13, (char) 32);
        setCharElement(term28792, 14, (char) 32);
        setCharElement(term28792, 15, (char) 32);
        setCharElement(term28792, 16, (char) 32);
        setCharElement(term28792, 17, (char) 32);
        setCharElement(term28792, 18, (char) 32);
        setCharElement(term28792, 19, (char) 32);
        setCharElement(term28792, 20, (char) 32);
        setCharElement(term28792, 21, (char) 32);
        setCharElement(term28792, 22, (char) 32);
        setCharElement(term28792, 23, (char) 32);
        setCharElement(term28792, 24, (char) 32);
        setCharElement(term28792, 25, (char) 32);
        setCharElement(term28792, 26, (char) 32);
        setCharElement(term28792, 27, (char) 32);
        setCharElement(term28792, 28, (char) 32);
        setCharElement(term28792, 29, (char) 32);
        setCharElement(term28792, 30, (char) 32);
        setCharElement(term28792, 31, (char) 32);
        setField(term28791, term28791.getClass(), "indents", term28792);
        setIntField(term28791, term28791.getClass(), "charsPerLevel", 2);
        setField(term28791, term28791.getClass(), "eol", "\n");
        setField(term28789, term28789.getClass(), "_objectIndenter", term28791);
        setField(term28795, term28795.getClass(), "_value", " ");
        setField(term28795, term28795.getClass(), "_quotedUTF8Ref", null);
        setField(term28795, term28795.getClass(), "_unquotedUTF8Ref", null);
        setField(term28795, term28795.getClass(), "_quotedChars", null);
        setField(term28795, term28795.getClass(), "_jdkSerializeValue", null);
        setField(term28789, term28789.getClass(), "_rootSeparator", term28795);
        setBooleanField(term28789, term28789.getClass(), "_spacesInObjectEntries", true);
        setIntField(term28789, term28789.getClass(), "_nesting", 0);
        setField(term28788, term28788.getClass(), "_defaultPrettyPrinter", term28789);
        setIntField(term28788, term28788.getClass(), "_serFeatures", 2722236);
        setIntField(term28788, term28788.getClass(), "_generatorFeatures", 0);
        setIntField(term28788, term28788.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term28788, term28788.getClass(), "_formatWriteFeatures", 0);
        setIntField(term28788, term28788.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term28798, term28798.getClass(), "_valueInclusion", enum1);
        setField(term28798, term28798.getClass(), "_contentInclusion", enum1);
        setField(term28788, term28788.getClass(), "_serializationInclusion", term28798);
        setField(term28788, term28788.getClass(), "_mixIns", null);
        setField(term28788, term28788.getClass(), "_subtypeResolver", null);
        setField(term28788, term28788.getClass(), "_rootName", null);
        setField(term28788, term28788.getClass(), "_view", null);
        setField(term28803, term28803.getClass(), "keySet", null);
        setField(term28803, term28803.getClass(), "values", null);
        setField(term28802, term28802.getClass(), "_shared", term28803);
        setField(term28802, term28802.getClass(), "_nonShared", null);
        setField(term28788, term28788.getClass(), "_attributes", term28802);
        setField(term28788, term28788.getClass(), "_rootNames", null);
        setIntField(term28788, term28788.getClass(), "_mapperFeatures", 1068991);
        setField(term28788, term28788.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term28788));
    }

};


