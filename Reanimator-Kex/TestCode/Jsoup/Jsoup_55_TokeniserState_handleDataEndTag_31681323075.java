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

public class TokeniserState_handleDataEndTag_31681323075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137187;
     Object term137401;

    public TokeniserState_handleDataEndTag_31681323075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137187 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term137293 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term137187, term137187.getClass(), "lastStartTag", "");
        setField(term137293, term137293.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term137187, term137187.getClass(), "tagPending", term137293);
        term137401 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term137401, term137401.getClass(), "pos", -2147483648);
        setIntField(term137401, term137401.getClass(), "length", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term137187;
        args[1] = term137401;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


