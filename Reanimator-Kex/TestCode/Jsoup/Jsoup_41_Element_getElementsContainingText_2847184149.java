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
     Object term29740;
     Object term29736;

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
        ArrayList term29744 = new ArrayList();
        LinkedHashMap term29747 = new LinkedHashMap();
        term29740 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term29741 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term29746 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term29741, term29741.getClass(), "tagName", "HHQcYMSBVc");
        setBooleanField(term29741, term29741.getClass(), "isBlock", false);
        setBooleanField(term29741, term29741.getClass(), "formatAsBlock", false);
        setBooleanField(term29741, term29741.getClass(), "canContainBlock", true);
        setBooleanField(term29741, term29741.getClass(), "canContainInline", true);
        setBooleanField(term29741, term29741.getClass(), "empty", false);
        setBooleanField(term29741, term29741.getClass(), "selfClosing", true);
        setBooleanField(term29741, term29741.getClass(), "preserveWhitespace", true);
        setBooleanField(term29741, term29741.getClass(), "formList", false);
        setBooleanField(term29741, term29741.getClass(), "formSubmit", false);
        setField(term29740, term29740.getClass(), "tag", term29741);
        setField(term29740, term29740.getClass(), "parentNode", null);
        setField(term29740, term29740.getClass(), "childNodes", term29744);
        setField(term29746, term29746.getClass(), "attributes", term29747);
        setField(term29740, term29740.getClass(), "attributes", term29746);
        setField(term29740, term29740.getClass(), "baseUri", "nRvKihUSPj");
        setIntField(term29740, term29740.getClass(), "siblingIndex", -1347665717);
        term29736 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term29737 = (Object[]) newArray("java.lang.Object", 0);
        setField(term29736, term29736.getClass(), "elementData", term29737);
        setIntField(term29736, term29736.getClass(), "size", 0);
        setIntField(term29736, term29736.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BbNeQJpYPr";
        Object retValue = callMethod(klass, "getElementsContainingText", argTypes, term4769, args);
        assertTrue(recursiveEquals(term4769, term29740));
        assertTrue(recursiveEquals(retValue, term29736));
    }

};


