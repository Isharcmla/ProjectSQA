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

public class CharacterReader_matchesIgnoreCase_705501828811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234390;

    public CharacterReader_matchesIgnoreCase_705501828811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234390 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term234273 = (char[]) newCharArray(8);
        setIntField(term234390, term234390.getClass(), "bufPos", 912);
        setIntField(term234390, term234390.getClass(), "bufSplitPoint", 913);
        setIntField(term234390, term234390.getClass(), "bufLength", 913);
        setCharElement(term234273, 0, (char) 32);
        setCharElement(term234273, 1, (char) 32);
        setCharElement(term234273, 2, (char) 32);
        setCharElement(term234273, 3, (char) 32);
        setCharElement(term234273, 4, (char) 32);
        setCharElement(term234273, 5, (char) 32);
        setCharElement(term234273, 6, (char) 32);
        setCharElement(term234273, 7, (char) 32);
        setField(term234390, term234390.getClass(), "charBuf", term234273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        try {
            callMethod(klass, "matchesIgnoreCase", argTypes, term234390, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


