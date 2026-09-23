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

public class Tokeniser_read_374258942211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209019;

    public Tokeniser_read_374258942211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209019 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term209087 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term209157 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term209019, term209019.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term209087, term209087.getClass(), "maxSize", 2147483647);
        setField(term209019, term209019.getClass(), "errors", term209087);
        setField(term209019, term209019.getClass(), "reader", term209157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term209019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


