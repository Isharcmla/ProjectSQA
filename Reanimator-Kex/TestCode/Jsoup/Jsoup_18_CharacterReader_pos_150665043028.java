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

public class CharacterReader_pos_150665043028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term936;

    public CharacterReader_pos_150665043028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term23, term23.getClass(), "input", "sjlJAEtRrb");
        setIntField(term23, term23.getClass(), "length", 568599855);
        setIntField(term23, term23.getClass(), "pos", 1162663216);
        setIntField(term23, term23.getClass(), "mark", 1484323161);
        term936 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term936, term936.getClass(), "input", "sjlJAEtRrb");
        setIntField(term936, term936.getClass(), "length", 568599855);
        setIntField(term936, term936.getClass(), "pos", 1162663216);
        setIntField(term936, term936.getClass(), "mark", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "pos", argTypes, term23, args);
        assertTrue(recursiveEquals(term23, term936));
        assertTrue(recursiveEquals(retValue, 1162663216));
    }

};


