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

public class Tokeniser_error_946170004179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176682;

    public Tokeniser_error_946170004179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176682 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term176750 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term176820 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term176750, term176750.getClass(), "maxSize", 2147483647);
        setField(term176682, term176682.getClass(), "errors", term176750);
        setField(term176682, term176682.getClass(), "reader", term176820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term176682, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


