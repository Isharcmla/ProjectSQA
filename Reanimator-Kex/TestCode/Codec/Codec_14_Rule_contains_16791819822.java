package org.apache.commons.codec.language.bm;

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
import java.lang.ExceptionInInitializerError;
import static org.apache.commons.codec.language.bm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;

public class Rule_contains_16791819822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Rule_contains_16791819822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Character('P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        try {
            callMethod(klass, "contains", argTypes, null, args);
            assertTrue(false);
        }
        catch (ExceptionInInitializerError e) {
        }

    }

};


