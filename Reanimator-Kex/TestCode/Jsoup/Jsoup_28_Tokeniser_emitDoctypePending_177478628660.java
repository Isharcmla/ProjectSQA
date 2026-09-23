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

public class Tokeniser_emitDoctypePending_177478628660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79710;

    public Tokeniser_emitDoctypePending_177478628660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80753 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term80752 = ((Class) term80753).getDeclaredField((String) "EndTag");
        ((Field) term80752).setAccessible(true);
        Object enum273 = ((Field) term80752).get((Object) null);
        term79710 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term79776 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term79776, term79776.getClass(), "type", enum273);
        setField(term79710, term79710.getClass(), "doctypePending", term79776);
        setBooleanField(term79710, term79710.getClass(), "isEmitPending", false);
        setField(term79710, term79710.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitDoctypePending", argTypes, term79710, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


