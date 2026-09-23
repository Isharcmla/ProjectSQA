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
import java.lang.Double;

public class StrBuilder_append_817161130174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4421;
     Object term4480;

    public StrBuilder_append_817161130174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4421 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term4422 = (char[]) newCharArray(32);
        setField(term4421, term4421.getClass(), "buffer", term4422);
        setIntField(term4421, term4421.getClass(), "size", 1328271830);
        setField(term4421, term4421.getClass(), "newLine", "VgZnGoIFwQ");
        setField(term4421, term4421.getClass(), "nullText", "jUbSRrkrYZ");
        term4480 = new Double(0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term4480;
        try {
            callMethod(klass, "append", argTypes, term4421, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


