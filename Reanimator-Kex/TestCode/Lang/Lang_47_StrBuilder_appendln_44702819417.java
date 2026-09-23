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

public class StrBuilder_appendln_44702819417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81374;
     Object term127952;
     Object term127914;

    public StrBuilder_appendln_44702819417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81374 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term81262 = (char[]) newCharArray(0);
        setIntField(term81374, term81374.getClass(), "size", 0);
        setField(term81374, term81374.getClass(), "buffer", term81262);
        term127952 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term127953 = (char[]) newCharArray(2);
        setCharElement(term127953, 0, (char) 48);
        setCharElement(term127953, 1, (char) 10);
        setField(term127952, term127952.getClass(), "buffer", term127953);
        setIntField(term127952, term127952.getClass(), "size", 2);
        setField(term127952, term127952.getClass(), "newLine", null);
        setField(term127952, term127952.getClass(), "nullText", null);
        term127914 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term127915 = (char[]) newCharArray(2);
        setCharElement(term127915, 0, (char) 48);
        setCharElement(term127915, 1, (char) 10);
        setField(term127914, term127914.getClass(), "buffer", term127915);
        setIntField(term127914, term127914.getClass(), "size", 2);
        setField(term127914, term127914.getClass(), "newLine", null);
        setField(term127914, term127914.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        Object retValue = callMethod(klass, "appendln", argTypes, term81374, args);
        assertTrue(recursiveEquals(term81374, term127952));
        assertTrue(recursiveEquals(retValue, term127914));
    }

};


