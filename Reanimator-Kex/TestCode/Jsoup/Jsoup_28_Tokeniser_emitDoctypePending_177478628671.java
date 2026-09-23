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

public class Tokeniser_emitDoctypePending_177478628671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83752;

    public Tokeniser_emitDoctypePending_177478628671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84720 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term84719 = ((Class) term84720).getDeclaredField((String) "StartTag");
        ((Field) term84719).setAccessible(true);
        Object enum277 = ((Field) term84719).get((Object) null);
        term83752 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term83818 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term83992 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term83818, term83818.getClass(), "type", enum277);
        setField(term83752, term83752.getClass(), "doctypePending", term83818);
        setBooleanField(term83752, term83752.getClass(), "isEmitPending", false);
        setField(term83752, term83752.getClass(), "emitPending", term83992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitDoctypePending", argTypes, term83752, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


