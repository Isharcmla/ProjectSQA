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

public class Tokeniser_read_374258942177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175885;

    public Tokeniser_read_374258942177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175885 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term175953 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term175885, term175885.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term175953, term175953.getClass(), "maxSize", 2147483647);
        setField(term175885, term175885.getClass(), "errors", term175953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term175885, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


