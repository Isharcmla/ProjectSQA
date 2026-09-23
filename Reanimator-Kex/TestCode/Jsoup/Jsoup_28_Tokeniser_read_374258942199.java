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

public class Tokeniser_read_374258942199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174497;

    public Tokeniser_read_374258942199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term175160 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term175159 = ((Class) term175160).getDeclaredField((String) "AfterAttributeName");
        ((Field) term175159).setAccessible(true);
        Object enum345 = ((Field) term175159).get((Object) null);
        term174497 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term174679 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term174497, term174497.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term174497, term174497.getClass(), "isEmitPending", false);
        setField(term174497, term174497.getClass(), "state", enum345);
        setIntField(term174679, term174679.getClass(), "pos", -2147483648);
        setIntField(term174679, term174679.getClass(), "length", -2147483647);
        setField(term174497, term174497.getClass(), "reader", term174679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term174497, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


