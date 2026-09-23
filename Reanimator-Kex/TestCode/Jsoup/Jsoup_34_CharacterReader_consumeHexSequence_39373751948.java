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

public class CharacterReader_consumeHexSequence_39373751948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;

    public CharacterReader_consumeHexSequence_39373751948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term262 = (char[]) newCharArray(8);
        setCharElement(term262, 0, 'O');
        setCharElement(term262, 1, 'Q');
        setCharElement(term262, 2, 'T');
        setCharElement(term262, 3, 'y');
        setCharElement(term262, 4, 'S');
        setCharElement(term262, 5, 'M');
        setCharElement(term262, 6, 'j');
        setCharElement(term262, 7, 'G');
        setField(term261, term261.getClass(), "input", term262);
        setIntField(term261, term261.getClass(), "length", 454281060);
        setIntField(term261, term261.getClass(), "pos", -1786399638);
        setIntField(term261, term261.getClass(), "mark", 2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term261, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


