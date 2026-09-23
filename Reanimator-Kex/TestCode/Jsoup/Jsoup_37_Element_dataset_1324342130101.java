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
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_dataset_1324342130101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term810;
     Object term10568;
     Object term10514;

    public Element_dataset_1324342130101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term834 = new HashMap();
        Set<Object> term10590 =  ((Map) term834).keySet();
        HashSet term833 = new HashSet((Collection<? extends Object>) term10590);
        ArrayList term846 = new ArrayList();
        ((ArrayList) term846).add((Object)null);
        LinkedHashMap term851 = new LinkedHashMap();
        term810 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term811 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term850 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term811, term811.getClass(), "tagName", "HqBOwkVqjD");
        setBooleanField(term811, term811.getClass(), "isBlock", false);
        setBooleanField(term811, term811.getClass(), "formatAsBlock", true);
        setBooleanField(term811, term811.getClass(), "canContainBlock", false);
        setBooleanField(term811, term811.getClass(), "canContainInline", true);
        setBooleanField(term811, term811.getClass(), "empty", false);
        setBooleanField(term811, term811.getClass(), "selfClosing", true);
        setBooleanField(term811, term811.getClass(), "preserveWhitespace", false);
        setBooleanField(term811, term811.getClass(), "formList", false);
        setBooleanField(term811, term811.getClass(), "formSubmit", true);
        setField(term810, term810.getClass(), "tag", term811);
        setField(term810, term810.getClass(), "classNames", term833);
        setField(term810, term810.getClass(), "parentNode", null);
        setField(term810, term810.getClass(), "childNodes", term846);
        setField(term850, term850.getClass(), "attributes", term851);
        setField(term810, term810.getClass(), "attributes", term850);
        setField(term810, term810.getClass(), "baseUri", "VgZnGoIFwQ");
        setIntField(term810, term810.getClass(), "siblingIndex", -2038273078);
        HashMap term10573 = new HashMap();
        Set<Object> term10611 =  ((Map) term10573).keySet();
        HashSet term10572 = new HashSet((Collection<? extends Object>) term10611);
        ArrayList term10574 = new ArrayList();
        ((ArrayList) term10574).add((Object)null);
        LinkedHashMap term10577 = new LinkedHashMap();
        term10568 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10569 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10576 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10569, term10569.getClass(), "tagName", "HqBOwkVqjD");
        setBooleanField(term10569, term10569.getClass(), "isBlock", false);
        setBooleanField(term10569, term10569.getClass(), "formatAsBlock", true);
        setBooleanField(term10569, term10569.getClass(), "canContainBlock", false);
        setBooleanField(term10569, term10569.getClass(), "canContainInline", true);
        setBooleanField(term10569, term10569.getClass(), "empty", false);
        setBooleanField(term10569, term10569.getClass(), "selfClosing", true);
        setBooleanField(term10569, term10569.getClass(), "preserveWhitespace", false);
        setBooleanField(term10569, term10569.getClass(), "formList", false);
        setBooleanField(term10569, term10569.getClass(), "formSubmit", true);
        setField(term10568, term10568.getClass(), "tag", term10569);
        setField(term10568, term10568.getClass(), "classNames", term10572);
        setField(term10568, term10568.getClass(), "parentNode", null);
        setField(term10568, term10568.getClass(), "childNodes", term10574);
        setField(term10576, term10576.getClass(), "attributes", term10577);
        setField(term10568, term10568.getClass(), "attributes", term10576);
        setField(term10568, term10568.getClass(), "baseUri", "VgZnGoIFwQ");
        setIntField(term10568, term10568.getClass(), "siblingIndex", -2038273078);
        LinkedHashMap term10516 = new LinkedHashMap();
        term10514 = newInstance(Class.forName("org.jsoup.nodes.Attributes$Dataset"));
        Object term10515 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10515, term10515.getClass(), "attributes", term10516);
        setField(term10514, term10514.getClass(), "this$0", term10515);
        setField(term10514, term10514.getClass(), "keySet", null);
        setField(term10514, term10514.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataset", argTypes, term810, args);
        assertTrue(recursiveEquals(term810, term10568));
        assertTrue(recursiveEquals(retValue, term10514));
    }

};


