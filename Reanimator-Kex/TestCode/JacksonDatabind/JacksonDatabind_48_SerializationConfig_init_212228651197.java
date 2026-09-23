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

public class SerializationConfig_init_212228651197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121855;
     Object term124127;
     Object term124144;

    public SerializationConfig_init_212228651197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term121635 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term121727 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term121635, term121635.getClass(), "_base", null);
        setIntField(term121635, term121635.getClass(), "_mapperFeatures", 0);
        setField(term121635, term121635.getClass(), "_mixIns", null);
        setField(term121635, term121635.getClass(), "_subtypeResolver", null);
        setField(term121635, term121635.getClass(), "_rootNames", null);
        setField(term121635, term121635.getClass(), "_rootName", term121727);
        setField(term121635, term121635.getClass(), "_view", null);
        setField(term121635, term121635.getClass(), "_attributes", null);
        term121855 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Class<? extends Object> term124180 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term124179 = ((Class) term124180).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term124179).setAccessible(true);
        Object enum24 = ((Field) term124179).get((Object) null);
        term124127 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term124128 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term124129 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term124130 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term124131 = (char[]) newCharArray(32);
        Object term124134 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term124137 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term124141 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term124142 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term124143 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term124127, term124127.getClass(), "_filterProvider", null);
        setField(term124128, term124128.getClass(), "_arrayIndenter", term124129);
        setCharElement(term124131, 0, (char) 32);
        setCharElement(term124131, 1, (char) 32);
        setCharElement(term124131, 2, (char) 32);
        setCharElement(term124131, 3, (char) 32);
        setCharElement(term124131, 4, (char) 32);
        setCharElement(term124131, 5, (char) 32);
        setCharElement(term124131, 6, (char) 32);
        setCharElement(term124131, 7, (char) 32);
        setCharElement(term124131, 8, (char) 32);
        setCharElement(term124131, 9, (char) 32);
        setCharElement(term124131, 10, (char) 32);
        setCharElement(term124131, 11, (char) 32);
        setCharElement(term124131, 12, (char) 32);
        setCharElement(term124131, 13, (char) 32);
        setCharElement(term124131, 14, (char) 32);
        setCharElement(term124131, 15, (char) 32);
        setCharElement(term124131, 16, (char) 32);
        setCharElement(term124131, 17, (char) 32);
        setCharElement(term124131, 18, (char) 32);
        setCharElement(term124131, 19, (char) 32);
        setCharElement(term124131, 20, (char) 32);
        setCharElement(term124131, 21, (char) 32);
        setCharElement(term124131, 22, (char) 32);
        setCharElement(term124131, 23, (char) 32);
        setCharElement(term124131, 24, (char) 32);
        setCharElement(term124131, 25, (char) 32);
        setCharElement(term124131, 26, (char) 32);
        setCharElement(term124131, 27, (char) 32);
        setCharElement(term124131, 28, (char) 32);
        setCharElement(term124131, 29, (char) 32);
        setCharElement(term124131, 30, (char) 32);
        setCharElement(term124131, 31, (char) 32);
        setField(term124130, term124130.getClass(), "indents", term124131);
        setIntField(term124130, term124130.getClass(), "charsPerLevel", 2);
        setField(term124130, term124130.getClass(), "eol", "\n");
        setField(term124128, term124128.getClass(), "_objectIndenter", term124130);
        setField(term124134, term124134.getClass(), "_value", " ");
        setField(term124134, term124134.getClass(), "_quotedUTF8Ref", null);
        setField(term124134, term124134.getClass(), "_unquotedUTF8Ref", null);
        setField(term124134, term124134.getClass(), "_quotedChars", null);
        setField(term124134, term124134.getClass(), "_jdkSerializeValue", null);
        setField(term124128, term124128.getClass(), "_rootSeparator", term124134);
        setBooleanField(term124128, term124128.getClass(), "_spacesInObjectEntries", true);
        setIntField(term124128, term124128.getClass(), "_nesting", 0);
        setField(term124127, term124127.getClass(), "_defaultPrettyPrinter", term124128);
        setIntField(term124127, term124127.getClass(), "_serFeatures", 2722236);
        setIntField(term124127, term124127.getClass(), "_generatorFeatures", 0);
        setIntField(term124127, term124127.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term124127, term124127.getClass(), "_formatWriteFeatures", 0);
        setIntField(term124127, term124127.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term124137, term124137.getClass(), "_valueInclusion", enum24);
        setField(term124137, term124137.getClass(), "_contentInclusion", enum24);
        setField(term124127, term124127.getClass(), "_serializationInclusion", term124137);
        setField(term124141, term124141.getClass(), "_overrides", null);
        setField(term124141, term124141.getClass(), "_localMixIns", null);
        setField(term124127, term124127.getClass(), "_mixIns", term124141);
        setField(term124127, term124127.getClass(), "_subtypeResolver", null);
        setField(term124127, term124127.getClass(), "_rootName", null);
        setField(term124127, term124127.getClass(), "_view", null);
        setField(term124143, term124143.getClass(), "keySet", null);
        setField(term124143, term124143.getClass(), "values", null);
        setField(term124142, term124142.getClass(), "_shared", term124143);
        setField(term124142, term124142.getClass(), "_nonShared", null);
        setField(term124127, term124127.getClass(), "_attributes", term124142);
        setField(term124127, term124127.getClass(), "_rootNames", null);
        setIntField(term124127, term124127.getClass(), "_mapperFeatures", 1068991);
        setField(term124127, term124127.getClass(), "_base", null);
        term124144 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term124144, term124144.getClass(), "_overrides", null);
        setField(term124144, term124144.getClass(), "_localMixIns", null);
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
        args[2] = term121855;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term124127));
        assertTrue(recursiveEquals(term121855, term124144));
    }

};


