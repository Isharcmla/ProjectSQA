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

public class CharacterReader_matchesAny_42275714753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384;
     Object term392;
     Object term4770;
     Object term4772;

    public CharacterReader_matchesAny_42275714753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term385 = (char[]) newCharArray(3);
        setCharElement(term385, 0, 'F');
        setCharElement(term385, 1, 'I');
        setCharElement(term385, 2, 's');
        setField(term384, term384.getClass(), "input", term385);
        setIntField(term384, term384.getClass(), "length", -1588772968);
        setIntField(term384, term384.getClass(), "pos", -93135961);
        setIntField(term384, term384.getClass(), "mark", -112921587);
        term392 = (char[]) newCharArray(5);
        setCharElement(term392, 0, 'Y');
        setCharElement(term392, 1, 'G');
        setCharElement(term392, 2, 'g');
        setCharElement(term392, 3, 'n');
        setCharElement(term392, 4, 'e');
        term4770 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4771 = (char[]) newCharArray(3);
        setCharElement(term4771, 0, 'F');
        setCharElement(term4771, 1, 'I');
        setCharElement(term4771, 2, 's');
        setField(term4770, term4770.getClass(), "input", term4771);
        setIntField(term4770, term4770.getClass(), "length", -1588772968);
        setIntField(term4770, term4770.getClass(), "pos", -93135961);
        setIntField(term4770, term4770.getClass(), "mark", -112921587);
        term4772 = (char[]) newCharArray(5);
        setCharElement(term4772, 0, 'Y');
        setCharElement(term4772, 1, 'G');
        setCharElement(term4772, 2, 'g');
        setCharElement(term4772, 3, 'n');
        setCharElement(term4772, 4, 'e');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term392;
        Object retValue = callMethod(klass, "matchesAny", argTypes, term384, args);
        assertTrue(recursiveEquals(term384, term4770));
        assertTrue(recursiveEquals(term392, term4772));
        assertTrue(recursiveEquals(retValue, false));
    }

};


