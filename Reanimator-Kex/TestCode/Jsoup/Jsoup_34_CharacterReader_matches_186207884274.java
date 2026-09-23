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

public class CharacterReader_matches_186207884274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8694;
     Object term8833;

    public CharacterReader_matches_186207884274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8694 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term8694, term8694.getClass(), "length", -1);
        setIntField(term8694, term8694.getClass(), "pos", 0);
        term8833 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term8833, term8833.getClass(), "input", null);
        setIntField(term8833, term8833.getClass(), "length", -1);
        setIntField(term8833, term8833.getClass(), "pos", 0);
        setIntField(term8833, term8833.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matches", argTypes, term8694, args);
        assertTrue(recursiveEquals(term8694, term8833));
        assertTrue(recursiveEquals(retValue, false));
    }

};


