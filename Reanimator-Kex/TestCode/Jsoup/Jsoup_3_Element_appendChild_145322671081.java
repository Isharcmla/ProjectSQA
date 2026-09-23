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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_appendChild_145322671081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1401;

    public Element_appendChild_145322671081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1423 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1423, term1423.getClass(), "tagName", null);
        setBooleanField(term1423, term1423.getClass(), "isBlock", true);
        setBooleanField(term1423, term1423.getClass(), "canContainBlock", false);
        setBooleanField(term1423, term1423.getClass(), "canContainInline", false);
        setBooleanField(term1423, term1423.getClass(), "optionalClosing", false);
        setBooleanField(term1423, term1423.getClass(), "empty", true);
        setBooleanField(term1423, term1423.getClass(), "preserveWhitespace", true);
        setField(term1423, term1423.getClass(), "ancestors", null);
        Object term1430 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1430, term1430.getClass(), "tagName", null);
        setBooleanField(term1430, term1430.getClass(), "isBlock", false);
        setBooleanField(term1430, term1430.getClass(), "canContainBlock", true);
        setBooleanField(term1430, term1430.getClass(), "canContainInline", false);
        setBooleanField(term1430, term1430.getClass(), "optionalClosing", true);
        setBooleanField(term1430, term1430.getClass(), "empty", false);
        setBooleanField(term1430, term1430.getClass(), "preserveWhitespace", false);
        setField(term1430, term1430.getClass(), "ancestors", null);
        ArrayList term1421 = new ArrayList();
        ((ArrayList) term1421).add(term1423);
        ((ArrayList) term1421).add(term1430);
        HashMap term1440 = new HashMap();
        Set<Object> term11424 =  ((Map) term1440).keySet();
        HashSet term1439 = new HashSet((Collection<? extends Object>) term11424);
        ArrayList term1450 = new ArrayList();
        ((ArrayList) term1450).add((Object)null);
        ((ArrayList) term1450).add((Object)null);
        ((ArrayList) term1450).add((Object)null);
        ((ArrayList) term1450).add((Object)null);
        ((ArrayList) term1450).add((Object)null);
        ((ArrayList) term1450).add((Object)null);
        ((ArrayList) term1450).add((Object)null);
        LinkedHashMap term1455 = new LinkedHashMap();
        term1401 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1402 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1454 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1402, term1402.getClass(), "tagName", "iikZEapDlu");
        setBooleanField(term1402, term1402.getClass(), "isBlock", true);
        setBooleanField(term1402, term1402.getClass(), "canContainBlock", false);
        setBooleanField(term1402, term1402.getClass(), "canContainInline", true);
        setBooleanField(term1402, term1402.getClass(), "optionalClosing", true);
        setBooleanField(term1402, term1402.getClass(), "empty", true);
        setBooleanField(term1402, term1402.getClass(), "preserveWhitespace", false);
        setField(term1402, term1402.getClass(), "ancestors", term1421);
        setField(term1401, term1401.getClass(), "tag", term1402);
        setField(term1401, term1401.getClass(), "classNames", term1439);
        setField(term1401, term1401.getClass(), "parentNode", null);
        setField(term1401, term1401.getClass(), "childNodes", term1450);
        setField(term1454, term1454.getClass(), "attributes", term1455);
        setField(term1401, term1401.getClass(), "attributes", term1454);
        setField(term1401, term1401.getClass(), "baseUri", "QduALnDSVo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "appendChild", argTypes, term1401, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


