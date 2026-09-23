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

public class CharacterReader_consumeHexSequence_393737519337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2085900;

    public CharacterReader_consumeHexSequence_393737519337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2085900 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2085795 = (char[]) newCharArray(8);
        setIntField(term2085900, term2085900.getClass(), "pos", 6);
        setIntField(term2085900, term2085900.getClass(), "length", 7);
        setCharElement(term2085795, 0, 'd');
        setCharElement(term2085795, 1, 'd');
        setCharElement(term2085795, 2, 'd');
        setCharElement(term2085795, 3, 'd');
        setCharElement(term2085795, 4, 'd');
        setCharElement(term2085795, 5, 'd');
        setCharElement(term2085795, 6, 'd');
        setCharElement(term2085795, 7, 'd');
        setField(term2085900, term2085900.getClass(), "input", term2085795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term2085900, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


