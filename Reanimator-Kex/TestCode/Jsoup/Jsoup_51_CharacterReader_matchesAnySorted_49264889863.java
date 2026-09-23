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

public class CharacterReader_matchesAnySorted_49264889863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2988;
     Object term3080;

    public CharacterReader_matchesAnySorted_49264889863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2988 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2989 = (char[]) newCharArray(2);
        Object[] term2995 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term2989, 0, 'z');
        setCharElement(term2989, 1, 'R');
        setField(term2988, term2988.getClass(), "input", term2989);
        setIntField(term2988, term2988.getClass(), "length", 1375330971);
        setIntField(term2988, term2988.getClass(), "pos", -478195677);
        setIntField(term2988, term2988.getClass(), "mark", 972867650);
        setElement(term2995, 0, "XylxrMBraH");
        setElement(term2995, 1, "pORebkoRdD");
        setElement(term2995, 2, "mXGCWJDOqA");
        setElement(term2995, 3, "dpNsDgfPso");
        setElement(term2995, 4, "hCWPJQKpdc");
        setElement(term2995, 5, "WzMEhMXkKx");
        setElement(term2995, 6, "XOiDvlDhdc");
        setField(term2988, term2988.getClass(), "stringCache", term2995);
        term3080 = (char[]) newCharArray(2);
        setCharElement(term3080, 0, 'f');
        setCharElement(term3080, 1, 'L');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3080;
        try {
            callMethod(klass, "matchesAnySorted", argTypes, term2988, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


