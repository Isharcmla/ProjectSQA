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

public class SerializationConfig_init_212228651205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136755;

    public SerializationConfig_init_212228651205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term134384 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term134484 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term134384, term134384.getClass(), "_base", term134484);
        setIntField(term134384, term134384.getClass(), "_mapperFeatures", 0);
        setField(term134384, term134384.getClass(), "_mixIns", null);
        setField(term134384, term134384.getClass(), "_subtypeResolver", null);
        setField(term134384, term134384.getClass(), "_rootNames", null);
        setField(term134384, term134384.getClass(), "_rootName", null);
        setField(term134384, term134384.getClass(), "_view", null);
        setField(term134384, term134384.getClass(), "_attributes", null);
        Class<? extends Object> term136806 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term136805 = ((Class) term136806).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term136805).setAccessible(true);
        Object enum27 = ((Field) term136805).get((Object) null);
        term136755 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term136756 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term136757 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term136758 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term136759 = (char[]) newCharArray(32);
        Object term136762 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term136765 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term136769 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term136770 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term136755, term136755.getClass(), "_filterProvider", null);
        setField(term136756, term136756.getClass(), "_arrayIndenter", term136757);
        setCharElement(term136759, 0, (char) 32);
        setCharElement(term136759, 1, (char) 32);
        setCharElement(term136759, 2, (char) 32);
        setCharElement(term136759, 3, (char) 32);
        setCharElement(term136759, 4, (char) 32);
        setCharElement(term136759, 5, (char) 32);
        setCharElement(term136759, 6, (char) 32);
        setCharElement(term136759, 7, (char) 32);
        setCharElement(term136759, 8, (char) 32);
        setCharElement(term136759, 9, (char) 32);
        setCharElement(term136759, 10, (char) 32);
        setCharElement(term136759, 11, (char) 32);
        setCharElement(term136759, 12, (char) 32);
        setCharElement(term136759, 13, (char) 32);
        setCharElement(term136759, 14, (char) 32);
        setCharElement(term136759, 15, (char) 32);
        setCharElement(term136759, 16, (char) 32);
        setCharElement(term136759, 17, (char) 32);
        setCharElement(term136759, 18, (char) 32);
        setCharElement(term136759, 19, (char) 32);
        setCharElement(term136759, 20, (char) 32);
        setCharElement(term136759, 21, (char) 32);
        setCharElement(term136759, 22, (char) 32);
        setCharElement(term136759, 23, (char) 32);
        setCharElement(term136759, 24, (char) 32);
        setCharElement(term136759, 25, (char) 32);
        setCharElement(term136759, 26, (char) 32);
        setCharElement(term136759, 27, (char) 32);
        setCharElement(term136759, 28, (char) 32);
        setCharElement(term136759, 29, (char) 32);
        setCharElement(term136759, 30, (char) 32);
        setCharElement(term136759, 31, (char) 32);
        setField(term136758, term136758.getClass(), "indents", term136759);
        setIntField(term136758, term136758.getClass(), "charsPerLevel", 2);
        setField(term136758, term136758.getClass(), "eol", "\n");
        setField(term136756, term136756.getClass(), "_objectIndenter", term136758);
        setField(term136762, term136762.getClass(), "_value", " ");
        setField(term136762, term136762.getClass(), "_quotedUTF8Ref", null);
        setField(term136762, term136762.getClass(), "_unquotedUTF8Ref", null);
        setField(term136762, term136762.getClass(), "_quotedChars", null);
        setField(term136762, term136762.getClass(), "_jdkSerializeValue", null);
        setField(term136756, term136756.getClass(), "_rootSeparator", term136762);
        setBooleanField(term136756, term136756.getClass(), "_spacesInObjectEntries", true);
        setIntField(term136756, term136756.getClass(), "_nesting", 0);
        setField(term136755, term136755.getClass(), "_defaultPrettyPrinter", term136756);
        setIntField(term136755, term136755.getClass(), "_serFeatures", 2722236);
        setIntField(term136755, term136755.getClass(), "_generatorFeatures", 0);
        setIntField(term136755, term136755.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term136755, term136755.getClass(), "_formatWriteFeatures", 0);
        setIntField(term136755, term136755.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term136765, term136765.getClass(), "_valueInclusion", enum27);
        setField(term136765, term136765.getClass(), "_contentInclusion", enum27);
        setField(term136755, term136755.getClass(), "_serializationInclusion", term136765);
        setField(term136755, term136755.getClass(), "_mixIns", null);
        setField(term136755, term136755.getClass(), "_subtypeResolver", null);
        setField(term136755, term136755.getClass(), "_rootName", null);
        setField(term136755, term136755.getClass(), "_view", null);
        setField(term136770, term136770.getClass(), "keySet", null);
        setField(term136770, term136770.getClass(), "values", null);
        setField(term136769, term136769.getClass(), "_shared", term136770);
        setField(term136769, term136769.getClass(), "_nonShared", null);
        setField(term136755, term136755.getClass(), "_attributes", term136769);
        setField(term136755, term136755.getClass(), "_rootNames", null);
        setIntField(term136755, term136755.getClass(), "_mapperFeatures", 1068991);
        setField(term136755, term136755.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term136755));
    }

};


