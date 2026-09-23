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
import java.lang.Character;

public class HashCodeBuilder_append_69680000555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343;
     Object term346;
     Object term5351;
     Object term5347;

    public HashCodeBuilder_append_69680000555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term343, term343.getClass(), "iConstant", 37);
        setIntField(term343, term343.getClass(), "iTotal", 17);
        term346 = new Character('P');
        term5351 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5351, term5351.getClass(), "iConstant", 37);
        setIntField(term5351, term5351.getClass(), "iTotal", 709);
        term5347 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5347, term5347.getClass(), "iConstant", 37);
        setIntField(term5347, term5347.getClass(), "iTotal", 709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term346;
        Object retValue = callMethod(klass, "append", argTypes, term343, args);
        assertTrue(recursiveEquals(term343, term5351));
        assertTrue(recursiveEquals(term346, 'P'));
        assertTrue(recursiveEquals(retValue, term5347));
    }

};


