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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.util.LinkedList;

public class Parser_popStackToClose_120125886737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30176;
     Object term30237;

    public Parser_popStackToClose_120125886737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term30230 = new LinkedList();
        term30176 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term30176, term30176.getClass(), "stack", term30230);
        LinkedList term30238 = new LinkedList();
        term30237 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term30237, term30237.getClass(), "stack", term30238);
        setField(term30237, term30237.getClass(), "tq", null);
        setField(term30237, term30237.getClass(), "doc", null);
        setField(term30237, term30237.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "popStackToClose", argTypes, term30176, args);
        assertTrue(recursiveEquals(term30176, term30237));
        assertTrue(recursiveEquals(retValue, null));
    }

};


