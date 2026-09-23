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

public class CharacterReader_containsIgnoreCase_201681704885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10618;
     Object term10942;

    public CharacterReader_containsIgnoreCase_201681704885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10618 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term10618, term10618.getClass(), "input", "");
        setIntField(term10618, term10618.getClass(), "pos", 0);
        term10942 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term10942, term10942.getClass(), "input", "");
        setIntField(term10942, term10942.getClass(), "length", 0);
        setIntField(term10942, term10942.getClass(), "pos", 0);
        setIntField(term10942, term10942.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "containsIgnoreCase", argTypes, term10618, args);
        assertTrue(recursiveEquals(term10618, term10942));
        assertTrue(recursiveEquals(retValue, true));
    }

};


