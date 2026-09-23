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
import java.lang.Object;

public class CharacterReader_matchesAny_42275714769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2901;
     Object term2933;

    public CharacterReader_matchesAny_42275714769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2901 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2902 = (char[]) newCharArray(0);
        Object[] term2908 = (Object[]) newArray("java.lang.String", 2);
        setField(term2901, term2901.getClass(), "charBuf", term2902);
        setField(term2901, term2901.getClass(), "reader", null);
        setIntField(term2901, term2901.getClass(), "bufLength", 538259104);
        setIntField(term2901, term2901.getClass(), "bufSplitPoint", 96566506);
        setIntField(term2901, term2901.getClass(), "bufPos", -343325701);
        setIntField(term2901, term2901.getClass(), "readerPos", 107945604);
        setIntField(term2901, term2901.getClass(), "bufMark", -1963464809);
        setElement(term2908, 0, "eVpkWxjuki");
        setElement(term2908, 1, "SJiQaLvSKv");
        setField(term2901, term2901.getClass(), "stringCache", term2908);
        term2933 = (char[]) newCharArray(7);
        setCharElement(term2933, 0, 'a');
        setCharElement(term2933, 1, 'H');
        setCharElement(term2933, 2, 'E');
        setCharElement(term2933, 3, 'w');
        setCharElement(term2933, 4, 'X');
        setCharElement(term2933, 5, 'R');
        setCharElement(term2933, 6, 'o');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2933;
        try {
            callMethod(klass, "matchesAny", argTypes, term2901, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


