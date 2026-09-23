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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333318;

    public Tokeniser_read_374258942225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term334326 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term334325 = ((Class) term334326).getDeclaredField((String) "BogusDoctype");
        ((Field) term334325).setAccessible(true);
        Object enum900 = ((Field) term334325).get((Object) null);
        term333318 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term333500 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term333318, term333318.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term333318, term333318.getClass(), "trackErrors", false);
        setBooleanField(term333318, term333318.getClass(), "isEmitPending", false);
        setField(term333318, term333318.getClass(), "state", enum900);
        setIntField(term333500, term333500.getClass(), "pos", -2147483648);
        setIntField(term333500, term333500.getClass(), "length", -2147483647);
        setField(term333500, term333500.getClass(), "input", "AfterDoctypeSystemKeyword");
        setField(term333318, term333318.getClass(), "reader", term333500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term333318, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


