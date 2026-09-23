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

public class Tokeniser_error_946170004165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142316;

    public Tokeniser_error_946170004165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142316 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term142384 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term142454 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term142384, term142384.getClass(), "maxSize", 2147483647);
        setField(term142316, term142316.getClass(), "errors", term142384);
        setIntField(term142454, term142454.getClass(), "pos", -2147483648);
        setIntField(term142454, term142454.getClass(), "length", -2147483647);
        setField(term142316, term142316.getClass(), "reader", term142454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term142316, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


