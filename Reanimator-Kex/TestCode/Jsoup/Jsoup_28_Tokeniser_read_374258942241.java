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

public class Tokeniser_read_374258942241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228168;

    public Tokeniser_read_374258942241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term228831 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term228830 = ((Class) term228831).getDeclaredField((String) "AfterAttributeName");
        ((Field) term228830).setAccessible(true);
        Object enum381 = ((Field) term228830).get((Object) null);
        term228168 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term228350 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term228168, term228168.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term228168, term228168.getClass(), "isEmitPending", false);
        setField(term228168, term228168.getClass(), "state", enum381);
        setIntField(term228350, term228350.getClass(), "pos", -2147483648);
        setIntField(term228350, term228350.getClass(), "length", -2147483647);
        setField(term228168, term228168.getClass(), "reader", term228350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term228168, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


