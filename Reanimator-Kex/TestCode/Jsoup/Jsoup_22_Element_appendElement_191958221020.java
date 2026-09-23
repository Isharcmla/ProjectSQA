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

public class Element_appendElement_191958221020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1683;

    public Element_appendElement_191958221020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1705 = new HashMap();
        Set<Object> term1772 =  ((Map) term1705).keySet();
        HashSet term1704 = new HashSet((Collection<? extends Object>) term1772);
        ArrayList term1721 = new ArrayList();
        ((ArrayList) term1721).add((Object)null);
        LinkedHashMap term1726 = new LinkedHashMap();
        term1683 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1684 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1725 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1684, term1684.getClass(), "tagName", "DyiXbeYIaN");
        setBooleanField(term1684, term1684.getClass(), "isBlock", true);
        setBooleanField(term1684, term1684.getClass(), "formatAsBlock", false);
        setBooleanField(term1684, term1684.getClass(), "canContainBlock", true);
        setBooleanField(term1684, term1684.getClass(), "canContainInline", false);
        setBooleanField(term1684, term1684.getClass(), "empty", false);
        setBooleanField(term1684, term1684.getClass(), "selfClosing", true);
        setBooleanField(term1684, term1684.getClass(), "preserveWhitespace", false);
        setField(term1683, term1683.getClass(), "tag", term1684);
        setField(term1683, term1683.getClass(), "classNames", term1704);
        setField(term1683, term1683.getClass(), "parentNode", null);
        setField(term1683, term1683.getClass(), "childNodes", term1721);
        setField(term1725, term1725.getClass(), "attributes", term1726);
        setField(term1683, term1683.getClass(), "attributes", term1725);
        setField(term1683, term1683.getClass(), "baseUri", "vKQukfbJUd");
        setIntField(term1683, term1683.getClass(), "siblingIndex", 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lFRJFUMVbx";
        callMethod(klass, "appendElement", argTypes, term1683, args);
    }

};


