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

public class StrBuilder_appendSeparator_1172291449248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7128;

    public StrBuilder_appendSeparator_1172291449248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7128 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7129 = (char[]) newCharArray(32);
        setField(term7128, term7128.getClass(), "buffer", term7129);
        setIntField(term7128, term7128.getClass(), "size", 941650513);
        setField(term7128, term7128.getClass(), "newLine", "fWKJoSoCwE");
        setField(term7128, term7128.getClass(), "nullText", "wfaXBpWAUH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VMeAzAHwZj";
        try {
            callMethod(klass, "appendSeparator", argTypes, term7128, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


