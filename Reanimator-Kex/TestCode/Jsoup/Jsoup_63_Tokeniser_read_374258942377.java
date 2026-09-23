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

public class Tokeniser_read_374258942377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353179;

    public Tokeniser_read_374258942377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term353946 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term353945 = ((Class) term353946).getDeclaredField((String) "CharacterReferenceInRcdata");
        ((Field) term353945).setAccessible(true);
        Object enum573 = ((Field) term353945).get((Object) null);
        term353179 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term353361 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term353179, term353179.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term353179, term353179.getClass(), "isEmitPending", false);
        setField(term353179, term353179.getClass(), "state", enum573);
        setField(term353179, term353179.getClass(), "reader", term353361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term353179, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


