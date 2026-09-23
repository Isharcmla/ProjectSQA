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

public class Tokeniser_read_374258942157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239109;

    public Tokeniser_read_374258942157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term239884 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term239883 = ((Class) term239884).getDeclaredField((String) "AfterDoctypeSystemIdentifier");
        ((Field) term239883).setAccessible(true);
        Object enum809 = ((Field) term239883).get((Object) null);
        term239109 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term239291 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term239109, term239109.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term239109, term239109.getClass(), "trackErrors", false);
        setBooleanField(term239109, term239109.getClass(), "isEmitPending", false);
        setField(term239109, term239109.getClass(), "state", enum809);
        setField(term239109, term239109.getClass(), "reader", term239291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term239109, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


