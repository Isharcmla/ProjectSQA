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
import java.lang.Integer;

public class StrBuilder_rightString_2035745237252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9709;
     Object term9768;
     Object term79821;

    public StrBuilder_rightString_2035745237252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9709 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9710 = (char[]) newCharArray(32);
        setField(term9709, term9709.getClass(), "buffer", term9710);
        setIntField(term9709, term9709.getClass(), "size", 9726679);
        setField(term9709, term9709.getClass(), "newLine", "JppkknKVOw");
        setField(term9709, term9709.getClass(), "nullText", "iljANwuEjk");
        term9768 = new Integer(-25637976);
        term79821 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term79822 = (char[]) newCharArray(32);
        setField(term79821, term79821.getClass(), "buffer", term79822);
        setIntField(term79821, term79821.getClass(), "size", 9726679);
        setField(term79821, term79821.getClass(), "newLine", "JppkknKVOw");
        setField(term79821, term79821.getClass(), "nullText", "iljANwuEjk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9768;
        Object retValue = callMethod(klass, "rightString", argTypes, term9709, args);
        assertTrue(recursiveEquals(term9709, term79821));
        assertTrue(recursiveEquals(term9768, -25637976));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


