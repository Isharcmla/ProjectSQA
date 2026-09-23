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
     Object term792;
     Object term19281;
     Object term19229;

    public Element_dataset_1324342130101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term814 = new HashMap();
        Set<Object> term19303 =  ((Map) term814).keySet();
        HashSet term813 = new HashSet((Collection<? extends Object>) term19303);
        ArrayList term826 = new ArrayList();
        ((ArrayList) term826).add((Object)null);
        LinkedHashMap term831 = new LinkedHashMap();
        term792 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term793 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term830 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term793, term793.getClass(), "tagName", "HqBOwkVqjD");
        setBooleanField(term793, term793.getClass(), "isBlock", true);
        setBooleanField(term793, term793.getClass(), "formatAsBlock", false);
        setBooleanField(term793, term793.getClass(), "canContainBlock", false);
        setBooleanField(term793, term793.getClass(), "canContainInline", true);
        setBooleanField(term793, term793.getClass(), "empty", true);
        setBooleanField(term793, term793.getClass(), "selfClosing", true);
        setBooleanField(term793, term793.getClass(), "preserveWhitespace", false);
        setField(term792, term792.getClass(), "tag", term793);
        setField(term792, term792.getClass(), "classNames", term813);
        setField(term792, term792.getClass(), "parentNode", null);
        setField(term792, term792.getClass(), "childNodes", term826);
        setField(term830, term830.getClass(), "attributes", term831);
        setField(term792, term792.getClass(), "attributes", term830);
        setField(term792, term792.getClass(), "baseUri", "VgZnGoIFwQ");
        setIntField(term792, term792.getClass(), "siblingIndex", -2038273078);
        HashMap term19286 = new HashMap();
        Set<Object> term19324 =  ((Map) term19286).keySet();
        HashSet term19285 = new HashSet((Collection<? extends Object>) term19324);
        ArrayList term19287 = new ArrayList();
        ((ArrayList) term19287).add((Object)null);
        LinkedHashMap term19290 = new LinkedHashMap();
        term19281 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19282 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19289 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19282, term19282.getClass(), "tagName", "HqBOwkVqjD");
        setBooleanField(term19282, term19282.getClass(), "isBlock", true);
        setBooleanField(term19282, term19282.getClass(), "formatAsBlock", false);
        setBooleanField(term19282, term19282.getClass(), "canContainBlock", false);
        setBooleanField(term19282, term19282.getClass(), "canContainInline", true);
        setBooleanField(term19282, term19282.getClass(), "empty", true);
        setBooleanField(term19282, term19282.getClass(), "selfClosing", true);
        setBooleanField(term19282, term19282.getClass(), "preserveWhitespace", false);
        setField(term19281, term19281.getClass(), "tag", term19282);
        setField(term19281, term19281.getClass(), "classNames", term19285);
        setField(term19281, term19281.getClass(), "parentNode", null);
        setField(term19281, term19281.getClass(), "childNodes", term19287);
        setField(term19289, term19289.getClass(), "attributes", term19290);
        setField(term19281, term19281.getClass(), "attributes", term19289);
        setField(term19281, term19281.getClass(), "baseUri", "VgZnGoIFwQ");
        setIntField(term19281, term19281.getClass(), "siblingIndex", -2038273078);
        LinkedHashMap term19231 = new LinkedHashMap();
        term19229 = newInstance(Class.forName("org.jsoup.nodes.Attributes$Dataset"));
        Object term19230 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19230, term19230.getClass(), "attributes", term19231);
        setField(term19229, term19229.getClass(), "this$0", term19230);
        setField(term19229, term19229.getClass(), "keySet", null);
        setField(term19229, term19229.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataset", argTypes, term792, args);
        assertTrue(recursiveEquals(term792, term19281));
        assertTrue(recursiveEquals(retValue, term19229));
    }

};


