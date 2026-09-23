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

public class Tokeniser_error_946170004245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222447;

    public Tokeniser_error_946170004245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222447 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term222515 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term222585 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term222637 = newInstance(Class.forName("java.io.CharArrayReader"));
        setIntField(term222515, term222515.getClass(), "maxSize", 2147483647);
        setField(term222447, term222447.getClass(), "errors", term222515);
        setIntField(term222585, term222585.getClass(), "readerPos", 0);
        setIntField(term222585, term222585.getClass(), "bufPos", -2147483648);
        setIntField(term222585, term222585.getClass(), "bufSplitPoint", -2147483648);
        setField(term222585, term222585.getClass(), "reader", term222637);
        setField(term222447, term222447.getClass(), "reader", term222585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term222447, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


