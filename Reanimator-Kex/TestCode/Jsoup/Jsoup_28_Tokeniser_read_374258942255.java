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

public class Tokeniser_read_374258942255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244810;

    public Tokeniser_read_374258942255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term245529 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term245528 = ((Class) term245529).getDeclaredField((String) "BogusComment");
        ((Field) term245528).setAccessible(true);
        Object enum393 = ((Field) term245528).get((Object) null);
        term244810 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term244992 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term244519 = (char[]) newCharArray(0);
        setBooleanField(term244810, term244810.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term244810, term244810.getClass(), "isEmitPending", false);
        setField(term244810, term244810.getClass(), "state", enum393);
        setIntField(term244992, term244992.getClass(), "pos", -2147483648);
        setIntField(term244992, term244992.getClass(), "length", -2147483647);
        setField(term244992, term244992.getClass(), "input", term244519);
        setField(term244810, term244810.getClass(), "reader", term244992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term244810, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


