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

public class Element_toggleClass_95262400081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7940;

    public Element_toggleClass_95262400081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7962 = new HashMap();
        Set<Object> term8023 =  ((Map) term7962).keySet();
        HashSet term7961 = new HashSet((Collection<? extends Object>) term8023);
        ArrayList term7972 = new ArrayList();
        LinkedHashMap term7977 = new LinkedHashMap();
        term7940 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7941 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7976 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7941, term7941.getClass(), "tagName", "mrSAYJlddZ");
        setBooleanField(term7941, term7941.getClass(), "isBlock", false);
        setBooleanField(term7941, term7941.getClass(), "formatAsBlock", false);
        setBooleanField(term7941, term7941.getClass(), "canContainBlock", true);
        setBooleanField(term7941, term7941.getClass(), "canContainInline", false);
        setBooleanField(term7941, term7941.getClass(), "empty", false);
        setBooleanField(term7941, term7941.getClass(), "selfClosing", true);
        setBooleanField(term7941, term7941.getClass(), "preserveWhitespace", false);
        setField(term7940, term7940.getClass(), "tag", term7941);
        setField(term7940, term7940.getClass(), "classNames", term7961);
        setField(term7940, term7940.getClass(), "parentNode", null);
        setField(term7940, term7940.getClass(), "childNodes", term7972);
        setField(term7976, term7976.getClass(), "attributes", term7977);
        setField(term7940, term7940.getClass(), "attributes", term7976);
        setField(term7940, term7940.getClass(), "baseUri", "vydWXHfFTw");
        setIntField(term7940, term7940.getClass(), "siblingIndex", -601863069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DRhkpDneCC";
        callMethod(klass, "toggleClass", argTypes, term7940, args);
    }

};


