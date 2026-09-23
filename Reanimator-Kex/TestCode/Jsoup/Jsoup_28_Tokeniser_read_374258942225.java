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

public class Tokeniser_read_374258942225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204575;

    public Tokeniser_read_374258942225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term205238 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term205237 = ((Class) term205238).getDeclaredField((String) "AfterAttributeName");
        ((Field) term205237).setAccessible(true);
        Object enum369 = ((Field) term205237).get((Object) null);
        term204575 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term204757 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term204575, term204575.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term204575, term204575.getClass(), "isEmitPending", false);
        setField(term204575, term204575.getClass(), "state", enum369);
        setIntField(term204757, term204757.getClass(), "pos", -2147483648);
        setIntField(term204757, term204757.getClass(), "length", -2147483647);
        setField(term204575, term204575.getClass(), "reader", term204757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term204575, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


