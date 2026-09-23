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
     Object term33372;

    public StrBuilder_init_1527496102112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33372 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term33373 = (char[]) newCharArray(42);
        setCharElement(term33373, 0, 'P');
        setCharElement(term33373, 1, 'A');
        setCharElement(term33373, 2, 'E');
        setCharElement(term33373, 3, 'B');
        setCharElement(term33373, 4, 't');
        setCharElement(term33373, 5, 'n');
        setCharElement(term33373, 6, 'Z');
        setCharElement(term33373, 7, 't');
        setCharElement(term33373, 8, 'T');
        setCharElement(term33373, 9, 'D');
        setField(term33372, term33372.getClass(), "buffer", term33373);
        setIntField(term33372, term33372.getClass(), "size", 10);
        setField(term33372, term33372.getClass(), "newLine", null);
        setField(term33372, term33372.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33372));
    }

};


