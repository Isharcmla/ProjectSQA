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

public class Tokeniser_read_37425894293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199093;

    public Tokeniser_read_37425894293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term199675 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term199674 = ((Class) term199675).getDeclaredField((String) "RcdataLessthanSign");
        ((Field) term199674).setAccessible(true);
        Object enum765 = ((Field) term199674).get((Object) null);
        term199093 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term199093, term199093.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term199093, term199093.getClass(), "isEmitPending", false);
        setField(term199093, term199093.getClass(), "state", enum765);
        setField(term199093, term199093.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term199093, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


