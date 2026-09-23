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

public class Tokeniser_emitDoctypePending_177478628667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182349;

    public Tokeniser_emitDoctypePending_177478628667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term183242 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term183241 = ((Class) term183242).getDeclaredField((String) "EndTag");
        ((Field) term183241).setAccessible(true);
        Object enum751 = ((Field) term183241).get((Object) null);
        term182349 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term182415 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term182415, term182415.getClass(), "type", enum751);
        setField(term182349, term182349.getClass(), "doctypePending", term182415);
        setBooleanField(term182349, term182349.getClass(), "isEmitPending", false);
        setField(term182349, term182349.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitDoctypePending", argTypes, term182349, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


