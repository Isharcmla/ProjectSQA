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

public class StrBuilder_init_1527496102134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36192;

    public StrBuilder_init_1527496102134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36192 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term36193 = (char[]) newCharArray(42);
        setCharElement(term36193, 0, 'P');
        setCharElement(term36193, 1, 'A');
        setCharElement(term36193, 2, 'E');
        setCharElement(term36193, 3, 'B');
        setCharElement(term36193, 4, 't');
        setCharElement(term36193, 5, 'n');
        setCharElement(term36193, 6, 'Z');
        setCharElement(term36193, 7, 't');
        setCharElement(term36193, 8, 'T');
        setCharElement(term36193, 9, 'D');
        setField(term36192, term36192.getClass(), "buffer", term36193);
        setIntField(term36192, term36192.getClass(), "size", 10);
        setField(term36192, term36192.getClass(), "newLine", null);
        setField(term36192, term36192.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36192));
    }

};


