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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.Integer;

public class StrBuilder_appendSeparator_1020007574256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7509;
     Object term7568;
     Object term7570;

    public StrBuilder_appendSeparator_1020007574256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7509 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7510 = (char[]) newCharArray(32);
        setField(term7509, term7509.getClass(), "buffer", term7510);
        setIntField(term7509, term7509.getClass(), "size", -894662986);
        setField(term7509, term7509.getClass(), "newLine", "pXOkjyeIRb");
        setField(term7509, term7509.getClass(), "nullText", "GgZWSjxjyE");
        term7568 = new Character('g');
        term7570 = new Integer(304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term7568;
        args[1] = term7570;
        try {
            callMethod(klass, "appendSeparator", argTypes, term7509, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


