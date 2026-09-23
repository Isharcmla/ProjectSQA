package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;
import java.lang.Object;

public class StrBuilder_init_1527496102284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88018;

    public StrBuilder_init_1527496102284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42485 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term42485, term42485.getClass(), "buffer", null);
        term88018 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term88019 = (char[]) newCharArray(32);
        setField(term88018, term88018.getClass(), "buffer", term88019);
        setIntField(term88018, term88018.getClass(), "size", 0);
        setField(term88018, term88018.getClass(), "newLine", null);
        setField(term88018, term88018.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term88018));
    }

};


