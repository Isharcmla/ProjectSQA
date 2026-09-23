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

public class Tokeniser_error_946170004300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264677;

    public Tokeniser_error_946170004300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264677 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term264745 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term264815 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term264865 = newInstance(Class.forName("java.io.PushbackReader"));
        setIntField(term264745, term264745.getClass(), "maxSize", 2147483647);
        setField(term264677, term264677.getClass(), "errors", term264745);
        setIntField(term264815, term264815.getClass(), "readerPos", 0);
        setIntField(term264815, term264815.getClass(), "bufPos", -2147483648);
        setIntField(term264815, term264815.getClass(), "bufSplitPoint", -2147483648);
        setField(term264815, term264815.getClass(), "reader", term264865);
        setField(term264677, term264677.getClass(), "reader", term264815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term264677, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


