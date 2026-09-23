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
import java.lang.Integer;

public class Element_getElementsByIndexEquals_180587943054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5276;
     Object term5349;

    public Element_getElementsByIndexEquals_180587943054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5298 = new HashMap();
        Set<Object> term5361 =  ((Map) term5298).keySet();
        HashSet term5297 = new HashSet((Collection<? extends Object>) term5361);
        ArrayList term5320 = new ArrayList();
        ((ArrayList) term5320).add((Object)null);
        ((ArrayList) term5320).add((Object)null);
        ((ArrayList) term5320).add((Object)null);
        ((ArrayList) term5320).add((Object)null);
        LinkedHashMap term5325 = new LinkedHashMap();
        term5276 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5277 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5324 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5277, term5277.getClass(), "tagName", "TcuXODkzBV");
        setBooleanField(term5277, term5277.getClass(), "isBlock", true);
        setBooleanField(term5277, term5277.getClass(), "formatAsBlock", true);
        setBooleanField(term5277, term5277.getClass(), "canContainBlock", false);
        setBooleanField(term5277, term5277.getClass(), "canContainInline", false);
        setBooleanField(term5277, term5277.getClass(), "empty", true);
        setBooleanField(term5277, term5277.getClass(), "selfClosing", false);
        setBooleanField(term5277, term5277.getClass(), "preserveWhitespace", false);
        setField(term5276, term5276.getClass(), "tag", term5277);
        setField(term5276, term5276.getClass(), "classNames", term5297);
        setField(term5276, term5276.getClass(), "parentNode", null);
        setField(term5276, term5276.getClass(), "childNodes", term5320);
        setField(term5324, term5324.getClass(), "attributes", term5325);
        setField(term5276, term5276.getClass(), "attributes", term5324);
        setField(term5276, term5276.getClass(), "baseUri", "QpYltHAdyY");
        setIntField(term5276, term5276.getClass(), "siblingIndex", 1063420942);
        term5349 = new Integer(1375330971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5349;
        callMethod(klass, "getElementsByIndexEquals", argTypes, term5276, args);
    }

};


