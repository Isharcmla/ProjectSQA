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

public class Tokeniser_read_374258942110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107068;

    public Tokeniser_read_374258942110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107855 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term107854 = ((Class) term107855).getDeclaredField((String) "BeforeDoctypeName");
        ((Field) term107854).setAccessible(true);
        Object enum296 = ((Field) term107854).get((Object) null);
        term107068 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term107136 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term107068, term107068.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term107136, term107136.getClass(), "maxSize", 2147483647);
        setField(term107068, term107068.getClass(), "errors", term107136);
        setBooleanField(term107068, term107068.getClass(), "isEmitPending", false);
        setField(term107068, term107068.getClass(), "state", enum296);
        setField(term107068, term107068.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term107068, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


