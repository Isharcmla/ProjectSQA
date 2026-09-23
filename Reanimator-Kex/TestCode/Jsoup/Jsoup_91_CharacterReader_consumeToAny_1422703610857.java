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

public class CharacterReader_consumeToAny_1422703610857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274149;
     Object term273807;

    public CharacterReader_consumeToAny_1422703610857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274149 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term273811 = (char[]) newCharArray(70);
        setIntField(term274149, term274149.getClass(), "bufPos", 65);
        setIntField(term274149, term274149.getClass(), "bufSplitPoint", 66);
        setIntField(term274149, term274149.getClass(), "bufLength", 76);
        setField(term274149, term274149.getClass(), "charBuf", term273811);
        setField(term274149, term274149.getClass(), "stringCache", null);
        term273807 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term273807;
        try {
            callMethod(klass, "consumeToAny", argTypes, term274149, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


