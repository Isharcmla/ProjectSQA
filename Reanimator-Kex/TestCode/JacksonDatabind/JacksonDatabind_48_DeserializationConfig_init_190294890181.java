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

public class DeserializationConfig_init_190294890181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94048;
     Object term94180;
     Object term94286;
     Object term96589;
     Object term96596;
     Object term96597;
     Object term96598;

    public DeserializationConfig_init_190294890181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term93686 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term94048 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term93878 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term93998 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        setField(term93686, term93686.getClass(), "_base", term94048);
        setIntField(term93686, term93686.getClass(), "_mapperFeatures", 0);
        setField(term93686, term93686.getClass(), "_mixIns", null);
        setField(term93686, term93686.getClass(), "_subtypeResolver", null);
        setField(term93686, term93686.getClass(), "_rootNames", null);
        setField(term93686, term93686.getClass(), "_rootName", term93878);
        setField(term93686, term93686.getClass(), "_view", null);
        setField(term93686, term93686.getClass(), "_attributes", term93998);
        term94180 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        term94286 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        term96589 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term96590 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term96591 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        Object term96592 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term96593 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term96594 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term96595 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term96589, term96589.getClass(), "_problemHandlers", null);
        setBooleanField(term96590, term96590.getClass(), "_cfgBigDecimalExact", false);
        setField(term96589, term96589.getClass(), "_nodeFactory", term96590);
        setIntField(term96589, term96589.getClass(), "_deserFeatures", 15214880);
        setIntField(term96589, term96589.getClass(), "_parserFeatures", 0);
        setIntField(term96589, term96589.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term96589, term96589.getClass(), "_formatReadFeatures", 0);
        setIntField(term96589, term96589.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term96589, term96589.getClass(), "_mixIns", null);
        setField(term96591, term96591.getClass(), "_registeredSubtypes", null);
        setField(term96589, term96589.getClass(), "_subtypeResolver", term96591);
        setField(term96589, term96589.getClass(), "_rootName", null);
        setField(term96589, term96589.getClass(), "_view", null);
        setField(term96593, term96593.getClass(), "keySet", null);
        setField(term96593, term96593.getClass(), "values", null);
        setField(term96592, term96592.getClass(), "_shared", term96593);
        setField(term96592, term96592.getClass(), "_nonShared", null);
        setField(term96589, term96589.getClass(), "_attributes", term96592);
        setField(term96594, term96594.getClass(), "_rootNames", null);
        setField(term96589, term96589.getClass(), "_rootNames", term96594);
        setIntField(term96589, term96589.getClass(), "_mapperFeatures", 1068991);
        setField(term96595, term96595.getClass(), "_classIntrospector", null);
        setField(term96595, term96595.getClass(), "_annotationIntrospector", null);
        setField(term96595, term96595.getClass(), "_visibilityChecker", null);
        setField(term96595, term96595.getClass(), "_propertyNamingStrategy", null);
        setField(term96595, term96595.getClass(), "_typeFactory", null);
        setField(term96595, term96595.getClass(), "_typeResolverBuilder", null);
        setField(term96595, term96595.getClass(), "_dateFormat", null);
        setField(term96595, term96595.getClass(), "_handlerInstantiator", null);
        setField(term96595, term96595.getClass(), "_locale", null);
        setField(term96595, term96595.getClass(), "_timeZone", null);
        setField(term96595, term96595.getClass(), "_defaultBase64", null);
        setField(term96589, term96589.getClass(), "_base", term96595);
        term96596 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term96596, term96596.getClass(), "_classIntrospector", null);
        setField(term96596, term96596.getClass(), "_annotationIntrospector", null);
        setField(term96596, term96596.getClass(), "_visibilityChecker", null);
        setField(term96596, term96596.getClass(), "_propertyNamingStrategy", null);
        setField(term96596, term96596.getClass(), "_typeFactory", null);
        setField(term96596, term96596.getClass(), "_typeResolverBuilder", null);
        setField(term96596, term96596.getClass(), "_dateFormat", null);
        setField(term96596, term96596.getClass(), "_handlerInstantiator", null);
        setField(term96596, term96596.getClass(), "_locale", null);
        setField(term96596, term96596.getClass(), "_timeZone", null);
        setField(term96596, term96596.getClass(), "_defaultBase64", null);
        term96597 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        setField(term96597, term96597.getClass(), "_registeredSubtypes", null);
        term96598 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term96598, term96598.getClass(), "_rootNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.SubtypeResolver");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup");
        Object[] args = new Object[4];
        args[0] = term94048;
        args[1] = term94180;
        args[2] = null;
        args[3] = term94286;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term96589));
        assertTrue(recursiveEquals(term94048, term96596));
        assertTrue(recursiveEquals(term94180, term96597));
        assertTrue(recursiveEquals(term94286, term96598));
    }

};


