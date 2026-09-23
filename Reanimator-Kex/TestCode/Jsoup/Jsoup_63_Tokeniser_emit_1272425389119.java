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

public class Tokeniser_emit_1272425389119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151560;
     Object term151626;

    public Tokeniser_emit_1272425389119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151560 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term151560, term151560.getClass(), "isEmitPending", false);
        setField(term151560, term151560.getClass(), "emitPending", null);
        Class<? extends Object> term152485 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term152484 = ((Class) term152485).getDeclaredField((String) "EndTag");
        ((Field) term152484).setAccessible(true);
        Object enum433 = ((Field) term152484).get((Object) null);
        term151626 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term151626, term151626.getClass(), "type", enum433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term151626;
        try {
            callMethod(klass, "emit", argTypes, term151560, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


