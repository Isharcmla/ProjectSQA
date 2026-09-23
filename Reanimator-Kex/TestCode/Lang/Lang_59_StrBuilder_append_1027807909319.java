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

public class StrBuilder_append_1027807909319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58514;
     Object term99329;
     Object term99327;

    public StrBuilder_append_1027807909319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58514 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term99329 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term99329, term99329.getClass(), "buffer", null);
        setIntField(term99329, term99329.getClass(), "size", 0);
        setField(term99329, term99329.getClass(), "newLine", null);
        setField(term99329, term99329.getClass(), "nullText", null);
        term99327 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term99327, term99327.getClass(), "buffer", null);
        setIntField(term99327, term99327.getClass(), "size", 0);
        setField(term99327, term99327.getClass(), "newLine", null);
        setField(term99327, term99327.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "append", argTypes, term58514, args);
        assertTrue(recursiveEquals(term58514, term99329));
        assertTrue(recursiveEquals(retValue, term99327));
    }

};


