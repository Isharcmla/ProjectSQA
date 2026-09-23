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
import java.lang.Object;
import java.lang.String;

public class Tokeniser_read_37425894280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91674;

    public Tokeniser_read_37425894280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92531 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term92530 = ((Class) term92531).getDeclaredField((String) "BeforeDoctypeName");
        ((Field) term92530).setAccessible(true);
        Object enum285 = ((Field) term92530).get((Object) null);
        term91674 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term91742 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term91674, term91674.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term91742, term91742.getClass(), "maxSize", 2147483647);
        setField(term91674, term91674.getClass(), "errors", term91742);
        setBooleanField(term91674, term91674.getClass(), "isEmitPending", false);
        setField(term91674, term91674.getClass(), "state", enum285);
        setField(term91674, term91674.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term91674, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


