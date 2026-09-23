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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class CharacterReader_unconsume_105085539335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term1009;

    public CharacterReader_unconsume_105085539335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term76 = (char[]) newCharArray(1);
        setCharElement(term76, 0, 't');
        setField(term75, term75.getClass(), "input", term76);
        setIntField(term75, term75.getClass(), "length", 1134449235);
        setIntField(term75, term75.getClass(), "pos", -883034806);
        setIntField(term75, term75.getClass(), "mark", 1585847225);
        term1009 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1010 = (char[]) newCharArray(1);
        setCharElement(term1010, 0, 't');
        setField(term1009, term1009.getClass(), "input", term1010);
        setIntField(term1009, term1009.getClass(), "length", 1134449235);
        setIntField(term1009, term1009.getClass(), "pos", -883034807);
        setIntField(term1009, term1009.getClass(), "mark", 1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unconsume", argTypes, term75, args);
        assertTrue(recursiveEquals(term75, term1009));
    }

};


