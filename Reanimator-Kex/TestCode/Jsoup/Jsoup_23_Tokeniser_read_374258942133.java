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

public class Tokeniser_read_374258942133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117134;

    public Tokeniser_read_374258942133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term117797 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term117796 = ((Class) term117797).getDeclaredField((String) "BeforeDoctypeName");
        ((Field) term117796).setAccessible(true);
        Object enum305 = ((Field) term117796).get((Object) null);
        term117134 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term117202 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term117134, term117134.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term117202, term117202.getClass(), "maxSize", 2147483647);
        setField(term117134, term117134.getClass(), "errors", term117202);
        setBooleanField(term117134, term117134.getClass(), "isEmitPending", false);
        setField(term117134, term117134.getClass(), "state", enum305);
        setField(term117134, term117134.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term117134, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


