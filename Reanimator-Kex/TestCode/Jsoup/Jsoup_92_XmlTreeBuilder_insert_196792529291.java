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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_196792529291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217159;
     Object term217315;

    public XmlTreeBuilder_insert_196792529291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term217249 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term217211 = new ArrayList();
        ((ArrayList) term217211).add(term217249);
        term217159 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term217159, term217159.getClass(), "stack", term217211);
        char[] term217012 = (char[]) newCharArray(0);
        StringBuilder term217375 = new StringBuilder();
        ((StringBuilder) term217375).append(term217012);
        term217315 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term217315, term217315.getClass(), "data", term217375);
        setBooleanField(term217315, term217315.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term217315;
        try {
            callMethod(klass, "insert", argTypes, term217159, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


