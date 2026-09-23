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

public class CharacterReader_matchesLetter_85209721988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11348;
     Object term11437;

    public CharacterReader_matchesLetter_85209721988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11348 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term11348, term11348.getClass(), "pos", -2147483648);
        setIntField(term11348, term11348.getClass(), "length", -2147483648);
        term11437 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term11437, term11437.getClass(), "input", null);
        setIntField(term11437, term11437.getClass(), "length", -2147483648);
        setIntField(term11437, term11437.getClass(), "pos", -2147483648);
        setIntField(term11437, term11437.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesLetter", argTypes, term11348, args);
        assertTrue(recursiveEquals(term11348, term11437));
        assertTrue(recursiveEquals(retValue, false));
    }

};


