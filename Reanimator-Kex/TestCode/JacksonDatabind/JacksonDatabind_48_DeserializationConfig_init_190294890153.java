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

public class DeserializationConfig_init_190294890153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44835;
     Object term44963;
     Object term47265;
     Object term47271;
     Object term47272;

    public DeserializationConfig_init_190294890153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44543 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term44643 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term44735 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term44543, term44543.getClass(), "_base", term44643);
        setIntField(term44543, term44543.getClass(), "_mapperFeatures", 0);
        setField(term44543, term44543.getClass(), "_mixIns", null);
        setField(term44543, term44543.getClass(), "_subtypeResolver", null);
        setField(term44543, term44543.getClass(), "_rootNames", null);
        setField(term44543, term44543.getClass(), "_rootName", term44735);
        setField(term44543, term44543.getClass(), "_view", null);
        setField(term44543, term44543.getClass(), "_attributes", null);
        term44835 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term44963 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term47265 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term47266 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term47267 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term47268 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term47269 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term47270 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term47265, term47265.getClass(), "_problemHandlers", null);
        setBooleanField(term47266, term47266.getClass(), "_cfgBigDecimalExact", false);
        setField(term47265, term47265.getClass(), "_nodeFactory", term47266);
        setIntField(term47265, term47265.getClass(), "_deserFeatures", 15214880);
        setIntField(term47265, term47265.getClass(), "_parserFeatures", 0);
        setIntField(term47265, term47265.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term47265, term47265.getClass(), "_formatReadFeatures", 0);
        setIntField(term47265, term47265.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term47267, term47267.getClass(), "_overrides", null);
        setField(term47267, term47267.getClass(), "_localMixIns", null);
        setField(term47265, term47265.getClass(), "_mixIns", term47267);
        setField(term47265, term47265.getClass(), "_subtypeResolver", null);
        setField(term47265, term47265.getClass(), "_rootName", null);
        setField(term47265, term47265.getClass(), "_view", null);
        setField(term47269, term47269.getClass(), "keySet", null);
        setField(term47269, term47269.getClass(), "values", null);
        setField(term47268, term47268.getClass(), "_shared", term47269);
        setField(term47268, term47268.getClass(), "_nonShared", null);
        setField(term47265, term47265.getClass(), "_attributes", term47268);
        setField(term47265, term47265.getClass(), "_rootNames", null);
        setIntField(term47265, term47265.getClass(), "_mapperFeatures", 1068991);
        setField(term47270, term47270.getClass(), "_classIntrospector", null);
        setField(term47270, term47270.getClass(), "_annotationIntrospector", null);
        setField(term47270, term47270.getClass(), "_visibilityChecker", null);
        setField(term47270, term47270.getClass(), "_propertyNamingStrategy", null);
        setField(term47270, term47270.getClass(), "_typeFactory", null);
        setField(term47270, term47270.getClass(), "_typeResolverBuilder", null);
        setField(term47270, term47270.getClass(), "_dateFormat", null);
        setField(term47270, term47270.getClass(), "_handlerInstantiator", null);
        setField(term47270, term47270.getClass(), "_locale", null);
        setField(term47270, term47270.getClass(), "_timeZone", null);
        setField(term47270, term47270.getClass(), "_defaultBase64", null);
        setField(term47265, term47265.getClass(), "_base", term47270);
        term47271 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term47271, term47271.getClass(), "_classIntrospector", null);
        setField(term47271, term47271.getClass(), "_annotationIntrospector", null);
        setField(term47271, term47271.getClass(), "_visibilityChecker", null);
        setField(term47271, term47271.getClass(), "_propertyNamingStrategy", null);
        setField(term47271, term47271.getClass(), "_typeFactory", null);
        setField(term47271, term47271.getClass(), "_typeResolverBuilder", null);
        setField(term47271, term47271.getClass(), "_dateFormat", null);
        setField(term47271, term47271.getClass(), "_handlerInstantiator", null);
        setField(term47271, term47271.getClass(), "_locale", null);
        setField(term47271, term47271.getClass(), "_timeZone", null);
        setField(term47271, term47271.getClass(), "_defaultBase64", null);
        term47272 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term47272, term47272.getClass(), "_overrides", null);
        setField(term47272, term47272.getClass(), "_localMixIns", null);
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
        args[0] = term44835;
        args[1] = null;
        args[2] = term44963;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term47265));
        assertTrue(recursiveEquals(term44835, term47271));
        assertTrue(recursiveEquals(term44963, term47272));
    }

};


