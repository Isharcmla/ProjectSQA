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

public class Tokeniser_error_946170004129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116042;

    public Tokeniser_error_946170004129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116042 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term116110 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term116180 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term116110, term116110.getClass(), "maxSize", 2147483647);
        setField(term116042, term116042.getClass(), "errors", term116110);
        setField(term116042, term116042.getClass(), "reader", term116180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term116042, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


