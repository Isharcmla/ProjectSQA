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

public class Element_hasText_195450272172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7232;

    public Element_hasText_195450272172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7254 = new HashMap();
        Set<Object> term7311 =  ((Map) term7254).keySet();
        HashSet term7253 = new HashSet((Collection<? extends Object>) term7311);
        ArrayList term7272 = new ArrayList();
        ((ArrayList) term7272).add((Object)null);
        ((ArrayList) term7272).add((Object)null);
        ((ArrayList) term7272).add((Object)null);
        ((ArrayList) term7272).add((Object)null);
        ((ArrayList) term7272).add((Object)null);
        ((ArrayList) term7272).add((Object)null);
        ((ArrayList) term7272).add((Object)null);
        ((ArrayList) term7272).add((Object)null);
        LinkedHashMap term7277 = new LinkedHashMap();
        term7232 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7233 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7276 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7233, term7233.getClass(), "tagName", "aJQuCOCvZs");
        setBooleanField(term7233, term7233.getClass(), "isBlock", false);
        setBooleanField(term7233, term7233.getClass(), "formatAsBlock", true);
        setBooleanField(term7233, term7233.getClass(), "canContainBlock", false);
        setBooleanField(term7233, term7233.getClass(), "canContainInline", true);
        setBooleanField(term7233, term7233.getClass(), "empty", false);
        setBooleanField(term7233, term7233.getClass(), "selfClosing", false);
        setBooleanField(term7233, term7233.getClass(), "preserveWhitespace", true);
        setField(term7232, term7232.getClass(), "tag", term7233);
        setField(term7232, term7232.getClass(), "classNames", term7253);
        setField(term7232, term7232.getClass(), "parentNode", null);
        setField(term7232, term7232.getClass(), "childNodes", term7272);
        setField(term7276, term7276.getClass(), "attributes", term7277);
        setField(term7232, term7232.getClass(), "attributes", term7276);
        setField(term7232, term7232.getClass(), "baseUri", "FrTZLybkKk");
        setIntField(term7232, term7232.getClass(), "siblingIndex", -461771056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasText", argTypes, term7232, args);
    }

};


