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

public class CharacterReader_consumeHexSequence_393737519494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3376031;

    public CharacterReader_consumeHexSequence_393737519494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3376031 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3375900 = (char[]) newCharArray(8);
        setIntField(term3376031, term3376031.getClass(), "pos", 3);
        setIntField(term3376031, term3376031.getClass(), "length", 7);
        setCharElement(term3375900, 0, (char) 48);
        setCharElement(term3375900, 1, (char) 48);
        setCharElement(term3375900, 2, (char) 48);
        setCharElement(term3375900, 3, 'd');
        setCharElement(term3375900, 4, (char) 48);
        setCharElement(term3375900, 5, (char) 48);
        setCharElement(term3375900, 6, (char) 48);
        setCharElement(term3375900, 7, (char) 48);
        setField(term3376031, term3376031.getClass(), "input", term3375900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term3376031, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


