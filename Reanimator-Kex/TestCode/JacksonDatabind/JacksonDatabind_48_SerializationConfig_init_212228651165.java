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

public class SerializationConfig_init_212228651165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72310;
     Object term72442;
     Object term72570;
     Object term74844;
     Object term74863;
     Object term74864;
     Object term74865;

    public SerializationConfig_init_212228651165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72110 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term72210 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term72110, term72110.getClass(), "_base", term72210);
        setIntField(term72110, term72110.getClass(), "_mapperFeatures", 0);
        setField(term72110, term72110.getClass(), "_mixIns", null);
        setField(term72110, term72110.getClass(), "_subtypeResolver", null);
        setField(term72110, term72110.getClass(), "_rootNames", null);
        setField(term72110, term72110.getClass(), "_rootName", null);
        setField(term72110, term72110.getClass(), "_view", null);
        setField(term72110, term72110.getClass(), "_attributes", null);
        term72310 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term72442 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        term72570 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Class<? extends Object> term74901 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term74900 = ((Class) term74901).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term74900).setAccessible(true);
        Object enum12 = ((Field) term74900).get((Object) null);
        term74844 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term74845 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term74846 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term74847 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term74848 = (char[]) newCharArray(32);
        Object term74851 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term74854 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term74858 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term74859 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        Object term74860 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term74861 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term74862 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term74844, term74844.getClass(), "_filterProvider", null);
        setField(term74845, term74845.getClass(), "_arrayIndenter", term74846);
        setCharElement(term74848, 0, (char) 32);
        setCharElement(term74848, 1, (char) 32);
        setCharElement(term74848, 2, (char) 32);
        setCharElement(term74848, 3, (char) 32);
        setCharElement(term74848, 4, (char) 32);
        setCharElement(term74848, 5, (char) 32);
        setCharElement(term74848, 6, (char) 32);
        setCharElement(term74848, 7, (char) 32);
        setCharElement(term74848, 8, (char) 32);
        setCharElement(term74848, 9, (char) 32);
        setCharElement(term74848, 10, (char) 32);
        setCharElement(term74848, 11, (char) 32);
        setCharElement(term74848, 12, (char) 32);
        setCharElement(term74848, 13, (char) 32);
        setCharElement(term74848, 14, (char) 32);
        setCharElement(term74848, 15, (char) 32);
        setCharElement(term74848, 16, (char) 32);
        setCharElement(term74848, 17, (char) 32);
        setCharElement(term74848, 18, (char) 32);
        setCharElement(term74848, 19, (char) 32);
        setCharElement(term74848, 20, (char) 32);
        setCharElement(term74848, 21, (char) 32);
        setCharElement(term74848, 22, (char) 32);
        setCharElement(term74848, 23, (char) 32);
        setCharElement(term74848, 24, (char) 32);
        setCharElement(term74848, 25, (char) 32);
        setCharElement(term74848, 26, (char) 32);
        setCharElement(term74848, 27, (char) 32);
        setCharElement(term74848, 28, (char) 32);
        setCharElement(term74848, 29, (char) 32);
        setCharElement(term74848, 30, (char) 32);
        setCharElement(term74848, 31, (char) 32);
        setField(term74847, term74847.getClass(), "indents", term74848);
        setIntField(term74847, term74847.getClass(), "charsPerLevel", 2);
        setField(term74847, term74847.getClass(), "eol", "\n");
        setField(term74845, term74845.getClass(), "_objectIndenter", term74847);
        setField(term74851, term74851.getClass(), "_value", " ");
        setField(term74851, term74851.getClass(), "_quotedUTF8Ref", null);
        setField(term74851, term74851.getClass(), "_unquotedUTF8Ref", null);
        setField(term74851, term74851.getClass(), "_quotedChars", null);
        setField(term74851, term74851.getClass(), "_jdkSerializeValue", null);
        setField(term74845, term74845.getClass(), "_rootSeparator", term74851);
        setBooleanField(term74845, term74845.getClass(), "_spacesInObjectEntries", true);
        setIntField(term74845, term74845.getClass(), "_nesting", 0);
        setField(term74844, term74844.getClass(), "_defaultPrettyPrinter", term74845);
        setIntField(term74844, term74844.getClass(), "_serFeatures", 2722236);
        setIntField(term74844, term74844.getClass(), "_generatorFeatures", 0);
        setIntField(term74844, term74844.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term74844, term74844.getClass(), "_formatWriteFeatures", 0);
        setIntField(term74844, term74844.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term74854, term74854.getClass(), "_valueInclusion", enum12);
        setField(term74854, term74854.getClass(), "_contentInclusion", enum12);
        setField(term74844, term74844.getClass(), "_serializationInclusion", term74854);
        setField(term74858, term74858.getClass(), "_overrides", null);
        setField(term74858, term74858.getClass(), "_localMixIns", null);
        setField(term74844, term74844.getClass(), "_mixIns", term74858);
        setField(term74859, term74859.getClass(), "_registeredSubtypes", null);
        setField(term74844, term74844.getClass(), "_subtypeResolver", term74859);
        setField(term74844, term74844.getClass(), "_rootName", null);
        setField(term74844, term74844.getClass(), "_view", null);
        setField(term74861, term74861.getClass(), "keySet", null);
        setField(term74861, term74861.getClass(), "values", null);
        setField(term74860, term74860.getClass(), "_shared", term74861);
        setField(term74860, term74860.getClass(), "_nonShared", null);
        setField(term74844, term74844.getClass(), "_attributes", term74860);
        setField(term74844, term74844.getClass(), "_rootNames", null);
        setIntField(term74844, term74844.getClass(), "_mapperFeatures", 1068991);
        setField(term74862, term74862.getClass(), "_classIntrospector", null);
        setField(term74862, term74862.getClass(), "_annotationIntrospector", null);
        setField(term74862, term74862.getClass(), "_visibilityChecker", null);
        setField(term74862, term74862.getClass(), "_propertyNamingStrategy", null);
        setField(term74862, term74862.getClass(), "_typeFactory", null);
        setField(term74862, term74862.getClass(), "_typeResolverBuilder", null);
        setField(term74862, term74862.getClass(), "_dateFormat", null);
        setField(term74862, term74862.getClass(), "_handlerInstantiator", null);
        setField(term74862, term74862.getClass(), "_locale", null);
        setField(term74862, term74862.getClass(), "_timeZone", null);
        setField(term74862, term74862.getClass(), "_defaultBase64", null);
        setField(term74844, term74844.getClass(), "_base", term74862);
        term74863 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term74863, term74863.getClass(), "_classIntrospector", null);
        setField(term74863, term74863.getClass(), "_annotationIntrospector", null);
        setField(term74863, term74863.getClass(), "_visibilityChecker", null);
        setField(term74863, term74863.getClass(), "_propertyNamingStrategy", null);
        setField(term74863, term74863.getClass(), "_typeFactory", null);
        setField(term74863, term74863.getClass(), "_typeResolverBuilder", null);
        setField(term74863, term74863.getClass(), "_dateFormat", null);
        setField(term74863, term74863.getClass(), "_handlerInstantiator", null);
        setField(term74863, term74863.getClass(), "_locale", null);
        setField(term74863, term74863.getClass(), "_timeZone", null);
        setField(term74863, term74863.getClass(), "_defaultBase64", null);
        term74864 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        setField(term74864, term74864.getClass(), "_registeredSubtypes", null);
        term74865 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term74865, term74865.getClass(), "_overrides", null);
        setField(term74865, term74865.getClass(), "_localMixIns", null);
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
        args[0] = term72310;
        args[1] = term72442;
        args[2] = term72570;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term74844));
        assertTrue(recursiveEquals(term72310, term74863));
        assertTrue(recursiveEquals(term72442, term74864));
        assertTrue(recursiveEquals(term72570, term74865));
    }

};


