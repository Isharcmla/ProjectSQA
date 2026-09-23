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

public class CharacterReader_matchesLetter_85209721980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25331;
     Object term25472;

    public CharacterReader_matchesLetter_85209721980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25331 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term25331, term25331.getClass(), "pos", -2147483648);
        setIntField(term25331, term25331.getClass(), "length", -2147483648);
        term25472 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term25472, term25472.getClass(), "input", null);
        setIntField(term25472, term25472.getClass(), "length", -2147483648);
        setIntField(term25472, term25472.getClass(), "pos", -2147483648);
        setIntField(term25472, term25472.getClass(), "mark", 0);
        setField(term25472, term25472.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesLetter", argTypes, term25331, args);
        assertTrue(recursiveEquals(term25331, term25472));
        assertTrue(recursiveEquals(retValue, false));
    }

};


