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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_emitDoctypePending_177478628659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134933;

    public Tokeniser_emitDoctypePending_177478628659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term136171 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term136170 = ((Class) term136171).getDeclaredField((String) "StartTag");
        ((Field) term136170).setAccessible(true);
        Object enum423 = ((Field) term136170).get((Object) null);
        term134933 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term134999 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term135173 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term134999, term134999.getClass(), "type", enum423);
        setField(term134933, term134933.getClass(), "doctypePending", term134999);
        setBooleanField(term134933, term134933.getClass(), "isEmitPending", false);
        setField(term134933, term134933.getClass(), "emitPending", term135173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitDoctypePending", argTypes, term134933, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


