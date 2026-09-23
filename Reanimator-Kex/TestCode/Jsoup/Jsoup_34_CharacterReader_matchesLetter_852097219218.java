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

public class CharacterReader_matchesLetter_852097219218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34774;
     Object term34905;

    public CharacterReader_matchesLetter_852097219218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34774 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term34670 = (char[]) newCharArray(8);
        setIntField(term34774, term34774.getClass(), "pos", 6);
        setIntField(term34774, term34774.getClass(), "length", 7);
        setCharElement(term34670, 0, 'a');
        setCharElement(term34670, 1, 'a');
        setCharElement(term34670, 2, 'a');
        setCharElement(term34670, 3, 'a');
        setCharElement(term34670, 4, 'a');
        setCharElement(term34670, 5, 'a');
        setCharElement(term34670, 6, 'a');
        setCharElement(term34670, 7, 'a');
        setField(term34774, term34774.getClass(), "input", term34670);
        term34905 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term34906 = (char[]) newCharArray(8);
        setCharElement(term34906, 0, 'a');
        setCharElement(term34906, 1, 'a');
        setCharElement(term34906, 2, 'a');
        setCharElement(term34906, 3, 'a');
        setCharElement(term34906, 4, 'a');
        setCharElement(term34906, 5, 'a');
        setCharElement(term34906, 6, 'a');
        setCharElement(term34906, 7, 'a');
        setField(term34905, term34905.getClass(), "input", term34906);
        setIntField(term34905, term34905.getClass(), "length", 7);
        setIntField(term34905, term34905.getClass(), "pos", 6);
        setIntField(term34905, term34905.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesLetter", argTypes, term34774, args);
        assertTrue(recursiveEquals(term34774, term34905));
        assertTrue(recursiveEquals(retValue, true));
    }

};


