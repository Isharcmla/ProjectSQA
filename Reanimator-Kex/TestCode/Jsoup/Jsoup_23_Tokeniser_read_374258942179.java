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

public class Tokeniser_read_374258942179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139556;

    public Tokeniser_read_374258942179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term140225 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term140224 = ((Class) term140225).getDeclaredField((String) "ScriptDataDoubleEscaped");
        ((Field) term140224).setAccessible(true);
        Object enum325 = ((Field) term140224).get((Object) null);
        term139556 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term139624 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term139556, term139556.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term139624, term139624.getClass(), "maxSize", 2147483647);
        setField(term139556, term139556.getClass(), "errors", term139624);
        setBooleanField(term139556, term139556.getClass(), "isEmitPending", false);
        setField(term139556, term139556.getClass(), "state", enum325);
        setField(term139556, term139556.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term139556, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


