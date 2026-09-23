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

public class CharacterReader_matches_1862078842143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38821;
     Object term39130;

    public CharacterReader_matches_1862078842143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38821 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term38821, term38821.getClass(), "length", -1);
        setIntField(term38821, term38821.getClass(), "pos", 0);
        term39130 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term39130, term39130.getClass(), "input", null);
        setIntField(term39130, term39130.getClass(), "length", -1);
        setIntField(term39130, term39130.getClass(), "pos", 0);
        setIntField(term39130, term39130.getClass(), "mark", 0);
        setField(term39130, term39130.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matches", argTypes, term38821, args);
        assertTrue(recursiveEquals(term38821, term39130));
        assertTrue(recursiveEquals(retValue, false));
    }

};


