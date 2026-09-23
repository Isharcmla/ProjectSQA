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

public class CharacterReader_consumeHexSequence_393737519241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92381;

    public CharacterReader_consumeHexSequence_393737519241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92381 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term92277 = (char[]) newCharArray(8);
        setIntField(term92381, term92381.getClass(), "pos", 1);
        setIntField(term92381, term92381.getClass(), "length", 3);
        setCharElement(term92277, 0, (char) 48);
        setCharElement(term92277, 1, (char) 48);
        setCharElement(term92277, 2, (char) 48);
        setCharElement(term92277, 3, (char) 48);
        setCharElement(term92277, 4, (char) 48);
        setCharElement(term92277, 5, (char) 48);
        setCharElement(term92277, 6, (char) 48);
        setCharElement(term92277, 7, (char) 48);
        setField(term92381, term92381.getClass(), "input", term92277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term92381, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


