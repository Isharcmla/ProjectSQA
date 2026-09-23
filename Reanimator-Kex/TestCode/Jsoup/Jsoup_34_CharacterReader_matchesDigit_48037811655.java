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

public class CharacterReader_matchesDigit_48037811655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423;

    public CharacterReader_matchesDigit_48037811655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term424 = (char[]) newCharArray(5);
        setCharElement(term424, 0, 'l');
        setCharElement(term424, 1, 'h');
        setCharElement(term424, 2, 'k');
        setCharElement(term424, 3, 'X');
        setCharElement(term424, 4, 'u');
        setField(term423, term423.getClass(), "input", term424);
        setIntField(term423, term423.getClass(), "length", 1540719661);
        setIntField(term423, term423.getClass(), "pos", 1265463001);
        setIntField(term423, term423.getClass(), "mark", 335112684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesDigit", argTypes, term423, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


