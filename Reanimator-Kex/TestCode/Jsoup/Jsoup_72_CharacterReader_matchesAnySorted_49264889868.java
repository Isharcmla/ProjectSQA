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

public class CharacterReader_matchesAnySorted_49264889868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3042;
     Object term3136;

    public CharacterReader_matchesAnySorted_49264889868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3042 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3043 = (char[]) newCharArray(2);
        Object[] term3051 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term3043, 0, 'z');
        setCharElement(term3043, 1, 'R');
        setField(term3042, term3042.getClass(), "charBuf", term3043);
        setField(term3042, term3042.getClass(), "reader", null);
        setIntField(term3042, term3042.getClass(), "bufLength", 538259104);
        setIntField(term3042, term3042.getClass(), "bufSplitPoint", 96566506);
        setIntField(term3042, term3042.getClass(), "bufPos", -343325701);
        setIntField(term3042, term3042.getClass(), "readerPos", 107945604);
        setIntField(term3042, term3042.getClass(), "bufMark", -1963464809);
        setElement(term3051, 0, "XylxrMBraH");
        setElement(term3051, 1, "pORebkoRdD");
        setElement(term3051, 2, "mXGCWJDOqA");
        setElement(term3051, 3, "dpNsDgfPso");
        setElement(term3051, 4, "hCWPJQKpdc");
        setElement(term3051, 5, "WzMEhMXkKx");
        setElement(term3051, 6, "XOiDvlDhdc");
        setField(term3042, term3042.getClass(), "stringCache", term3051);
        term3136 = (char[]) newCharArray(2);
        setCharElement(term3136, 0, 'f');
        setCharElement(term3136, 1, 'L');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3136;
        try {
            callMethod(klass, "matchesAnySorted", argTypes, term3042, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


