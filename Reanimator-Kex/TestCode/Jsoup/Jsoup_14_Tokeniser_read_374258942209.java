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
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310813;

    public Tokeniser_read_374258942209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term311504 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term311503 = ((Class) term311504).getDeclaredField((String) "Doctype");
        ((Field) term311503).setAccessible(true);
        Object enum877 = ((Field) term311503).get((Object) null);
        term310813 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term310995 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term310813, term310813.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term310813, term310813.getClass(), "trackErrors", false);
        setBooleanField(term310813, term310813.getClass(), "isEmitPending", false);
        setField(term310813, term310813.getClass(), "state", enum877);
        setIntField(term310995, term310995.getClass(), "pos", -2147483648);
        setIntField(term310995, term310995.getClass(), "length", -2147483647);
        setField(term310813, term310813.getClass(), "reader", term310995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term310813, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


