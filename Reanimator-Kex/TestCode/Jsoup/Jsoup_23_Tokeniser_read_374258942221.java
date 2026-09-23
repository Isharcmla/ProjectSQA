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

public class Tokeniser_read_374258942221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185790;

    public Tokeniser_read_374258942221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term186512 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term186511 = ((Class) term186512).getDeclaredField((String) "AfterAttributeName");
        ((Field) term186511).setAccessible(true);
        Object enum362 = ((Field) term186511).get((Object) null);
        StringBuilder term186032 = new StringBuilder();
        term185790 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term185972 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term185790, term185790.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term185790, term185790.getClass(), "isEmitPending", false);
        setField(term185790, term185790.getClass(), "state", enum362);
        setIntField(term185972, term185972.getClass(), "pos", -2147483648);
        setIntField(term185972, term185972.getClass(), "length", -2147483648);
        setField(term185790, term185790.getClass(), "reader", term185972);
        setField(term185790, term185790.getClass(), "charBuffer", term186032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term185790, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


