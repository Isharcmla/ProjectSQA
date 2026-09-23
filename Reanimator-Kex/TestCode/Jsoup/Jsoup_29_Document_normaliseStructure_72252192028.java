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

public class Document_normaliseStructure_72252192028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2391;
     Object term2474;

    public Document_normaliseStructure_72252192028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13662 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term13661 = ((Class) term13662).getDeclaredField((String) "noQuirks");
        ((Field) term13661).setAccessible(true);
        Object enum32 = ((Field) term13661).get((Object) null);
        HashMap term2428 = new HashMap();
        Set<Object> term13877 =  ((Map) term2428).keySet();
        HashSet term2427 = new HashSet((Collection<? extends Object>) term13877);
        ArrayList term2433 = new ArrayList();
        ((ArrayList) term2433).add((Object)null);
        ((ArrayList) term2433).add((Object)null);
        LinkedHashMap term2438 = new LinkedHashMap();
        term2391 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term2392 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term2407 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2437 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2392, term2392.getClass(), "escapeMode", null);
        setField(term2392, term2392.getClass(), "charset", null);
        setField(term2392, term2392.getClass(), "charsetEncoder", null);
        setBooleanField(term2392, term2392.getClass(), "prettyPrint", true);
        setIntField(term2392, term2392.getClass(), "indentAmount", 597278769);
        setField(term2391, term2391.getClass(), "outputSettings", term2392);
        setField(term2391, term2391.getClass(), "quirksMode", enum32);
        setField(term2407, term2407.getClass(), "tagName", "oVgzLbrsFr");
        setBooleanField(term2407, term2407.getClass(), "isBlock", false);
        setBooleanField(term2407, term2407.getClass(), "formatAsBlock", false);
        setBooleanField(term2407, term2407.getClass(), "canContainBlock", true);
        setBooleanField(term2407, term2407.getClass(), "canContainInline", true);
        setBooleanField(term2407, term2407.getClass(), "empty", true);
        setBooleanField(term2407, term2407.getClass(), "selfClosing", false);
        setBooleanField(term2407, term2407.getClass(), "preserveWhitespace", false);
        setField(term2391, term2391.getClass(), "tag", term2407);
        setField(term2391, term2391.getClass(), "classNames", term2427);
        setField(term2391, term2391.getClass(), "parentNode", null);
        setField(term2391, term2391.getClass(), "childNodes", term2433);
        setField(term2437, term2437.getClass(), "attributes", term2438);
        setField(term2391, term2391.getClass(), "attributes", term2437);
        setField(term2391, term2391.getClass(), "baseUri", "idgaQsnJpQ");
        setIntField(term2391, term2391.getClass(), "siblingIndex", -1685132342);
        HashMap term2496 = new HashMap();
        Set<Object> term13908 =  ((Map) term2496).keySet();
        HashSet term2495 = new HashSet((Collection<? extends Object>) term13908);
        ArrayList term2516 = new ArrayList();
        ((ArrayList) term2516).add((Object)null);
        ((ArrayList) term2516).add((Object)null);
        ((ArrayList) term2516).add((Object)null);
        ((ArrayList) term2516).add((Object)null);
        ((ArrayList) term2516).add((Object)null);
        ((ArrayList) term2516).add((Object)null);
        LinkedHashMap term2521 = new LinkedHashMap();
        term2474 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2475 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2520 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2475, term2475.getClass(), "tagName", "jUbSRrkrYZ");
        setBooleanField(term2475, term2475.getClass(), "isBlock", false);
        setBooleanField(term2475, term2475.getClass(), "formatAsBlock", false);
        setBooleanField(term2475, term2475.getClass(), "canContainBlock", false);
        setBooleanField(term2475, term2475.getClass(), "canContainInline", false);
        setBooleanField(term2475, term2475.getClass(), "empty", false);
        setBooleanField(term2475, term2475.getClass(), "selfClosing", true);
        setBooleanField(term2475, term2475.getClass(), "preserveWhitespace", false);
        setField(term2474, term2474.getClass(), "tag", term2475);
        setField(term2474, term2474.getClass(), "classNames", term2495);
        setField(term2474, term2474.getClass(), "parentNode", null);
        setField(term2474, term2474.getClass(), "childNodes", term2516);
        setField(term2520, term2520.getClass(), "attributes", term2521);
        setField(term2474, term2474.getClass(), "attributes", term2520);
        setField(term2474, term2474.getClass(), "baseUri", "jiKYgYHqIS");
        setIntField(term2474, term2474.getClass(), "siblingIndex", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = "VgZnGoIFwQ";
        args[1] = term2474;
        try {
            callMethod(klass, "normaliseStructure", argTypes, term2391, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


