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

public class Element_appendChild_1453226710110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1551;

    public Element_appendChild_1453226710110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1575 = new HashMap();
        Set<Object> term13270 =  ((Map) term1575).keySet();
        HashSet term1574 = new HashSet((Collection<? extends Object>) term13270);
        ArrayList term1585 = new ArrayList();
        ((ArrayList) term1585).add((Object)null);
        ((ArrayList) term1585).add((Object)null);
        ((ArrayList) term1585).add((Object)null);
        ((ArrayList) term1585).add((Object)null);
        ((ArrayList) term1585).add((Object)null);
        LinkedHashMap term1590 = new LinkedHashMap();
        term1551 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1552 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1589 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1552, term1552.getClass(), "tagName", "PapWxkhEWe");
        setBooleanField(term1552, term1552.getClass(), "isBlock", false);
        setBooleanField(term1552, term1552.getClass(), "formatAsBlock", false);
        setBooleanField(term1552, term1552.getClass(), "canContainBlock", true);
        setBooleanField(term1552, term1552.getClass(), "canContainInline", true);
        setBooleanField(term1552, term1552.getClass(), "empty", false);
        setBooleanField(term1552, term1552.getClass(), "selfClosing", true);
        setBooleanField(term1552, term1552.getClass(), "preserveWhitespace", true);
        setBooleanField(term1552, term1552.getClass(), "formList", false);
        setBooleanField(term1552, term1552.getClass(), "formSubmit", false);
        setField(term1551, term1551.getClass(), "tag", term1552);
        setField(term1551, term1551.getClass(), "classNames", term1574);
        setField(term1551, term1551.getClass(), "parentNode", null);
        setField(term1551, term1551.getClass(), "childNodes", term1585);
        setField(term1589, term1589.getClass(), "attributes", term1590);
        setField(term1551, term1551.getClass(), "attributes", term1589);
        setField(term1551, term1551.getClass(), "baseUri", "rLHAoqXgPh");
        setIntField(term1551, term1551.getClass(), "siblingIndex", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "appendChild", argTypes, term1551, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


