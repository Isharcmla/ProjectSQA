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

public class CharacterReader_consumeToAny_1422703610885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300297;
     Object term298634;

    public CharacterReader_consumeToAny_1422703610885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300297 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term298638 = (char[]) newCharArray(713);
        setIntField(term300297, term300297.getClass(), "bufPos", 704);
        setIntField(term300297, term300297.getClass(), "bufSplitPoint", 705);
        setIntField(term300297, term300297.getClass(), "bufLength", 715);
        setField(term300297, term300297.getClass(), "charBuf", term298638);
        setField(term300297, term300297.getClass(), "stringCache", null);
        term298634 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term298634;
        try {
            callMethod(klass, "consumeToAny", argTypes, term300297, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


