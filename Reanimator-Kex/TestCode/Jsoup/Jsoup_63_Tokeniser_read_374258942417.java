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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409222;

    public Tokeniser_read_374258942417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term409985 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term409984 = ((Class) term409985).getDeclaredField((String) "AfterDoctypePublicIdentifier");
        ((Field) term409984).setAccessible(true);
        Object enum606 = ((Field) term409984).get((Object) null);
        term409222 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term409404 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term409454 = newInstance(Class.forName("java.io.BufferedReader"));
        setBooleanField(term409222, term409222.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term409222, term409222.getClass(), "isEmitPending", false);
        setField(term409222, term409222.getClass(), "state", enum606);
        setIntField(term409404, term409404.getClass(), "bufPos", -2147483648);
        setIntField(term409404, term409404.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term409404, term409404.getClass(), "readerPos", 0);
        setField(term409404, term409404.getClass(), "reader", term409454);
        setField(term409222, term409222.getClass(), "reader", term409404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term409222, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


