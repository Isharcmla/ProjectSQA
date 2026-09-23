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

public class Tokeniser_read_374258942405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388563;

    public Tokeniser_read_374258942405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term389274 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term389273 = ((Class) term389274).getDeclaredField((String) "DoctypeSystemIdentifier_singleQuoted");
        ((Field) term389273).setAccessible(true);
        Object enum594 = ((Field) term389273).get((Object) null);
        term388563 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term388745 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term388563, term388563.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term388563, term388563.getClass(), "isEmitPending", false);
        setField(term388563, term388563.getClass(), "state", enum594);
        setIntField(term388745, term388745.getClass(), "bufPos", -2147483647);
        setIntField(term388745, term388745.getClass(), "bufSplitPoint", -2147483647);
        setField(term388563, term388563.getClass(), "reader", term388745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term388563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


