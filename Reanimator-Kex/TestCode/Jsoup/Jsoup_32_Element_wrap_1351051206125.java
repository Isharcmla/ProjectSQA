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

public class Element_wrap_1351051206125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2803;

    public Element_wrap_1351051206125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2825 = new HashMap();
        Set<Object> term19820 =  ((Map) term2825).keySet();
        HashSet term2824 = new HashSet((Collection<? extends Object>) term19820);
        ArrayList term2843 = new ArrayList();
        ((ArrayList) term2843).add((Object)null);
        ((ArrayList) term2843).add((Object)null);
        ((ArrayList) term2843).add((Object)null);
        ((ArrayList) term2843).add((Object)null);
        ((ArrayList) term2843).add((Object)null);
        ((ArrayList) term2843).add((Object)null);
        ((ArrayList) term2843).add((Object)null);
        LinkedHashMap term2848 = new LinkedHashMap();
        term2803 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2804 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2847 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2804, term2804.getClass(), "tagName", "PsqusYmejD");
        setBooleanField(term2804, term2804.getClass(), "isBlock", true);
        setBooleanField(term2804, term2804.getClass(), "formatAsBlock", true);
        setBooleanField(term2804, term2804.getClass(), "canContainBlock", false);
        setBooleanField(term2804, term2804.getClass(), "canContainInline", false);
        setBooleanField(term2804, term2804.getClass(), "empty", true);
        setBooleanField(term2804, term2804.getClass(), "selfClosing", false);
        setBooleanField(term2804, term2804.getClass(), "preserveWhitespace", true);
        setField(term2803, term2803.getClass(), "tag", term2804);
        setField(term2803, term2803.getClass(), "classNames", term2824);
        setField(term2803, term2803.getClass(), "parentNode", null);
        setField(term2803, term2803.getClass(), "childNodes", term2843);
        setField(term2847, term2847.getClass(), "attributes", term2848);
        setField(term2803, term2803.getClass(), "attributes", term2847);
        setField(term2803, term2803.getClass(), "baseUri", "wdoqITnaAP");
        setIntField(term2803, term2803.getClass(), "siblingIndex", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rIPMBcrNqB";
        try {
            callMethod(klass, "wrap", argTypes, term2803, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


