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

public class Tokeniser_read_374258942177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264066;

    public Tokeniser_read_374258942177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term264729 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term264728 = ((Class) term264729).getDeclaredField((String) "AfterAttributeName");
        ((Field) term264728).setAccessible(true);
        Object enum831 = ((Field) term264728).get((Object) null);
        term264066 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term264248 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term264066, term264066.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term264066, term264066.getClass(), "isEmitPending", false);
        setField(term264066, term264066.getClass(), "state", enum831);
        setIntField(term264248, term264248.getClass(), "pos", -2147483648);
        setIntField(term264248, term264248.getClass(), "length", -2147483647);
        setField(term264066, term264066.getClass(), "reader", term264248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term264066, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


