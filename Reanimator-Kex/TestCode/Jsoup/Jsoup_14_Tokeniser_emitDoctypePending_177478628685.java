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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tokeniser_emitDoctypePending_177478628685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195265;

    public Tokeniser_emitDoctypePending_177478628685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195265 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term195331 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term195265, term195265.getClass(), "doctypePending", term195331);
        setBooleanField(term195265, term195265.getClass(), "isEmitPending", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitDoctypePending", argTypes, term195265, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


