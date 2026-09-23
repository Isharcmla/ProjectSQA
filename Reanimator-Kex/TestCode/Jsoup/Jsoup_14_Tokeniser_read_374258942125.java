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

public class Tokeniser_read_374258942125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219044;

    public Tokeniser_read_374258942125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219044 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term219114 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term219044, term219044.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term219044, term219044.getClass(), "trackErrors", true);
        setField(term219044, term219044.getClass(), "errors", null);
        setField(term219044, term219044.getClass(), "reader", term219114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term219044, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


