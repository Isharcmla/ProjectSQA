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

public class CharacterReader_consumeHexSequence_393737519391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2122905;

    public CharacterReader_consumeHexSequence_393737519391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2122905 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2122770 = (char[]) newCharArray(32);
        setIntField(term2122905, term2122905.getClass(), "pos", 14);
        setIntField(term2122905, term2122905.getClass(), "length", 16);
        setCharElement(term2122770, 0, 'd');
        setCharElement(term2122770, 1, 'd');
        setCharElement(term2122770, 2, 'd');
        setCharElement(term2122770, 3, 'd');
        setCharElement(term2122770, 4, 'd');
        setCharElement(term2122770, 5, 'd');
        setCharElement(term2122770, 6, 'd');
        setCharElement(term2122770, 7, 'd');
        setCharElement(term2122770, 8, 'd');
        setCharElement(term2122770, 9, 'd');
        setCharElement(term2122770, 10, 'd');
        setCharElement(term2122770, 11, 'd');
        setCharElement(term2122770, 12, 'd');
        setCharElement(term2122770, 13, 'd');
        setCharElement(term2122770, 14, 'd');
        setCharElement(term2122770, 15, 'd');
        setCharElement(term2122770, 16, 'd');
        setCharElement(term2122770, 17, 'd');
        setCharElement(term2122770, 18, 'd');
        setCharElement(term2122770, 19, 'd');
        setCharElement(term2122770, 20, 'd');
        setCharElement(term2122770, 21, 'd');
        setCharElement(term2122770, 22, 'd');
        setCharElement(term2122770, 23, 'd');
        setCharElement(term2122770, 24, 'd');
        setCharElement(term2122770, 25, 'd');
        setCharElement(term2122770, 26, 'd');
        setCharElement(term2122770, 27, 'd');
        setCharElement(term2122770, 28, 'd');
        setCharElement(term2122770, 29, 'd');
        setCharElement(term2122770, 30, 'd');
        setCharElement(term2122770, 31, 'd');
        setField(term2122905, term2122905.getClass(), "input", term2122770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term2122905, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


