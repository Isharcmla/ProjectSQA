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
import java.lang.OutOfMemoryError;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StrBuilder_appendln_25151498205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4534;
     Object term4593;

    public StrBuilder_appendln_25151498205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4534 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term4535 = (char[]) newCharArray(32);
        setField(term4534, term4534.getClass(), "buffer", term4535);
        setIntField(term4534, term4534.getClass(), "size", 1596070772);
        setField(term4534, term4534.getClass(), "newLine", "bWWfajKbEX");
        setField(term4534, term4534.getClass(), "nullText", "cAPeiZHKGJ");
        term4593 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4593;
        try {
            callMethod(klass, "appendln", argTypes, term4534, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


