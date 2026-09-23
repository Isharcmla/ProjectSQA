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
import java.lang.StringBuilder;

public class Tokeniser_read_374258942169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147481;

    public Tokeniser_read_374258942169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term148203 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term148202 = ((Class) term148203).getDeclaredField((String) "AfterAttributeName");
        ((Field) term148202).setAccessible(true);
        Object enum324 = ((Field) term148202).get((Object) null);
        StringBuilder term147723 = new StringBuilder();
        term147481 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term147663 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term147481, term147481.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term147481, term147481.getClass(), "isEmitPending", false);
        setField(term147481, term147481.getClass(), "state", enum324);
        setIntField(term147663, term147663.getClass(), "pos", -2147483648);
        setIntField(term147663, term147663.getClass(), "length", -2147483648);
        setField(term147481, term147481.getClass(), "reader", term147663);
        setField(term147481, term147481.getClass(), "charBuffer", term147723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term147481, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


