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

public class HashCodeBuilder_append_626943704112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29901;
     Object term30015;
     Object term30236;
     Object term30237;
     Object term30232;

    public HashCodeBuilder_append_626943704112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29901 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        term30015 = newInstance(Class.forName("org.apache.commons.lang3.text.StrMatcher$StringMatcher"));
        term30236 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term30236, term30236.getClass(), "iConstant", 0);
        setIntField(term30236, term30236.getClass(), "iTotal", 2022930836);
        term30237 = newInstance(Class.forName("org.apache.commons.lang3.text.StrMatcher$StringMatcher"));
        setField(term30237, term30237.getClass(), "chars", null);
        term30232 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term30232, term30232.getClass(), "iConstant", 0);
        setIntField(term30232, term30232.getClass(), "iTotal", 2022930836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30015;
        Object retValue = callMethod(klass, "append", argTypes, term29901, args);
        assertTrue(recursiveEquals(term29901, term30236));
        assertTrue(recursiveEquals(term30015, term30237));
        assertTrue(recursiveEquals(retValue, term30232));
    }

};


