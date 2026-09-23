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
import static org.jsoup.nodes.EqualityUtils.*;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.ArrayList;

public class Element_init_97793489092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term33;
     Object term17825;
     Object term17837;
     Object term17839;

    public Element_init_97793489092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1, term1.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term1, term1.getClass(), "isBlock", false);
        setBooleanField(term1, term1.getClass(), "formatAsBlock", false);
        setBooleanField(term1, term1.getClass(), "canContainBlock", false);
        setBooleanField(term1, term1.getClass(), "canContainInline", false);
        setBooleanField(term1, term1.getClass(), "empty", true);
        setBooleanField(term1, term1.getClass(), "selfClosing", true);
        setBooleanField(term1, term1.getClass(), "preserveWhitespace", true);
        LinkedHashMap term34 = new LinkedHashMap();
        term33 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term33, term33.getClass(), "attributes", term34);
        ArrayList term17829 = new ArrayList();
        LinkedHashMap term17832 = new LinkedHashMap();
        term17825 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term17826 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term17831 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17826, term17826.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term17826, term17826.getClass(), "isBlock", false);
        setBooleanField(term17826, term17826.getClass(), "formatAsBlock", false);
        setBooleanField(term17826, term17826.getClass(), "canContainBlock", false);
        setBooleanField(term17826, term17826.getClass(), "canContainInline", false);
        setBooleanField(term17826, term17826.getClass(), "empty", true);
        setBooleanField(term17826, term17826.getClass(), "selfClosing", true);
        setBooleanField(term17826, term17826.getClass(), "preserveWhitespace", true);
        setField(term17825, term17825.getClass(), "tag", term17826);
        setField(term17825, term17825.getClass(), "classNames", null);
        setField(term17825, term17825.getClass(), "parentNode", null);
        setField(term17825, term17825.getClass(), "childNodes", term17829);
        setField(term17831, term17831.getClass(), "attributes", term17832);
        setField(term17825, term17825.getClass(), "attributes", term17831);
        setField(term17825, term17825.getClass(), "baseUri", "sjlJAEtRrb");
        setIntField(term17825, term17825.getClass(), "siblingIndex", 0);
        LinkedHashMap term17838 = new LinkedHashMap();
        term17837 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17837, term17837.getClass(), "attributes", term17838);
        term17839 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17839, term17839.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term17839, term17839.getClass(), "isBlock", false);
        setBooleanField(term17839, term17839.getClass(), "formatAsBlock", false);
        setBooleanField(term17839, term17839.getClass(), "canContainBlock", false);
        setBooleanField(term17839, term17839.getClass(), "canContainInline", false);
        setBooleanField(term17839, term17839.getClass(), "empty", true);
        setBooleanField(term17839, term17839.getClass(), "selfClosing", true);
        setBooleanField(term17839, term17839.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = "sjlJAEtRrb";
        args[2] = term33;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17825));
        assertTrue(recursiveEquals(term1, "sjlJAEtRrb"));
        assertTrue(recursiveEquals(term33, term17839));
    }

};


