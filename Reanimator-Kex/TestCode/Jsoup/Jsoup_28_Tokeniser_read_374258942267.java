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

public class Tokeniser_read_374258942267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262575;

    public Tokeniser_read_374258942267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term263235 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term263234 = ((Class) term263235).getDeclaredField((String) "RawtextEndTagOpen");
        ((Field) term263234).setAccessible(true);
        Object enum405 = ((Field) term263234).get((Object) null);
        term262575 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term262757 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term262575, term262575.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term262575, term262575.getClass(), "isEmitPending", false);
        setField(term262575, term262575.getClass(), "state", enum405);
        setIntField(term262757, term262757.getClass(), "pos", -2147483647);
        setIntField(term262757, term262757.getClass(), "length", -2147483647);
        setField(term262575, term262575.getClass(), "reader", term262757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term262575, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


