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

public class HtmlTreeBuilder_aboveOnStack_665381070219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311945;

    public HtmlTreeBuilder_aboveOnStack_665381070219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term312035 = newInstance(Class.forName("java.lang.Object"));
        Object term312089 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term312141 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term312201 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term312253 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term312305 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term312357 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term311997 = new ArrayList();
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312035);
        ((ArrayList) term311997).add(term312089);
        ((ArrayList) term311997).add(term312141);
        ((ArrayList) term311997).add(term312141);
        ((ArrayList) term311997).add(term312201);
        ((ArrayList) term311997).add(term312253);
        ((ArrayList) term311997).add(term312305);
        ((ArrayList) term311997).add(term312357);
        term311945 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term311945, term311945.getClass(), "stack", term311997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "aboveOnStack", argTypes, term311945, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


