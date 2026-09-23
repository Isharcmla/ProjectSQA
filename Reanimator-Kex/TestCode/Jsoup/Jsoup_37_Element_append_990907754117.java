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
import java.lang.ExceptionInInitializerError;
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

public class Element_append_990907754117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2162;

    public Element_append_990907754117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2186 = new HashMap();
        Set<Object> term16906 =  ((Map) term2186).keySet();
        HashSet term2185 = new HashSet((Collection<? extends Object>) term16906);
        ArrayList term2200 = new ArrayList();
        ((ArrayList) term2200).add((Object)null);
        ((ArrayList) term2200).add((Object)null);
        ((ArrayList) term2200).add((Object)null);
        ((ArrayList) term2200).add((Object)null);
        ((ArrayList) term2200).add((Object)null);
        ((ArrayList) term2200).add((Object)null);
        ((ArrayList) term2200).add((Object)null);
        ((ArrayList) term2200).add((Object)null);
        LinkedHashMap term2205 = new LinkedHashMap();
        term2162 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2163 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2204 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2163, term2163.getClass(), "tagName", "HBGNxdNURv");
        setBooleanField(term2163, term2163.getClass(), "isBlock", true);
        setBooleanField(term2163, term2163.getClass(), "formatAsBlock", false);
        setBooleanField(term2163, term2163.getClass(), "canContainBlock", false);
        setBooleanField(term2163, term2163.getClass(), "canContainInline", true);
        setBooleanField(term2163, term2163.getClass(), "empty", false);
        setBooleanField(term2163, term2163.getClass(), "selfClosing", true);
        setBooleanField(term2163, term2163.getClass(), "preserveWhitespace", true);
        setBooleanField(term2163, term2163.getClass(), "formList", true);
        setBooleanField(term2163, term2163.getClass(), "formSubmit", false);
        setField(term2162, term2162.getClass(), "tag", term2163);
        setField(term2162, term2162.getClass(), "classNames", term2185);
        setField(term2162, term2162.getClass(), "parentNode", null);
        setField(term2162, term2162.getClass(), "childNodes", term2200);
        setField(term2204, term2204.getClass(), "attributes", term2205);
        setField(term2162, term2162.getClass(), "attributes", term2204);
        setField(term2162, term2162.getClass(), "baseUri", "WBAOTqErtm");
        setIntField(term2162, term2162.getClass(), "siblingIndex", 1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PqtVXXZMqK";
        try {
            callMethod(klass, "append", argTypes, term2162, args);
            assertTrue(false);
        }
        catch (ExceptionInInitializerError e) {
        }

    }

};


