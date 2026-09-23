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

public class Tokeniser_read_374258942243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363272;

    public Tokeniser_read_374258942243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term363456 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term363455 = ((Class) term363456).getDeclaredField((String) "DoctypeSystemIdentifier_singleQuoted");
        ((Field) term363455).setAccessible(true);
        Object enum915 = ((Field) term363455).get((Object) null);
        term363272 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term363454 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term363272, term363272.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term363272, term363272.getClass(), "isEmitPending", false);
        setField(term363272, term363272.getClass(), "state", enum915);
        setIntField(term363454, term363454.getClass(), "pos", -2147483648);
        setIntField(term363454, term363454.getClass(), "length", -2147483648);
        setField(term363272, term363272.getClass(), "reader", term363454);
        setBooleanField(term363272, term363272.getClass(), "trackErrors", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term363272, args);
    }

};


