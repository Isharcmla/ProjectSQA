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

public class Tokeniser_read_374258942197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292410;

    public Tokeniser_read_374258942197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term293219 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term293218 = ((Class) term293219).getDeclaredField((String) "CharacterReferenceInData");
        ((Field) term293218).setAccessible(true);
        Object enum861 = ((Field) term293218).get((Object) null);
        term292410 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term292410, term292410.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term292410, term292410.getClass(), "trackErrors", false);
        setBooleanField(term292410, term292410.getClass(), "isEmitPending", false);
        setField(term292410, term292410.getClass(), "state", enum861);
        setField(term292410, term292410.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term292410, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


