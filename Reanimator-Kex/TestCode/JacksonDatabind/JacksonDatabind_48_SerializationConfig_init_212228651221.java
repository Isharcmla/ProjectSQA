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

public class SerializationConfig_init_212228651221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165637;

    public SerializationConfig_init_212228651221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term163366 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term163366, term163366.getClass(), "_base", null);
        setIntField(term163366, term163366.getClass(), "_mapperFeatures", 0);
        setField(term163366, term163366.getClass(), "_mixIns", null);
        setField(term163366, term163366.getClass(), "_subtypeResolver", null);
        setField(term163366, term163366.getClass(), "_rootNames", null);
        setField(term163366, term163366.getClass(), "_rootName", null);
        setField(term163366, term163366.getClass(), "_view", null);
        setField(term163366, term163366.getClass(), "_attributes", null);
        Class<? extends Object> term165688 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term165687 = ((Class) term165688).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term165687).setAccessible(true);
        Object enum34 = ((Field) term165687).get((Object) null);
        term165637 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term165638 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term165639 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term165640 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term165641 = (char[]) newCharArray(32);
        Object term165644 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term165647 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term165651 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term165652 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term165637, term165637.getClass(), "_filterProvider", null);
        setField(term165638, term165638.getClass(), "_arrayIndenter", term165639);
        setCharElement(term165641, 0, (char) 32);
        setCharElement(term165641, 1, (char) 32);
        setCharElement(term165641, 2, (char) 32);
        setCharElement(term165641, 3, (char) 32);
        setCharElement(term165641, 4, (char) 32);
        setCharElement(term165641, 5, (char) 32);
        setCharElement(term165641, 6, (char) 32);
        setCharElement(term165641, 7, (char) 32);
        setCharElement(term165641, 8, (char) 32);
        setCharElement(term165641, 9, (char) 32);
        setCharElement(term165641, 10, (char) 32);
        setCharElement(term165641, 11, (char) 32);
        setCharElement(term165641, 12, (char) 32);
        setCharElement(term165641, 13, (char) 32);
        setCharElement(term165641, 14, (char) 32);
        setCharElement(term165641, 15, (char) 32);
        setCharElement(term165641, 16, (char) 32);
        setCharElement(term165641, 17, (char) 32);
        setCharElement(term165641, 18, (char) 32);
        setCharElement(term165641, 19, (char) 32);
        setCharElement(term165641, 20, (char) 32);
        setCharElement(term165641, 21, (char) 32);
        setCharElement(term165641, 22, (char) 32);
        setCharElement(term165641, 23, (char) 32);
        setCharElement(term165641, 24, (char) 32);
        setCharElement(term165641, 25, (char) 32);
        setCharElement(term165641, 26, (char) 32);
        setCharElement(term165641, 27, (char) 32);
        setCharElement(term165641, 28, (char) 32);
        setCharElement(term165641, 29, (char) 32);
        setCharElement(term165641, 30, (char) 32);
        setCharElement(term165641, 31, (char) 32);
        setField(term165640, term165640.getClass(), "indents", term165641);
        setIntField(term165640, term165640.getClass(), "charsPerLevel", 2);
        setField(term165640, term165640.getClass(), "eol", "\n");
        setField(term165638, term165638.getClass(), "_objectIndenter", term165640);
        setField(term165644, term165644.getClass(), "_value", " ");
        setField(term165644, term165644.getClass(), "_quotedUTF8Ref", null);
        setField(term165644, term165644.getClass(), "_unquotedUTF8Ref", null);
        setField(term165644, term165644.getClass(), "_quotedChars", null);
        setField(term165644, term165644.getClass(), "_jdkSerializeValue", null);
        setField(term165638, term165638.getClass(), "_rootSeparator", term165644);
        setBooleanField(term165638, term165638.getClass(), "_spacesInObjectEntries", true);
        setIntField(term165638, term165638.getClass(), "_nesting", 0);
        setField(term165637, term165637.getClass(), "_defaultPrettyPrinter", term165638);
        setIntField(term165637, term165637.getClass(), "_serFeatures", 2722236);
        setIntField(term165637, term165637.getClass(), "_generatorFeatures", 0);
        setIntField(term165637, term165637.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term165637, term165637.getClass(), "_formatWriteFeatures", 0);
        setIntField(term165637, term165637.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term165647, term165647.getClass(), "_valueInclusion", enum34);
        setField(term165647, term165647.getClass(), "_contentInclusion", enum34);
        setField(term165637, term165637.getClass(), "_serializationInclusion", term165647);
        setField(term165637, term165637.getClass(), "_mixIns", null);
        setField(term165637, term165637.getClass(), "_subtypeResolver", null);
        setField(term165637, term165637.getClass(), "_rootName", null);
        setField(term165637, term165637.getClass(), "_view", null);
        setField(term165652, term165652.getClass(), "keySet", null);
        setField(term165652, term165652.getClass(), "values", null);
        setField(term165651, term165651.getClass(), "_shared", term165652);
        setField(term165651, term165651.getClass(), "_nonShared", null);
        setField(term165637, term165637.getClass(), "_attributes", term165651);
        setField(term165637, term165637.getClass(), "_rootNames", null);
        setIntField(term165637, term165637.getClass(), "_mapperFeatures", 1068991);
        setField(term165637, term165637.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term165637));
    }

};


