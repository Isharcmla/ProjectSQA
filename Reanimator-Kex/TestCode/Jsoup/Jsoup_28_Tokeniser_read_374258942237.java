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

public class Tokeniser_read_374258942237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224091;

    public Tokeniser_read_374258942237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term224754 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term224753 = ((Class) term224754).getDeclaredField((String) "AfterAttributeName");
        ((Field) term224753).setAccessible(true);
        Object enum379 = ((Field) term224753).get((Object) null);
        term224091 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term224273 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term224091, term224091.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term224091, term224091.getClass(), "isEmitPending", false);
        setField(term224091, term224091.getClass(), "state", enum379);
        setIntField(term224273, term224273.getClass(), "pos", -2147483648);
        setIntField(term224273, term224273.getClass(), "length", -2147483647);
        setField(term224091, term224091.getClass(), "reader", term224273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term224091, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


