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

public class Tokeniser_read_374258942369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340026;

    public Tokeniser_read_374258942369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term340707 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term340706 = ((Class) term340707).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term340706).setAccessible(true);
        Object enum566 = ((Field) term340706).get((Object) null);
        term340026 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term340208 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term340026, term340026.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term340026, term340026.getClass(), "isEmitPending", false);
        setField(term340026, term340026.getClass(), "state", enum566);
        setIntField(term340208, term340208.getClass(), "bufPos", -2147483648);
        setIntField(term340208, term340208.getClass(), "bufLength", -2147483647);
        setIntField(term340208, term340208.getClass(), "bufSplitPoint", -2147483648);
        setField(term340026, term340026.getClass(), "reader", term340208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term340026, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


