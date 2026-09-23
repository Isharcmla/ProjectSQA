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

public class CharacterReader_mark_32211479534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;
     Object term1472;

    public CharacterReader_mark_32211479534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term179, term179.getClass(), "input", "MjGYSRKTNF");
        setIntField(term179, term179.getClass(), "length", 1622346318);
        setIntField(term179, term179.getClass(), "pos", 1048535127);
        setIntField(term179, term179.getClass(), "mark", -655067527);
        term1472 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term1472, term1472.getClass(), "input", "MjGYSRKTNF");
        setIntField(term1472, term1472.getClass(), "length", 1622346318);
        setIntField(term1472, term1472.getClass(), "pos", 1048535127);
        setIntField(term1472, term1472.getClass(), "mark", 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "mark", argTypes, term179, args);
        assertTrue(recursiveEquals(term179, term1472));
    }

};


