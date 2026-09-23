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

public class Tokeniser_characterReferenceError_240925789149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164025;

    public Tokeniser_characterReferenceError_240925789149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164025 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term164093 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term164163 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term164093, term164093.getClass(), "maxSize", 2147483647);
        setField(term164025, term164025.getClass(), "errors", term164093);
        setField(term164025, term164025.getClass(), "reader", term164163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "characterReferenceError", argTypes, term164025, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


