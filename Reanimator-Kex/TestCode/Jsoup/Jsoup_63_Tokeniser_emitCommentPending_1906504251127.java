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

public class Tokeniser_emitCommentPending_1906504251127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156414;

    public Tokeniser_emitCommentPending_1906504251127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term158099 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term158098 = ((Class) term158099).getDeclaredField((String) "StartTag");
        ((Field) term158098).setAccessible(true);
        Object enum439 = ((Field) term158098).get((Object) null);
        term156414 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term156480 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term156654 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term156480, term156480.getClass(), "type", enum439);
        setField(term156414, term156414.getClass(), "commentPending", term156480);
        setBooleanField(term156414, term156414.getClass(), "isEmitPending", false);
        setField(term156414, term156414.getClass(), "emitPending", term156654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitCommentPending", argTypes, term156414, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


