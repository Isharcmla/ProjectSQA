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

public class Element_getElementsMatchingOwnText_210255518563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6065;

    public Element_getElementsMatchingOwnText_210255518563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6087 = new HashMap();
        Set<Object> term6158 =  ((Map) term6087).keySet();
        HashSet term6086 = new HashSet((Collection<? extends Object>) term6158);
        ArrayList term6107 = new ArrayList();
        ((ArrayList) term6107).add((Object)null);
        ((ArrayList) term6107).add((Object)null);
        LinkedHashMap term6112 = new LinkedHashMap();
        term6065 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6066 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6111 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6066, term6066.getClass(), "tagName", "IkfarsYNJO");
        setBooleanField(term6066, term6066.getClass(), "isBlock", false);
        setBooleanField(term6066, term6066.getClass(), "formatAsBlock", false);
        setBooleanField(term6066, term6066.getClass(), "canContainBlock", true);
        setBooleanField(term6066, term6066.getClass(), "canContainInline", false);
        setBooleanField(term6066, term6066.getClass(), "empty", true);
        setBooleanField(term6066, term6066.getClass(), "selfClosing", true);
        setBooleanField(term6066, term6066.getClass(), "preserveWhitespace", false);
        setField(term6065, term6065.getClass(), "tag", term6066);
        setField(term6065, term6065.getClass(), "classNames", term6086);
        setField(term6065, term6065.getClass(), "parentNode", null);
        setField(term6065, term6065.getClass(), "childNodes", term6107);
        setField(term6111, term6111.getClass(), "attributes", term6112);
        setField(term6065, term6065.getClass(), "attributes", term6111);
        setField(term6065, term6065.getClass(), "baseUri", "rQjxAhisjm");
        setIntField(term6065, term6065.getClass(), "siblingIndex", -1697741339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZDhASPHjDG";
        callMethod(klass, "getElementsMatchingOwnText", argTypes, term6065, args);
    }

};


