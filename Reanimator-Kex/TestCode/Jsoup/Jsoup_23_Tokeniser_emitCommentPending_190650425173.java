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

public class Tokeniser_emitCommentPending_190650425173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85459;

    public Tokeniser_emitCommentPending_190650425173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86351 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term86350 = ((Class) term86351).getDeclaredField((String) "EndTag");
        ((Field) term86350).setAccessible(true);
        Object enum281 = ((Field) term86350).get((Object) null);
        term85459 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term85525 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term85525, term85525.getClass(), "type", enum281);
        setField(term85459, term85459.getClass(), "commentPending", term85525);
        setBooleanField(term85459, term85459.getClass(), "isEmitPending", false);
        setField(term85459, term85459.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitCommentPending", argTypes, term85459, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


