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

public class Tokeniser_read_374258942251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218331;

    public Tokeniser_read_374258942251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term218994 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term218993 = ((Class) term218994).getDeclaredField((String) "AfterAttributeName");
        ((Field) term218993).setAccessible(true);
        Object enum385 = ((Field) term218993).get((Object) null);
        term218331 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term218513 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term218331, term218331.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term218331, term218331.getClass(), "isEmitPending", false);
        setField(term218331, term218331.getClass(), "state", enum385);
        setIntField(term218513, term218513.getClass(), "pos", -2147483648);
        setIntField(term218513, term218513.getClass(), "length", -2147483647);
        setField(term218331, term218331.getClass(), "reader", term218513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term218331, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


