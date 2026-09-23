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

public class CharacterReader_matchesLetter_85209721987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10842;
     Object term11107;

    public CharacterReader_matchesLetter_85209721987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10842 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term10842, term10842.getClass(), "pos", -2147483648);
        setIntField(term10842, term10842.getClass(), "length", -2147483648);
        term11107 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term11107, term11107.getClass(), "input", null);
        setIntField(term11107, term11107.getClass(), "length", -2147483648);
        setIntField(term11107, term11107.getClass(), "pos", -2147483648);
        setIntField(term11107, term11107.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesLetter", argTypes, term10842, args);
        assertTrue(recursiveEquals(term10842, term11107));
        assertTrue(recursiveEquals(retValue, false));
    }

};


