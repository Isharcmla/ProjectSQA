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
import java.lang.Character;

public class CharacterReader_matches_201433289550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299;
     Object term306;
     Object term4127;

    public CharacterReader_matches_201433289550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term299 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term300 = (char[]) newCharArray(2);
        setCharElement(term300, 0, 'F');
        setCharElement(term300, 1, 'h');
        setField(term299, term299.getClass(), "input", term300);
        setIntField(term299, term299.getClass(), "length", -184153539);
        setIntField(term299, term299.getClass(), "pos", 493620644);
        setIntField(term299, term299.getClass(), "mark", 1328271830);
        term306 = new Character('R');
        term4127 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4128 = (char[]) newCharArray(2);
        setCharElement(term4128, 0, 'F');
        setCharElement(term4128, 1, 'h');
        setField(term4127, term4127.getClass(), "input", term4128);
        setIntField(term4127, term4127.getClass(), "length", -184153539);
        setIntField(term4127, term4127.getClass(), "pos", 493620644);
        setIntField(term4127, term4127.getClass(), "mark", 1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term306;
        Object retValue = callMethod(klass, "matches", argTypes, term299, args);
        assertTrue(recursiveEquals(term299, term4127));
        assertTrue(recursiveEquals(term306, 'R'));
        assertTrue(recursiveEquals(retValue, false));
    }

};


