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

public class Element_siblingElements_131976547632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2911;

    public Element_siblingElements_131976547632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2933 = new HashMap();
        Set<Object> term2990 =  ((Map) term2933).keySet();
        HashSet term2932 = new HashSet((Collection<? extends Object>) term2990);
        ArrayList term2951 = new ArrayList();
        ((ArrayList) term2951).add((Object)null);
        ((ArrayList) term2951).add((Object)null);
        ((ArrayList) term2951).add((Object)null);
        ((ArrayList) term2951).add((Object)null);
        ((ArrayList) term2951).add((Object)null);
        ((ArrayList) term2951).add((Object)null);
        ((ArrayList) term2951).add((Object)null);
        LinkedHashMap term2956 = new LinkedHashMap();
        term2911 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2912 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2955 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2912, term2912.getClass(), "tagName", "NTWMiBEaDF");
        setBooleanField(term2912, term2912.getClass(), "isBlock", true);
        setBooleanField(term2912, term2912.getClass(), "formatAsBlock", true);
        setBooleanField(term2912, term2912.getClass(), "canContainBlock", false);
        setBooleanField(term2912, term2912.getClass(), "canContainInline", false);
        setBooleanField(term2912, term2912.getClass(), "empty", true);
        setBooleanField(term2912, term2912.getClass(), "selfClosing", false);
        setBooleanField(term2912, term2912.getClass(), "preserveWhitespace", true);
        setField(term2911, term2911.getClass(), "tag", term2912);
        setField(term2911, term2911.getClass(), "classNames", term2932);
        setField(term2911, term2911.getClass(), "parentNode", null);
        setField(term2911, term2911.getClass(), "childNodes", term2951);
        setField(term2955, term2955.getClass(), "attributes", term2956);
        setField(term2911, term2911.getClass(), "attributes", term2955);
        setField(term2911, term2911.getClass(), "baseUri", "rIPMBcrNqB");
        setIntField(term2911, term2911.getClass(), "siblingIndex", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "siblingElements", argTypes, term2911, args);
    }

};


