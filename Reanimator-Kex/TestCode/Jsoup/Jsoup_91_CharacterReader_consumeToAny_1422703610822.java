package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeToAny_1422703610822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245470;
     Object term243997;

    public CharacterReader_consumeToAny_1422703610822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245470 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term244001 = (char[]) newCharArray(653);
        setIntField(term245470, term245470.getClass(), "bufPos", 536870901);
        setIntField(term245470, term245470.getClass(), "bufSplitPoint", 536870902);
        setIntField(term245470, term245470.getClass(), "bufLength", 536870913);
        setCharElement(term244001, 0, (char) 256);
        setCharElement(term244001, 1, (char) 256);
        setCharElement(term244001, 2, (char) 256);
        setCharElement(term244001, 3, (char) 256);
        setCharElement(term244001, 4, (char) 256);
        setCharElement(term244001, 5, (char) 256);
        setCharElement(term244001, 6, (char) 256);
        setCharElement(term244001, 7, (char) 256);
        setCharElement(term244001, 8, (char) 256);
        setCharElement(term244001, 9, (char) 256);
        setCharElement(term244001, 10, (char) 256);
        setCharElement(term244001, 11, (char) 256);
        setCharElement(term244001, 12, (char) 256);
        setCharElement(term244001, 13, (char) 256);
        setCharElement(term244001, 14, (char) 256);
        setCharElement(term244001, 15, (char) 256);
        setCharElement(term244001, 16, (char) 256);
        setField(term245470, term245470.getClass(), "charBuf", term244001);
        setField(term245470, term245470.getClass(), "stringCache", null);
        term243997 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term243997;
        try {
            callMethod(klass, "consumeToAny", argTypes, term245470, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


