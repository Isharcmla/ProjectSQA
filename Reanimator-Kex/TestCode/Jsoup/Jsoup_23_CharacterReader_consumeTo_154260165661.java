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

public class CharacterReader_consumeTo_154260165661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6000;
     Object term6051;

    public CharacterReader_consumeTo_154260165661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6000 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term6000, term6000.getClass(), "input", "");
        setIntField(term6000, term6000.getClass(), "pos", 0);
        term6051 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term6051, term6051.getClass(), "input", "");
        setIntField(term6051, term6051.getClass(), "length", 0);
        setIntField(term6051, term6051.getClass(), "pos", 0);
        setIntField(term6051, term6051.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "consumeTo", argTypes, term6000, args);
        assertTrue(recursiveEquals(term6000, term6051));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


