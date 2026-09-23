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

public class CharacterReader_matchesIgnoreCase_70550182893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11491;
     Object term11841;

    public CharacterReader_matchesIgnoreCase_70550182893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11491 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term11491, term11491.getClass(), "length", 0);
        setIntField(term11491, term11491.getClass(), "pos", 0);
        term11841 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term11841, term11841.getClass(), "input", null);
        setIntField(term11841, term11841.getClass(), "length", 0);
        setIntField(term11841, term11841.getClass(), "pos", 0);
        setIntField(term11841, term11841.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matchesIgnoreCase", argTypes, term11491, args);
        assertTrue(recursiveEquals(term11491, term11841));
        assertTrue(recursiveEquals(retValue, true));
    }

};


