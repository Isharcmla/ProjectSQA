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

public class SerializationConfig_init_212228651190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113351;
     Object term115789;
     Object term115806;

    public SerializationConfig_init_212228651190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term112999 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term113131 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        Object term113251 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        setField(term112999, term112999.getClass(), "_base", null);
        setIntField(term112999, term112999.getClass(), "_mapperFeatures", 0);
        setField(term112999, term112999.getClass(), "_mixIns", null);
        setField(term112999, term112999.getClass(), "_subtypeResolver", term113131);
        setField(term112999, term112999.getClass(), "_rootNames", null);
        setField(term112999, term112999.getClass(), "_rootName", null);
        setField(term112999, term112999.getClass(), "_view", null);
        setField(term112999, term112999.getClass(), "_attributes", term113251);
        term113351 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Class<? extends Object> term115842 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term115841 = ((Class) term115842).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term115841).setAccessible(true);
        Object enum22 = ((Field) term115841).get((Object) null);
        term115789 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term115790 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term115791 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term115792 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term115793 = (char[]) newCharArray(32);
        Object term115796 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term115799 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term115803 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term115804 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term115805 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term115789, term115789.getClass(), "_filterProvider", null);
        setField(term115790, term115790.getClass(), "_arrayIndenter", term115791);
        setCharElement(term115793, 0, (char) 32);
        setCharElement(term115793, 1, (char) 32);
        setCharElement(term115793, 2, (char) 32);
        setCharElement(term115793, 3, (char) 32);
        setCharElement(term115793, 4, (char) 32);
        setCharElement(term115793, 5, (char) 32);
        setCharElement(term115793, 6, (char) 32);
        setCharElement(term115793, 7, (char) 32);
        setCharElement(term115793, 8, (char) 32);
        setCharElement(term115793, 9, (char) 32);
        setCharElement(term115793, 10, (char) 32);
        setCharElement(term115793, 11, (char) 32);
        setCharElement(term115793, 12, (char) 32);
        setCharElement(term115793, 13, (char) 32);
        setCharElement(term115793, 14, (char) 32);
        setCharElement(term115793, 15, (char) 32);
        setCharElement(term115793, 16, (char) 32);
        setCharElement(term115793, 17, (char) 32);
        setCharElement(term115793, 18, (char) 32);
        setCharElement(term115793, 19, (char) 32);
        setCharElement(term115793, 20, (char) 32);
        setCharElement(term115793, 21, (char) 32);
        setCharElement(term115793, 22, (char) 32);
        setCharElement(term115793, 23, (char) 32);
        setCharElement(term115793, 24, (char) 32);
        setCharElement(term115793, 25, (char) 32);
        setCharElement(term115793, 26, (char) 32);
        setCharElement(term115793, 27, (char) 32);
        setCharElement(term115793, 28, (char) 32);
        setCharElement(term115793, 29, (char) 32);
        setCharElement(term115793, 30, (char) 32);
        setCharElement(term115793, 31, (char) 32);
        setField(term115792, term115792.getClass(), "indents", term115793);
        setIntField(term115792, term115792.getClass(), "charsPerLevel", 2);
        setField(term115792, term115792.getClass(), "eol", "\n");
        setField(term115790, term115790.getClass(), "_objectIndenter", term115792);
        setField(term115796, term115796.getClass(), "_value", " ");
        setField(term115796, term115796.getClass(), "_quotedUTF8Ref", null);
        setField(term115796, term115796.getClass(), "_unquotedUTF8Ref", null);
        setField(term115796, term115796.getClass(), "_quotedChars", null);
        setField(term115796, term115796.getClass(), "_jdkSerializeValue", null);
        setField(term115790, term115790.getClass(), "_rootSeparator", term115796);
        setBooleanField(term115790, term115790.getClass(), "_spacesInObjectEntries", true);
        setIntField(term115790, term115790.getClass(), "_nesting", 0);
        setField(term115789, term115789.getClass(), "_defaultPrettyPrinter", term115790);
        setIntField(term115789, term115789.getClass(), "_serFeatures", 2722236);
        setIntField(term115789, term115789.getClass(), "_generatorFeatures", 0);
        setIntField(term115789, term115789.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term115789, term115789.getClass(), "_formatWriteFeatures", 0);
        setIntField(term115789, term115789.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term115799, term115799.getClass(), "_valueInclusion", enum22);
        setField(term115799, term115799.getClass(), "_contentInclusion", enum22);
        setField(term115789, term115789.getClass(), "_serializationInclusion", term115799);
        setField(term115789, term115789.getClass(), "_mixIns", null);
        setField(term115789, term115789.getClass(), "_subtypeResolver", null);
        setField(term115789, term115789.getClass(), "_rootName", null);
        setField(term115789, term115789.getClass(), "_view", null);
        setField(term115804, term115804.getClass(), "keySet", null);
        setField(term115804, term115804.getClass(), "values", null);
        setField(term115803, term115803.getClass(), "_shared", term115804);
        setField(term115803, term115803.getClass(), "_nonShared", null);
        setField(term115789, term115789.getClass(), "_attributes", term115803);
        setField(term115789, term115789.getClass(), "_rootNames", null);
        setIntField(term115789, term115789.getClass(), "_mapperFeatures", 1068991);
        setField(term115805, term115805.getClass(), "_classIntrospector", null);
        setField(term115805, term115805.getClass(), "_annotationIntrospector", null);
        setField(term115805, term115805.getClass(), "_visibilityChecker", null);
        setField(term115805, term115805.getClass(), "_propertyNamingStrategy", null);
        setField(term115805, term115805.getClass(), "_typeFactory", null);
        setField(term115805, term115805.getClass(), "_typeResolverBuilder", null);
        setField(term115805, term115805.getClass(), "_dateFormat", null);
        setField(term115805, term115805.getClass(), "_handlerInstantiator", null);
        setField(term115805, term115805.getClass(), "_locale", null);
        setField(term115805, term115805.getClass(), "_timeZone", null);
        setField(term115805, term115805.getClass(), "_defaultBase64", null);
        setField(term115789, term115789.getClass(), "_base", term115805);
        term115806 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term115806, term115806.getClass(), "_classIntrospector", null);
        setField(term115806, term115806.getClass(), "_annotationIntrospector", null);
        setField(term115806, term115806.getClass(), "_visibilityChecker", null);
        setField(term115806, term115806.getClass(), "_propertyNamingStrategy", null);
        setField(term115806, term115806.getClass(), "_typeFactory", null);
        setField(term115806, term115806.getClass(), "_typeResolverBuilder", null);
        setField(term115806, term115806.getClass(), "_dateFormat", null);
        setField(term115806, term115806.getClass(), "_handlerInstantiator", null);
        setField(term115806, term115806.getClass(), "_locale", null);
        setField(term115806, term115806.getClass(), "_timeZone", null);
        setField(term115806, term115806.getClass(), "_defaultBase64", null);
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
        args[0] = term113351;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term115789));
        assertTrue(recursiveEquals(term113351, term115806));
    }

};


