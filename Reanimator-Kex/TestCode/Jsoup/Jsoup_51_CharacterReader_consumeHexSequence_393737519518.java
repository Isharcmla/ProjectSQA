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

public class CharacterReader_consumeHexSequence_393737519518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4121688;

    public CharacterReader_consumeHexSequence_393737519518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4121688 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4121545 = (char[]) newCharArray(11);
        Object[] term4121569 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term4121688, term4121688.getClass(), "pos", 2);
        setIntField(term4121688, term4121688.getClass(), "length", 3);
        setCharElement(term4121545, 0, 'A');
        setCharElement(term4121545, 1, 'A');
        setCharElement(term4121545, 2, 'A');
        setCharElement(term4121545, 3, 'A');
        setCharElement(term4121545, 4, 'A');
        setCharElement(term4121545, 5, 'A');
        setCharElement(term4121545, 6, 'A');
        setCharElement(term4121545, 7, 'A');
        setCharElement(term4121545, 8, 'A');
        setCharElement(term4121545, 9, 'A');
        setCharElement(term4121545, 10, 'A');
        setField(term4121688, term4121688.getClass(), "input", term4121545);
        setField(term4121688, term4121688.getClass(), "stringCache", term4121569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term4121688, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


