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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tokeniser_unescapeEntities_1802623960267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231184;

    public Tokeniser_unescapeEntities_1802623960267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231184 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term231254 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term231296 = newInstance(Class.forName("java.io.FileReader"));
        setIntField(term231254, term231254.getClass(), "bufPos", -2147483648);
        setIntField(term231254, term231254.getClass(), "bufLength", -2147483647);
        setIntField(term231254, term231254.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term231254, term231254.getClass(), "readerPos", 0);
        setField(term231254, term231254.getClass(), "reader", term231296);
        setField(term231184, term231184.getClass(), "reader", term231254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "unescapeEntities", argTypes, term231184, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


