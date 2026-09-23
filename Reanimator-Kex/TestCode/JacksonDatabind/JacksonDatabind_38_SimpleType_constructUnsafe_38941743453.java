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

public class SimpleType_constructUnsafe_38941743453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10812;
     Object term11770;
     Object term11632;

    public SimpleType_constructUnsafe_38941743453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10812 = Class.forName((String) "java.util.Locale$LocaleNameGetter");
        term11770 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIdentityReference");
        Class<? extends Object> term11637 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIdentityReference");
        term11632 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term11633 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term11634 = (Object[]) newArray("java.lang.String", 0);
        Object[] term11635 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term11632, term11632.getClass(), "_superClass", null);
        setField(term11632, term11632.getClass(), "_superInterfaces", null);
        setField(term11633, term11633.getClass(), "_names", term11634);
        setField(term11633, term11633.getClass(), "_types", term11635);
        setField(term11633, term11633.getClass(), "_unboundVariables", null);
        setIntField(term11633, term11633.getClass(), "_hashCode", 1);
        setField(term11632, term11632.getClass(), "_bindings", term11633);
        setField(term11632, term11632.getClass(), "_canonicalName", null);
        setField(term11632, term11632.getClass(), "_class", term11637);
        setIntField(term11632, term11632.getClass(), "_hash", -679675442);
        setField(term11632, term11632.getClass(), "_valueHandler", null);
        setField(term11632, term11632.getClass(), "_typeHandler", null);
        setBooleanField(term11632, term11632.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = term10812;
        Object retValue = callMethod(klass, "constructUnsafe", argTypes, null, args);
        assertTrue(recursiveEquals(term10812, term11770));
        assertTrue(recursiveEquals(retValue, term11632));
    }

};


