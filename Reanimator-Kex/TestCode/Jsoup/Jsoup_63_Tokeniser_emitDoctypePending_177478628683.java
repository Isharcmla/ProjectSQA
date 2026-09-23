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

public class Tokeniser_emitDoctypePending_177478628683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139315;

    public Tokeniser_emitDoctypePending_177478628683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term140349 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term140348 = ((Class) term140349).getDeclaredField((String) "EndTag");
        ((Field) term140348).setAccessible(true);
        Object enum425 = ((Field) term140348).get((Object) null);
        term139315 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term139381 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term139381, term139381.getClass(), "type", enum425);
        setField(term139315, term139315.getClass(), "doctypePending", term139381);
        setBooleanField(term139315, term139315.getClass(), "isEmitPending", false);
        setField(term139315, term139315.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitDoctypePending", argTypes, term139315, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


