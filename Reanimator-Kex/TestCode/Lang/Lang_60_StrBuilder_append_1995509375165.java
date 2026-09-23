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
import java.lang.Float;

public class StrBuilder_append_1995509375165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4308;
     Object term4367;

    public StrBuilder_append_1995509375165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4308 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term4309 = (char[]) newCharArray(32);
        setField(term4308, term4308.getClass(), "buffer", term4309);
        setIntField(term4308, term4308.getClass(), "size", 493620644);
        setField(term4308, term4308.getClass(), "newLine", "wGmYcqUkgE");
        setField(term4308, term4308.getClass(), "nullText", "idgaQsnJpQ");
        term4367 = new Float(0.13238746F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term4367;
        try {
            callMethod(klass, "append", argTypes, term4308, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


