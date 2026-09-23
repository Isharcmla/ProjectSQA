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

public class Element_equals_143192808889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17508;
     Object term17569;

    public Element_equals_143192808889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17530 = new HashMap();
        Set<Object> term17580 =  ((Map) term17530).keySet();
        HashSet term17529 = new HashSet((Collection<? extends Object>) term17580);
        ArrayList term17540 = new ArrayList();
        ((ArrayList) term17540).add((Object)null);
        ((ArrayList) term17540).add((Object)null);
        ((ArrayList) term17540).add((Object)null);
        ((ArrayList) term17540).add((Object)null);
        ((ArrayList) term17540).add((Object)null);
        ((ArrayList) term17540).add((Object)null);
        ((ArrayList) term17540).add((Object)null);
        ((ArrayList) term17540).add((Object)null);
        LinkedHashMap term17545 = new LinkedHashMap();
        term17508 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term17509 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term17544 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17509, term17509.getClass(), "tagName", "NNMBrIWEBw");
        setBooleanField(term17509, term17509.getClass(), "isBlock", true);
        setBooleanField(term17509, term17509.getClass(), "formatAsBlock", false);
        setBooleanField(term17509, term17509.getClass(), "canContainBlock", true);
        setBooleanField(term17509, term17509.getClass(), "canContainInline", true);
        setBooleanField(term17509, term17509.getClass(), "empty", true);
        setBooleanField(term17509, term17509.getClass(), "selfClosing", false);
        setBooleanField(term17509, term17509.getClass(), "preserveWhitespace", true);
        setField(term17508, term17508.getClass(), "tag", term17509);
        setField(term17508, term17508.getClass(), "classNames", term17529);
        setField(term17508, term17508.getClass(), "parentNode", null);
        setField(term17508, term17508.getClass(), "childNodes", term17540);
        setField(term17544, term17544.getClass(), "attributes", term17545);
        setField(term17508, term17508.getClass(), "attributes", term17544);
        setField(term17508, term17508.getClass(), "baseUri", "udRdJkgXmH");
        setIntField(term17508, term17508.getClass(), "siblingIndex", -1970452551);
        term17569 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17569;
        callMethod(klass, "equals", argTypes, term17508, args);
    }

};


