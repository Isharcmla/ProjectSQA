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

public class Tokeniser_read_374258942259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251059;

    public Tokeniser_read_374258942259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term251966 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term251965 = ((Class) term251966).getDeclaredField((String) "DoctypeSystemIdentifier_doubleQuoted");
        ((Field) term251965).setAccessible(true);
        Object enum395 = ((Field) term251965).get((Object) null);
        term251059 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term251241 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term251309 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term251059, term251059.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term251059, term251059.getClass(), "isEmitPending", false);
        setField(term251059, term251059.getClass(), "state", enum395);
        setIntField(term251241, term251241.getClass(), "pos", -2147483648);
        setIntField(term251241, term251241.getClass(), "length", -2147483648);
        setField(term251059, term251059.getClass(), "reader", term251241);
        setIntField(term251309, term251309.getClass(), "maxSize", 2147483647);
        setField(term251059, term251059.getClass(), "errors", term251309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term251059, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


