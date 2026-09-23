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

public class Tokeniser_emitCommentPending_1906504251110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206919;

    public Tokeniser_emitCommentPending_1906504251110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term208497 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term208496 = ((Class) term208497).getDeclaredField((String) "StartTag");
        ((Field) term208496).setAccessible(true);
        Object enum776 = ((Field) term208496).get((Object) null);
        term206919 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term206985 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term207157 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term206985, term206985.getClass(), "type", enum776);
        setField(term206919, term206919.getClass(), "commentPending", term206985);
        setBooleanField(term206919, term206919.getClass(), "isEmitPending", false);
        setField(term206919, term206919.getClass(), "emitPending", term207157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitCommentPending", argTypes, term206919, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


