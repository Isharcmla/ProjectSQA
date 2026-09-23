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

public class SerializationConfig_init_212228651219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159023;
     Object term159151;
     Object term161549;
     Object term161567;
     Object term161568;

    public SerializationConfig_init_212228651219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term158923 = Class.forName((String) "com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Object term158563 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term158663 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term158795 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        Object term158887 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term158563, term158563.getClass(), "_base", term158663);
        setIntField(term158563, term158563.getClass(), "_mapperFeatures", 0);
        setField(term158563, term158563.getClass(), "_mixIns", null);
        setField(term158563, term158563.getClass(), "_subtypeResolver", term158795);
        setField(term158563, term158563.getClass(), "_rootNames", null);
        setField(term158563, term158563.getClass(), "_rootName", term158887);
        setField(term158563, term158563.getClass(), "_view", term158923);
        setField(term158563, term158563.getClass(), "_attributes", null);
        term159023 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term159151 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Class<? extends Object> term161753 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term161752 = ((Class) term161753).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term161752).setAccessible(true);
        Object enum33 = ((Field) term161752).get((Object) null);
        term161549 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term161550 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term161551 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term161552 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term161553 = (char[]) newCharArray(32);
        Object term161556 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term161559 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term161563 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term161564 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term161565 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term161566 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term161549, term161549.getClass(), "_filterProvider", null);
        setField(term161550, term161550.getClass(), "_arrayIndenter", term161551);
        setCharElement(term161553, 0, (char) 32);
        setCharElement(term161553, 1, (char) 32);
        setCharElement(term161553, 2, (char) 32);
        setCharElement(term161553, 3, (char) 32);
        setCharElement(term161553, 4, (char) 32);
        setCharElement(term161553, 5, (char) 32);
        setCharElement(term161553, 6, (char) 32);
        setCharElement(term161553, 7, (char) 32);
        setCharElement(term161553, 8, (char) 32);
        setCharElement(term161553, 9, (char) 32);
        setCharElement(term161553, 10, (char) 32);
        setCharElement(term161553, 11, (char) 32);
        setCharElement(term161553, 12, (char) 32);
        setCharElement(term161553, 13, (char) 32);
        setCharElement(term161553, 14, (char) 32);
        setCharElement(term161553, 15, (char) 32);
        setCharElement(term161553, 16, (char) 32);
        setCharElement(term161553, 17, (char) 32);
        setCharElement(term161553, 18, (char) 32);
        setCharElement(term161553, 19, (char) 32);
        setCharElement(term161553, 20, (char) 32);
        setCharElement(term161553, 21, (char) 32);
        setCharElement(term161553, 22, (char) 32);
        setCharElement(term161553, 23, (char) 32);
        setCharElement(term161553, 24, (char) 32);
        setCharElement(term161553, 25, (char) 32);
        setCharElement(term161553, 26, (char) 32);
        setCharElement(term161553, 27, (char) 32);
        setCharElement(term161553, 28, (char) 32);
        setCharElement(term161553, 29, (char) 32);
        setCharElement(term161553, 30, (char) 32);
        setCharElement(term161553, 31, (char) 32);
        setField(term161552, term161552.getClass(), "indents", term161553);
        setIntField(term161552, term161552.getClass(), "charsPerLevel", 2);
        setField(term161552, term161552.getClass(), "eol", "\n");
        setField(term161550, term161550.getClass(), "_objectIndenter", term161552);
        setField(term161556, term161556.getClass(), "_value", " ");
        setField(term161556, term161556.getClass(), "_quotedUTF8Ref", null);
        setField(term161556, term161556.getClass(), "_unquotedUTF8Ref", null);
        setField(term161556, term161556.getClass(), "_quotedChars", null);
        setField(term161556, term161556.getClass(), "_jdkSerializeValue", null);
        setField(term161550, term161550.getClass(), "_rootSeparator", term161556);
        setBooleanField(term161550, term161550.getClass(), "_spacesInObjectEntries", true);
        setIntField(term161550, term161550.getClass(), "_nesting", 0);
        setField(term161549, term161549.getClass(), "_defaultPrettyPrinter", term161550);
        setIntField(term161549, term161549.getClass(), "_serFeatures", 2722236);
        setIntField(term161549, term161549.getClass(), "_generatorFeatures", 0);
        setIntField(term161549, term161549.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term161549, term161549.getClass(), "_formatWriteFeatures", 0);
        setIntField(term161549, term161549.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term161559, term161559.getClass(), "_valueInclusion", enum33);
        setField(term161559, term161559.getClass(), "_contentInclusion", enum33);
        setField(term161549, term161549.getClass(), "_serializationInclusion", term161559);
        setField(term161563, term161563.getClass(), "_overrides", null);
        setField(term161563, term161563.getClass(), "_localMixIns", null);
        setField(term161549, term161549.getClass(), "_mixIns", term161563);
        setField(term161549, term161549.getClass(), "_subtypeResolver", null);
        setField(term161549, term161549.getClass(), "_rootName", null);
        setField(term161549, term161549.getClass(), "_view", null);
        setField(term161565, term161565.getClass(), "keySet", null);
        setField(term161565, term161565.getClass(), "values", null);
        setField(term161564, term161564.getClass(), "_shared", term161565);
        setField(term161564, term161564.getClass(), "_nonShared", null);
        setField(term161549, term161549.getClass(), "_attributes", term161564);
        setField(term161549, term161549.getClass(), "_rootNames", null);
        setIntField(term161549, term161549.getClass(), "_mapperFeatures", 1068991);
        setField(term161566, term161566.getClass(), "_classIntrospector", null);
        setField(term161566, term161566.getClass(), "_annotationIntrospector", null);
        setField(term161566, term161566.getClass(), "_visibilityChecker", null);
        setField(term161566, term161566.getClass(), "_propertyNamingStrategy", null);
        setField(term161566, term161566.getClass(), "_typeFactory", null);
        setField(term161566, term161566.getClass(), "_typeResolverBuilder", null);
        setField(term161566, term161566.getClass(), "_dateFormat", null);
        setField(term161566, term161566.getClass(), "_handlerInstantiator", null);
        setField(term161566, term161566.getClass(), "_locale", null);
        setField(term161566, term161566.getClass(), "_timeZone", null);
        setField(term161566, term161566.getClass(), "_defaultBase64", null);
        setField(term161549, term161549.getClass(), "_base", term161566);
        term161567 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term161567, term161567.getClass(), "_classIntrospector", null);
        setField(term161567, term161567.getClass(), "_annotationIntrospector", null);
        setField(term161567, term161567.getClass(), "_visibilityChecker", null);
        setField(term161567, term161567.getClass(), "_propertyNamingStrategy", null);
        setField(term161567, term161567.getClass(), "_typeFactory", null);
        setField(term161567, term161567.getClass(), "_typeResolverBuilder", null);
        setField(term161567, term161567.getClass(), "_dateFormat", null);
        setField(term161567, term161567.getClass(), "_handlerInstantiator", null);
        setField(term161567, term161567.getClass(), "_locale", null);
        setField(term161567, term161567.getClass(), "_timeZone", null);
        setField(term161567, term161567.getClass(), "_defaultBase64", null);
        term161568 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term161568, term161568.getClass(), "_overrides", null);
        setField(term161568, term161568.getClass(), "_localMixIns", null);
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
        args[0] = term159023;
        args[1] = null;
        args[2] = term159151;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term161549));
        assertTrue(recursiveEquals(term159023, term161567));
        assertTrue(recursiveEquals(term159151, term161568));
    }

};


