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

public class CharacterReader_consumeToAny_1422703610833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255549;
     Object term255396;

    public CharacterReader_consumeToAny_1422703610833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255549 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term255400 = (char[]) newCharArray(2);
        setIntField(term255549, term255549.getClass(), "bufPos", 1);
        setIntField(term255549, term255549.getClass(), "bufSplitPoint", 2);
        setIntField(term255549, term255549.getClass(), "bufLength", 11);
        setCharElement(term255400, 0, (char) 1024);
        setCharElement(term255400, 1, (char) 1024);
        setField(term255549, term255549.getClass(), "charBuf", term255400);
        setField(term255549, term255549.getClass(), "stringCache", null);
        term255396 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term255396;
        try {
            callMethod(klass, "consumeToAny", argTypes, term255549, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


