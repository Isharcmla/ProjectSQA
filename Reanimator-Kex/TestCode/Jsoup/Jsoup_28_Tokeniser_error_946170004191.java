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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tokeniser_error_946170004191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164950;

    public Tokeniser_error_946170004191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164950 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term165018 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term165088 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term164748 = (char[]) newCharArray(106);
        setIntField(term165018, term165018.getClass(), "maxSize", 2147483647);
        setField(term164950, term164950.getClass(), "errors", term165018);
        setIntField(term165088, term165088.getClass(), "pos", -2147483648);
        setIntField(term165088, term165088.getClass(), "length", -2147483647);
        setField(term165088, term165088.getClass(), "input", term164748);
        setField(term164950, term164950.getClass(), "reader", term165088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term164950, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


