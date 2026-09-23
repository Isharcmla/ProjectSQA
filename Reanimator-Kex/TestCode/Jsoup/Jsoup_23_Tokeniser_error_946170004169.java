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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tokeniser_error_946170004169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131808;

    public Tokeniser_error_946170004169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131808 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term131876 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term131946 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term131876, term131876.getClass(), "maxSize", 2147483647);
        setField(term131808, term131808.getClass(), "errors", term131876);
        setIntField(term131946, term131946.getClass(), "pos", -2147483648);
        setIntField(term131946, term131946.getClass(), "length", -2147483647);
        setField(term131946, term131946.getClass(), "input", "");
        setField(term131808, term131808.getClass(), "reader", term131946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term131808, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


