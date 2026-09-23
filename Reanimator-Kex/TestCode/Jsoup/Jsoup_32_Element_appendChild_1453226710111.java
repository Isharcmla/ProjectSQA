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
import java.lang.IllegalArgumentException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_appendChild_1453226710111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1517;

    public Element_appendChild_1453226710111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1539 = new HashMap();
        Set<Object> term13348 =  ((Map) term1539).keySet();
        HashSet term1538 = new HashSet((Collection<? extends Object>) term13348);
        ArrayList term1549 = new ArrayList();
        ((ArrayList) term1549).add((Object)null);
        ((ArrayList) term1549).add((Object)null);
        ((ArrayList) term1549).add((Object)null);
        ((ArrayList) term1549).add((Object)null);
        ((ArrayList) term1549).add((Object)null);
        LinkedHashMap term1554 = new LinkedHashMap();
        term1517 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1518 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1553 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1518, term1518.getClass(), "tagName", "PapWxkhEWe");
        setBooleanField(term1518, term1518.getClass(), "isBlock", true);
        setBooleanField(term1518, term1518.getClass(), "formatAsBlock", false);
        setBooleanField(term1518, term1518.getClass(), "canContainBlock", false);
        setBooleanField(term1518, term1518.getClass(), "canContainInline", true);
        setBooleanField(term1518, term1518.getClass(), "empty", true);
        setBooleanField(term1518, term1518.getClass(), "selfClosing", false);
        setBooleanField(term1518, term1518.getClass(), "preserveWhitespace", false);
        setField(term1517, term1517.getClass(), "tag", term1518);
        setField(term1517, term1517.getClass(), "classNames", term1538);
        setField(term1517, term1517.getClass(), "parentNode", null);
        setField(term1517, term1517.getClass(), "childNodes", term1549);
        setField(term1553, term1553.getClass(), "attributes", term1554);
        setField(term1517, term1517.getClass(), "attributes", term1553);
        setField(term1517, term1517.getClass(), "baseUri", "rLHAoqXgPh");
        setIntField(term1517, term1517.getClass(), "siblingIndex", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "appendChild", argTypes, term1517, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


