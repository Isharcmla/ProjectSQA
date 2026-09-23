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

public class Element_lastElementSibling_93642902937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3346;

    public Element_lastElementSibling_93642902937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3368 = new HashMap();
        Set<Object> term3412 =  ((Map) term3368).keySet();
        HashSet term3367 = new HashSet((Collection<? extends Object>) term3412);
        ArrayList term3373 = new ArrayList();
        ((ArrayList) term3373).add((Object)null);
        ((ArrayList) term3373).add((Object)null);
        ((ArrayList) term3373).add((Object)null);
        ((ArrayList) term3373).add((Object)null);
        ((ArrayList) term3373).add((Object)null);
        ((ArrayList) term3373).add((Object)null);
        LinkedHashMap term3378 = new LinkedHashMap();
        term3346 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3347 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3377 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3347, term3347.getClass(), "tagName", "IoSfuKDFRe");
        setBooleanField(term3347, term3347.getClass(), "isBlock", false);
        setBooleanField(term3347, term3347.getClass(), "formatAsBlock", true);
        setBooleanField(term3347, term3347.getClass(), "canContainBlock", false);
        setBooleanField(term3347, term3347.getClass(), "canContainInline", false);
        setBooleanField(term3347, term3347.getClass(), "empty", false);
        setBooleanField(term3347, term3347.getClass(), "selfClosing", false);
        setBooleanField(term3347, term3347.getClass(), "preserveWhitespace", true);
        setField(term3346, term3346.getClass(), "tag", term3347);
        setField(term3346, term3346.getClass(), "classNames", term3367);
        setField(term3346, term3346.getClass(), "parentNode", null);
        setField(term3346, term3346.getClass(), "childNodes", term3373);
        setField(term3377, term3377.getClass(), "attributes", term3378);
        setField(term3346, term3346.getClass(), "attributes", term3377);
        setField(term3346, term3346.getClass(), "baseUri", "sUEeHQTWkA");
        setIntField(term3346, term3346.getClass(), "siblingIndex", -1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "lastElementSibling", argTypes, term3346, args);
    }

};


