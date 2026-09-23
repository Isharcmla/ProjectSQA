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

public class Tokeniser_error_946170004423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412617;

    public Tokeniser_error_946170004423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term412617 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term412685 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term412755 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term412809 = newInstance(Class.forName("java.io.LineNumberReader"));
        setIntField(term412685, term412685.getClass(), "maxSize", 2147483647);
        setField(term412617, term412617.getClass(), "errors", term412685);
        setIntField(term412755, term412755.getClass(), "readerPos", 0);
        setIntField(term412755, term412755.getClass(), "bufPos", -2147483648);
        setIntField(term412755, term412755.getClass(), "bufSplitPoint", -2147483648);
        setField(term412755, term412755.getClass(), "reader", term412809);
        setField(term412617, term412617.getClass(), "reader", term412755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term412617, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


