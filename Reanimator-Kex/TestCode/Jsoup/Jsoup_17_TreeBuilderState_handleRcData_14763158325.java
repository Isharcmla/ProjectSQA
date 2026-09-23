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

public class TreeBuilderState_handleRcData_14763158325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50846;
     Object term51004;

    public TreeBuilderState_handleRcData_14763158325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50846 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term50942 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term50846, term50846.getClass(), "selfClosing", false);
        setField(term50846, term50846.getClass(), "tagName", "                 ");
        setField(term50846, term50846.getClass(), "attributes", term50942);
        term51004 = newInstance(Class.forName("org.jsoup.parser.TreeBuilder"));
        Object term51124 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term51004, term51004.getClass(), "baseUri", "");
        setField(term51004, term51004.getClass(), "stack", term51124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.TreeBuilder");
        Object[] args = new Object[2];
        args[0] = term50846;
        args[1] = term51004;
        try {
            callMethod(klass, "handleRcData", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


