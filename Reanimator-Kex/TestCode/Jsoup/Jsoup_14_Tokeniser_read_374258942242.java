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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360948;

    public Tokeniser_read_374258942242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term361170 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term361169 = ((Class) term361170).getDeclaredField((String) "Rawtext");
        ((Field) term361169).setAccessible(true);
        Object enum914 = ((Field) term361169).get((Object) null);
        term360948 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term361130 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term360948, term360948.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term360948, term360948.getClass(), "trackErrors", false);
        setBooleanField(term360948, term360948.getClass(), "isEmitPending", false);
        setField(term360948, term360948.getClass(), "state", enum914);
        setField(term361130, term361130.getClass(), "input", "");
        setIntField(term361130, term361130.getClass(), "pos", 0);
        setField(term360948, term360948.getClass(), "reader", term361130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term360948, args);
    }

};


