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

public class Tokeniser_read_37425894277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89601;

    public Tokeniser_read_37425894277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92811 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term92810 = ((Class) term92811).getDeclaredField((String) "BeforeDoctypeName");
        ((Field) term92810).setAccessible(true);
        Object enum282 = ((Field) term92810).get((Object) null);
        term89601 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term89669 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term89601, term89601.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term89669, term89669.getClass(), "maxSize", 2147483647);
        setField(term89601, term89601.getClass(), "errors", term89669);
        setBooleanField(term89601, term89601.getClass(), "isEmitPending", false);
        setField(term89601, term89601.getClass(), "state", enum282);
        setField(term89601, term89601.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term89601, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


