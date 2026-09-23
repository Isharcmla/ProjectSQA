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

public class Element_getElementsByClass_150601760441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3776;

    public Element_getElementsByClass_150601760441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3798 = new HashMap();
        Set<Object> term3857 =  ((Map) term3798).keySet();
        HashSet term3797 = new HashSet((Collection<? extends Object>) term3857);
        ArrayList term3806 = new ArrayList();
        ((ArrayList) term3806).add((Object)null);
        ((ArrayList) term3806).add((Object)null);
        LinkedHashMap term3811 = new LinkedHashMap();
        term3776 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3777 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3810 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3777, term3777.getClass(), "tagName", "CVRGEomOth");
        setBooleanField(term3777, term3777.getClass(), "isBlock", true);
        setBooleanField(term3777, term3777.getClass(), "formatAsBlock", true);
        setBooleanField(term3777, term3777.getClass(), "canContainBlock", false);
        setBooleanField(term3777, term3777.getClass(), "canContainInline", false);
        setBooleanField(term3777, term3777.getClass(), "empty", false);
        setBooleanField(term3777, term3777.getClass(), "selfClosing", false);
        setBooleanField(term3777, term3777.getClass(), "preserveWhitespace", true);
        setField(term3776, term3776.getClass(), "tag", term3777);
        setField(term3776, term3776.getClass(), "classNames", term3797);
        setField(term3776, term3776.getClass(), "parentNode", null);
        setField(term3776, term3776.getClass(), "childNodes", term3806);
        setField(term3810, term3810.getClass(), "attributes", term3811);
        setField(term3776, term3776.getClass(), "attributes", term3810);
        setField(term3776, term3776.getClass(), "baseUri", "GsWxOwXvSu");
        setIntField(term3776, term3776.getClass(), "siblingIndex", 767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bKBSncrMEZ";
        callMethod(klass, "getElementsByClass", argTypes, term3776, args);
    }

};


