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

public class CharacterReader_matchesDigit_48037811681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10236;
     Object term10566;

    public CharacterReader_matchesDigit_48037811681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10236 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term10139 = (char[]) newCharArray(8);
        setIntField(term10236, term10236.getClass(), "pos", 6);
        setIntField(term10236, term10236.getClass(), "length", 7);
        setField(term10236, term10236.getClass(), "input", term10139);
        term10566 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term10567 = (char[]) newCharArray(8);
        setField(term10566, term10566.getClass(), "input", term10567);
        setIntField(term10566, term10566.getClass(), "length", 7);
        setIntField(term10566, term10566.getClass(), "pos", 6);
        setIntField(term10566, term10566.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term10236, args);
        assertTrue(recursiveEquals(term10236, term10566));
        assertTrue(recursiveEquals(retValue, false));
    }

};


