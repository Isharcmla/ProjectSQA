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

public class Element_id_13187903499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584;
     Object term10195;

    public Element_id_13187903499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term608 = new HashMap();
        Set<Object> term10217 =  ((Map) term608).keySet();
        HashSet term607 = new HashSet((Collection<? extends Object>) term10217);
        ArrayList term626 = new ArrayList();
        ((ArrayList) term626).add((Object)null);
        ((ArrayList) term626).add((Object)null);
        ((ArrayList) term626).add((Object)null);
        ((ArrayList) term626).add((Object)null);
        ((ArrayList) term626).add((Object)null);
        LinkedHashMap term631 = new LinkedHashMap();
        term584 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term585 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term630 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term585, term585.getClass(), "tagName", "UiUYnPrcCi");
        setBooleanField(term585, term585.getClass(), "isBlock", true);
        setBooleanField(term585, term585.getClass(), "formatAsBlock", false);
        setBooleanField(term585, term585.getClass(), "canContainBlock", false);
        setBooleanField(term585, term585.getClass(), "canContainInline", true);
        setBooleanField(term585, term585.getClass(), "empty", true);
        setBooleanField(term585, term585.getClass(), "selfClosing", true);
        setBooleanField(term585, term585.getClass(), "preserveWhitespace", false);
        setBooleanField(term585, term585.getClass(), "formList", false);
        setBooleanField(term585, term585.getClass(), "formSubmit", false);
        setField(term584, term584.getClass(), "tag", term585);
        setField(term584, term584.getClass(), "classNames", term607);
        setField(term584, term584.getClass(), "parentNode", null);
        setField(term584, term584.getClass(), "childNodes", term626);
        setField(term630, term630.getClass(), "attributes", term631);
        setField(term584, term584.getClass(), "attributes", term630);
        setField(term584, term584.getClass(), "baseUri", "dEnhdmILtU");
        setIntField(term584, term584.getClass(), "siblingIndex", -616727354);
        HashMap term10200 = new HashMap();
        Set<Object> term10238 =  ((Map) term10200).keySet();
        HashSet term10199 = new HashSet((Collection<? extends Object>) term10238);
        ArrayList term10201 = new ArrayList();
        ((ArrayList) term10201).add((Object)null);
        ((ArrayList) term10201).add((Object)null);
        ((ArrayList) term10201).add((Object)null);
        ((ArrayList) term10201).add((Object)null);
        ((ArrayList) term10201).add((Object)null);
        LinkedHashMap term10204 = new LinkedHashMap();
        term10195 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10196 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10203 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10196, term10196.getClass(), "tagName", "UiUYnPrcCi");
        setBooleanField(term10196, term10196.getClass(), "isBlock", true);
        setBooleanField(term10196, term10196.getClass(), "formatAsBlock", false);
        setBooleanField(term10196, term10196.getClass(), "canContainBlock", false);
        setBooleanField(term10196, term10196.getClass(), "canContainInline", true);
        setBooleanField(term10196, term10196.getClass(), "empty", true);
        setBooleanField(term10196, term10196.getClass(), "selfClosing", true);
        setBooleanField(term10196, term10196.getClass(), "preserveWhitespace", false);
        setBooleanField(term10196, term10196.getClass(), "formList", false);
        setBooleanField(term10196, term10196.getClass(), "formSubmit", false);
        setField(term10195, term10195.getClass(), "tag", term10196);
        setField(term10195, term10195.getClass(), "classNames", term10199);
        setField(term10195, term10195.getClass(), "parentNode", null);
        setField(term10195, term10195.getClass(), "childNodes", term10201);
        setField(term10203, term10203.getClass(), "attributes", term10204);
        setField(term10195, term10195.getClass(), "attributes", term10203);
        setField(term10195, term10195.getClass(), "baseUri", "dEnhdmILtU");
        setIntField(term10195, term10195.getClass(), "siblingIndex", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "id", argTypes, term584, args);
        assertTrue(recursiveEquals(term584, term10195));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


