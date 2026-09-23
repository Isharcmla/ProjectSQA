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

public class Tokeniser_error_946170004153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235661;

    public Tokeniser_error_946170004153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235661 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term235731 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term235661, term235661.getClass(), "trackErrors", true);
        setField(term235661, term235661.getClass(), "errors", null);
        setIntField(term235731, term235731.getClass(), "pos", -2147483648);
        setIntField(term235731, term235731.getClass(), "length", -2147483647);
        setField(term235731, term235731.getClass(), "input", "");
        setField(term235661, term235661.getClass(), "reader", term235731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term235661, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


