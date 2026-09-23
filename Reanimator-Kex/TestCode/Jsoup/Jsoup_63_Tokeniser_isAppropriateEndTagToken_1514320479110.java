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

public class Tokeniser_isAppropriateEndTagToken_1514320479110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148908;

    public Tokeniser_isAppropriateEndTagToken_1514320479110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148908 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term149014 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term148908, term148908.getClass(), "lastStartTag", "");
        setField(term149014, term149014.getClass(), "tagName", "");
        setField(term148908, term148908.getClass(), "tagPending", term149014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isAppropriateEndTagToken", argTypes, term148908, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


