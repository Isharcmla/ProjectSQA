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

public class Tokeniser_read_37425894290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99834;

    public Tokeniser_read_37425894290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term100630 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term100629 = ((Class) term100630).getDeclaredField((String) "BeforeDoctypeName");
        ((Field) term100629).setAccessible(true);
        Object enum287 = ((Field) term100629).get((Object) null);
        term99834 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term99902 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term99834, term99834.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term99902, term99902.getClass(), "maxSize", 2147483647);
        setField(term99834, term99834.getClass(), "errors", term99902);
        setBooleanField(term99834, term99834.getClass(), "isEmitPending", false);
        setField(term99834, term99834.getClass(), "state", enum287);
        setField(term99834, term99834.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term99834, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


