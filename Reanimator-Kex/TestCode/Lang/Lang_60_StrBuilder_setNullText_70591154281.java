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

public class StrBuilder_setNullText_70591154281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38400;
     Object term87919;
     Object term87883;

    public StrBuilder_setNullText_70591154281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38400 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term87919 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term87919, term87919.getClass(), "buffer", null);
        setIntField(term87919, term87919.getClass(), "size", 0);
        setField(term87919, term87919.getClass(), "newLine", null);
        setField(term87919, term87919.getClass(), "nullText", null);
        term87883 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term87883, term87883.getClass(), "buffer", null);
        setIntField(term87883, term87883.getClass(), "size", 0);
        setField(term87883, term87883.getClass(), "newLine", null);
        setField(term87883, term87883.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "setNullText", argTypes, term38400, args);
        assertTrue(recursiveEquals(term38400, term87919));
        assertTrue(recursiveEquals(retValue, term87883));
    }

};


