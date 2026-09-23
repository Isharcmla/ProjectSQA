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
import java.lang.String;
import java.lang.Object;

public class Tokeniser_emit_1272425389105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204950;
     Object term205016;

    public Tokeniser_emit_1272425389105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204950 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term204950, term204950.getClass(), "isEmitPending", false);
        setField(term204950, term204950.getClass(), "emitPending", null);
        Class<? extends Object> term206103 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term206102 = ((Class) term206103).getDeclaredField((String) "EndTag");
        ((Field) term206102).setAccessible(true);
        Object enum773 = ((Field) term206102).get((Object) null);
        term205016 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term205016, term205016.getClass(), "type", enum773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term205016;
        try {
            callMethod(klass, "emit", argTypes, term204950, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


