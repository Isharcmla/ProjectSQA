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

public class SerializationConfig_init_212228651171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84157;
     Object term86429;
     Object term86446;

    public SerializationConfig_init_212228651171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term84025 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term84025, term84025.getClass(), "_base", null);
        setIntField(term84025, term84025.getClass(), "_mapperFeatures", 0);
        setField(term84025, term84025.getClass(), "_mixIns", null);
        setField(term84025, term84025.getClass(), "_subtypeResolver", null);
        setField(term84025, term84025.getClass(), "_rootNames", null);
        setField(term84025, term84025.getClass(), "_rootName", null);
        setField(term84025, term84025.getClass(), "_view", null);
        setField(term84025, term84025.getClass(), "_attributes", null);
        term84157 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        Class<? extends Object> term86482 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term86481 = ((Class) term86482).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term86481).setAccessible(true);
        Object enum15 = ((Field) term86481).get((Object) null);
        term86429 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term86430 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term86431 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term86432 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term86433 = (char[]) newCharArray(32);
        Object term86436 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term86439 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term86443 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        Object term86444 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term86445 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term86429, term86429.getClass(), "_filterProvider", null);
        setField(term86430, term86430.getClass(), "_arrayIndenter", term86431);
        setCharElement(term86433, 0, (char) 32);
        setCharElement(term86433, 1, (char) 32);
        setCharElement(term86433, 2, (char) 32);
        setCharElement(term86433, 3, (char) 32);
        setCharElement(term86433, 4, (char) 32);
        setCharElement(term86433, 5, (char) 32);
        setCharElement(term86433, 6, (char) 32);
        setCharElement(term86433, 7, (char) 32);
        setCharElement(term86433, 8, (char) 32);
        setCharElement(term86433, 9, (char) 32);
        setCharElement(term86433, 10, (char) 32);
        setCharElement(term86433, 11, (char) 32);
        setCharElement(term86433, 12, (char) 32);
        setCharElement(term86433, 13, (char) 32);
        setCharElement(term86433, 14, (char) 32);
        setCharElement(term86433, 15, (char) 32);
        setCharElement(term86433, 16, (char) 32);
        setCharElement(term86433, 17, (char) 32);
        setCharElement(term86433, 18, (char) 32);
        setCharElement(term86433, 19, (char) 32);
        setCharElement(term86433, 20, (char) 32);
        setCharElement(term86433, 21, (char) 32);
        setCharElement(term86433, 22, (char) 32);
        setCharElement(term86433, 23, (char) 32);
        setCharElement(term86433, 24, (char) 32);
        setCharElement(term86433, 25, (char) 32);
        setCharElement(term86433, 26, (char) 32);
        setCharElement(term86433, 27, (char) 32);
        setCharElement(term86433, 28, (char) 32);
        setCharElement(term86433, 29, (char) 32);
        setCharElement(term86433, 30, (char) 32);
        setCharElement(term86433, 31, (char) 32);
        setField(term86432, term86432.getClass(), "indents", term86433);
        setIntField(term86432, term86432.getClass(), "charsPerLevel", 2);
        setField(term86432, term86432.getClass(), "eol", "\n");
        setField(term86430, term86430.getClass(), "_objectIndenter", term86432);
        setField(term86436, term86436.getClass(), "_value", " ");
        setField(term86436, term86436.getClass(), "_quotedUTF8Ref", null);
        setField(term86436, term86436.getClass(), "_unquotedUTF8Ref", null);
        setField(term86436, term86436.getClass(), "_quotedChars", null);
        setField(term86436, term86436.getClass(), "_jdkSerializeValue", null);
        setField(term86430, term86430.getClass(), "_rootSeparator", term86436);
        setBooleanField(term86430, term86430.getClass(), "_spacesInObjectEntries", true);
        setIntField(term86430, term86430.getClass(), "_nesting", 0);
        setField(term86429, term86429.getClass(), "_defaultPrettyPrinter", term86430);
        setIntField(term86429, term86429.getClass(), "_serFeatures", 2722236);
        setIntField(term86429, term86429.getClass(), "_generatorFeatures", 0);
        setIntField(term86429, term86429.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term86429, term86429.getClass(), "_formatWriteFeatures", 0);
        setIntField(term86429, term86429.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term86439, term86439.getClass(), "_valueInclusion", enum15);
        setField(term86439, term86439.getClass(), "_contentInclusion", enum15);
        setField(term86429, term86429.getClass(), "_serializationInclusion", term86439);
        setField(term86429, term86429.getClass(), "_mixIns", null);
        setField(term86443, term86443.getClass(), "_registeredSubtypes", null);
        setField(term86429, term86429.getClass(), "_subtypeResolver", term86443);
        setField(term86429, term86429.getClass(), "_rootName", null);
        setField(term86429, term86429.getClass(), "_view", null);
        setField(term86445, term86445.getClass(), "keySet", null);
        setField(term86445, term86445.getClass(), "values", null);
        setField(term86444, term86444.getClass(), "_shared", term86445);
        setField(term86444, term86444.getClass(), "_nonShared", null);
        setField(term86429, term86429.getClass(), "_attributes", term86444);
        setField(term86429, term86429.getClass(), "_rootNames", null);
        setIntField(term86429, term86429.getClass(), "_mapperFeatures", 1068991);
        setField(term86429, term86429.getClass(), "_base", null);
        term86446 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        setField(term86446, term86446.getClass(), "_registeredSubtypes", null);
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
        args[1] = term84157;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term86429));
        assertTrue(recursiveEquals(term84157, term86446));
    }

};


