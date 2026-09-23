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

public class Tokeniser_read_374258942235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199212;

    public Tokeniser_read_374258942235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term199821 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term199820 = ((Class) term199821).getDeclaredField((String) "ScriptDataEscapedEndTagName");
        ((Field) term199820).setAccessible(true);
        Object enum368 = ((Field) term199820).get((Object) null);
        term199212 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term199212, term199212.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term199212, term199212.getClass(), "isEmitPending", false);
        setField(term199212, term199212.getClass(), "state", enum368);
        setField(term199212, term199212.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term199212, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


