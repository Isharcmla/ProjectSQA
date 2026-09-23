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
import java.lang.NullPointerException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StrBuilder_appendFixedWidthPadRight_1049631965333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62542;

    public StrBuilder_appendFixedWidthPadRight_1049631965333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62542 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term62442 = (char[]) newCharArray(0);
        setIntField(term62542, term62542.getClass(), "size", -1);
        setField(term62542, term62542.getClass(), "buffer", term62442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 1;
        args[2] = (char) 0;
        try {
            callMethod(klass, "appendFixedWidthPadRight", argTypes, term62542, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


