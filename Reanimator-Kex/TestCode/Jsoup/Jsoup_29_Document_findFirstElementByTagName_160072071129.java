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

public class Document_findFirstElementByTagName_160072071129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2803;

    public Document_findFirstElementByTagName_160072071129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14405 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term14404 = ((Class) term14405).getDeclaredField((String) "noQuirks");
        ((Field) term14404).setAccessible(true);
        Object enum34 = ((Field) term14404).get((Object) null);
        HashMap term2840 = new HashMap();
        Set<Object> term14620 =  ((Map) term2840).keySet();
        HashSet term2839 = new HashSet((Collection<? extends Object>) term14620);
        ArrayList term2850 = new ArrayList();
        ((ArrayList) term2850).add((Object)null);
        LinkedHashMap term2855 = new LinkedHashMap();
        term2803 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term2804 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term2819 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2854 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2804, term2804.getClass(), "escapeMode", null);
        setField(term2804, term2804.getClass(), "charset", null);
        setField(term2804, term2804.getClass(), "charsetEncoder", null);
        setBooleanField(term2804, term2804.getClass(), "prettyPrint", false);
        setIntField(term2804, term2804.getClass(), "indentAmount", 1622346318);
        setField(term2803, term2803.getClass(), "outputSettings", term2804);
        setField(term2803, term2803.getClass(), "quirksMode", enum34);
        setField(term2819, term2819.getClass(), "tagName", "DfISiziTgG");
        setBooleanField(term2819, term2819.getClass(), "isBlock", true);
        setBooleanField(term2819, term2819.getClass(), "formatAsBlock", false);
        setBooleanField(term2819, term2819.getClass(), "canContainBlock", false);
        setBooleanField(term2819, term2819.getClass(), "canContainInline", true);
        setBooleanField(term2819, term2819.getClass(), "empty", false);
        setBooleanField(term2819, term2819.getClass(), "selfClosing", true);
        setBooleanField(term2819, term2819.getClass(), "preserveWhitespace", false);
        setField(term2803, term2803.getClass(), "tag", term2819);
        setField(term2803, term2803.getClass(), "classNames", term2839);
        setField(term2803, term2803.getClass(), "parentNode", null);
        setField(term2803, term2803.getClass(), "childNodes", term2850);
        setField(term2854, term2854.getClass(), "attributes", term2855);
        setField(term2803, term2803.getClass(), "attributes", term2854);
        setField(term2803, term2803.getClass(), "baseUri", "sEccwbJKYE");
        setIntField(term2803, term2803.getClass(), "siblingIndex", 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[2];
        args[0] = "AWRooQKkdW";
        args[1] = null;
        try {
            callMethod(klass, "findFirstElementByTagName", argTypes, term2803, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


