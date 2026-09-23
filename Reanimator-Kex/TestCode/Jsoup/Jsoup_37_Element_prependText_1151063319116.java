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
import java.lang.NullPointerException;
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

public class Element_prependText_1151063319116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2048;

    public Element_prependText_1151063319116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2072 = new HashMap();
        Set<Object> term16172 =  ((Map) term2072).keySet();
        HashSet term2071 = new HashSet((Collection<? extends Object>) term16172);
        ArrayList term2090 = new ArrayList();
        ((ArrayList) term2090).add((Object)null);
        ((ArrayList) term2090).add((Object)null);
        ((ArrayList) term2090).add((Object)null);
        LinkedHashMap term2095 = new LinkedHashMap();
        term2048 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2049 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2094 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2049, term2049.getClass(), "tagName", "CFyoseFGLF");
        setBooleanField(term2049, term2049.getClass(), "isBlock", true);
        setBooleanField(term2049, term2049.getClass(), "formatAsBlock", true);
        setBooleanField(term2049, term2049.getClass(), "canContainBlock", false);
        setBooleanField(term2049, term2049.getClass(), "canContainInline", false);
        setBooleanField(term2049, term2049.getClass(), "empty", false);
        setBooleanField(term2049, term2049.getClass(), "selfClosing", false);
        setBooleanField(term2049, term2049.getClass(), "preserveWhitespace", true);
        setBooleanField(term2049, term2049.getClass(), "formList", true);
        setBooleanField(term2049, term2049.getClass(), "formSubmit", true);
        setField(term2048, term2048.getClass(), "tag", term2049);
        setField(term2048, term2048.getClass(), "classNames", term2071);
        setField(term2048, term2048.getClass(), "parentNode", null);
        setField(term2048, term2048.getClass(), "childNodes", term2090);
        setField(term2094, term2094.getClass(), "attributes", term2095);
        setField(term2048, term2048.getClass(), "attributes", term2094);
        setField(term2048, term2048.getClass(), "baseUri", "aSkmSwTnEw");
        setIntField(term2048, term2048.getClass(), "siblingIndex", -1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xvkbvaEGYd";
        try {
            callMethod(klass, "prependText", argTypes, term2048, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


