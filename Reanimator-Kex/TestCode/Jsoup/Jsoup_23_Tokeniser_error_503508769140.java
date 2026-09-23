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

public class Tokeniser_error_503508769140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120682;

    public Tokeniser_error_503508769140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120682 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term120750 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term120820 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term120750, term120750.getClass(), "maxSize", 2147483647);
        setField(term120682, term120682.getClass(), "errors", term120750);
        setField(term120682, term120682.getClass(), "reader", term120820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term120682, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


