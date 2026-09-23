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

public class Tokeniser_read_374258942231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341027;

    public Tokeniser_read_374258942231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term341836 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term341835 = ((Class) term341836).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term341835).setAccessible(true);
        Object enum904 = ((Field) term341835).get((Object) null);
        term341027 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term341209 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term341027, term341027.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term341027, term341027.getClass(), "isEmitPending", false);
        setField(term341027, term341027.getClass(), "state", enum904);
        setIntField(term341209, term341209.getClass(), "pos", -2147483648);
        setIntField(term341209, term341209.getClass(), "length", -2147483648);
        setField(term341027, term341027.getClass(), "reader", term341209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term341027, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


