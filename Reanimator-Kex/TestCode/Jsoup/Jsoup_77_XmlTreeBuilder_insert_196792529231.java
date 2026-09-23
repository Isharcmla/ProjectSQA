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

public class XmlTreeBuilder_insert_196792529231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177242;
     Object term177398;

    public XmlTreeBuilder_insert_196792529231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term177332 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term177294 = new ArrayList();
        ((ArrayList) term177294).add(term177332);
        term177242 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term177242, term177242.getClass(), "stack", term177294);
        char[] term177097 = (char[]) newCharArray(0);
        StringBuilder term177458 = new StringBuilder();
        ((StringBuilder) term177458).append(term177097);
        term177398 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term177398, term177398.getClass(), "data", term177458);
        setBooleanField(term177398, term177398.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term177398;
        try {
            callMethod(klass, "insert", argTypes, term177242, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


