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

public class Tokeniser_read_374258942253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241453;

    public Tokeniser_read_374258942253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term242114 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term242113 = ((Class) term242114).getDeclaredField((String) "AfterAttributeName");
        ((Field) term242113).setAccessible(true);
        Object enum391 = ((Field) term242113).get((Object) null);
        term241453 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term241633 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term241453, term241453.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term241453, term241453.getClass(), "isEmitPending", false);
        setField(term241453, term241453.getClass(), "state", enum391);
        setIntField(term241633, term241633.getClass(), "pos", -2147483648);
        setIntField(term241633, term241633.getClass(), "length", -2147483647);
        setField(term241453, term241453.getClass(), "reader", term241633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term241453, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


