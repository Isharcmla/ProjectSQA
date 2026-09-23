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
     Object term20673;
     Object term20683;

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
        ArrayList term20677 = new ArrayList();
        LinkedHashMap term20680 = new LinkedHashMap();
        term20673 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20674 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20679 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20674, term20674.getClass(), "tagName", "hOncybyCAH");
        setBooleanField(term20674, term20674.getClass(), "isBlock", false);
        setBooleanField(term20674, term20674.getClass(), "formatAsBlock", true);
        setBooleanField(term20674, term20674.getClass(), "canContainBlock", true);
        setBooleanField(term20674, term20674.getClass(), "canContainInline", true);
        setBooleanField(term20674, term20674.getClass(), "empty", false);
        setBooleanField(term20674, term20674.getClass(), "selfClosing", true);
        setBooleanField(term20674, term20674.getClass(), "preserveWhitespace", true);
        setBooleanField(term20674, term20674.getClass(), "formList", false);
        setBooleanField(term20674, term20674.getClass(), "formSubmit", true);
        setField(term20673, term20673.getClass(), "tag", term20674);
        setField(term20673, term20673.getClass(), "parentNode", null);
        setField(term20673, term20673.getClass(), "childNodes", term20677);
        setField(term20679, term20679.getClass(), "attributes", term20680);
        setField(term20673, term20673.getClass(), "attributes", term20679);
        setField(term20673, term20673.getClass(), "baseUri", "tlQSNgTkQX");
        setIntField(term20673, term20673.getClass(), "siblingIndex", 1962444399);
        ArrayList term20688 = new ArrayList();
        LinkedHashMap term20691 = new LinkedHashMap();
        Object term20685 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20686 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20690 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20686, term20686.getClass(), "tagName", "");
        setBooleanField(term20686, term20686.getClass(), "isBlock", false);
        setBooleanField(term20686, term20686.getClass(), "formatAsBlock", true);
        setBooleanField(term20686, term20686.getClass(), "canContainBlock", false);
        setBooleanField(term20686, term20686.getClass(), "canContainInline", false);
        setBooleanField(term20686, term20686.getClass(), "empty", true);
        setBooleanField(term20686, term20686.getClass(), "selfClosing", false);
        setBooleanField(term20686, term20686.getClass(), "preserveWhitespace", false);
        setBooleanField(term20686, term20686.getClass(), "formList", true);
        setBooleanField(term20686, term20686.getClass(), "formSubmit", true);
        setField(term20685, term20685.getClass(), "tag", term20686);
        setField(term20685, term20685.getClass(), "parentNode", null);
        setField(term20685, term20685.getClass(), "childNodes", term20688);
        setField(term20690, term20690.getClass(), "attributes", term20691);
        setField(term20685, term20685.getClass(), "attributes", term20690);
        setField(term20685, term20685.getClass(), "baseUri", "SFqCrhEWLm");
        setIntField(term20685, term20685.getClass(), "siblingIndex", 767834723);
        term20683 = new LinkedList();
        ((LinkedList) term20683).add(term20685);
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
        assertTrue(recursiveEquals(term3020, term20673));
        assertTrue(recursiveEquals(term3072, term20683));
        assertTrue(recursiveEquals(retValue, null));
    }

};


