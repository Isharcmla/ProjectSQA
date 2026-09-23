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

public class SerializationConfig_init_212228651153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47213;
     Object term49485;
     Object term49502;

    public SerializationConfig_init_212228651153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47107 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term47107, term47107.getClass(), "_base", null);
        setIntField(term47107, term47107.getClass(), "_mapperFeatures", 0);
        setField(term47107, term47107.getClass(), "_mixIns", null);
        setField(term47107, term47107.getClass(), "_subtypeResolver", null);
        setField(term47107, term47107.getClass(), "_rootNames", null);
        setField(term47107, term47107.getClass(), "_rootName", null);
        setField(term47107, term47107.getClass(), "_view", null);
        setField(term47107, term47107.getClass(), "_attributes", null);
        term47213 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Class<? extends Object> term49538 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term49537 = ((Class) term49538).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term49537).setAccessible(true);
        Object enum6 = ((Field) term49537).get((Object) null);
        term49485 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term49486 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term49487 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term49488 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term49489 = (char[]) newCharArray(32);
        Object term49492 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term49495 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term49499 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term49500 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term49501 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term49485, term49485.getClass(), "_filterProvider", null);
        setField(term49486, term49486.getClass(), "_arrayIndenter", term49487);
        setCharElement(term49489, 0, (char) 32);
        setCharElement(term49489, 1, (char) 32);
        setCharElement(term49489, 2, (char) 32);
        setCharElement(term49489, 3, (char) 32);
        setCharElement(term49489, 4, (char) 32);
        setCharElement(term49489, 5, (char) 32);
        setCharElement(term49489, 6, (char) 32);
        setCharElement(term49489, 7, (char) 32);
        setCharElement(term49489, 8, (char) 32);
        setCharElement(term49489, 9, (char) 32);
        setCharElement(term49489, 10, (char) 32);
        setCharElement(term49489, 11, (char) 32);
        setCharElement(term49489, 12, (char) 32);
        setCharElement(term49489, 13, (char) 32);
        setCharElement(term49489, 14, (char) 32);
        setCharElement(term49489, 15, (char) 32);
        setCharElement(term49489, 16, (char) 32);
        setCharElement(term49489, 17, (char) 32);
        setCharElement(term49489, 18, (char) 32);
        setCharElement(term49489, 19, (char) 32);
        setCharElement(term49489, 20, (char) 32);
        setCharElement(term49489, 21, (char) 32);
        setCharElement(term49489, 22, (char) 32);
        setCharElement(term49489, 23, (char) 32);
        setCharElement(term49489, 24, (char) 32);
        setCharElement(term49489, 25, (char) 32);
        setCharElement(term49489, 26, (char) 32);
        setCharElement(term49489, 27, (char) 32);
        setCharElement(term49489, 28, (char) 32);
        setCharElement(term49489, 29, (char) 32);
        setCharElement(term49489, 30, (char) 32);
        setCharElement(term49489, 31, (char) 32);
        setField(term49488, term49488.getClass(), "indents", term49489);
        setIntField(term49488, term49488.getClass(), "charsPerLevel", 2);
        setField(term49488, term49488.getClass(), "eol", "\n");
        setField(term49486, term49486.getClass(), "_objectIndenter", term49488);
        setField(term49492, term49492.getClass(), "_value", " ");
        setField(term49492, term49492.getClass(), "_quotedUTF8Ref", null);
        setField(term49492, term49492.getClass(), "_unquotedUTF8Ref", null);
        setField(term49492, term49492.getClass(), "_quotedChars", null);
        setField(term49492, term49492.getClass(), "_jdkSerializeValue", null);
        setField(term49486, term49486.getClass(), "_rootSeparator", term49492);
        setBooleanField(term49486, term49486.getClass(), "_spacesInObjectEntries", true);
        setIntField(term49486, term49486.getClass(), "_nesting", 0);
        setField(term49485, term49485.getClass(), "_defaultPrettyPrinter", term49486);
        setIntField(term49485, term49485.getClass(), "_serFeatures", 2722236);
        setIntField(term49485, term49485.getClass(), "_generatorFeatures", 0);
        setIntField(term49485, term49485.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term49485, term49485.getClass(), "_formatWriteFeatures", 0);
        setIntField(term49485, term49485.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term49495, term49495.getClass(), "_valueInclusion", enum6);
        setField(term49495, term49495.getClass(), "_contentInclusion", enum6);
        setField(term49485, term49485.getClass(), "_serializationInclusion", term49495);
        setField(term49485, term49485.getClass(), "_mixIns", null);
        setField(term49485, term49485.getClass(), "_subtypeResolver", null);
        setField(term49485, term49485.getClass(), "_rootName", null);
        setField(term49485, term49485.getClass(), "_view", null);
        setField(term49500, term49500.getClass(), "keySet", null);
        setField(term49500, term49500.getClass(), "values", null);
        setField(term49499, term49499.getClass(), "_shared", term49500);
        setField(term49499, term49499.getClass(), "_nonShared", null);
        setField(term49485, term49485.getClass(), "_attributes", term49499);
        setField(term49501, term49501.getClass(), "_rootNames", null);
        setField(term49485, term49485.getClass(), "_rootNames", term49501);
        setIntField(term49485, term49485.getClass(), "_mapperFeatures", 1068991);
        setField(term49485, term49485.getClass(), "_base", null);
        term49502 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term49502, term49502.getClass(), "_rootNames", null);
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
        args[3] = term47213;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term49485));
        assertTrue(recursiveEquals(term47213, term49502));
    }

};


