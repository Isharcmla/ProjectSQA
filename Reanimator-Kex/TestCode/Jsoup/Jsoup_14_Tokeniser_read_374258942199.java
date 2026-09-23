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
     Object term296150;

    public Tokeniser_read_374258942199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term296841 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term296840 = ((Class) term296841).getDeclaredField((String) "Doctype");
        ((Field) term296840).setAccessible(true);
        Object enum864 = ((Field) term296840).get((Object) null);
        term296150 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term296332 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term296150, term296150.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term296150, term296150.getClass(), "trackErrors", false);
        setBooleanField(term296150, term296150.getClass(), "isEmitPending", false);
        setField(term296150, term296150.getClass(), "state", enum864);
        setIntField(term296332, term296332.getClass(), "pos", -2147483648);
        setIntField(term296332, term296332.getClass(), "length", -2147483647);
        setField(term296150, term296150.getClass(), "reader", term296332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term296150, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


