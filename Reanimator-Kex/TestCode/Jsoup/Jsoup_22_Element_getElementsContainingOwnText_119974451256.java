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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsContainingOwnText_119974451256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5478;

    public Element_getElementsContainingOwnText_119974451256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5500 = new HashMap();
        Set<Object> term5561 =  ((Map) term5500).keySet();
        HashSet term5499 = new HashSet((Collection<? extends Object>) term5561);
        ArrayList term5510 = new ArrayList();
        ((ArrayList) term5510).add((Object)null);
        ((ArrayList) term5510).add((Object)null);
        ((ArrayList) term5510).add((Object)null);
        ((ArrayList) term5510).add((Object)null);
        ((ArrayList) term5510).add((Object)null);
        ((ArrayList) term5510).add((Object)null);
        ((ArrayList) term5510).add((Object)null);
        LinkedHashMap term5515 = new LinkedHashMap();
        term5478 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5479 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5514 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5479, term5479.getClass(), "tagName", "pDkMNnAGgv");
        setBooleanField(term5479, term5479.getClass(), "isBlock", false);
        setBooleanField(term5479, term5479.getClass(), "formatAsBlock", false);
        setBooleanField(term5479, term5479.getClass(), "canContainBlock", false);
        setBooleanField(term5479, term5479.getClass(), "canContainInline", false);
        setBooleanField(term5479, term5479.getClass(), "empty", false);
        setBooleanField(term5479, term5479.getClass(), "selfClosing", true);
        setBooleanField(term5479, term5479.getClass(), "preserveWhitespace", true);
        setField(term5478, term5478.getClass(), "tag", term5479);
        setField(term5478, term5478.getClass(), "classNames", term5499);
        setField(term5478, term5478.getClass(), "parentNode", null);
        setField(term5478, term5478.getClass(), "childNodes", term5510);
        setField(term5514, term5514.getClass(), "attributes", term5515);
        setField(term5478, term5478.getClass(), "attributes", term5514);
        setField(term5478, term5478.getClass(), "baseUri", "bucTnYicnp");
        setIntField(term5478, term5478.getClass(), "siblingIndex", 972867650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EkgprvqZlM";
        callMethod(klass, "getElementsContainingOwnText", argTypes, term5478, args);
    }

};


