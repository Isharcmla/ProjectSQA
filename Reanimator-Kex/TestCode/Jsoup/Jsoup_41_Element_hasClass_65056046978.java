package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_hasClass_65056046978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6496;

    public Element_hasClass_65056046978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6519 = new ArrayList();
        LinkedHashMap term6524 = new LinkedHashMap();
        term6496 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6497 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6523 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6497, term6497.getClass(), "tagName", "huVIXUWLtI");
        setBooleanField(term6497, term6497.getClass(), "isBlock", false);
        setBooleanField(term6497, term6497.getClass(), "formatAsBlock", true);
        setBooleanField(term6497, term6497.getClass(), "canContainBlock", true);
        setBooleanField(term6497, term6497.getClass(), "canContainInline", true);
        setBooleanField(term6497, term6497.getClass(), "empty", false);
        setBooleanField(term6497, term6497.getClass(), "selfClosing", true);
        setBooleanField(term6497, term6497.getClass(), "preserveWhitespace", true);
        setBooleanField(term6497, term6497.getClass(), "formList", true);
        setBooleanField(term6497, term6497.getClass(), "formSubmit", false);
        setField(term6496, term6496.getClass(), "tag", term6497);
        setField(term6496, term6496.getClass(), "parentNode", null);
        setField(term6496, term6496.getClass(), "childNodes", term6519);
        setField(term6523, term6523.getClass(), "attributes", term6524);
        setField(term6496, term6496.getClass(), "attributes", term6523);
        setField(term6496, term6496.getClass(), "baseUri", "SScVQYSvWH");
        setIntField(term6496, term6496.getClass(), "siblingIndex", 11724947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MnovcqFhCl";
        callMethod(klass, "hasClass", argTypes, term6496, args);
    }

};


