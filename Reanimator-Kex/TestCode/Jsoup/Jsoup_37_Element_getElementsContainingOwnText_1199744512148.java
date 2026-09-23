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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsContainingOwnText_1199744512148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5534;
     Object term30880;
     Object term30875;

    public Element_getElementsContainingOwnText_1199744512148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5558 = new HashMap();
        Set<Object> term30904 =  ((Map) term5558).keySet();
        HashSet term5557 = new HashSet((Collection<? extends Object>) term30904);
        ArrayList term5568 = new ArrayList();
        ((ArrayList) term5568).add((Object)null);
        ((ArrayList) term5568).add((Object)null);
        ((ArrayList) term5568).add((Object)null);
        ((ArrayList) term5568).add((Object)null);
        ((ArrayList) term5568).add((Object)null);
        ((ArrayList) term5568).add((Object)null);
        ((ArrayList) term5568).add((Object)null);
        LinkedHashMap term5573 = new LinkedHashMap();
        term5534 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5535 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5572 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5535, term5535.getClass(), "tagName", "pDkMNnAGgv");
        setBooleanField(term5535, term5535.getClass(), "isBlock", true);
        setBooleanField(term5535, term5535.getClass(), "formatAsBlock", false);
        setBooleanField(term5535, term5535.getClass(), "canContainBlock", true);
        setBooleanField(term5535, term5535.getClass(), "canContainInline", true);
        setBooleanField(term5535, term5535.getClass(), "empty", false);
        setBooleanField(term5535, term5535.getClass(), "selfClosing", false);
        setBooleanField(term5535, term5535.getClass(), "preserveWhitespace", true);
        setBooleanField(term5535, term5535.getClass(), "formList", false);
        setBooleanField(term5535, term5535.getClass(), "formSubmit", true);
        setField(term5534, term5534.getClass(), "tag", term5535);
        setField(term5534, term5534.getClass(), "classNames", term5557);
        setField(term5534, term5534.getClass(), "parentNode", null);
        setField(term5534, term5534.getClass(), "childNodes", term5568);
        setField(term5572, term5572.getClass(), "attributes", term5573);
        setField(term5534, term5534.getClass(), "attributes", term5572);
        setField(term5534, term5534.getClass(), "baseUri", "bucTnYicnp");
        setIntField(term5534, term5534.getClass(), "siblingIndex", 1655935355);
        HashMap term30885 = new HashMap();
        Set<Object> term30935 =  ((Map) term30885).keySet();
        HashSet term30884 = new HashSet((Collection<? extends Object>) term30935);
        ArrayList term30886 = new ArrayList();
        ((ArrayList) term30886).add((Object)null);
        ((ArrayList) term30886).add((Object)null);
        ((ArrayList) term30886).add((Object)null);
        ((ArrayList) term30886).add((Object)null);
        ((ArrayList) term30886).add((Object)null);
        ((ArrayList) term30886).add((Object)null);
        ((ArrayList) term30886).add((Object)null);
        LinkedHashMap term30889 = new LinkedHashMap();
        term30880 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term30881 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term30888 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term30881, term30881.getClass(), "tagName", "pDkMNnAGgv");
        setBooleanField(term30881, term30881.getClass(), "isBlock", true);
        setBooleanField(term30881, term30881.getClass(), "formatAsBlock", false);
        setBooleanField(term30881, term30881.getClass(), "canContainBlock", true);
        setBooleanField(term30881, term30881.getClass(), "canContainInline", true);
        setBooleanField(term30881, term30881.getClass(), "empty", false);
        setBooleanField(term30881, term30881.getClass(), "selfClosing", false);
        setBooleanField(term30881, term30881.getClass(), "preserveWhitespace", true);
        setBooleanField(term30881, term30881.getClass(), "formList", false);
        setBooleanField(term30881, term30881.getClass(), "formSubmit", true);
        setField(term30880, term30880.getClass(), "tag", term30881);
        setField(term30880, term30880.getClass(), "classNames", term30884);
        setField(term30880, term30880.getClass(), "parentNode", null);
        setField(term30880, term30880.getClass(), "childNodes", term30886);
        setField(term30888, term30888.getClass(), "attributes", term30889);
        setField(term30880, term30880.getClass(), "attributes", term30888);
        setField(term30880, term30880.getClass(), "baseUri", "bucTnYicnp");
        setIntField(term30880, term30880.getClass(), "siblingIndex", 1655935355);
        ArrayList term30876 = new ArrayList();
        term30875 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term30875, term30875.getClass(), "contents", term30876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EkgprvqZlM";
        Object retValue = callMethod(klass, "getElementsContainingOwnText", argTypes, term5534, args);
        assertTrue(recursiveEquals(term5534, term30880));
        assertTrue(recursiveEquals(retValue, term30875));
    }

};


