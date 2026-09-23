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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_196792529234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180264;
     Object term180382;

    public XmlTreeBuilder_insert_196792529234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180316 = new ArrayList();
        term180264 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term180264, term180264.getClass(), "stack", term180316);
        char[] term180126 = (char[]) newCharArray(10);
        setCharElement(term180126, 0, (char) 1);
        StringBuilder term180442 = new StringBuilder();
        ((StringBuilder) term180442).append(term180126);
        term180382 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term180382, term180382.getClass(), "data", term180442);
        setBooleanField(term180382, term180382.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term180382;
        try {
            callMethod(klass, "insert", argTypes, term180264, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


