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

public class Tokeniser_read_374258942355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324312;

    public Tokeniser_read_374258942355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term324993 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term324992 = ((Class) term324993).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term324992).setAccessible(true);
        Object enum554 = ((Field) term324992).get((Object) null);
        term324312 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term324494 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term324312, term324312.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term324312, term324312.getClass(), "isEmitPending", false);
        setField(term324312, term324312.getClass(), "state", enum554);
        setIntField(term324494, term324494.getClass(), "bufPos", -2147483648);
        setIntField(term324494, term324494.getClass(), "bufSplitPoint", -2147483648);
        setField(term324312, term324312.getClass(), "reader", term324494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term324312, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


