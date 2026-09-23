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

public class Element_className_78448294279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6462;

    public Element_className_78448294279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6484 = new ArrayList();
        LinkedHashMap term6489 = new LinkedHashMap();
        term6462 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6463 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6488 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6463, term6463.getClass(), "tagName", "KAORSSPSeV");
        setBooleanField(term6463, term6463.getClass(), "isBlock", true);
        setBooleanField(term6463, term6463.getClass(), "formatAsBlock", false);
        setBooleanField(term6463, term6463.getClass(), "canContainInline", true);
        setBooleanField(term6463, term6463.getClass(), "empty", false);
        setBooleanField(term6463, term6463.getClass(), "selfClosing", true);
        setBooleanField(term6463, term6463.getClass(), "preserveWhitespace", true);
        setBooleanField(term6463, term6463.getClass(), "formList", false);
        setBooleanField(term6463, term6463.getClass(), "formSubmit", false);
        setField(term6462, term6462.getClass(), "tag", term6463);
        setField(term6462, term6462.getClass(), "parentNode", null);
        setField(term6462, term6462.getClass(), "childNodes", term6484);
        setField(term6488, term6488.getClass(), "attributes", term6489);
        setField(term6462, term6462.getClass(), "attributes", term6488);
        setField(term6462, term6462.getClass(), "baseUri", "nQhIgWXdRc");
        setIntField(term6462, term6462.getClass(), "siblingIndex", 628918458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "className", argTypes, term6462, args);
    }

};


