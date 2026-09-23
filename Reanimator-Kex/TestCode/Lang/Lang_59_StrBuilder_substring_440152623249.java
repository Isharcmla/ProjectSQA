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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_substring_440152623249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9368;
     Object term9427;

    public StrBuilder_substring_440152623249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9368 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9369 = (char[]) newCharArray(32);
        setField(term9368, term9368.getClass(), "buffer", term9369);
        setIntField(term9368, term9368.getClass(), "size", 1202361360);
        setField(term9368, term9368.getClass(), "newLine", "DyiXbeYIaN");
        setField(term9368, term9368.getClass(), "nullText", "VGizxZnyHX");
        term9427 = new Integer(-2015048153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9427;
        try {
            callMethod(klass, "substring", argTypes, term9368, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


