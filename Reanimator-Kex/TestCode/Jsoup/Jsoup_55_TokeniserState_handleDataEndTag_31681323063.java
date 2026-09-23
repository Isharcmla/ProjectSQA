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

public class TokeniserState_handleDataEndTag_31681323063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113841;
     Object term114055;

    public TokeniserState_handleDataEndTag_31681323063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113841 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term113947 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term113841, term113841.getClass(), "lastStartTag", "");
        setField(term113947, term113947.getClass(), "tagName", "");
        setField(term113841, term113841.getClass(), "tagPending", term113947);
        term114055 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term114055, term114055.getClass(), "pos", -2147483648);
        setIntField(term114055, term114055.getClass(), "length", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term113841;
        args[1] = term114055;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


