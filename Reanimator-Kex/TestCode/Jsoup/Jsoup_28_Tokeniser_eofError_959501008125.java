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

public class Tokeniser_eofError_959501008125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114404;

    public Tokeniser_eofError_959501008125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114404 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term114472 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term114542 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term114472, term114472.getClass(), "maxSize", 2147483647);
        setField(term114404, term114404.getClass(), "errors", term114472);
        setField(term114404, term114404.getClass(), "reader", term114542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "eofError", argTypes, term114404, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


