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

public class Tokeniser_read_374258942167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144761;

    public Tokeniser_read_374258942167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term145345 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term145344 = ((Class) term145345).getDeclaredField((String) "RcdataLessthanSign");
        ((Field) term145344).setAccessible(true);
        Object enum322 = ((Field) term145344).get((Object) null);
        term144761 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term144761, term144761.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term144761, term144761.getClass(), "isEmitPending", false);
        setField(term144761, term144761.getClass(), "state", enum322);
        setField(term144761, term144761.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term144761, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


