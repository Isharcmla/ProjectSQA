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

public class Tokeniser_error_946170004121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215593;

    public Tokeniser_error_946170004121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215593 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term215663 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term215593, term215593.getClass(), "trackErrors", true);
        setField(term215593, term215593.getClass(), "errors", null);
        setIntField(term215663, term215663.getClass(), "pos", -2147483648);
        setIntField(term215663, term215663.getClass(), "length", -2147483647);
        setField(term215593, term215593.getClass(), "reader", term215663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term215593, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


