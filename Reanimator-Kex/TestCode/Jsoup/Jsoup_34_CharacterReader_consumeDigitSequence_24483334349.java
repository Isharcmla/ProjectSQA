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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeDigitSequence_24483334349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;

    public CharacterReader_consumeDigitSequence_24483334349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term283 = (char[]) newCharArray(6);
        setCharElement(term283, 0, 'Y');
        setCharElement(term283, 1, 'S');
        setCharElement(term283, 2, 'R');
        setCharElement(term283, 3, 'K');
        setCharElement(term283, 4, 'T');
        setCharElement(term283, 5, 'N');
        setField(term282, term282.getClass(), "input", term283);
        setIntField(term282, term282.getClass(), "length", -1048298087);
        setIntField(term282, term282.getClass(), "pos", 292681826);
        setIntField(term282, term282.getClass(), "mark", 458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeDigitSequence", argTypes, term282, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


