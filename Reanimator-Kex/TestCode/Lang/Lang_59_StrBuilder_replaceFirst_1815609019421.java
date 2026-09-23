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

public class StrBuilder_replaceFirst_1815609019421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1683657;
     Object term1709535;
     Object term1709499;

    public StrBuilder_replaceFirst_1815609019421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1683657 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1682766 = (char[]) newCharArray(31);
        setIntField(term1683657, term1683657.getClass(), "size", 31);
        setCharElement(term1682766, 19, (char) 65535);
        setField(term1683657, term1683657.getClass(), "buffer", term1682766);
        term1709535 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1709536 = (char[]) newCharArray(31);
        setField(term1709535, term1709535.getClass(), "buffer", term1709536);
        setIntField(term1709535, term1709535.getClass(), "size", 31);
        setField(term1709535, term1709535.getClass(), "newLine", null);
        setField(term1709535, term1709535.getClass(), "nullText", null);
        term1709499 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1709500 = (char[]) newCharArray(31);
        setField(term1709499, term1709499.getClass(), "buffer", term1709500);
        setIntField(term1709499, term1709499.getClass(), "size", 31);
        setField(term1709499, term1709499.getClass(), "newLine", null);
        setField(term1709499, term1709499.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term1683657, args);
        assertTrue(recursiveEquals(term1683657, term1709535));
        assertTrue(recursiveEquals(retValue, term1709499));
    }

};


