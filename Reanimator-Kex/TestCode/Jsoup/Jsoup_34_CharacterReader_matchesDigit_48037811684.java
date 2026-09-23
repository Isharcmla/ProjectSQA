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

public class CharacterReader_matchesDigit_48037811684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10666;
     Object term10759;

    public CharacterReader_matchesDigit_48037811684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10666 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term10666, term10666.getClass(), "pos", -2147483648);
        setIntField(term10666, term10666.getClass(), "length", -2147483648);
        term10759 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term10759, term10759.getClass(), "input", null);
        setIntField(term10759, term10759.getClass(), "length", -2147483648);
        setIntField(term10759, term10759.getClass(), "pos", -2147483648);
        setIntField(term10759, term10759.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term10666, args);
        assertTrue(recursiveEquals(term10666, term10759));
        assertTrue(recursiveEquals(retValue, false));
    }

};


