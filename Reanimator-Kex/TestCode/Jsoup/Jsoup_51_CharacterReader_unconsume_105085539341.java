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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class CharacterReader_unconsume_105085539341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509;
     Object term5267;

    public CharacterReader_unconsume_105085539341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term509 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term510 = (char[]) newCharArray(7);
        Object[] term521 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term510, 0, 'j');
        setCharElement(term510, 1, 'l');
        setCharElement(term510, 2, 'J');
        setCharElement(term510, 3, 'A');
        setCharElement(term510, 4, 'E');
        setCharElement(term510, 5, 't');
        setCharElement(term510, 6, 'R');
        setField(term509, term509.getClass(), "input", term510);
        setIntField(term509, term509.getClass(), "length", 1134449235);
        setIntField(term509, term509.getClass(), "pos", -883034806);
        setIntField(term509, term509.getClass(), "mark", 1585847225);
        setElement(term521, 0, "RkybSrpybU");
        setField(term509, term509.getClass(), "stringCache", term521);
        term5267 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5268 = (char[]) newCharArray(7);
        Object[] term5269 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term5268, 0, 'j');
        setCharElement(term5268, 1, 'l');
        setCharElement(term5268, 2, 'J');
        setCharElement(term5268, 3, 'A');
        setCharElement(term5268, 4, 'E');
        setCharElement(term5268, 5, 't');
        setCharElement(term5268, 6, 'R');
        setField(term5267, term5267.getClass(), "input", term5268);
        setIntField(term5267, term5267.getClass(), "length", 1134449235);
        setIntField(term5267, term5267.getClass(), "pos", -883034807);
        setIntField(term5267, term5267.getClass(), "mark", 1585847225);
        setElement(term5269, 0, "RkybSrpybU");
        setField(term5267, term5267.getClass(), "stringCache", term5269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unconsume", argTypes, term509, args);
        assertTrue(recursiveEquals(term509, term5267));
    }

};


