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

public class Element_appendText_83357295723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1936;

    public Element_appendText_83357295723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1960 = new HashMap();
        Set<Object> term2027 =  ((Map) term1960).keySet();
        HashSet term1959 = new HashSet((Collection<? extends Object>) term2027);
        ArrayList term1976 = new ArrayList();
        ((ArrayList) term1976).add((Object)null);
        ((ArrayList) term1976).add((Object)null);
        LinkedHashMap term1981 = new LinkedHashMap();
        term1936 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1937 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1980 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1937, term1937.getClass(), "tagName", "tlzpzIjMib");
        setBooleanField(term1937, term1937.getClass(), "isBlock", true);
        setBooleanField(term1937, term1937.getClass(), "formatAsBlock", false);
        setBooleanField(term1937, term1937.getClass(), "canContainBlock", true);
        setBooleanField(term1937, term1937.getClass(), "canContainInline", true);
        setBooleanField(term1937, term1937.getClass(), "empty", false);
        setBooleanField(term1937, term1937.getClass(), "selfClosing", false);
        setBooleanField(term1937, term1937.getClass(), "preserveWhitespace", true);
        setBooleanField(term1937, term1937.getClass(), "formList", false);
        setBooleanField(term1937, term1937.getClass(), "formSubmit", false);
        setField(term1936, term1936.getClass(), "tag", term1937);
        setField(term1936, term1936.getClass(), "classNames", term1959);
        setField(term1936, term1936.getClass(), "parentNode", null);
        setField(term1936, term1936.getClass(), "childNodes", term1976);
        setField(term1980, term1980.getClass(), "attributes", term1981);
        setField(term1936, term1936.getClass(), "attributes", term1980);
        setField(term1936, term1936.getClass(), "baseUri", "zcorEihhLK");
        setIntField(term1936, term1936.getClass(), "siblingIndex", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GrqozDKFOk";
        callMethod(klass, "appendText", argTypes, term1936, args);
    }

};


