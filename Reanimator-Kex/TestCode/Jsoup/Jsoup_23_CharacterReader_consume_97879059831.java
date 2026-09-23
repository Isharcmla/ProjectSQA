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

public class CharacterReader_consume_97879059831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;
     Object term1355;

    public CharacterReader_consume_97879059831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term101, term101.getClass(), "input", "jJCZpVmanW");
        setIntField(term101, term101.getClass(), "length", -1339778481);
        setIntField(term101, term101.getClass(), "pos", 1725571209);
        setIntField(term101, term101.getClass(), "mark", -522618178);
        term1355 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term1355, term1355.getClass(), "input", "jJCZpVmanW");
        setIntField(term1355, term1355.getClass(), "length", -1339778481);
        setIntField(term1355, term1355.getClass(), "pos", 1725571210);
        setIntField(term1355, term1355.getClass(), "mark", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consume", argTypes, term101, args);
        assertTrue(recursiveEquals(term101, term1355));
        assertTrue(recursiveEquals(retValue, 65535));
    }

};


