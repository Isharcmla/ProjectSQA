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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_toString_1903592843133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7392;

    public Element_toString_1903592843133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7414 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7414, term7414.getClass(), "tagName", null);
        setBooleanField(term7414, term7414.getClass(), "isBlock", true);
        setBooleanField(term7414, term7414.getClass(), "canContainBlock", false);
        setBooleanField(term7414, term7414.getClass(), "canContainInline", false);
        setBooleanField(term7414, term7414.getClass(), "optionalClosing", false);
        setBooleanField(term7414, term7414.getClass(), "empty", false);
        setBooleanField(term7414, term7414.getClass(), "preserveWhitespace", false);
        setField(term7414, term7414.getClass(), "ancestors", null);
        ArrayList term7412 = new ArrayList();
        ((ArrayList) term7412).add(term7414);
        HashMap term7424 = new HashMap();
        Set<Object> term64366 =  ((Map) term7424).keySet();
        HashSet term7423 = new HashSet((Collection<? extends Object>) term64366);
        ArrayList term7438 = new ArrayList();
        ((ArrayList) term7438).add((Object)null);
        ((ArrayList) term7438).add((Object)null);
        ((ArrayList) term7438).add((Object)null);
        ((ArrayList) term7438).add((Object)null);
        ((ArrayList) term7438).add((Object)null);
        ((ArrayList) term7438).add((Object)null);
        ((ArrayList) term7438).add((Object)null);
        ((ArrayList) term7438).add((Object)null);
        LinkedHashMap term7443 = new LinkedHashMap();
        term7392 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7393 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7442 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7393, term7393.getClass(), "tagName", "JukEMhPWql");
        setBooleanField(term7393, term7393.getClass(), "isBlock", true);
        setBooleanField(term7393, term7393.getClass(), "canContainBlock", false);
        setBooleanField(term7393, term7393.getClass(), "canContainInline", true);
        setBooleanField(term7393, term7393.getClass(), "optionalClosing", true);
        setBooleanField(term7393, term7393.getClass(), "empty", false);
        setBooleanField(term7393, term7393.getClass(), "preserveWhitespace", true);
        setField(term7393, term7393.getClass(), "ancestors", term7412);
        setField(term7392, term7392.getClass(), "tag", term7393);
        setField(term7392, term7392.getClass(), "classNames", term7423);
        setField(term7392, term7392.getClass(), "parentNode", null);
        setField(term7392, term7392.getClass(), "childNodes", term7438);
        setField(term7442, term7442.getClass(), "attributes", term7443);
        setField(term7392, term7392.getClass(), "attributes", term7442);
        setField(term7392, term7392.getClass(), "baseUri", "plWlgdgIhn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term7392, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


