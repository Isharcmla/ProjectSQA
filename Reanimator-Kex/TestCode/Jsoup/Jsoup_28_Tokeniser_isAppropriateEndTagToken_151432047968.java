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

public class Tokeniser_isAppropriateEndTagToken_151432047968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81838;

    public Tokeniser_isAppropriateEndTagToken_151432047968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81838 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term81906 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term81974 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term81838, term81838.getClass(), "lastStartTag", term81906);
        setField(term81838, term81838.getClass(), "tagPending", term81974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isAppropriateEndTagToken", argTypes, term81838, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


