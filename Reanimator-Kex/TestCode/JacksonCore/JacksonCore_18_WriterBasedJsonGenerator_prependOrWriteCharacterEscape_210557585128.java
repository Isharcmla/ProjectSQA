package com.fasterxml.jackson.core.json;

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
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Character;

public class WriterBasedJsonGenerator_prependOrWriteCharacterEscape_210557585128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539;
     Object term545;
     Object term547;
     Object term549;
     Object term551;

    public WriterBasedJsonGenerator_prependOrWriteCharacterEscape_210557585128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term539 = (char[]) newCharArray(5);
        setCharElement(term539, 0, 'Q');
        setCharElement(term539, 1, 'H');
        setCharElement(term539, 2, 'g');
        setCharElement(term539, 3, 'q');
        setCharElement(term539, 4, 'z');
        term545 = new Integer(-1145578966);
        term547 = new Integer(679763016);
        term549 = new Character('x');
        term551 = new Integer(1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = char.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term539;
        args[1] = term545;
        args[2] = term547;
        args[3] = term549;
        args[4] = term551;
        try {
            callMethod(klass, "_prependOrWriteCharacterEscape", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


