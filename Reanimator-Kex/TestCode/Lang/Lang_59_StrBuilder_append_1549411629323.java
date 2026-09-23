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

public class StrBuilder_append_1549411629323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59925;
     Object term60009;

    public StrBuilder_append_1549411629323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59925 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term58906 = (char[]) newCharArray(912);
        setIntField(term59925, term59925.getClass(), "size", -1023411076);
        setField(term59925, term59925.getClass(), "buffer", term58906);
        term60009 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term60009, term60009.getClass(), "size", 1006634004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = term60009;
        try {
            callMethod(klass, "append", argTypes, term59925, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


