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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeToAny_14227036101020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369430;
     Object term368984;

    public CharacterReader_consumeToAny_14227036101020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369430 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term369430, term369430.getClass(), "bufPos", -8);
        setIntField(term369430, term369430.getClass(), "bufSplitPoint", -7);
        setIntField(term369430, term369430.getClass(), "bufLength", 64);
        setField(term369430, term369430.getClass(), "charBuf", null);
        term368984 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term368984;
        try {
            callMethod(klass, "consumeToAny", argTypes, term369430, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


