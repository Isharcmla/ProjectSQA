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

public class Tokeniser_read_374258942204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178237;

    public Tokeniser_read_374258942204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term179998 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term179997 = ((Class) term179998).getDeclaredField((String) "SelfClosingStartTag");
        ((Field) term179997).setAccessible(true);
        Object enum347 = ((Field) term179997).get((Object) null);
        term178237 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term178417 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term178485 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term178237, term178237.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term178237, term178237.getClass(), "isEmitPending", false);
        setField(term178237, term178237.getClass(), "state", enum347);
        setIntField(term178417, term178417.getClass(), "pos", -2147483648);
        setIntField(term178417, term178417.getClass(), "length", -2147483648);
        setField(term178237, term178237.getClass(), "reader", term178417);
        setField(term178237, term178237.getClass(), "errors", term178485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term178237, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


