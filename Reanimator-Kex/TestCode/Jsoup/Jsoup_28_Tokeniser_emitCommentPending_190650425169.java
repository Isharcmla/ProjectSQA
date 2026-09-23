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

public class Tokeniser_emitCommentPending_190650425169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82155;

    public Tokeniser_emitCommentPending_190650425169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83370 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term83369 = ((Class) term83370).getDeclaredField((String) "StartTag");
        ((Field) term83369).setAccessible(true);
        Object enum275 = ((Field) term83369).get((Object) null);
        term82155 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term82221 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term82393 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term82221, term82221.getClass(), "type", enum275);
        setField(term82155, term82155.getClass(), "commentPending", term82221);
        setBooleanField(term82155, term82155.getClass(), "isEmitPending", false);
        setField(term82155, term82155.getClass(), "emitPending", term82393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitCommentPending", argTypes, term82155, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


