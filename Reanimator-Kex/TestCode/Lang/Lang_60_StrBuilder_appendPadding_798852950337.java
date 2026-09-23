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

public class StrBuilder_appendPadding_798852950337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64855;
     Object term149327;
     Object term149320;

    public StrBuilder_appendPadding_798852950337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64855 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term64754 = (char[]) newCharArray(0);
        setIntField(term64855, term64855.getClass(), "size", 0);
        setField(term64855, term64855.getClass(), "buffer", term64754);
        term149327 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term149328 = (char[]) newCharArray(0);
        setField(term149327, term149327.getClass(), "buffer", term149328);
        setIntField(term149327, term149327.getClass(), "size", 0);
        setField(term149327, term149327.getClass(), "newLine", null);
        setField(term149327, term149327.getClass(), "nullText", null);
        term149320 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term149321 = (char[]) newCharArray(0);
        setField(term149320, term149320.getClass(), "buffer", term149321);
        setIntField(term149320, term149320.getClass(), "size", 0);
        setField(term149320, term149320.getClass(), "newLine", null);
        setField(term149320, term149320.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = (char) 0;
        Object retValue = callMethod(klass, "appendPadding", argTypes, term64855, args);
        assertTrue(recursiveEquals(term64855, term149327));
        assertTrue(recursiveEquals(retValue, term149320));
    }

};


