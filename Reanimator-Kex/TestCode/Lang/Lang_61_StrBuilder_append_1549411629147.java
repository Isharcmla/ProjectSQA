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

public class StrBuilder_append_1549411629147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3166;
     Object term3225;

    public StrBuilder_append_1549411629147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3166 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term3167 = (char[]) newCharArray(32);
        setField(term3166, term3166.getClass(), "buffer", term3167);
        setIntField(term3166, term3166.getClass(), "size", -157887805);
        setField(term3166, term3166.getClass(), "newLine", "nHXjMycHlU");
        setField(term3166, term3166.getClass(), "nullText", "ieCtQFdkii");
        term3225 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term3226 = (char[]) newCharArray(32);
        setField(term3225, term3225.getClass(), "buffer", term3226);
        setIntField(term3225, term3225.getClass(), "size", 1876565163);
        setField(term3225, term3225.getClass(), "newLine", "dEnhdmILtU");
        setField(term3225, term3225.getClass(), "nullText", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = term3225;
        try {
            callMethod(klass, "append", argTypes, term3166, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


