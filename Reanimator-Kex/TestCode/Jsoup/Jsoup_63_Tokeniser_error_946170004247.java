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

public class Tokeniser_error_946170004247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223022;

    public Tokeniser_error_946170004247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223022 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term223090 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term223160 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term223090, term223090.getClass(), "maxSize", 2147483647);
        setField(term223022, term223022.getClass(), "errors", term223090);
        setIntField(term223160, term223160.getClass(), "readerPos", 0);
        setIntField(term223160, term223160.getClass(), "bufPos", -2147483648);
        setIntField(term223160, term223160.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term223160, term223160.getClass(), "bufLength", -2147483648);
        setField(term223022, term223022.getClass(), "reader", term223160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term223022, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


