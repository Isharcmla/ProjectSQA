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

public class SerializationConfig_init_212228651202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130117;
     Object term130223;
     Object term132662;
     Object term132680;
     Object term132681;

    public SerializationConfig_init_212228651202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term129889 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term129989 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term129889, term129889.getClass(), "_base", term129989);
        setIntField(term129889, term129889.getClass(), "_mapperFeatures", 0);
        setField(term129889, term129889.getClass(), "_mixIns", null);
        setField(term129889, term129889.getClass(), "_subtypeResolver", null);
        setField(term129889, term129889.getClass(), "_rootNames", null);
        setField(term129889, term129889.getClass(), "_rootName", null);
        setField(term129889, term129889.getClass(), "_view", null);
        setField(term129889, term129889.getClass(), "_attributes", null);
        term130117 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term130223 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Class<? extends Object> term132717 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term132716 = ((Class) term132717).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term132716).setAccessible(true);
        Object enum26 = ((Field) term132716).get((Object) null);
        term132662 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term132663 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term132664 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term132665 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term132666 = (char[]) newCharArray(32);
        Object term132669 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term132672 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term132676 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term132677 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term132678 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term132679 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term132662, term132662.getClass(), "_filterProvider", null);
        setField(term132663, term132663.getClass(), "_arrayIndenter", term132664);
        setCharElement(term132666, 0, (char) 32);
        setCharElement(term132666, 1, (char) 32);
        setCharElement(term132666, 2, (char) 32);
        setCharElement(term132666, 3, (char) 32);
        setCharElement(term132666, 4, (char) 32);
        setCharElement(term132666, 5, (char) 32);
        setCharElement(term132666, 6, (char) 32);
        setCharElement(term132666, 7, (char) 32);
        setCharElement(term132666, 8, (char) 32);
        setCharElement(term132666, 9, (char) 32);
        setCharElement(term132666, 10, (char) 32);
        setCharElement(term132666, 11, (char) 32);
        setCharElement(term132666, 12, (char) 32);
        setCharElement(term132666, 13, (char) 32);
        setCharElement(term132666, 14, (char) 32);
        setCharElement(term132666, 15, (char) 32);
        setCharElement(term132666, 16, (char) 32);
        setCharElement(term132666, 17, (char) 32);
        setCharElement(term132666, 18, (char) 32);
        setCharElement(term132666, 19, (char) 32);
        setCharElement(term132666, 20, (char) 32);
        setCharElement(term132666, 21, (char) 32);
        setCharElement(term132666, 22, (char) 32);
        setCharElement(term132666, 23, (char) 32);
        setCharElement(term132666, 24, (char) 32);
        setCharElement(term132666, 25, (char) 32);
        setCharElement(term132666, 26, (char) 32);
        setCharElement(term132666, 27, (char) 32);
        setCharElement(term132666, 28, (char) 32);
        setCharElement(term132666, 29, (char) 32);
        setCharElement(term132666, 30, (char) 32);
        setCharElement(term132666, 31, (char) 32);
        setField(term132665, term132665.getClass(), "indents", term132666);
        setIntField(term132665, term132665.getClass(), "charsPerLevel", 2);
        setField(term132665, term132665.getClass(), "eol", "\n");
        setField(term132663, term132663.getClass(), "_objectIndenter", term132665);
        setField(term132669, term132669.getClass(), "_value", " ");
        setField(term132669, term132669.getClass(), "_quotedUTF8Ref", null);
        setField(term132669, term132669.getClass(), "_unquotedUTF8Ref", null);
        setField(term132669, term132669.getClass(), "_quotedChars", null);
        setField(term132669, term132669.getClass(), "_jdkSerializeValue", null);
        setField(term132663, term132663.getClass(), "_rootSeparator", term132669);
        setBooleanField(term132663, term132663.getClass(), "_spacesInObjectEntries", true);
        setIntField(term132663, term132663.getClass(), "_nesting", 0);
        setField(term132662, term132662.getClass(), "_defaultPrettyPrinter", term132663);
        setIntField(term132662, term132662.getClass(), "_serFeatures", 2722236);
        setIntField(term132662, term132662.getClass(), "_generatorFeatures", 0);
        setIntField(term132662, term132662.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term132662, term132662.getClass(), "_formatWriteFeatures", 0);
        setIntField(term132662, term132662.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term132672, term132672.getClass(), "_valueInclusion", enum26);
        setField(term132672, term132672.getClass(), "_contentInclusion", enum26);
        setField(term132662, term132662.getClass(), "_serializationInclusion", term132672);
        setField(term132676, term132676.getClass(), "_overrides", null);
        setField(term132676, term132676.getClass(), "_localMixIns", null);
        setField(term132662, term132662.getClass(), "_mixIns", term132676);
        setField(term132662, term132662.getClass(), "_subtypeResolver", null);
        setField(term132662, term132662.getClass(), "_rootName", null);
        setField(term132662, term132662.getClass(), "_view", null);
        setField(term132678, term132678.getClass(), "keySet", null);
        setField(term132678, term132678.getClass(), "values", null);
        setField(term132677, term132677.getClass(), "_shared", term132678);
        setField(term132677, term132677.getClass(), "_nonShared", null);
        setField(term132662, term132662.getClass(), "_attributes", term132677);
        setField(term132679, term132679.getClass(), "_rootNames", null);
        setField(term132662, term132662.getClass(), "_rootNames", term132679);
        setIntField(term132662, term132662.getClass(), "_mapperFeatures", 1068991);
        setField(term132662, term132662.getClass(), "_base", null);
        term132680 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term132680, term132680.getClass(), "_overrides", null);
        setField(term132680, term132680.getClass(), "_localMixIns", null);
        term132681 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term132681, term132681.getClass(), "_rootNames", null);
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
        args[2] = term130117;
        args[3] = term130223;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term132662));
        assertTrue(recursiveEquals(term130117, term132680));
        assertTrue(recursiveEquals(term130223, term132681));
    }

};


