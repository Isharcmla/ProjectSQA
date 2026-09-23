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

public class TokeniserState_handleDataEndTag_31681323033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46008;
     Object term46078;

    public TokeniserState_handleDataEndTag_31681323033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46008 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term46008, term46008.getClass(), "lastStartTag", null);
        term46078 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term46078, term46078.getClass(), "bufPos", -2147483648);
        setIntField(term46078, term46078.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term46078, term46078.getClass(), "bufLength", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term46008;
        args[1] = term46078;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


