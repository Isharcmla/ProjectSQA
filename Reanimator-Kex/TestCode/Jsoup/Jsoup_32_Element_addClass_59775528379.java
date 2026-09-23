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

public class Element_addClass_59775528379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7724;

    public Element_addClass_59775528379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7746 = new HashMap();
        Set<Object> term7809 =  ((Map) term7746).keySet();
        HashSet term7745 = new HashSet((Collection<? extends Object>) term7809);
        ArrayList term7758 = new ArrayList();
        ((ArrayList) term7758).add((Object)null);
        ((ArrayList) term7758).add((Object)null);
        ((ArrayList) term7758).add((Object)null);
        ((ArrayList) term7758).add((Object)null);
        LinkedHashMap term7763 = new LinkedHashMap();
        term7724 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7725 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7762 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7725, term7725.getClass(), "tagName", "YQwoogpPyi");
        setBooleanField(term7725, term7725.getClass(), "isBlock", false);
        setBooleanField(term7725, term7725.getClass(), "formatAsBlock", true);
        setBooleanField(term7725, term7725.getClass(), "canContainBlock", false);
        setBooleanField(term7725, term7725.getClass(), "canContainInline", true);
        setBooleanField(term7725, term7725.getClass(), "empty", true);
        setBooleanField(term7725, term7725.getClass(), "selfClosing", true);
        setBooleanField(term7725, term7725.getClass(), "preserveWhitespace", false);
        setField(term7724, term7724.getClass(), "tag", term7725);
        setField(term7724, term7724.getClass(), "classNames", term7745);
        setField(term7724, term7724.getClass(), "parentNode", null);
        setField(term7724, term7724.getClass(), "childNodes", term7758);
        setField(term7762, term7762.getClass(), "attributes", term7763);
        setField(term7724, term7724.getClass(), "attributes", term7762);
        setField(term7724, term7724.getClass(), "baseUri", "PNdLRrSAIY");
        setIntField(term7724, term7724.getClass(), "siblingIndex", -1274456137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nJnRIRiLZK";
        callMethod(klass, "addClass", argTypes, term7724, args);
    }

};


