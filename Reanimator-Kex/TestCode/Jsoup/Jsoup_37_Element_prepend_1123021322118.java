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
import java.lang.NoClassDefFoundError;
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

public class Element_prepend_1123021322118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2272;

    public Element_prepend_1123021322118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2296 = new HashMap();
        Set<Object> term17567 =  ((Map) term2296).keySet();
        HashSet term2295 = new HashSet((Collection<? extends Object>) term17567);
        ArrayList term2316 = new ArrayList();
        ((ArrayList) term2316).add((Object)null);
        ((ArrayList) term2316).add((Object)null);
        ((ArrayList) term2316).add((Object)null);
        ((ArrayList) term2316).add((Object)null);
        ((ArrayList) term2316).add((Object)null);
        ((ArrayList) term2316).add((Object)null);
        ((ArrayList) term2316).add((Object)null);
        LinkedHashMap term2321 = new LinkedHashMap();
        term2272 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2273 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2320 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2273, term2273.getClass(), "tagName", "rYbtIDVdnd");
        setBooleanField(term2273, term2273.getClass(), "isBlock", true);
        setBooleanField(term2273, term2273.getClass(), "formatAsBlock", true);
        setBooleanField(term2273, term2273.getClass(), "canContainBlock", true);
        setBooleanField(term2273, term2273.getClass(), "canContainInline", true);
        setBooleanField(term2273, term2273.getClass(), "empty", true);
        setBooleanField(term2273, term2273.getClass(), "selfClosing", false);
        setBooleanField(term2273, term2273.getClass(), "preserveWhitespace", false);
        setBooleanField(term2273, term2273.getClass(), "formList", true);
        setBooleanField(term2273, term2273.getClass(), "formSubmit", false);
        setField(term2272, term2272.getClass(), "tag", term2273);
        setField(term2272, term2272.getClass(), "classNames", term2295);
        setField(term2272, term2272.getClass(), "parentNode", null);
        setField(term2272, term2272.getClass(), "childNodes", term2316);
        setField(term2320, term2320.getClass(), "attributes", term2321);
        setField(term2272, term2272.getClass(), "attributes", term2320);
        setField(term2272, term2272.getClass(), "baseUri", "CGOpQSZZwI");
        setIntField(term2272, term2272.getClass(), "siblingIndex", 590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ypEdrstygY";
        try {
            callMethod(klass, "prepend", argTypes, term2272, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


