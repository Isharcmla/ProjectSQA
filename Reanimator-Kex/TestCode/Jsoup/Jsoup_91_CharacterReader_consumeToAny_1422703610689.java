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

public class CharacterReader_consumeToAny_1422703610689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181269;
     Object term180336;

    public CharacterReader_consumeToAny_1422703610689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181269 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term180340 = (char[]) newCharArray(398);
        setIntField(term181269, term181269.getClass(), "bufPos", 396);
        setIntField(term181269, term181269.getClass(), "bufSplitPoint", 397);
        setIntField(term181269, term181269.getClass(), "bufLength", 399);
        setField(term181269, term181269.getClass(), "charBuf", term180340);
        setField(term181269, term181269.getClass(), "stringCache", null);
        term180336 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term180336;
        try {
            callMethod(klass, "consumeToAny", argTypes, term181269, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


