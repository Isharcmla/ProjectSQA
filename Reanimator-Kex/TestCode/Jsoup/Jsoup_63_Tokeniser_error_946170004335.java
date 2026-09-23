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

public class Tokeniser_error_946170004335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297865;

    public Tokeniser_error_946170004335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297865 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term297933 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term298003 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term298047 = newInstance(Class.forName("java.io.PipedReader"));
        setIntField(term297933, term297933.getClass(), "maxSize", 2147483647);
        setField(term297865, term297865.getClass(), "errors", term297933);
        setIntField(term298003, term298003.getClass(), "readerPos", 0);
        setIntField(term298003, term298003.getClass(), "bufPos", -2147483648);
        setIntField(term298003, term298003.getClass(), "bufSplitPoint", -2147483648);
        setField(term298003, term298003.getClass(), "reader", term298047);
        setField(term297865, term297865.getClass(), "reader", term298003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term297865, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


