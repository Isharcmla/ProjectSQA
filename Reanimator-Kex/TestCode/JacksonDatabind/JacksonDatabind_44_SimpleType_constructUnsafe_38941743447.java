package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class SimpleType_constructUnsafe_38941743447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6236;
     Object term7458;
     Object term7301;

    public SimpleType_constructUnsafe_38941743447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6236 = Class.forName((String) "com.fasterxml.jackson.databind.cfg.ContextAttributes");
        term7458 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        Class<? extends Object> term7306 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        term7301 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term7302 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term7303 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7304 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term7301, term7301.getClass(), "_superClass", null);
        setField(term7301, term7301.getClass(), "_superInterfaces", null);
        setField(term7302, term7302.getClass(), "_names", term7303);
        setField(term7302, term7302.getClass(), "_types", term7304);
        setField(term7302, term7302.getClass(), "_unboundVariables", null);
        setIntField(term7302, term7302.getClass(), "_hashCode", 1);
        setField(term7301, term7301.getClass(), "_bindings", term7302);
        setField(term7301, term7301.getClass(), "_canonicalName", null);
        setField(term7301, term7301.getClass(), "_class", term7306);
        setIntField(term7301, term7301.getClass(), "_hash", -425211174);
        setField(term7301, term7301.getClass(), "_valueHandler", null);
        setField(term7301, term7301.getClass(), "_typeHandler", null);
        setBooleanField(term7301, term7301.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = term6236;
        Object retValue = callMethod(klass, "constructUnsafe", argTypes, null, args);
        assertTrue(recursiveEquals(term6236, term7458));
        assertTrue(recursiveEquals(retValue, term7301));
    }

};


