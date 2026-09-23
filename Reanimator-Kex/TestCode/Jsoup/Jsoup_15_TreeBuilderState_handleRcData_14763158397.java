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

public class TreeBuilderState_handleRcData_14763158397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204756;
     Object term204914;

    public TreeBuilderState_handleRcData_14763158397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204756 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term204852 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term204756, term204756.getClass(), "selfClosing", false);
        setField(term204756, term204756.getClass(), "tagName", "                 ");
        setField(term204756, term204756.getClass(), "attributes", term204852);
        term204914 = newInstance(Class.forName("org.jsoup.parser.TreeBuilder"));
        Object term205034 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term204914, term204914.getClass(), "baseUri", "");
        setField(term204914, term204914.getClass(), "stack", term205034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.TreeBuilder");
        Object[] args = new Object[2];
        args[0] = term204756;
        args[1] = term204914;
        try {
            callMethod(klass, "handleRcData", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


