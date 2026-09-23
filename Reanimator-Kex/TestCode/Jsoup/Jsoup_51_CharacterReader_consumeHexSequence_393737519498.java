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

public class CharacterReader_consumeHexSequence_393737519498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3378576;

    public CharacterReader_consumeHexSequence_393737519498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3378576 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3378443 = (char[]) newCharArray(32);
        setIntField(term3378576, term3378576.getClass(), "pos", 14);
        setIntField(term3378576, term3378576.getClass(), "length", 16);
        setCharElement(term3378443, 0, 'D');
        setCharElement(term3378443, 1, 'D');
        setCharElement(term3378443, 2, 'D');
        setCharElement(term3378443, 3, 'D');
        setCharElement(term3378443, 4, 'D');
        setCharElement(term3378443, 5, 'D');
        setCharElement(term3378443, 6, 'D');
        setCharElement(term3378443, 7, 'D');
        setCharElement(term3378443, 8, 'D');
        setCharElement(term3378443, 9, 'D');
        setCharElement(term3378443, 10, 'D');
        setCharElement(term3378443, 11, 'D');
        setCharElement(term3378443, 12, 'D');
        setCharElement(term3378443, 13, 'D');
        setCharElement(term3378443, 14, 'D');
        setCharElement(term3378443, 15, 'D');
        setCharElement(term3378443, 16, 'D');
        setCharElement(term3378443, 17, 'D');
        setCharElement(term3378443, 18, 'D');
        setCharElement(term3378443, 19, 'D');
        setCharElement(term3378443, 20, 'D');
        setCharElement(term3378443, 21, 'D');
        setCharElement(term3378443, 22, 'D');
        setCharElement(term3378443, 23, 'D');
        setCharElement(term3378443, 24, 'D');
        setCharElement(term3378443, 25, 'D');
        setCharElement(term3378443, 26, 'D');
        setCharElement(term3378443, 27, 'D');
        setCharElement(term3378443, 28, 'D');
        setCharElement(term3378443, 29, 'D');
        setCharElement(term3378443, 30, 'D');
        setCharElement(term3378443, 31, 'D');
        setField(term3378576, term3378576.getClass(), "input", term3378443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term3378576, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


