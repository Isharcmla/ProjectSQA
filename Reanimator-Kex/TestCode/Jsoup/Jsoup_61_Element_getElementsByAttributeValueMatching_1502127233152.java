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

public class Element_getElementsByAttributeValueMatching_1502127233152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4601;
     Object term29226;
     Object term29210;

    public Element_getElementsByAttributeValueMatching_1502127233152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4623 = new ArrayList();
        LinkedHashMap term4628 = new LinkedHashMap();
        term4601 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4602 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4627 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4602, term4602.getClass(), "tagName", "PsqusYmejD");
        setBooleanField(term4602, term4602.getClass(), "isBlock", true);
        setBooleanField(term4602, term4602.getClass(), "formatAsBlock", true);
        setBooleanField(term4602, term4602.getClass(), "canContainInline", false);
        setBooleanField(term4602, term4602.getClass(), "empty", true);
        setBooleanField(term4602, term4602.getClass(), "selfClosing", true);
        setBooleanField(term4602, term4602.getClass(), "preserveWhitespace", false);
        setBooleanField(term4602, term4602.getClass(), "formList", false);
        setBooleanField(term4602, term4602.getClass(), "formSubmit", false);
        setField(term4601, term4601.getClass(), "tag", term4602);
        setField(term4601, term4601.getClass(), "parentNode", null);
        setField(term4601, term4601.getClass(), "childNodes", term4623);
        setField(term4627, term4627.getClass(), "attributes", term4628);
        setField(term4601, term4601.getClass(), "attributes", term4627);
        setField(term4601, term4601.getClass(), "baseUri", "OeQLvhVERT");
        setIntField(term4601, term4601.getClass(), "siblingIndex", 1442160736);
        ArrayList term29230 = new ArrayList();
        LinkedHashMap term29233 = new LinkedHashMap();
        term29226 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term29227 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term29232 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term29227, term29227.getClass(), "tagName", "PsqusYmejD");
        setBooleanField(term29227, term29227.getClass(), "isBlock", true);
        setBooleanField(term29227, term29227.getClass(), "formatAsBlock", true);
        setBooleanField(term29227, term29227.getClass(), "canContainInline", false);
        setBooleanField(term29227, term29227.getClass(), "empty", true);
        setBooleanField(term29227, term29227.getClass(), "selfClosing", true);
        setBooleanField(term29227, term29227.getClass(), "preserveWhitespace", false);
        setBooleanField(term29227, term29227.getClass(), "formList", false);
        setBooleanField(term29227, term29227.getClass(), "formSubmit", false);
        setField(term29226, term29226.getClass(), "tag", term29227);
        setField(term29226, term29226.getClass(), "parentNode", null);
        setField(term29226, term29226.getClass(), "childNodes", term29230);
        setField(term29232, term29232.getClass(), "attributes", term29233);
        setField(term29226, term29226.getClass(), "attributes", term29232);
        setField(term29226, term29226.getClass(), "baseUri", "OeQLvhVERT");
        setIntField(term29226, term29226.getClass(), "siblingIndex", 1442160736);
        term29210 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term29211 = (Object[]) newArray("java.lang.Object", 0);
        setField(term29210, term29210.getClass(), "elementData", term29211);
        setIntField(term29210, term29210.getClass(), "size", 0);
        setIntField(term29210, term29210.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "IlvgFINwIa";
        args[1] = "GEJABPlHSI";
        Object retValue = callMethod(klass, "getElementsByAttributeValueMatching", argTypes, term4601, args);
        assertTrue(recursiveEquals(term4601, term29226));
        assertTrue(recursiveEquals(retValue, term29210));
    }

};


