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
import java.util.ArrayList;

public class Tokeniser_read_374258942161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245680;

    public Tokeniser_read_374258942161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term246458 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term246457 = ((Class) term246458).getDeclaredField((String) "CharacterReferenceInData");
        ((Field) term246457).setAccessible(true);
        Object enum815 = ((Field) term246457).get((Object) null);
        ArrayList term245912 = new ArrayList();
        term245680 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term245860 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term245680, term245680.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term245680, term245680.getClass(), "isEmitPending", false);
        setField(term245680, term245680.getClass(), "state", enum815);
        setIntField(term245860, term245860.getClass(), "pos", -2147483648);
        setIntField(term245860, term245860.getClass(), "length", -2147483648);
        setField(term245680, term245680.getClass(), "reader", term245860);
        setBooleanField(term245680, term245680.getClass(), "trackErrors", true);
        setField(term245680, term245680.getClass(), "errors", term245912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term245680, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


