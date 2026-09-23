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

public class CharacterReader_consumeToAny_1422703610541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151157;
     Object term150388;

    public CharacterReader_consumeToAny_1422703610541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151157 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term150392 = (char[]) newCharArray(299);
        setIntField(term151157, term151157.getClass(), "bufPos", -970092287);
        setIntField(term151157, term151157.getClass(), "bufSplitPoint", -970092286);
        setIntField(term151157, term151157.getClass(), "bufLength", -970092282);
        setField(term151157, term151157.getClass(), "charBuf", term150392);
        setField(term151157, term151157.getClass(), "stringCache", null);
        term150388 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term150388;
        try {
            callMethod(klass, "consumeToAny", argTypes, term151157, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


