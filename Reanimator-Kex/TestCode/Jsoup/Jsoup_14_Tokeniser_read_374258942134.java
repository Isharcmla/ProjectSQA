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

public class Tokeniser_read_374258942134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222510;

    public Tokeniser_read_374258942134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term223793 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term223792 = ((Class) term223793).getDeclaredField((String) "AfterAttributeName");
        ((Field) term223792).setAccessible(true);
        Object enum791 = ((Field) term223792).get((Object) null);
        term222510 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term222692 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term222510, term222510.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term222510, term222510.getClass(), "isEmitPending", false);
        setField(term222510, term222510.getClass(), "state", enum791);
        setIntField(term222692, term222692.getClass(), "pos", -2147483648);
        setIntField(term222692, term222692.getClass(), "length", -2147483647);
        setField(term222510, term222510.getClass(), "reader", term222692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term222510, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


