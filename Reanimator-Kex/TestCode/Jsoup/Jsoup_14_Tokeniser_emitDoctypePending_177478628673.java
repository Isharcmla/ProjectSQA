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

public class Tokeniser_emitDoctypePending_177478628673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184328;

    public Tokeniser_emitDoctypePending_177478628673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term185300 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term185299 = ((Class) term185300).getDeclaredField((String) "StartTag");
        ((Field) term185299).setAccessible(true);
        Object enum755 = ((Field) term185299).get((Object) null);
        term184328 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term184394 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term184572 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term184394, term184394.getClass(), "type", enum755);
        setField(term184328, term184328.getClass(), "doctypePending", term184394);
        setBooleanField(term184328, term184328.getClass(), "isEmitPending", false);
        setField(term184328, term184328.getClass(), "emitPending", term184572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitDoctypePending", argTypes, term184328, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


