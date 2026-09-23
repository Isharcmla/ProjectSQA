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

public class Element_wrap_135105120631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2797;

    public Element_wrap_135105120631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2819 = new HashMap();
        Set<Object> term2890 =  ((Map) term2819).keySet();
        HashSet term2818 = new HashSet((Collection<? extends Object>) term2890);
        ArrayList term2839 = new ArrayList();
        ((ArrayList) term2839).add((Object)null);
        ((ArrayList) term2839).add((Object)null);
        ((ArrayList) term2839).add((Object)null);
        ((ArrayList) term2839).add((Object)null);
        ((ArrayList) term2839).add((Object)null);
        ((ArrayList) term2839).add((Object)null);
        ((ArrayList) term2839).add((Object)null);
        LinkedHashMap term2844 = new LinkedHashMap();
        term2797 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2798 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2843 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2798, term2798.getClass(), "tagName", "TXZAIPQJHt");
        setBooleanField(term2798, term2798.getClass(), "isBlock", true);
        setBooleanField(term2798, term2798.getClass(), "formatAsBlock", false);
        setBooleanField(term2798, term2798.getClass(), "canContainBlock", false);
        setBooleanField(term2798, term2798.getClass(), "canContainInline", false);
        setBooleanField(term2798, term2798.getClass(), "empty", false);
        setBooleanField(term2798, term2798.getClass(), "selfClosing", true);
        setBooleanField(term2798, term2798.getClass(), "preserveWhitespace", true);
        setField(term2797, term2797.getClass(), "tag", term2798);
        setField(term2797, term2797.getClass(), "classNames", term2818);
        setField(term2797, term2797.getClass(), "parentNode", null);
        setField(term2797, term2797.getClass(), "childNodes", term2839);
        setField(term2843, term2843.getClass(), "attributes", term2844);
        setField(term2797, term2797.getClass(), "attributes", term2843);
        setField(term2797, term2797.getClass(), "baseUri", "QSrDQfEsTR");
        setIntField(term2797, term2797.getClass(), "siblingIndex", -203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PsqusYmejD";
        callMethod(klass, "wrap", argTypes, term2797, args);
    }

};


