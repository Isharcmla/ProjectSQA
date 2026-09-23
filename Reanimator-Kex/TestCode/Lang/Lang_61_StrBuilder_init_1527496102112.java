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

public class StrBuilder_init_1527496102112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23371;

    public StrBuilder_init_1527496102112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23371 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term23372 = (char[]) newCharArray(42);
        setCharElement(term23372, 0, 'P');
        setCharElement(term23372, 1, 'A');
        setCharElement(term23372, 2, 'E');
        setCharElement(term23372, 3, 'B');
        setCharElement(term23372, 4, 't');
        setCharElement(term23372, 5, 'n');
        setCharElement(term23372, 6, 'Z');
        setCharElement(term23372, 7, 't');
        setCharElement(term23372, 8, 'T');
        setCharElement(term23372, 9, 'D');
        setField(term23371, term23371.getClass(), "buffer", term23372);
        setIntField(term23371, term23371.getClass(), "size", 10);
        setField(term23371, term23371.getClass(), "newLine", null);
        setField(term23371, term23371.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23371));
    }

};


