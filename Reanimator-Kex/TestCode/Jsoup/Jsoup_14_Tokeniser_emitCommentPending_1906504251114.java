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

public class Tokeniser_emitCommentPending_1906504251114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209999;

    public Tokeniser_emitCommentPending_1906504251114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term213123 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term213122 = ((Class) term213123).getDeclaredField((String) "EndTag");
        ((Field) term213122).setAccessible(true);
        Object enum780 = ((Field) term213122).get((Object) null);
        term209999 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term210065 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term210065, term210065.getClass(), "type", enum780);
        setField(term209999, term209999.getClass(), "commentPending", term210065);
        setBooleanField(term209999, term209999.getClass(), "isEmitPending", false);
        setField(term209999, term209999.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitCommentPending", argTypes, term209999, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


