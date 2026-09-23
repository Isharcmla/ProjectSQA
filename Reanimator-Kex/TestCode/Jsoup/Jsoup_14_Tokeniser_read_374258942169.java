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

public class Tokeniser_read_374258942169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255673;

    public Tokeniser_read_374258942169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term256459 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term256458 = ((Class) term256459).getDeclaredField((String) "BetweenDoctypePublicAndSystemIdentifiers");
        ((Field) term256458).setAccessible(true);
        Object enum823 = ((Field) term256458).get((Object) null);
        term255673 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term255855 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term255673, term255673.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term255673, term255673.getClass(), "isEmitPending", false);
        setField(term255673, term255673.getClass(), "state", enum823);
        setIntField(term255855, term255855.getClass(), "pos", -2147483648);
        setIntField(term255855, term255855.getClass(), "length", -2147483648);
        setField(term255673, term255673.getClass(), "reader", term255855);
        setBooleanField(term255673, term255673.getClass(), "trackErrors", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term255673, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


