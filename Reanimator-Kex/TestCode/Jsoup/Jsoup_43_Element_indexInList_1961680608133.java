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
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Element_indexInList_1961680608133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3020;
     Object term3072;
     Object term20531;
     Object term20541;

    public Element_indexInList_1961680608133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3043 = new ArrayList();
        LinkedHashMap term3048 = new LinkedHashMap();
        term3020 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3021 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3047 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3021, term3021.getClass(), "tagName", "hOncybyCAH");
        setBooleanField(term3021, term3021.getClass(), "isBlock", false);
        setBooleanField(term3021, term3021.getClass(), "formatAsBlock", true);
        setBooleanField(term3021, term3021.getClass(), "canContainBlock", true);
        setBooleanField(term3021, term3021.getClass(), "canContainInline", true);
        setBooleanField(term3021, term3021.getClass(), "empty", false);
        setBooleanField(term3021, term3021.getClass(), "selfClosing", true);
        setBooleanField(term3021, term3021.getClass(), "preserveWhitespace", true);
        setBooleanField(term3021, term3021.getClass(), "formList", false);
        setBooleanField(term3021, term3021.getClass(), "formSubmit", true);
        setField(term3020, term3020.getClass(), "tag", term3021);
        setField(term3020, term3020.getClass(), "parentNode", null);
        setField(term3020, term3020.getClass(), "childNodes", term3043);
        setField(term3047, term3047.getClass(), "attributes", term3048);
        setField(term3020, term3020.getClass(), "attributes", term3047);
        setField(term3020, term3020.getClass(), "baseUri", "tlQSNgTkQX");
        setIntField(term3020, term3020.getClass(), "siblingIndex", 1962444399);
        ArrayList term3087 = new ArrayList();
        LinkedHashMap term3092 = new LinkedHashMap();
        Object term3075 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3076 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3091 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3076, term3076.getClass(), "tagName", "");
        setBooleanField(term3076, term3076.getClass(), "isBlock", false);
        setBooleanField(term3076, term3076.getClass(), "formatAsBlock", true);
        setBooleanField(term3076, term3076.getClass(), "canContainBlock", false);
        setBooleanField(term3076, term3076.getClass(), "canContainInline", false);
        setBooleanField(term3076, term3076.getClass(), "empty", true);
        setBooleanField(term3076, term3076.getClass(), "selfClosing", false);
        setBooleanField(term3076, term3076.getClass(), "preserveWhitespace", false);
        setBooleanField(term3076, term3076.getClass(), "formList", true);
        setBooleanField(term3076, term3076.getClass(), "formSubmit", true);
        setField(term3075, term3075.getClass(), "tag", term3076);
        setField(term3075, term3075.getClass(), "parentNode", null);
        setField(term3075, term3075.getClass(), "childNodes", term3087);
        setField(term3091, term3091.getClass(), "attributes", term3092);
        setField(term3075, term3075.getClass(), "attributes", term3091);
        setField(term3075, term3075.getClass(), "baseUri", "SFqCrhEWLm");
        setIntField(term3075, term3075.getClass(), "siblingIndex", 767834723);
        term3072 = new LinkedList();
        ((LinkedList) term3072).add(term3075);
        ArrayList term20535 = new ArrayList();
        LinkedHashMap term20538 = new LinkedHashMap();
        term20531 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20532 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20537 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20532, term20532.getClass(), "tagName", "hOncybyCAH");
        setBooleanField(term20532, term20532.getClass(), "isBlock", false);
        setBooleanField(term20532, term20532.getClass(), "formatAsBlock", true);
        setBooleanField(term20532, term20532.getClass(), "canContainBlock", true);
        setBooleanField(term20532, term20532.getClass(), "canContainInline", true);
        setBooleanField(term20532, term20532.getClass(), "empty", false);
        setBooleanField(term20532, term20532.getClass(), "selfClosing", true);
        setBooleanField(term20532, term20532.getClass(), "preserveWhitespace", true);
        setBooleanField(term20532, term20532.getClass(), "formList", false);
        setBooleanField(term20532, term20532.getClass(), "formSubmit", true);
        setField(term20531, term20531.getClass(), "tag", term20532);
        setField(term20531, term20531.getClass(), "parentNode", null);
        setField(term20531, term20531.getClass(), "childNodes", term20535);
        setField(term20537, term20537.getClass(), "attributes", term20538);
        setField(term20531, term20531.getClass(), "attributes", term20537);
        setField(term20531, term20531.getClass(), "baseUri", "tlQSNgTkQX");
        setIntField(term20531, term20531.getClass(), "siblingIndex", 1962444399);
        ArrayList term20546 = new ArrayList();
        LinkedHashMap term20549 = new LinkedHashMap();
        Object term20543 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20544 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20548 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20544, term20544.getClass(), "tagName", "");
        setBooleanField(term20544, term20544.getClass(), "isBlock", false);
        setBooleanField(term20544, term20544.getClass(), "formatAsBlock", true);
        setBooleanField(term20544, term20544.getClass(), "canContainBlock", false);
        setBooleanField(term20544, term20544.getClass(), "canContainInline", false);
        setBooleanField(term20544, term20544.getClass(), "empty", true);
        setBooleanField(term20544, term20544.getClass(), "selfClosing", false);
        setBooleanField(term20544, term20544.getClass(), "preserveWhitespace", false);
        setBooleanField(term20544, term20544.getClass(), "formList", true);
        setBooleanField(term20544, term20544.getClass(), "formSubmit", true);
        setField(term20543, term20543.getClass(), "tag", term20544);
        setField(term20543, term20543.getClass(), "parentNode", null);
        setField(term20543, term20543.getClass(), "childNodes", term20546);
        setField(term20548, term20548.getClass(), "attributes", term20549);
        setField(term20543, term20543.getClass(), "attributes", term20548);
        setField(term20543, term20543.getClass(), "baseUri", "SFqCrhEWLm");
        setIntField(term20543, term20543.getClass(), "siblingIndex", 767834723);
        term20541 = new LinkedList();
        ((LinkedList) term20541).add(term20543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term3020;
        args[1] = term3072;
        Object retValue = callMethod(klass, "indexInList", argTypes, null, args);
        assertTrue(recursiveEquals(term3020, term20531));
        assertTrue(recursiveEquals(term3072, term20541));
        assertTrue(recursiveEquals(retValue, null));
    }

};


