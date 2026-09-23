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

public class Tokeniser_read_374258942219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323494;

    public Tokeniser_read_374258942219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term324340 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term324339 = ((Class) term324340).getDeclaredField((String) "DoctypeSystemIdentifier_singleQuoted");
        ((Field) term324339).setAccessible(true);
        Object enum891 = ((Field) term324339).get((Object) null);
        term323494 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term323676 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term323494, term323494.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term323494, term323494.getClass(), "isEmitPending", false);
        setField(term323494, term323494.getClass(), "state", enum891);
        setIntField(term323676, term323676.getClass(), "pos", -2147483648);
        setIntField(term323676, term323676.getClass(), "length", -2147483648);
        setField(term323494, term323494.getClass(), "reader", term323676);
        setBooleanField(term323494, term323494.getClass(), "trackErrors", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term323494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


