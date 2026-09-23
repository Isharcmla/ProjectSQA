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

public class Element_removeClass_11498692879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7882;

    public Element_removeClass_11498692879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7904 = new HashMap();
        Set<Object> term7971 =  ((Map) term7904).keySet();
        HashSet term7903 = new HashSet((Collection<? extends Object>) term7971);
        ArrayList term7920 = new ArrayList();
        ((ArrayList) term7920).add((Object)null);
        LinkedHashMap term7925 = new LinkedHashMap();
        term7882 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7883 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7924 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7883, term7883.getClass(), "tagName", "eWnrMSbYbT");
        setBooleanField(term7883, term7883.getClass(), "isBlock", true);
        setBooleanField(term7883, term7883.getClass(), "formatAsBlock", true);
        setBooleanField(term7883, term7883.getClass(), "canContainBlock", true);
        setBooleanField(term7883, term7883.getClass(), "canContainInline", false);
        setBooleanField(term7883, term7883.getClass(), "empty", false);
        setBooleanField(term7883, term7883.getClass(), "selfClosing", false);
        setBooleanField(term7883, term7883.getClass(), "preserveWhitespace", false);
        setField(term7882, term7882.getClass(), "tag", term7883);
        setField(term7882, term7882.getClass(), "classNames", term7903);
        setField(term7882, term7882.getClass(), "parentNode", null);
        setField(term7882, term7882.getClass(), "childNodes", term7920);
        setField(term7924, term7924.getClass(), "attributes", term7925);
        setField(term7882, term7882.getClass(), "attributes", term7924);
        setField(term7882, term7882.getClass(), "baseUri", "QTefjRuiez");
        setIntField(term7882, term7882.getClass(), "siblingIndex", -1274456137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SQZVNkAVBB";
        callMethod(klass, "removeClass", argTypes, term7882, args);
    }

};


