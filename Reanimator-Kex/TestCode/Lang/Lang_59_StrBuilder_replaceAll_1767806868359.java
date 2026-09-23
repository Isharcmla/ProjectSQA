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

public class StrBuilder_replaceAll_1767806868359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166677;
     Object term197139;
     Object term197103;

    public StrBuilder_replaceAll_1767806868359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166677 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term165503 = (char[]) newCharArray(31);
        setIntField(term166677, term166677.getClass(), "size", 27);
        setField(term166677, term166677.getClass(), "buffer", term165503);
        term197139 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term197140 = (char[]) newCharArray(31);
        setField(term197139, term197139.getClass(), "buffer", term197140);
        setIntField(term197139, term197139.getClass(), "size", 27);
        setField(term197139, term197139.getClass(), "newLine", null);
        setField(term197139, term197139.getClass(), "nullText", null);
        term197103 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term197104 = (char[]) newCharArray(31);
        setField(term197103, term197103.getClass(), "buffer", term197104);
        setIntField(term197103, term197103.getClass(), "size", 27);
        setField(term197103, term197103.getClass(), "newLine", null);
        setField(term197103, term197103.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "replaceAll", argTypes, term166677, args);
        assertTrue(recursiveEquals(term166677, term197139));
        assertTrue(recursiveEquals(retValue, term197103));
    }

};


