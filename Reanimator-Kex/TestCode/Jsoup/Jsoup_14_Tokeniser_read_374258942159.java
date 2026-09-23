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

public class Tokeniser_read_374258942159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242281;

    public Tokeniser_read_374258942159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term242971 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term242970 = ((Class) term242971).getDeclaredField((String) "CharacterReferenceInData");
        ((Field) term242970).setAccessible(true);
        Object enum812 = ((Field) term242970).get((Object) null);
        term242281 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term242281, term242281.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term242281, term242281.getClass(), "trackErrors", false);
        setBooleanField(term242281, term242281.getClass(), "isEmitPending", false);
        setField(term242281, term242281.getClass(), "state", enum812);
        setField(term242281, term242281.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term242281, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


