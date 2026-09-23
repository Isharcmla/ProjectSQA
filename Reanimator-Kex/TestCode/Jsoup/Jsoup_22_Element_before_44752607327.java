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

public class Element_before_44752607327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2448;

    public Element_before_44752607327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2470 = new HashMap();
        Set<Object> term2519 =  ((Map) term2470).keySet();
        HashSet term2469 = new HashSet((Collection<? extends Object>) term2519);
        ArrayList term2480 = new ArrayList();
        ((ArrayList) term2480).add((Object)null);
        ((ArrayList) term2480).add((Object)null);
        ((ArrayList) term2480).add((Object)null);
        ((ArrayList) term2480).add((Object)null);
        LinkedHashMap term2485 = new LinkedHashMap();
        term2448 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2449 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2484 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2449, term2449.getClass(), "tagName", "ZKMLioamsY");
        setBooleanField(term2449, term2449.getClass(), "isBlock", false);
        setBooleanField(term2449, term2449.getClass(), "formatAsBlock", false);
        setBooleanField(term2449, term2449.getClass(), "canContainBlock", false);
        setBooleanField(term2449, term2449.getClass(), "canContainInline", false);
        setBooleanField(term2449, term2449.getClass(), "empty", true);
        setBooleanField(term2449, term2449.getClass(), "selfClosing", true);
        setBooleanField(term2449, term2449.getClass(), "preserveWhitespace", true);
        setField(term2448, term2448.getClass(), "tag", term2449);
        setField(term2448, term2448.getClass(), "classNames", term2469);
        setField(term2448, term2448.getClass(), "parentNode", null);
        setField(term2448, term2448.getClass(), "childNodes", term2480);
        setField(term2484, term2484.getClass(), "attributes", term2485);
        setField(term2448, term2448.getClass(), "attributes", term2484);
        setField(term2448, term2448.getClass(), "baseUri", "bnsyeQXFdu");
        setIntField(term2448, term2448.getClass(), "siblingIndex", 590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "before", argTypes, term2448, args);
    }

};


