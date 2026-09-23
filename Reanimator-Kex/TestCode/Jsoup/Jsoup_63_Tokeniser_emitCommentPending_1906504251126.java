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

public class Tokeniser_emitCommentPending_1906504251126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155874;

    public Tokeniser_emitCommentPending_1906504251126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term157379 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term157378 = ((Class) term157379).getDeclaredField((String) "EndTag");
        ((Field) term157378).setAccessible(true);
        Object enum438 = ((Field) term157378).get((Object) null);
        term155874 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term155940 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term155940, term155940.getClass(), "type", enum438);
        setField(term155874, term155874.getClass(), "commentPending", term155940);
        setBooleanField(term155874, term155874.getClass(), "isEmitPending", false);
        setField(term155874, term155874.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitCommentPending", argTypes, term155874, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


