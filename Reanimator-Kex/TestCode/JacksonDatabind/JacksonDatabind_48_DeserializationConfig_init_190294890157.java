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

public class DeserializationConfig_init_190294890157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52313;
     Object term52441;
     Object term54743;
     Object term54749;
     Object term54750;

    public DeserializationConfig_init_190294890157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term52163 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term52313 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term52163, term52163.getClass(), "_base", term52313);
        setIntField(term52163, term52163.getClass(), "_mapperFeatures", 0);
        setField(term52163, term52163.getClass(), "_mixIns", null);
        setField(term52163, term52163.getClass(), "_subtypeResolver", null);
        setField(term52163, term52163.getClass(), "_rootNames", null);
        setField(term52163, term52163.getClass(), "_rootName", null);
        setField(term52163, term52163.getClass(), "_view", null);
        setField(term52163, term52163.getClass(), "_attributes", null);
        term52441 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term54743 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term54744 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term54745 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term54746 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term54747 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term54748 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term54743, term54743.getClass(), "_problemHandlers", null);
        setBooleanField(term54744, term54744.getClass(), "_cfgBigDecimalExact", false);
        setField(term54743, term54743.getClass(), "_nodeFactory", term54744);
        setIntField(term54743, term54743.getClass(), "_deserFeatures", 15214880);
        setIntField(term54743, term54743.getClass(), "_parserFeatures", 0);
        setIntField(term54743, term54743.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term54743, term54743.getClass(), "_formatReadFeatures", 0);
        setIntField(term54743, term54743.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term54745, term54745.getClass(), "_overrides", null);
        setField(term54745, term54745.getClass(), "_localMixIns", null);
        setField(term54743, term54743.getClass(), "_mixIns", term54745);
        setField(term54743, term54743.getClass(), "_subtypeResolver", null);
        setField(term54743, term54743.getClass(), "_rootName", null);
        setField(term54743, term54743.getClass(), "_view", null);
        setField(term54747, term54747.getClass(), "keySet", null);
        setField(term54747, term54747.getClass(), "values", null);
        setField(term54746, term54746.getClass(), "_shared", term54747);
        setField(term54746, term54746.getClass(), "_nonShared", null);
        setField(term54743, term54743.getClass(), "_attributes", term54746);
        setField(term54743, term54743.getClass(), "_rootNames", null);
        setIntField(term54743, term54743.getClass(), "_mapperFeatures", 1068991);
        setField(term54748, term54748.getClass(), "_classIntrospector", null);
        setField(term54748, term54748.getClass(), "_annotationIntrospector", null);
        setField(term54748, term54748.getClass(), "_visibilityChecker", null);
        setField(term54748, term54748.getClass(), "_propertyNamingStrategy", null);
        setField(term54748, term54748.getClass(), "_typeFactory", null);
        setField(term54748, term54748.getClass(), "_typeResolverBuilder", null);
        setField(term54748, term54748.getClass(), "_dateFormat", null);
        setField(term54748, term54748.getClass(), "_handlerInstantiator", null);
        setField(term54748, term54748.getClass(), "_locale", null);
        setField(term54748, term54748.getClass(), "_timeZone", null);
        setField(term54748, term54748.getClass(), "_defaultBase64", null);
        setField(term54743, term54743.getClass(), "_base", term54748);
        term54749 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term54749, term54749.getClass(), "_classIntrospector", null);
        setField(term54749, term54749.getClass(), "_annotationIntrospector", null);
        setField(term54749, term54749.getClass(), "_visibilityChecker", null);
        setField(term54749, term54749.getClass(), "_propertyNamingStrategy", null);
        setField(term54749, term54749.getClass(), "_typeFactory", null);
        setField(term54749, term54749.getClass(), "_typeResolverBuilder", null);
        setField(term54749, term54749.getClass(), "_dateFormat", null);
        setField(term54749, term54749.getClass(), "_handlerInstantiator", null);
        setField(term54749, term54749.getClass(), "_locale", null);
        setField(term54749, term54749.getClass(), "_timeZone", null);
        setField(term54749, term54749.getClass(), "_defaultBase64", null);
        term54750 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term54750, term54750.getClass(), "_overrides", null);
        setField(term54750, term54750.getClass(), "_localMixIns", null);
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
        args[0] = term52313;
        args[1] = null;
        args[2] = term52441;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term54743));
        assertTrue(recursiveEquals(term52313, term54749));
        assertTrue(recursiveEquals(term52441, term54750));
    }

};


