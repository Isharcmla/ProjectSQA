package org.apache.commons.lang3.builder;

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
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.builder.EqualityUtils.*;
import java.lang.Float;

public class HashCodeBuilder_append_196845001759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377;
     Object term380;
     Object term5426;
     Object term5422;

    public HashCodeBuilder_append_196845001759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term377, term377.getClass(), "iConstant", 37);
        setIntField(term377, term377.getClass(), "iTotal", 17);
        term380 = new Float(0.13238746F);
        term5426 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5426, term5426.getClass(), "iConstant", 37);
        setIntField(term5426, term5426.getClass(), "iTotal", 1040683785);
        term5422 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5422, term5422.getClass(), "iConstant", 37);
        setIntField(term5422, term5422.getClass(), "iTotal", 1040683785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term380;
        Object retValue = callMethod(klass, "append", argTypes, term377, args);
        assertTrue(recursiveEquals(term377, term5426));
        assertTrue(recursiveEquals(term380, 0.13238746F));
        assertTrue(recursiveEquals(retValue, term5422));
    }

};


