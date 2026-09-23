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

public class Tokeniser_read_374258942285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249751;

    public Tokeniser_read_374258942285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term250432 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term250431 = ((Class) term250432).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term250431).setAccessible(true);
        Object enum507 = ((Field) term250431).get((Object) null);
        term249751 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term249933 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term249751, term249751.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term249751, term249751.getClass(), "isEmitPending", false);
        setField(term249751, term249751.getClass(), "state", enum507);
        setIntField(term249933, term249933.getClass(), "bufPos", -2147483648);
        setIntField(term249933, term249933.getClass(), "bufSplitPoint", -2147483648);
        setField(term249751, term249751.getClass(), "reader", term249933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term249751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


