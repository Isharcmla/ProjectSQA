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

public class StrBuilder_append_1027806917402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74619;
     Object term119448;
     Object term118348;

    public StrBuilder_append_1027806917402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74619 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term73418 = (char[]) newCharArray(544);
        setIntField(term74619, term74619.getClass(), "size", 480);
        setField(term74619, term74619.getClass(), "buffer", term73418);
        term119448 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term119449 = (char[]) newCharArray(544);
        setCharElement(term119449, 480, (char) 48);
        setField(term119448, term119448.getClass(), "buffer", term119449);
        setIntField(term119448, term119448.getClass(), "size", 481);
        setField(term119448, term119448.getClass(), "newLine", null);
        setField(term119448, term119448.getClass(), "nullText", null);
        term118348 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term118349 = (char[]) newCharArray(544);
        setCharElement(term118349, 480, (char) 48);
        setField(term118348, term118348.getClass(), "buffer", term118349);
        setIntField(term118348, term118348.getClass(), "size", 481);
        setField(term118348, term118348.getClass(), "newLine", null);
        setField(term118348, term118348.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term74619, args);
        assertTrue(recursiveEquals(term74619, term119448));
        assertTrue(recursiveEquals(retValue, term118348));
    }

};


