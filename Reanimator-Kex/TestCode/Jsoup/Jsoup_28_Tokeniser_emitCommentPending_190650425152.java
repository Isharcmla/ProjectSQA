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

public class Tokeniser_emitCommentPending_190650425152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77032;

    public Tokeniser_emitCommentPending_190650425152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78255 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term78254 = ((Class) term78255).getDeclaredField((String) "EndTag");
        ((Field) term78254).setAccessible(true);
        Object enum269 = ((Field) term78254).get((Object) null);
        term77032 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term77098 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term77098, term77098.getClass(), "type", enum269);
        setField(term77032, term77032.getClass(), "commentPending", term77098);
        setBooleanField(term77032, term77032.getClass(), "isEmitPending", false);
        setField(term77032, term77032.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitCommentPending", argTypes, term77032, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


