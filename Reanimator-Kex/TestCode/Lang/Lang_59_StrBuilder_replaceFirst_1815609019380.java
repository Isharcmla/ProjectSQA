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

public class StrBuilder_replaceFirst_1815609019380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265934;
     Object term280631;
     Object term280622;

    public StrBuilder_replaceFirst_1815609019380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265934 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term265788 = (char[]) newCharArray(4);
        setIntField(term265934, term265934.getClass(), "size", 4);
        setField(term265934, term265934.getClass(), "buffer", term265788);
        term280631 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term280632 = (char[]) newCharArray(4);
        setField(term280631, term280631.getClass(), "buffer", term280632);
        setIntField(term280631, term280631.getClass(), "size", 4);
        setField(term280631, term280631.getClass(), "newLine", null);
        setField(term280631, term280631.getClass(), "nullText", null);
        term280622 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term280623 = (char[]) newCharArray(4);
        setField(term280622, term280622.getClass(), "buffer", term280623);
        setIntField(term280622, term280622.getClass(), "size", 4);
        setField(term280622, term280622.getClass(), "newLine", null);
        setField(term280622, term280622.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = (char) 65535;
        args[1] = (char) 0;
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term265934, args);
        assertTrue(recursiveEquals(term265934, term280631));
        assertTrue(recursiveEquals(retValue, term280622));
    }

};


