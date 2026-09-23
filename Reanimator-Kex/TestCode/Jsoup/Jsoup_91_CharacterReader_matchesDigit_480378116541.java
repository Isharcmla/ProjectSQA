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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_matchesDigit_480378116541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135843;

    public CharacterReader_matchesDigit_480378116541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135843 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term135889 = newInstance(Class.forName("java.io.StringReader"));
        setIntField(term135843, term135843.getClass(), "bufPos", -2147483648);
        setIntField(term135843, term135843.getClass(), "bufSplitPoint", -2147483648);
        setField(term135843, term135843.getClass(), "reader", term135889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesDigit", argTypes, term135843, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


