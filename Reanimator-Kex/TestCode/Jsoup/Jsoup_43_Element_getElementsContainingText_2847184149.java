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

public class Element_getElementsContainingText_2847184149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4769;
     Object term29565;
     Object term29561;

    public Element_getElementsContainingText_2847184149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4792 = new ArrayList();
        LinkedHashMap term4797 = new LinkedHashMap();
        term4769 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4770 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4796 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4770, term4770.getClass(), "tagName", "HHQcYMSBVc");
        setBooleanField(term4770, term4770.getClass(), "isBlock", false);
        setBooleanField(term4770, term4770.getClass(), "formatAsBlock", false);
        setBooleanField(term4770, term4770.getClass(), "canContainBlock", true);
        setBooleanField(term4770, term4770.getClass(), "canContainInline", true);
        setBooleanField(term4770, term4770.getClass(), "empty", false);
        setBooleanField(term4770, term4770.getClass(), "selfClosing", true);
        setBooleanField(term4770, term4770.getClass(), "preserveWhitespace", true);
        setBooleanField(term4770, term4770.getClass(), "formList", false);
        setBooleanField(term4770, term4770.getClass(), "formSubmit", false);
        setField(term4769, term4769.getClass(), "tag", term4770);
        setField(term4769, term4769.getClass(), "parentNode", null);
        setField(term4769, term4769.getClass(), "childNodes", term4792);
        setField(term4796, term4796.getClass(), "attributes", term4797);
        setField(term4769, term4769.getClass(), "attributes", term4796);
        setField(term4769, term4769.getClass(), "baseUri", "nRvKihUSPj");
        setIntField(term4769, term4769.getClass(), "siblingIndex", -1347665717);
        ArrayList term29569 = new ArrayList();
        LinkedHashMap term29572 = new LinkedHashMap();
        term29565 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term29566 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term29571 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term29566, term29566.getClass(), "tagName", "HHQcYMSBVc");
        setBooleanField(term29566, term29566.getClass(), "isBlock", false);
        setBooleanField(term29566, term29566.getClass(), "formatAsBlock", false);
        setBooleanField(term29566, term29566.getClass(), "canContainBlock", true);
        setBooleanField(term29566, term29566.getClass(), "canContainInline", true);
        setBooleanField(term29566, term29566.getClass(), "empty", false);
        setBooleanField(term29566, term29566.getClass(), "selfClosing", true);
        setBooleanField(term29566, term29566.getClass(), "preserveWhitespace", true);
        setBooleanField(term29566, term29566.getClass(), "formList", false);
        setBooleanField(term29566, term29566.getClass(), "formSubmit", false);
        setField(term29565, term29565.getClass(), "tag", term29566);
        setField(term29565, term29565.getClass(), "parentNode", null);
        setField(term29565, term29565.getClass(), "childNodes", term29569);
        setField(term29571, term29571.getClass(), "attributes", term29572);
        setField(term29565, term29565.getClass(), "attributes", term29571);
        setField(term29565, term29565.getClass(), "baseUri", "nRvKihUSPj");
        setIntField(term29565, term29565.getClass(), "siblingIndex", -1347665717);
        term29561 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term29562 = (Object[]) newArray("java.lang.Object", 0);
        setField(term29561, term29561.getClass(), "elementData", term29562);
        setIntField(term29561, term29561.getClass(), "size", 0);
        setIntField(term29561, term29561.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BbNeQJpYPr";
        Object retValue = callMethod(klass, "getElementsContainingText", argTypes, term4769, args);
        assertTrue(recursiveEquals(term4769, term29565));
        assertTrue(recursiveEquals(retValue, term29561));
    }

};


