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

public class StrBuilder_append_817161130383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63349;
     Object term115123;
     Object term115103;

    public StrBuilder_append_817161130383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63349 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term63237 = (char[]) newCharArray(0);
        setIntField(term63349, term63349.getClass(), "size", 0);
        setField(term63349, term63349.getClass(), "buffer", term63237);
        term115123 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term115124 = (char[]) newCharArray(3);
        setCharElement(term115124, 0, (char) 48);
        setCharElement(term115124, 1, (char) 46);
        setCharElement(term115124, 2, (char) 48);
        setField(term115123, term115123.getClass(), "buffer", term115124);
        setIntField(term115123, term115123.getClass(), "size", 3);
        setField(term115123, term115123.getClass(), "newLine", null);
        setField(term115123, term115123.getClass(), "nullText", null);
        term115103 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term115104 = (char[]) newCharArray(3);
        setCharElement(term115104, 0, (char) 48);
        setCharElement(term115104, 1, (char) 46);
        setCharElement(term115104, 2, (char) 48);
        setField(term115103, term115103.getClass(), "buffer", term115104);
        setIntField(term115103, term115103.getClass(), "size", 3);
        setField(term115103, term115103.getClass(), "newLine", null);
        setField(term115103, term115103.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "append", argTypes, term63349, args);
        assertTrue(recursiveEquals(term63349, term115123));
        assertTrue(recursiveEquals(retValue, term115103));
    }

};


