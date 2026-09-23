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

public class Tokeniser_emitDoctypePending_177478628652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78316;

    public Tokeniser_emitDoctypePending_177478628652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79342 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term79341 = ((Class) term79342).getDeclaredField((String) "StartTag");
        ((Field) term79341).setAccessible(true);
        Object enum273 = ((Field) term79341).get((Object) null);
        term78316 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term78382 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term78548 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term78382, term78382.getClass(), "type", enum273);
        setField(term78316, term78316.getClass(), "doctypePending", term78382);
        setBooleanField(term78316, term78316.getClass(), "isEmitPending", false);
        setField(term78316, term78316.getClass(), "emitPending", term78548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitDoctypePending", argTypes, term78316, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


