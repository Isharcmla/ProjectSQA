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

public class Tokeniser_read_374258942161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169245;

    public Tokeniser_read_374258942161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term169827 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term169826 = ((Class) term169827).getDeclaredField((String) "RcdataLessthanSign");
        ((Field) term169826).setAccessible(true);
        Object enum450 = ((Field) term169826).get((Object) null);
        term169245 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term169245, term169245.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term169245, term169245.getClass(), "isEmitPending", false);
        setField(term169245, term169245.getClass(), "state", enum450);
        setField(term169245, term169245.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term169245, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


