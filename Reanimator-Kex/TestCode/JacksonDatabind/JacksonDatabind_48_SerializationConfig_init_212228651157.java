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

public class SerializationConfig_init_212228651157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55543;
     Object term57937;
     Object term57954;

    public SerializationConfig_init_212228651157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55317 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base");
        Object term54947 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term55047 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term55175 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term55281 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term55437 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        setField(term54947, term54947.getClass(), "_base", term55047);
        setIntField(term54947, term54947.getClass(), "_mapperFeatures", 0);
        setField(term54947, term54947.getClass(), "_mixIns", term55175);
        setField(term54947, term54947.getClass(), "_subtypeResolver", null);
        setField(term54947, term54947.getClass(), "_rootNames", term55281);
        setField(term54947, term54947.getClass(), "_rootName", null);
        setField(term54947, term54947.getClass(), "_view", term55317);
        setField(term54947, term54947.getClass(), "_attributes", term55437);
        term55543 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Class<? extends Object> term58175 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term58174 = ((Class) term58175).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term58174).setAccessible(true);
        Object enum8 = ((Field) term58174).get((Object) null);
        term57937 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term57938 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term57939 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term57940 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term57941 = (char[]) newCharArray(32);
        Object term57944 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term57947 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term57951 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term57952 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term57953 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term57937, term57937.getClass(), "_filterProvider", null);
        setField(term57938, term57938.getClass(), "_arrayIndenter", term57939);
        setCharElement(term57941, 0, (char) 32);
        setCharElement(term57941, 1, (char) 32);
        setCharElement(term57941, 2, (char) 32);
        setCharElement(term57941, 3, (char) 32);
        setCharElement(term57941, 4, (char) 32);
        setCharElement(term57941, 5, (char) 32);
        setCharElement(term57941, 6, (char) 32);
        setCharElement(term57941, 7, (char) 32);
        setCharElement(term57941, 8, (char) 32);
        setCharElement(term57941, 9, (char) 32);
        setCharElement(term57941, 10, (char) 32);
        setCharElement(term57941, 11, (char) 32);
        setCharElement(term57941, 12, (char) 32);
        setCharElement(term57941, 13, (char) 32);
        setCharElement(term57941, 14, (char) 32);
        setCharElement(term57941, 15, (char) 32);
        setCharElement(term57941, 16, (char) 32);
        setCharElement(term57941, 17, (char) 32);
        setCharElement(term57941, 18, (char) 32);
        setCharElement(term57941, 19, (char) 32);
        setCharElement(term57941, 20, (char) 32);
        setCharElement(term57941, 21, (char) 32);
        setCharElement(term57941, 22, (char) 32);
        setCharElement(term57941, 23, (char) 32);
        setCharElement(term57941, 24, (char) 32);
        setCharElement(term57941, 25, (char) 32);
        setCharElement(term57941, 26, (char) 32);
        setCharElement(term57941, 27, (char) 32);
        setCharElement(term57941, 28, (char) 32);
        setCharElement(term57941, 29, (char) 32);
        setCharElement(term57941, 30, (char) 32);
        setCharElement(term57941, 31, (char) 32);
        setField(term57940, term57940.getClass(), "indents", term57941);
        setIntField(term57940, term57940.getClass(), "charsPerLevel", 2);
        setField(term57940, term57940.getClass(), "eol", "\n");
        setField(term57938, term57938.getClass(), "_objectIndenter", term57940);
        setField(term57944, term57944.getClass(), "_value", " ");
        setField(term57944, term57944.getClass(), "_quotedUTF8Ref", null);
        setField(term57944, term57944.getClass(), "_unquotedUTF8Ref", null);
        setField(term57944, term57944.getClass(), "_quotedChars", null);
        setField(term57944, term57944.getClass(), "_jdkSerializeValue", null);
        setField(term57938, term57938.getClass(), "_rootSeparator", term57944);
        setBooleanField(term57938, term57938.getClass(), "_spacesInObjectEntries", true);
        setIntField(term57938, term57938.getClass(), "_nesting", 0);
        setField(term57937, term57937.getClass(), "_defaultPrettyPrinter", term57938);
        setIntField(term57937, term57937.getClass(), "_serFeatures", 2722236);
        setIntField(term57937, term57937.getClass(), "_generatorFeatures", 0);
        setIntField(term57937, term57937.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term57937, term57937.getClass(), "_formatWriteFeatures", 0);
        setIntField(term57937, term57937.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term57947, term57947.getClass(), "_valueInclusion", enum8);
        setField(term57947, term57947.getClass(), "_contentInclusion", enum8);
        setField(term57937, term57937.getClass(), "_serializationInclusion", term57947);
        setField(term57937, term57937.getClass(), "_mixIns", null);
        setField(term57937, term57937.getClass(), "_subtypeResolver", null);
        setField(term57937, term57937.getClass(), "_rootName", null);
        setField(term57937, term57937.getClass(), "_view", null);
        setField(term57952, term57952.getClass(), "keySet", null);
        setField(term57952, term57952.getClass(), "values", null);
        setField(term57951, term57951.getClass(), "_shared", term57952);
        setField(term57951, term57951.getClass(), "_nonShared", null);
        setField(term57937, term57937.getClass(), "_attributes", term57951);
        setField(term57953, term57953.getClass(), "_rootNames", null);
        setField(term57937, term57937.getClass(), "_rootNames", term57953);
        setIntField(term57937, term57937.getClass(), "_mapperFeatures", 1068991);
        setField(term57937, term57937.getClass(), "_base", null);
        term57954 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term57954, term57954.getClass(), "_rootNames", null);
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
        args[3] = term55543;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term57937));
        assertTrue(recursiveEquals(term55543, term57954));
    }

};


