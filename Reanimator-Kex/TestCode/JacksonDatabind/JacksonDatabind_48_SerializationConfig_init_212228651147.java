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

public class SerializationConfig_init_212228651147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34510;
     Object term36782;
     Object term36799;

    public SerializationConfig_init_212228651147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34382 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term34382, term34382.getClass(), "_base", null);
        setIntField(term34382, term34382.getClass(), "_mapperFeatures", 0);
        setField(term34382, term34382.getClass(), "_mixIns", null);
        setField(term34382, term34382.getClass(), "_subtypeResolver", null);
        setField(term34382, term34382.getClass(), "_rootNames", null);
        setField(term34382, term34382.getClass(), "_rootName", null);
        setField(term34382, term34382.getClass(), "_view", null);
        setField(term34382, term34382.getClass(), "_attributes", null);
        term34510 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Class<? extends Object> term36835 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term36834 = ((Class) term36835).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term36834).setAccessible(true);
        Object enum3 = ((Field) term36834).get((Object) null);
        term36782 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term36783 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term36784 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term36785 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term36786 = (char[]) newCharArray(32);
        Object term36789 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term36792 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term36796 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term36797 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term36798 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term36782, term36782.getClass(), "_filterProvider", null);
        setField(term36783, term36783.getClass(), "_arrayIndenter", term36784);
        setCharElement(term36786, 0, (char) 32);
        setCharElement(term36786, 1, (char) 32);
        setCharElement(term36786, 2, (char) 32);
        setCharElement(term36786, 3, (char) 32);
        setCharElement(term36786, 4, (char) 32);
        setCharElement(term36786, 5, (char) 32);
        setCharElement(term36786, 6, (char) 32);
        setCharElement(term36786, 7, (char) 32);
        setCharElement(term36786, 8, (char) 32);
        setCharElement(term36786, 9, (char) 32);
        setCharElement(term36786, 10, (char) 32);
        setCharElement(term36786, 11, (char) 32);
        setCharElement(term36786, 12, (char) 32);
        setCharElement(term36786, 13, (char) 32);
        setCharElement(term36786, 14, (char) 32);
        setCharElement(term36786, 15, (char) 32);
        setCharElement(term36786, 16, (char) 32);
        setCharElement(term36786, 17, (char) 32);
        setCharElement(term36786, 18, (char) 32);
        setCharElement(term36786, 19, (char) 32);
        setCharElement(term36786, 20, (char) 32);
        setCharElement(term36786, 21, (char) 32);
        setCharElement(term36786, 22, (char) 32);
        setCharElement(term36786, 23, (char) 32);
        setCharElement(term36786, 24, (char) 32);
        setCharElement(term36786, 25, (char) 32);
        setCharElement(term36786, 26, (char) 32);
        setCharElement(term36786, 27, (char) 32);
        setCharElement(term36786, 28, (char) 32);
        setCharElement(term36786, 29, (char) 32);
        setCharElement(term36786, 30, (char) 32);
        setCharElement(term36786, 31, (char) 32);
        setField(term36785, term36785.getClass(), "indents", term36786);
        setIntField(term36785, term36785.getClass(), "charsPerLevel", 2);
        setField(term36785, term36785.getClass(), "eol", "\n");
        setField(term36783, term36783.getClass(), "_objectIndenter", term36785);
        setField(term36789, term36789.getClass(), "_value", " ");
        setField(term36789, term36789.getClass(), "_quotedUTF8Ref", null);
        setField(term36789, term36789.getClass(), "_unquotedUTF8Ref", null);
        setField(term36789, term36789.getClass(), "_quotedChars", null);
        setField(term36789, term36789.getClass(), "_jdkSerializeValue", null);
        setField(term36783, term36783.getClass(), "_rootSeparator", term36789);
        setBooleanField(term36783, term36783.getClass(), "_spacesInObjectEntries", true);
        setIntField(term36783, term36783.getClass(), "_nesting", 0);
        setField(term36782, term36782.getClass(), "_defaultPrettyPrinter", term36783);
        setIntField(term36782, term36782.getClass(), "_serFeatures", 2722236);
        setIntField(term36782, term36782.getClass(), "_generatorFeatures", 0);
        setIntField(term36782, term36782.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term36782, term36782.getClass(), "_formatWriteFeatures", 0);
        setIntField(term36782, term36782.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term36792, term36792.getClass(), "_valueInclusion", enum3);
        setField(term36792, term36792.getClass(), "_contentInclusion", enum3);
        setField(term36782, term36782.getClass(), "_serializationInclusion", term36792);
        setField(term36796, term36796.getClass(), "_overrides", null);
        setField(term36796, term36796.getClass(), "_localMixIns", null);
        setField(term36782, term36782.getClass(), "_mixIns", term36796);
        setField(term36782, term36782.getClass(), "_subtypeResolver", null);
        setField(term36782, term36782.getClass(), "_rootName", null);
        setField(term36782, term36782.getClass(), "_view", null);
        setField(term36798, term36798.getClass(), "keySet", null);
        setField(term36798, term36798.getClass(), "values", null);
        setField(term36797, term36797.getClass(), "_shared", term36798);
        setField(term36797, term36797.getClass(), "_nonShared", null);
        setField(term36782, term36782.getClass(), "_attributes", term36797);
        setField(term36782, term36782.getClass(), "_rootNames", null);
        setIntField(term36782, term36782.getClass(), "_mapperFeatures", 1068991);
        setField(term36782, term36782.getClass(), "_base", null);
        term36799 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term36799, term36799.getClass(), "_overrides", null);
        setField(term36799, term36799.getClass(), "_localMixIns", null);
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
        args[2] = term34510;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36782));
        assertTrue(recursiveEquals(term34510, term36799));
    }

};


