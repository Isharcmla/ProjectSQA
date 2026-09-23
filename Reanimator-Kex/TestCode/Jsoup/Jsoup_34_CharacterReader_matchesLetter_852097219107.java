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

public class CharacterReader_matchesLetter_852097219107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14067;
     Object term14317;

    public CharacterReader_matchesLetter_852097219107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14067 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term13970 = (char[]) newCharArray(8);
        setIntField(term14067, term14067.getClass(), "pos", 6);
        setIntField(term14067, term14067.getClass(), "length", 7);
        setField(term14067, term14067.getClass(), "input", term13970);
        term14317 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term14318 = (char[]) newCharArray(8);
        setField(term14317, term14317.getClass(), "input", term14318);
        setIntField(term14317, term14317.getClass(), "length", 7);
        setIntField(term14317, term14317.getClass(), "pos", 6);
        setIntField(term14317, term14317.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesLetter", argTypes, term14067, args);
        assertTrue(recursiveEquals(term14067, term14317));
        assertTrue(recursiveEquals(retValue, false));
    }

};


