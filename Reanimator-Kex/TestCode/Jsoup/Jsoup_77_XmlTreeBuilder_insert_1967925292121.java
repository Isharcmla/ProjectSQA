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
import java.lang.Object;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_1967925292121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235238;
     Object term235454;

    public XmlTreeBuilder_insert_1967925292121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term235328 = newInstance(Class.forName("java.lang.Object"));
        Object term235388 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        ArrayList term235290 = new ArrayList();
        ((ArrayList) term235290).add((Object)null);
        ((ArrayList) term235290).add((Object)null);
        ((ArrayList) term235290).add(term235328);
        ((ArrayList) term235290).add(term235388);
        term235238 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term235238, term235238.getClass(), "stack", term235290);
        char[] term235080 = (char[]) newCharArray(0);
        StringBuilder term235514 = new StringBuilder();
        ((StringBuilder) term235514).append(term235080);
        term235454 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term235454, term235454.getClass(), "data", term235514);
        setBooleanField(term235454, term235454.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term235454;
        try {
            callMethod(klass, "insert", argTypes, term235238, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


