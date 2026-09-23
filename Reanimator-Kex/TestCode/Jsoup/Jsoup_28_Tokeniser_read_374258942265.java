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

public class Tokeniser_read_374258942265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259352;

    public Tokeniser_read_374258942265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term260038 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term260037 = ((Class) term260038).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term260037).setAccessible(true);
        Object enum403 = ((Field) term260037).get((Object) null);
        term259352 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term259534 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term259352, term259352.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term259352, term259352.getClass(), "isEmitPending", false);
        setField(term259352, term259352.getClass(), "state", enum403);
        setIntField(term259534, term259534.getClass(), "pos", -2147483648);
        setIntField(term259534, term259534.getClass(), "length", -2147483648);
        setField(term259352, term259352.getClass(), "reader", term259534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term259352, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


