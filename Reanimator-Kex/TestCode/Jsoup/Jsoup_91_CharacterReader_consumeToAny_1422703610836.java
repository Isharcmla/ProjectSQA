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

public class CharacterReader_consumeToAny_1422703610836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256522;
     Object term256371;

    public CharacterReader_consumeToAny_1422703610836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256522 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term256522, term256522.getClass(), "bufPos", 0);
        setIntField(term256522, term256522.getClass(), "bufSplitPoint", 1);
        setIntField(term256522, term256522.getClass(), "bufLength", 11);
        setField(term256522, term256522.getClass(), "charBuf", null);
        setField(term256522, term256522.getClass(), "stringCache", null);
        term256371 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term256371;
        try {
            callMethod(klass, "consumeToAny", argTypes, term256522, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


