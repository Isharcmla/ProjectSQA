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

public class CharacterReader_consumeHexSequence_393737519541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4366810;

    public CharacterReader_consumeHexSequence_393737519541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4366810 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4366659 = (char[]) newCharArray(8);
        setIntField(term4366810, term4366810.getClass(), "pos", 3);
        setIntField(term4366810, term4366810.getClass(), "length", 6);
        setCharElement(term4366659, 0, 'd');
        setCharElement(term4366659, 1, 'd');
        setCharElement(term4366659, 2, 'd');
        setCharElement(term4366659, 3, 'd');
        setCharElement(term4366659, 4, (char) 48);
        setCharElement(term4366659, 5, (char) 48);
        setCharElement(term4366659, 6, 'd');
        setCharElement(term4366659, 7, 'd');
        setField(term4366810, term4366810.getClass(), "input", term4366659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term4366810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


