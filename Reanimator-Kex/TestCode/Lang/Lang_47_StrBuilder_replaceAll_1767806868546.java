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

public class StrBuilder_replaceAll_1767806868546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2725704;
     Object term2740817;
     Object term2740781;

    public StrBuilder_replaceAll_1767806868546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2725704 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term2724730 = (char[]) newCharArray(31);
        setIntField(term2725704, term2725704.getClass(), "size", 22);
        setField(term2725704, term2725704.getClass(), "buffer", term2724730);
        term2740817 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term2740818 = (char[]) newCharArray(31);
        setField(term2740817, term2740817.getClass(), "buffer", term2740818);
        setIntField(term2740817, term2740817.getClass(), "size", 22);
        setField(term2740817, term2740817.getClass(), "newLine", null);
        setField(term2740817, term2740817.getClass(), "nullText", null);
        term2740781 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term2740782 = (char[]) newCharArray(31);
        setField(term2740781, term2740781.getClass(), "buffer", term2740782);
        setIntField(term2740781, term2740781.getClass(), "size", 22);
        setField(term2740781, term2740781.getClass(), "newLine", null);
        setField(term2740781, term2740781.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "replaceAll", argTypes, term2725704, args);
        assertTrue(recursiveEquals(term2725704, term2740817));
        assertTrue(recursiveEquals(retValue, term2740781));
    }

};


