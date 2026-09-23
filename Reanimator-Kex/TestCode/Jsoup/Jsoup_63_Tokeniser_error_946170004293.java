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

public class Tokeniser_error_946170004293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258335;

    public Tokeniser_error_946170004293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258335 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term258403 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term258473 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term258519 = newInstance(Class.forName("java.io.StringReader"));
        setIntField(term258403, term258403.getClass(), "maxSize", 2147483647);
        setField(term258335, term258335.getClass(), "errors", term258403);
        setIntField(term258473, term258473.getClass(), "readerPos", 0);
        setIntField(term258473, term258473.getClass(), "bufPos", -2147483648);
        setIntField(term258473, term258473.getClass(), "bufSplitPoint", -2147483648);
        setField(term258473, term258473.getClass(), "reader", term258519);
        setField(term258335, term258335.getClass(), "reader", term258473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term258335, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


