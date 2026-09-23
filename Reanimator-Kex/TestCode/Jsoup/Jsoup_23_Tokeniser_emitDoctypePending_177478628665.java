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

public class Tokeniser_emitDoctypePending_177478628665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82240;

    public Tokeniser_emitDoctypePending_177478628665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83857 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term83856 = ((Class) term83857).getDeclaredField((String) "EndTag");
        ((Field) term83856).setAccessible(true);
        Object enum279 = ((Field) term83856).get((Object) null);
        term82240 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term82306 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term82306, term82306.getClass(), "type", enum279);
        setField(term82240, term82240.getClass(), "doctypePending", term82306);
        setBooleanField(term82240, term82240.getClass(), "isEmitPending", false);
        setField(term82240, term82240.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitDoctypePending", argTypes, term82240, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


