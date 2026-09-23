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

public class StrBuilder_replaceAll_1767806868358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157283;
     Object term196952;
     Object term196916;

    public StrBuilder_replaceAll_1767806868358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157283 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term156032 = (char[]) newCharArray(31);
        setIntField(term157283, term157283.getClass(), "size", 31);
        setCharElement(term156032, 28, (char) 65535);
        setField(term157283, term157283.getClass(), "buffer", term156032);
        term196952 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term196953 = (char[]) newCharArray(31);
        setField(term196952, term196952.getClass(), "buffer", term196953);
        setIntField(term196952, term196952.getClass(), "size", 31);
        setField(term196952, term196952.getClass(), "newLine", null);
        setField(term196952, term196952.getClass(), "nullText", null);
        term196916 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term196917 = (char[]) newCharArray(31);
        setField(term196916, term196916.getClass(), "buffer", term196917);
        setIntField(term196916, term196916.getClass(), "size", 31);
        setField(term196916, term196916.getClass(), "newLine", null);
        setField(term196916, term196916.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "replaceAll", argTypes, term157283, args);
        assertTrue(recursiveEquals(term157283, term196952));
        assertTrue(recursiveEquals(retValue, term196916));
    }

};


