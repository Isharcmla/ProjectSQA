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

public class Tokeniser_read_374258942261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254294;

    public Tokeniser_read_374258942261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term254955 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term254954 = ((Class) term254955).getDeclaredField((String) "AfterAttributeName");
        ((Field) term254954).setAccessible(true);
        Object enum397 = ((Field) term254954).get((Object) null);
        term254294 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term254474 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term254294, term254294.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term254294, term254294.getClass(), "isEmitPending", false);
        setField(term254294, term254294.getClass(), "state", enum397);
        setIntField(term254474, term254474.getClass(), "pos", -2147483648);
        setIntField(term254474, term254474.getClass(), "length", -2147483647);
        setField(term254294, term254294.getClass(), "reader", term254474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term254294, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


