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
import java.lang.Integer;
import java.lang.Character;

public class StrBuilder_appendFixedWidthPadLeft_688195012184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4919;
     Object term4978;
     Object term4979;
     Object term4981;
     Object term53463;
     Object term53469;

    public StrBuilder_appendFixedWidthPadLeft_688195012184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4919 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term4920 = (char[]) newCharArray(32);
        setField(term4919, term4919.getClass(), "buffer", term4920);
        setIntField(term4919, term4919.getClass(), "size", 1324040357);
        setField(term4919, term4919.getClass(), "newLine", "JqXGgAhZPl");
        setField(term4919, term4919.getClass(), "nullText", "jiKYgYHqIS");
        term4978 = newInstance(Class.forName("java.lang.Object"));
        term4979 = new Integer(-1588772968);
        term4981 = new Character('b');
        term53463 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term53464 = (char[]) newCharArray(32);
        setField(term53463, term53463.getClass(), "buffer", term53464);
        setIntField(term53463, term53463.getClass(), "size", 1324040357);
        setField(term53463, term53463.getClass(), "newLine", "JqXGgAhZPl");
        setField(term53463, term53463.getClass(), "nullText", "jiKYgYHqIS");
        term53469 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term4978;
        args[1] = term4979;
        args[2] = term4981;
        callMethod(klass, "appendFixedWidthPadLeft", argTypes, term4919, args);
        assertTrue(recursiveEquals(term4919, term53463));
        assertTrue(recursiveEquals(term4978, term53469));
        assertTrue(recursiveEquals(term4979, -1588772968));
        assertTrue(recursiveEquals(term4981, 'b'));
    }

};


