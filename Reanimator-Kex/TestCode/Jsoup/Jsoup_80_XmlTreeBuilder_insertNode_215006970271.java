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

public class XmlTreeBuilder_insertNode_215006970271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321954;
     Object term322158;

    public XmlTreeBuilder_insertNode_215006970271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term322044 = newInstance(Class.forName("java.lang.Object"));
        Object term322098 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term322006 = new ArrayList();
        ((ArrayList) term322006).add(term322044);
        ((ArrayList) term322006).add(term322098);
        term321954 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term321954, term321954.getClass(), "stack", term322006);
        term322158 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term322210 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term322210, term322210.getClass(), "childNodes", null);
        setField(term322158, term322158.getClass(), "parentNode", term322210);
        setIntField(term322158, term322158.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term322158;
        try {
            callMethod(klass, "insertNode", argTypes, term321954, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


