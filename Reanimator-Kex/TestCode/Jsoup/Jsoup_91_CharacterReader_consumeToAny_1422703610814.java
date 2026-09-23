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

public class CharacterReader_consumeToAny_1422703610814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240047;
     Object term238943;

    public CharacterReader_consumeToAny_1422703610814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240047 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term238947 = (char[]) newCharArray(494);
        setIntField(term240047, term240047.getClass(), "bufPos", 2079786311);
        setIntField(term240047, term240047.getClass(), "bufSplitPoint", 2079786312);
        setIntField(term240047, term240047.getClass(), "bufLength", 2079786313);
        setCharElement(term238947, 0, (char) 2048);
        setCharElement(term238947, 1, (char) 2048);
        setCharElement(term238947, 2, (char) 2048);
        setField(term240047, term240047.getClass(), "charBuf", term238947);
        setField(term240047, term240047.getClass(), "stringCache", null);
        term238943 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term238943;
        try {
            callMethod(klass, "consumeToAny", argTypes, term240047, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


