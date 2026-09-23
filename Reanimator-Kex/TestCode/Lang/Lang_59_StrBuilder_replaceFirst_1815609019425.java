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

public class StrBuilder_replaceFirst_1815609019425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1710751;
     Object term1717755;
     Object term1717719;

    public StrBuilder_replaceFirst_1815609019425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1710751 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1709940 = (char[]) newCharArray(31);
        setIntField(term1710751, term1710751.getClass(), "size", 31);
        setCharElement(term1709940, 17, (char) 65535);
        setField(term1710751, term1710751.getClass(), "buffer", term1709940);
        term1717755 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1717756 = (char[]) newCharArray(31);
        setField(term1717755, term1717755.getClass(), "buffer", term1717756);
        setIntField(term1717755, term1717755.getClass(), "size", 31);
        setField(term1717755, term1717755.getClass(), "newLine", null);
        setField(term1717755, term1717755.getClass(), "nullText", null);
        term1717719 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1717720 = (char[]) newCharArray(31);
        setField(term1717719, term1717719.getClass(), "buffer", term1717720);
        setIntField(term1717719, term1717719.getClass(), "size", 31);
        setField(term1717719, term1717719.getClass(), "newLine", null);
        setField(term1717719, term1717719.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term1710751, args);
        assertTrue(recursiveEquals(term1710751, term1717755));
        assertTrue(recursiveEquals(retValue, term1717719));
    }

};


