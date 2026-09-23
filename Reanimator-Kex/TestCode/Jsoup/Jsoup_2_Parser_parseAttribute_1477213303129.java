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
import java.util.LinkedList;

public class Parser_parseAttribute_1477213303129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72887;

    public Parser_parseAttribute_1477213303129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73091 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term73001 = new LinkedList();
        ((LinkedList) term73001).add(term73091);
        term72887 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term72947 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term72947, term72947.getClass(), "queue", term73001);
        setField(term72887, term72887.getClass(), "tq", term72947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parseAttribute", argTypes, term72887, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


