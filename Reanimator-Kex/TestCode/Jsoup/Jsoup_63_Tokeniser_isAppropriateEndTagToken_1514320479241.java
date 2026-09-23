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

public class Tokeniser_isAppropriateEndTagToken_1514320479241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221543;

    public Tokeniser_isAppropriateEndTagToken_1514320479241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221543 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term221645 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term221543, term221543.getClass(), "lastStartTag", "");
        setField(term221645, term221645.getClass(), "tagName", "");
        setField(term221543, term221543.getClass(), "tagPending", term221645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isAppropriateEndTagToken", argTypes, term221543, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


