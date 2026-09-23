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

public class CharacterReader_consumeHexSequence_393737519305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1320982;

    public CharacterReader_consumeHexSequence_393737519305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1320982 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1320880 = (char[]) newCharArray(8);
        setIntField(term1320982, term1320982.getClass(), "pos", 6);
        setIntField(term1320982, term1320982.getClass(), "length", 7);
        setCharElement(term1320880, 0, 'z');
        setCharElement(term1320880, 1, 'z');
        setCharElement(term1320880, 2, 'z');
        setCharElement(term1320880, 3, 'z');
        setCharElement(term1320880, 4, 'z');
        setCharElement(term1320880, 5, 'z');
        setCharElement(term1320880, 6, 'z');
        setCharElement(term1320880, 7, 'z');
        setField(term1320982, term1320982.getClass(), "input", term1320880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term1320982, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


