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
     Object term88899;

    public Tokeniser_read_37425894277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89548 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term89547 = ((Class) term89548).getDeclaredField((String) "BeforeDoctypeName");
        ((Field) term89547).setAccessible(true);
        Object enum283 = ((Field) term89547).get((Object) null);
        term88899 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term88967 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term88899, term88899.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term88967, term88967.getClass(), "maxSize", 2147483647);
        setField(term88899, term88899.getClass(), "errors", term88967);
        setBooleanField(term88899, term88899.getClass(), "isEmitPending", false);
        setField(term88899, term88899.getClass(), "state", enum283);
        setField(term88899, term88899.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term88899, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


