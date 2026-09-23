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

public class Tokeniser_eofError_959501008176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175670;

    public Tokeniser_eofError_959501008176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175670 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term175738 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term175808 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term175738, term175738.getClass(), "maxSize", 2147483647);
        setField(term175670, term175670.getClass(), "errors", term175738);
        setField(term175670, term175670.getClass(), "reader", term175808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "eofError", argTypes, term175670, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


