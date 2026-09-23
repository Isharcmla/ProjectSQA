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

public class Element_getAllElements_545850964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6179;

    public Element_getAllElements_545850964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6201 = new HashMap();
        Set<Object> term6254 =  ((Map) term6201).keySet();
        HashSet term6200 = new HashSet((Collection<? extends Object>) term6254);
        ArrayList term6215 = new ArrayList();
        LinkedHashMap term6220 = new LinkedHashMap();
        term6179 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6180 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6219 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6180, term6180.getClass(), "tagName", "HNVOAXYNEZ");
        setBooleanField(term6180, term6180.getClass(), "isBlock", false);
        setBooleanField(term6180, term6180.getClass(), "formatAsBlock", true);
        setBooleanField(term6180, term6180.getClass(), "canContainBlock", true);
        setBooleanField(term6180, term6180.getClass(), "canContainInline", true);
        setBooleanField(term6180, term6180.getClass(), "empty", true);
        setBooleanField(term6180, term6180.getClass(), "selfClosing", false);
        setBooleanField(term6180, term6180.getClass(), "preserveWhitespace", false);
        setField(term6179, term6179.getClass(), "tag", term6180);
        setField(term6179, term6179.getClass(), "classNames", term6200);
        setField(term6179, term6179.getClass(), "parentNode", null);
        setField(term6179, term6179.getClass(), "childNodes", term6215);
        setField(term6219, term6219.getClass(), "attributes", term6220);
        setField(term6179, term6179.getClass(), "attributes", term6219);
        setField(term6179, term6179.getClass(), "baseUri", "lLiSiPCciB");
        setIntField(term6179, term6179.getClass(), "siblingIndex", 98922530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllElements", argTypes, term6179, args);
    }

};


