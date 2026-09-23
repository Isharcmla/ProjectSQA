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

public class Tokeniser_read_374258942133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121196;

    public Tokeniser_read_374258942133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term121923 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term121922 = ((Class) term121923).getDeclaredField((String) "CharacterReferenceInRcdata");
        ((Field) term121922).setAccessible(true);
        Object enum301 = ((Field) term121922).get((Object) null);
        term121196 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term121378 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term121196, term121196.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term121196, term121196.getClass(), "isEmitPending", false);
        setField(term121196, term121196.getClass(), "state", enum301);
        setField(term121196, term121196.getClass(), "reader", term121378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term121196, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


