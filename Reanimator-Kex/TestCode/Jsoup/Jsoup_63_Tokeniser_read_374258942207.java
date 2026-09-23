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

public class Tokeniser_read_374258942207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205303;

    public Tokeniser_read_374258942207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term205885 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term205884 = ((Class) term205885).getDeclaredField((String) "RcdataLessthanSign");
        ((Field) term205884).setAccessible(true);
        Object enum473 = ((Field) term205884).get((Object) null);
        term205303 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term205303, term205303.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term205303, term205303.getClass(), "isEmitPending", false);
        setField(term205303, term205303.getClass(), "state", enum473);
        setField(term205303, term205303.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term205303, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


