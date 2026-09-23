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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Document_normalise_41742654126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1677;

    public Document_normalise_41742654126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11734 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term11733 = ((Class) term11734).getDeclaredField((String) "quirks");
        ((Field) term11733).setAccessible(true);
        Object enum28 = ((Field) term11733).get((Object) null);
        HashMap term1712 = new HashMap();
        Set<Object> term11943 =  ((Map) term1712).keySet();
        HashSet term1711 = new HashSet((Collection<? extends Object>) term11943);
        ArrayList term1728 = new ArrayList();
        ((ArrayList) term1728).add((Object)null);
        ((ArrayList) term1728).add((Object)null);
        ((ArrayList) term1728).add((Object)null);
        ((ArrayList) term1728).add((Object)null);
        ((ArrayList) term1728).add((Object)null);
        LinkedHashMap term1733 = new LinkedHashMap();
        term1677 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term1678 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term1691 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1732 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1678, term1678.getClass(), "escapeMode", null);
        setField(term1678, term1678.getClass(), "charset", null);
        setField(term1678, term1678.getClass(), "charsetEncoder", null);
        setBooleanField(term1678, term1678.getClass(), "prettyPrint", false);
        setIntField(term1678, term1678.getClass(), "indentAmount", 1725571209);
        setField(term1677, term1677.getClass(), "outputSettings", term1678);
        setField(term1677, term1677.getClass(), "quirksMode", enum28);
        setField(term1691, term1691.getClass(), "tagName", "LvtrsXUliU");
        setBooleanField(term1691, term1691.getClass(), "isBlock", false);
        setBooleanField(term1691, term1691.getClass(), "formatAsBlock", true);
        setBooleanField(term1691, term1691.getClass(), "canContainBlock", true);
        setBooleanField(term1691, term1691.getClass(), "canContainInline", false);
        setBooleanField(term1691, term1691.getClass(), "empty", true);
        setBooleanField(term1691, term1691.getClass(), "selfClosing", true);
        setBooleanField(term1691, term1691.getClass(), "preserveWhitespace", true);
        setField(term1677, term1677.getClass(), "tag", term1691);
        setField(term1677, term1677.getClass(), "classNames", term1711);
        setField(term1677, term1677.getClass(), "parentNode", null);
        setField(term1677, term1677.getClass(), "childNodes", term1728);
        setField(term1732, term1732.getClass(), "attributes", term1733);
        setField(term1677, term1677.getClass(), "attributes", term1732);
        setField(term1677, term1677.getClass(), "baseUri", "MLqYREekMl");
        setIntField(term1677, term1677.getClass(), "siblingIndex", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "normalise", argTypes, term1677, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


