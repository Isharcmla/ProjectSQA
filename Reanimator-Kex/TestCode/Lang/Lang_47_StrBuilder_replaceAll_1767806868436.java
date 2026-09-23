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

public class StrBuilder_replaceAll_1767806868436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140665;
     Object term141066;
     Object term141030;

    public StrBuilder_replaceAll_1767806868436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140665 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term139531 = (char[]) newCharArray(31);
        setIntField(term140665, term140665.getClass(), "size", 26);
        setField(term140665, term140665.getClass(), "buffer", term139531);
        term141066 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term141067 = (char[]) newCharArray(31);
        setField(term141066, term141066.getClass(), "buffer", term141067);
        setIntField(term141066, term141066.getClass(), "size", 26);
        setField(term141066, term141066.getClass(), "newLine", null);
        setField(term141066, term141066.getClass(), "nullText", null);
        term141030 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term141031 = (char[]) newCharArray(31);
        setField(term141030, term141030.getClass(), "buffer", term141031);
        setIntField(term141030, term141030.getClass(), "size", 26);
        setField(term141030, term141030.getClass(), "newLine", null);
        setField(term141030, term141030.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "replaceAll", argTypes, term140665, args);
        assertTrue(recursiveEquals(term140665, term141066));
        assertTrue(recursiveEquals(retValue, term141030));
    }

};


