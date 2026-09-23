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

public class SerializationConfig_init_212228651169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82539;

    public SerializationConfig_init_212228651169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term80268 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term80268, term80268.getClass(), "_base", null);
        setIntField(term80268, term80268.getClass(), "_mapperFeatures", 0);
        setField(term80268, term80268.getClass(), "_mixIns", null);
        setField(term80268, term80268.getClass(), "_subtypeResolver", null);
        setField(term80268, term80268.getClass(), "_rootNames", null);
        setField(term80268, term80268.getClass(), "_rootName", null);
        setField(term80268, term80268.getClass(), "_view", null);
        setField(term80268, term80268.getClass(), "_attributes", null);
        Class<? extends Object> term82590 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term82589 = ((Class) term82590).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term82589).setAccessible(true);
        Object enum14 = ((Field) term82589).get((Object) null);
        term82539 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term82540 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term82541 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term82542 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term82543 = (char[]) newCharArray(32);
        Object term82546 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term82549 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term82553 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term82554 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term82539, term82539.getClass(), "_filterProvider", null);
        setField(term82540, term82540.getClass(), "_arrayIndenter", term82541);
        setCharElement(term82543, 0, (char) 32);
        setCharElement(term82543, 1, (char) 32);
        setCharElement(term82543, 2, (char) 32);
        setCharElement(term82543, 3, (char) 32);
        setCharElement(term82543, 4, (char) 32);
        setCharElement(term82543, 5, (char) 32);
        setCharElement(term82543, 6, (char) 32);
        setCharElement(term82543, 7, (char) 32);
        setCharElement(term82543, 8, (char) 32);
        setCharElement(term82543, 9, (char) 32);
        setCharElement(term82543, 10, (char) 32);
        setCharElement(term82543, 11, (char) 32);
        setCharElement(term82543, 12, (char) 32);
        setCharElement(term82543, 13, (char) 32);
        setCharElement(term82543, 14, (char) 32);
        setCharElement(term82543, 15, (char) 32);
        setCharElement(term82543, 16, (char) 32);
        setCharElement(term82543, 17, (char) 32);
        setCharElement(term82543, 18, (char) 32);
        setCharElement(term82543, 19, (char) 32);
        setCharElement(term82543, 20, (char) 32);
        setCharElement(term82543, 21, (char) 32);
        setCharElement(term82543, 22, (char) 32);
        setCharElement(term82543, 23, (char) 32);
        setCharElement(term82543, 24, (char) 32);
        setCharElement(term82543, 25, (char) 32);
        setCharElement(term82543, 26, (char) 32);
        setCharElement(term82543, 27, (char) 32);
        setCharElement(term82543, 28, (char) 32);
        setCharElement(term82543, 29, (char) 32);
        setCharElement(term82543, 30, (char) 32);
        setCharElement(term82543, 31, (char) 32);
        setField(term82542, term82542.getClass(), "indents", term82543);
        setIntField(term82542, term82542.getClass(), "charsPerLevel", 2);
        setField(term82542, term82542.getClass(), "eol", "\n");
        setField(term82540, term82540.getClass(), "_objectIndenter", term82542);
        setField(term82546, term82546.getClass(), "_value", " ");
        setField(term82546, term82546.getClass(), "_quotedUTF8Ref", null);
        setField(term82546, term82546.getClass(), "_unquotedUTF8Ref", null);
        setField(term82546, term82546.getClass(), "_quotedChars", null);
        setField(term82546, term82546.getClass(), "_jdkSerializeValue", null);
        setField(term82540, term82540.getClass(), "_rootSeparator", term82546);
        setBooleanField(term82540, term82540.getClass(), "_spacesInObjectEntries", true);
        setIntField(term82540, term82540.getClass(), "_nesting", 0);
        setField(term82539, term82539.getClass(), "_defaultPrettyPrinter", term82540);
        setIntField(term82539, term82539.getClass(), "_serFeatures", 2722236);
        setIntField(term82539, term82539.getClass(), "_generatorFeatures", 0);
        setIntField(term82539, term82539.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term82539, term82539.getClass(), "_formatWriteFeatures", 0);
        setIntField(term82539, term82539.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term82549, term82549.getClass(), "_valueInclusion", enum14);
        setField(term82549, term82549.getClass(), "_contentInclusion", enum14);
        setField(term82539, term82539.getClass(), "_serializationInclusion", term82549);
        setField(term82539, term82539.getClass(), "_mixIns", null);
        setField(term82539, term82539.getClass(), "_subtypeResolver", null);
        setField(term82539, term82539.getClass(), "_rootName", null);
        setField(term82539, term82539.getClass(), "_view", null);
        setField(term82554, term82554.getClass(), "keySet", null);
        setField(term82554, term82554.getClass(), "values", null);
        setField(term82553, term82553.getClass(), "_shared", term82554);
        setField(term82553, term82553.getClass(), "_nonShared", null);
        setField(term82539, term82539.getClass(), "_attributes", term82553);
        setField(term82539, term82539.getClass(), "_rootNames", null);
        setIntField(term82539, term82539.getClass(), "_mapperFeatures", 1068991);
        setField(term82539, term82539.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term82539));
    }

};


